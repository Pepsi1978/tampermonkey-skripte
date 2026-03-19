package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun techQuestionsMaster4(): List<Question> = listOf(
    // 1
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet TCP CUBIC von TCP Reno beim Congestion-Control-Algorithmus?",
        answerA = "CUBIC verwendet eine lineare Wachstumsfunktion für das Congestion Window, Reno eine kubische",
        answerB = "CUBIC wächst das Congestion Window nach einem Verlust kubisch zur vergangenen Zeit seit dem letzten Verlust, unabhängig von RTT",
        answerC = "CUBIC deaktiviert Slow Start komplett und beginnt sofort mit Additive Increase",
        answerD = "CUBIC verwendet UDP als Transportprotokoll für schnellere Übertragung",
        correctAnswer = 1,
        explanation = "TCP CUBIC ersetzt die lineare AIMD-Kurve von Reno durch eine kubische Funktion W(t) = C(t-K)³ + Wmax. Das Wachstum ist zeitbasiert statt RTT-basiert, was CUBIC bei langen Fat-Pipe-Verbindungen stark bevorzugt, da es nicht durch hohe RTTs benachteiligt wird.",
        difficulty = 5,
        funFact = "CUBIC ist seit Linux-Kernel 2.6.19 (2006) der Standard-TCP-Algorithmus und dominiert heute das Internet — es ersetzt Reno auf fast allen Linux-Servern weltweit."
    ),
    // 2
    Question(
        categoryId = 7,
        questionText = "Welches Phänomen beschreibt der Begriff 'TCP Incast' in Datacenter-Netzwerken?",
        answerA = "Paketverluste durch zu viele simultane Sender die gleichzeitig an einen einzigen Empfänger senden und dessen Receive-Buffer überfluten",
        answerB = "Kollisionen auf dem Ethernet-Bus durch zu hohen Broadcast-Traffic",
        answerC = "Verbindungsabbrüche durch asymmetrisches Routing in ECMP-Netzwerken",
        answerD = "Überlastung von DNS-Resolvern durch zu viele gleichzeitige A-Record-Anfragen",
        correctAnswer = 0,
        explanation = "TCP Incast tritt auf, wenn viele Server gleichzeitig auf eine einzige Anfrage antworten (z.B. MapReduce-Synchronisation). Die simultanen Antworten überfluten den Switch-Buffer, es kommt zu Drops, TCP löst Timeouts aus (mindestens 200ms), und die Gesamtlatenz explodiert — obwohl die Gesamtbandbreite niedrig ist.",
        difficulty = 5,
        funFact = "Microsoft Research hat DCTCP zusammen mit MIT-Forschern entwickelt (SIGCOMM 2010) — es nutzt ECN-Markierungen um früh auf Warteschlangenfüllung zu reagieren, bevor Drops auftreten."
    ),
    // 3
    Question(
        categoryId = 7,
        questionText = "Was ist das zentrale Designprinzip von BBR (Bottleneck Bandwidth and Round-trip propagation time)?",
        answerA = "BBR misst Paketverluste und reduziert die Senderate nach jedem Drop proportional zur Verlustrate",
        answerB = "BBR schätzt die Bottleneck-Bandbreite und die minimale RTT unabhängig voneinander und sendet mit dem Produkt beider Werte",
        answerC = "BBR nutzt explizite Feedback-Signale vom Router via ECN um die optimale Senderate zu bestimmen",
        answerD = "BBR ersetzt TCP durch UDP und implementiert Congestion Control im Application Layer",
        correctAnswer = 1,
        explanation = "BBR modelliert das Netzwerk durch zwei Messungen: BtlBw (Bottleneck Bandwidth, gemessen als maximaler beobachteter Durchsatz) und RTprop (minimale beobachtete RTT). Das optimale Betriebspunkt ist BtlBw × RTprop — der BDP (Bandwidth-Delay Product). Im Gegensatz zu verlustbasierten Algorithmen reagiert BBR nicht auf Paketverluste als Überlastungssignal.",
        difficulty = 5,
        funFact = "Google hat BBR 2016 eingeführt und berichtet von bis zu 2–25-fach höherem Durchsatz auf Langstreckenleitungen mit hohem Paketverlust — besonders in Entwicklungsländern mit schlechter Infrastruktur."
    ),
    // 4
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert der TCP Slow-Start-Algorithmus präzise und was begrenzt ihn?",
        answerA = "Das Congestion Window wächst um 1 MSS pro RTT bis der Schwellwert ssthresh erreicht wird",
        answerB = "Das Congestion Window wird nach jedem bestätigten Segment um 1 MSS erhöht, was exponentielles Wachstum pro RTT erzeugt, bis ssthresh oder ein Verlust auftritt",
        answerC = "Slow Start verdoppelt die Senderate jede Sekunde bis zur konfigurierten maximalen Bandbreite",
        answerD = "Slow Start beginnt mit dem vollen Receive-Window des Empfängers und reduziert es bei Verlusten",
        correctAnswer = 1,
        explanation = "Pro ACK wird cwnd um 1 MSS erhöht. Bei einem vollen Window (cwnd MSS gesendet, alle bestätigt) wächst cwnd um cwnd MSS — also pro RTT verdoppelt sich cwnd (exponentielles Wachstum). Dies endet wenn cwnd ≥ ssthresh, bei Verlust (Timeout → cwnd=1, ssthresh=cwnd/2) oder bei Triple Duplicate ACK (Fast Retransmit).",
        difficulty = 5,
        funFact = "Der Name 'Slow Start' ist irreführend — der Algorithmus ist tatsächlich exponentiell schnell. 'Slow' bezieht sich darauf, dass er langsam im Vergleich zu 'starte sofort mit voller Rate' ist, was das Netz kollabieren würde."
    ),
    // 5
    Question(
        categoryId = 7,
        questionText = "Was beschreibt AIMD (Additive Increase, Multiplicative Decrease) in TCP Reno präzise?",
        answerA = "Additive Increase: cwnd += 1 MSS pro RTT; Multiplicative Decrease: cwnd = cwnd/2 bei Verlust (Triple-ACK); bei Timeout: cwnd = 1",
        answerB = "Additive Increase: cwnd verdoppelt sich pro RTT; Multiplicative Decrease: cwnd = 0 bei jedem Verlust",
        answerC = "Additive Increase: cwnd += 1 Byte pro Paket; Multiplicative Decrease: cwnd wird durch RTT dividiert",
        answerD = "AIMD gilt nur für UDP und wird in TCP nicht verwendet",
        correctAnswer = 0,
        explanation = "In der Congestion-Avoidance-Phase (cwnd ≥ ssthresh) wächst cwnd um 1 MSS pro RTT (additiv, linear). Bei einem Triple-Duplicate-ACK (wahrscheinlicher Verlust, kein Netzausfall) halbiert TCP Reno das Fenster: ssthresh = cwnd/2, cwnd = ssthresh (Fast Recovery). Bei einem Timeout-Verlust ist das Signal schlimmer: cwnd = 1 MSS, Slow Start neu.",
        difficulty = 5,
        funFact = "AIMD wurde 1988 von Jacobson und Karels entwickelt, nachdem 1986 ein TCP-Kollaps das ARPANET auf 1/1000 seiner normalen Leistung brachte — ein Ereignis das heute als erster 'Internet Congestion Collapse' gilt."
    ),
    // 6
    Question(
        categoryId = 7,
        questionText = "Was ist das Path-Vector-Routing-Modell in BGP und warum wird es statt Distance-Vector verwendet?",
        answerA = "BGP speichert den vollständigen AS-Pfad zu jedem Präfix, wodurch Routing-Loops erkannt und verhindert werden können",
        answerB = "BGP verwendet Hop-Count als einzige Metrik und vermeidet Schleifen durch TTL-Dekrementierung",
        answerC = "Path-Vector ist identisch mit Distance-Vector, aber mit kürzeren Update-Intervallen",
        answerD = "BGP verwendet Link-State-Datenbanken wie OSPF, speichert aber nur externe Routen",
        correctAnswer = 0,
        explanation = "BGP speichert in jedem Route-Update die vollständige Sequenz von AS-Nummern (AS_PATH), die das Präfix durchlaufen hat. Wenn ein Router seinen eigenen AS in einem eingehenden AS_PATH sieht, verwirft er das Update — damit werden Routing-Loops verhindert. Distance-Vector-Protokolle wie RIP zählen nur Hops und sind anfällig für Count-to-Infinity-Probleme.",
        difficulty = 5,
        funFact = "Das größte bekannte BGP-Routing-Tabelle (Full Table) enthält über 1,1 Millionen IPv4-Präfixe (Stand 2025) und wächst täglich. Ein BGP-Router muss alle diese Routen im RAM halten — typisch 1-2 GB nur für die Routing-Tabelle."
    ),
    // 7
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert ein BGP-Route-Hijacking-Angriff und was macht ihn so gefährlich?",
        answerA = "Ein Angreifer injiziert gefälschte BGP-Updates mit einer spezifischeren Präfix-Route (längeres Subnetz), die von anderen AS bevorzugt wird",
        answerB = "Ein Angreifer modifiziert DNS-Einträge um Traffic auf seine Server umzuleiten",
        answerC = "Ein Angreifer sendet gefälschte ICMP-Redirect-Pakete um Routing-Tabellen zu manipulieren",
        answerD = "Ein Angreifer überflutet BGP-Router mit SYN-Paketen um sie zum Neustart zu zwingen",
        correctAnswer = 0,
        explanation = "BGP bevorzugt spezifischere Routen (längere Prefix-Länge). Ein AS kann eine /24-Route für einen IP-Block ankündigen, der eigentlich einem anderen AS gehört. Andere Router bevorzugen diese spezifischere Route gegenüber der legitimen /20-Ankündigung. Da BGP historisch kein kryptografisches Vertrauen hat, werden solche Ankündigungen oft akzeptiert und weltweit propagiert.",
        difficulty = 5,
        funFact = "2010 leitete ein chinesischer ISP für etwa 18 Minuten rund 15% des globalen Internet-Traffics durch China — darunter Traffic von US-Militär, NASA und Dell. Es wurde nie offiziell bestätigt ob es Absicht oder Fehler war."
    ),
    // 8
    Question(
        categoryId = 7,
        questionText = "Was ist RPKI (Resource Public Key Infrastructure) und wie verhindert es BGP-Hijacking?",
        answerA = "RPKI ist ein kryptografisches System wo IP-Präfix-Inhaber signierte Zertifikate (ROA) ausstellen, die authorisierte Ursprungs-AS-Nummern für ihre Präfixe definieren",
        answerB = "RPKI verschlüsselt BGP-Sessions zwischen Routern mit TLS um Man-in-the-Middle-Angriffe zu verhindern",
        answerC = "RPKI ist ein DNS-basiertes System das AS-Nummern mit Domainnamen verknüpft",
        answerD = "RPKI signiert jeden einzelnen BGP-Update mit einem privaten Schlüssel des sendenden Routers",
        correctAnswer = 0,
        explanation = "ROA (Route Origin Authorization) ist ein signiertes Objekt: 'AS 12345 darf Präfix 1.2.3.0/24 ankündigen'. Router mit RPKI-Validierung prüfen eingehende BGP-Updates gegen ROAs. Ein Update mit falschem Ursprungs-AS wird als 'Invalid' markiert und normalerweise verworfen. RPKI schützt nur den Ursprung, nicht den gesamten Pfad — dafür gibt es BGPsec.",
        difficulty = 5,
        funFact = "Stand 2024 sind über 50% aller globalen IPv4-Routen durch RPKI ROAs abgedeckt — ein historischer Meilenstein, der im Mai 2024 erstmals überschritten wurde. Trotzdem filtern viele große ISPs 'Invalid'-Routen noch nicht konsequent."
    ),
    // 9
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen rekursiver und iterativer DNS-Auflösung aus Sicht des Clients?",
        answerA = "Bei rekursiver Auflösung fragt der Client nur seinen Resolver, der alle weiteren Schritte übernimmt; bei iterativer Auflösung verfolgt der Client jeden Schritt selbst",
        answerB = "Rekursive Auflösung funktioniert nur für IPv6-Adressen, iterative nur für IPv4",
        answerC = "Bei iterativer Auflösung antwortet der Resolver sofort mit einer Schätzung, ohne authoritative Server zu befragen",
        answerD = "Rekursive Auflösung verwendet UDP, iterative verwendet TCP für mehr Zuverlässigkeit",
        correctAnswer = 0,
        explanation = "Rekursiv: Client → Resolver (sendet RD=1-Flag) → Resolver fragt Root, TLD, Authoritative NS sequenziell → liefert finale Antwort. Iterativ: Resolver antwortet mit Referral ('frag diesen NS'), Client muss selbst weiterverfolgen. In der Praxis verwenden Stub-Resolver (Browser, OS) rekursiv und kommunizieren mit einem Recursive Resolver (z.B. 8.8.8.8), der seinerseits iterativ gegen authoritative Server antwortet.",
        difficulty = 5,
        funFact = "Ein vollständig iterativer DNS-Client müsste selbst die Root-Hinweisdatei ('root hints') pflegen und direkt mit den 13 Root-Nameservern kommunizieren — das macht kein normales Betriebssystem, aber DNS-Software wie 'unbound' kann so konfiguriert werden."
    ),
    // 10
    Question(
        categoryId = 7,
        questionText = "Wie schützt DNSSEC DNS-Antworten kryptografisch und was schützt es NICHT?",
        answerA = "DNSSEC verschlüsselt DNS-Antworten mit AES-256 und schützt so vor Abhören und Manipulation",
        answerB = "DNSSEC signiert DNS-Records mit privaten Schlüsseln (RRSIG); Resolver validieren mit publizierten DNSKEY-Records; es schützt vor Datenfälschung, aber NICHT vor Abhören (kein Encryption)",
        answerC = "DNSSEC verhindert DNS-Amplification-Angriffe indem es die Antwortgröße auf 512 Byte begrenzt",
        answerD = "DNSSEC authentifiziert den DNS-Resolver beim Client mit gegenseitiger TLS-Authentifizierung",
        correctAnswer = 1,
        explanation = "DNSSEC verwendet Public-Key-Kryptografie: Der Zone-Owner signiert RRSets mit einem privaten ZSK (Zone Signing Key). Resolver können mit dem publizierten DNSKEY die RRSIG-Signaturen verifizieren. Die Vertrauenskette läuft von der Root-Zone über Delegation Signer (DS)-Records. DNSSEC bietet Authentizität und Integrität — aber KEINE Vertraulichkeit. Antworten sind weiterhin im Klartext lesbar.",
        difficulty = 5,
        funFact = "DNSSEC-signierte Antworten sind deutlich größer als unsignierte — oft 10-20x. Das hat paradoxerweise DNS-Amplification-Angriffe massiv verstärkt: Ein Angreifer kann mit einem kleinen Query eine riesige signierte Antwort triggern und auf ein Opfer reflektieren."
    ),
    // 11
    Question(
        categoryId = 7,
        questionText = "Was ist der wesentliche Unterschied zwischen DNS over HTTPS (DoH) und DNS over TLS (DoT)?",
        answerA = "DoH tunnelt DNS im HTTP/2-Protokoll über Port 443; DoT verwendet TLS direkt über Port 853 — DoH ist schwerer zu blockieren, DoT transparenter für Netzwerkadmins",
        answerB = "DoH verschlüsselt nur DNS-Anfragen, DoT verschlüsselt Anfragen und Antworten",
        answerC = "DoT ist ein älteres Protokoll das nur mit IPv4 funktioniert; DoH ist der neuere IPv6-Standard",
        answerD = "DoH verwendet symmetrische Verschlüsselung, DoT asymmetrische Public-Key-Kryptografie",
        correctAnswer = 0,
        explanation = "DoT (RFC 7858) verwendet TLS direkt auf Port 853 — gut erkennbar und filterbar für Firewalls. DoH (RFC 8484) sieht aus wie normaler HTTPS-Traffic auf Port 443 und ist nahezu ununterscheidbar. DoH macht DNS-Filtering für Elternkontrolle/Enterprise schwieriger, bietet aber bessere Privacy in feindseligen Netzwerken. Beide verschlüsseln DNS vollständig.",
        difficulty = 5,
        funFact = "Mozilla aktivierte DoH 2019 standardmäßig in Firefox für US-Nutzer, was massive Kritik von Regierungen und ISPs auslöste — Großbritannien nominierte Mozilla für den 'Internet Villain of the Year'-Award."
    ),
    // 12
    Question(
        categoryId = 7,
        questionText = "Was passiert im TLS 1.3 Handshake und wie unterscheidet er sich von TLS 1.2?",
        answerA = "TLS 1.3 benötigt 1-RTT statt 2-RTT; ClientHello enthält Key-Share-Informationen, sodass der Server sofort mit verschlüsselten Daten antworten kann",
        answerB = "TLS 1.3 eliminiert den Handshake komplett und verwendet Pre-Shared Keys aus dem DNS",
        answerC = "TLS 1.3 verwendet RSA für Key Exchange statt Diffie-Hellman für bessere Performance",
        answerD = "TLS 1.3 führt einen 3-RTT-Handshake ein für erhöhte Sicherheit auf Kosten der Latenz",
        correctAnswer = 0,
        explanation = "TLS 1.2: 2-RTT (ClientHello→ServerHello→Certificate→ServerHelloDone; ClientKeyExchange→ChangeCipherSpec→Finished; dann erst Daten). TLS 1.3: 1-RTT (ClientHello enthält key_share; Server kann sofort mit EncryptedExtensions+Certificate+CertificateVerify+Finished+Anwendungsdaten antworten). Zusätzlich unterstützt TLS 1.3 0-RTT-Resumption für bereits bekannte Server.",
        difficulty = 5,
        funFact = "TLS 1.3 entfernte alle schwachen Cipher Suites (RC4, DES, 3DES, MD5, SHA-1, RSA Key Exchange, Static DH). Das bedeutete, dass TLS 1.3 mit vielen alten Middleboxen (Firewalls, Load-Balancer) inkompatibel war — was die Standardisierung um Jahre verzögerte."
    ),
    // 13
    Question(
        categoryId = 7,
        questionText = "Was bedeutet 'Forward Secrecy' (Perfect Forward Secrecy) in TLS 1.3 und warum ist es wichtig?",
        answerA = "Jede TLS-Session verwendet ephemere Schlüssel (ECDHE/DHE), die nach der Session vernichtet werden; ein kompromittierter Server-Privatschlüssel entschlüsselt vergangene Sessions nicht",
        answerB = "Forward Secrecy bedeutet, dass TLS 1.3 zukünftige Protokollversionen automatisch unterstützt",
        answerC = "Forward Secrecy verschlüsselt DNS-Anfragen vor dem TLS-Handshake um Metadaten zu schützen",
        answerD = "Forward Secrecy ist ein Algorithmus der den TLS-Session-Key bei jeder Anfrage wechselt",
        correctAnswer = 0,
        explanation = "Ohne PFS: Wenn ein Angreifer verschlüsselten Traffic aufzeichnet und später den Server-Privatschlüssel stiehlt, kann er allen alten Traffic entschlüsseln. Mit PFS (ECDHE): Für jede Session wird ein neues ephemeres Schlüsselpaar generiert. Der Session-Key wird nie übertragen, der private ECDHE-Key nach der Session vernichtet. TLS 1.3 erzwingt PFS — RSA-Schlüsselaustausch (kein PFS) ist verboten.",
        difficulty = 5,
        funFact = "Die NSA-Dokumente von Edward Snowden zeigten, dass die NSA massenhaft verschlüsselten Traffic aufzeichnete in der Hoffnung, Schlüssel später zu erlangen. PFS macht diese 'Harvest Now, Decrypt Later'-Strategie wirkungslos."
    ),
    // 14
    Question(
        categoryId = 7,
        questionText = "Was ist TLS 1.3 0-RTT und welches Sicherheitsrisiko bringt es mit?",
        answerA = "0-RTT erlaubt dem Client, sofort mit dem ersten Paket Anwendungsdaten zu senden ohne auf den Handshake zu warten; es ist anfällig für Replay-Angriffe",
        answerB = "0-RTT eliminiert Verschlüsselung beim ersten Request um Latenz zu minimieren",
        answerC = "0-RTT ist ein Verfahren das TCP durch UDP ersetzt um den Verbindungsaufbau zu beschleunigen",
        answerD = "0-RTT verwendet Pre-Shared Keys aus DNS TLSA-Records anstelle des normalen Handshakes",
        correctAnswer = 0,
        explanation = "Bei 0-RTT (Early Data) nutzt der Client einen PSK (Pre-Shared Key) aus einer früheren Session. Er sendet Early Data im ersten Paket, noch bevor der Server antwortet. Das Risiko: Replay-Angriffe. Ein Angreifer kann das erste Paket aufzeichnen und erneut senden — der Server kann echte von wiederholten Anfragen nicht unterscheiden. Daher darf 0-RTT nur für nicht-zustandsändernde, idempotente Requests verwendet werden.",
        difficulty = 5,
        funFact = "Google's QUIC-Protokoll hat 0-RTT-Resumption ebenfalls — und Cloudflare hat gezeigt, dass man mit gezielten Replay-Angriffen auf 0-RTT-Endpunkte unter Umständen Authentifizierungs-Tokens stehlen kann."
    ),
    // 15
    Question(
        categoryId = 7,
        questionText = "Wie löst QUIC das Head-of-Line-Blocking-Problem, das HTTP/2 über TCP noch hat?",
        answerA = "QUIC multiplext mehrere Streams über eine einzige UDP-Verbindung; Paketverluste betreffen nur den betroffenen Stream, nicht alle anderen",
        answerB = "QUIC verwendet mehrere parallele TCP-Verbindungen um Blocking zu vermeiden",
        answerC = "QUIC eliminiert Head-of-Line-Blocking durch ein proprietäres Fehlerkorrekturprotokoll das niemals Pakete verliert",
        answerD = "QUIC sendet alle Streams über separate UDP-Ports um Interferenzen zu vermeiden",
        correctAnswer = 0,
        explanation = "HTTP/2 über TCP leidet unter TCP-Level-HoL-Blocking: Ein verlorenes Paket blockiert alle Streams, weil TCP einen geordneten Byte-Stream liefert. QUIC implementiert Multiplexing direkt auf UDP: Jeder Stream wird unabhängig verfolgt. Ein verlorenes Paket in Stream 3 blockiert nur Stream 3 — Stream 1 und 2 empfangen weiterhin Daten ohne Unterbrechung.",
        difficulty = 5,
        funFact = "QUIC wurde ursprünglich von Google entwickelt und als 'Quick UDP Internet Connections' bezeichnet. HTTP/3 (RFC 9114) ist QUIC — und Googles eigene Dienste (YouTube, Search, Gmail) liefen bereits QUIC bevor der Standard finalisiert wurde."
    ),
    // 16
    Question(
        categoryId = 7,
        questionText = "Was ermöglicht QUIC Connection Migration und wie wird sie implementiert?",
        answerA = "QUIC verwendet Connection IDs statt IP:Port-Tupeln zur Verbindungsidentifikation; bei IP-Wechsel (z.B. WiFi→LTE) bleibt die Connection ID gültig und die Verbindung besteht weiter",
        answerB = "QUIC migriert TCP-Verbindungen transparent zwischen Servern durch Load-Balancer",
        answerC = "QUIC verwaltet IP-Adressen über MPTCP-Subflows und kann zwischen mehreren Pfaden wechseln",
        answerD = "Connection Migration in QUIC erfordert einen neuen TLS-Handshake aber keinen neuen UDP-Socket",
        correctAnswer = 0,
        explanation = "TCP identifiziert Verbindungen durch 4-Tupel (Src-IP, Src-Port, Dst-IP, Dst-Port). Bei IP-Wechsel (Handy wechselt von WiFi zu LTE) bricht die TCP-Verbindung ab. QUIC verwendet einen 64-Bit Connection Identifier (CID) im Header. Wenn der Client seine IP-Adresse wechselt, sendet er weiterhin Pakete mit derselben CID — der Server erkennt die Verbindung und fährt ohne Unterbrechung fort.",
        difficulty = 5,
        funFact = "Apple nutzt QUIC Connection Migration in iCloud und FaceTime: Wenn du beim Telefonieren von WiFi ins Mobilnetz wechselst, bleibt die Verbindung dank QUIC nahtlos bestehen — etwas das mit TCP unmöglich war."
    ),
    // 17
    Question(
        categoryId = 7,
        questionText = "Was ist HPACK in HTTP/2 und welches Problem löst es gegenüber HTTP/1.1?",
        answerA = "HPACK ist eine stateful Header-Kompressionstechnik mit statischer Tabelle (61 vordefinierte Header) und dynamischer Tabelle; sie eliminiert redundante Header-Übertragungen",
        answerB = "HPACK ist ein neues Binärformat für HTTP-Body-Daten das Gzip ersetzt",
        answerC = "HPACK ist ein Hash-Algorithmus der HTTP-Header für schnelleres Parsing vorkompiliert",
        answerD = "HPACK komprimiert TLS-Handshake-Daten um die Verbindungsaufbauzeit zu reduzieren",
        correctAnswer = 0,
        explanation = "HTTP/1.1 sendet bei jeder Anfrage alle Header als Text (oft 500-800 Byte für Cookies, User-Agent etc.). HPACK (RFC 7541) verwendet zwei Tabellen: eine statische (61 häufige Header-Value-Paare) und eine dynamische (session-spezifische, zustandsbehaftete Tabelle). Bereits gesendete Header werden durch einen Index-Verweis ersetzt (1-3 Bytes statt 50-800 Bytes). Das spart 85-95% Header-Traffic.",
        difficulty = 5,
        funFact = "HPACK's Zustandsbehaftung war tatsächlich ein Sicherheitsproblem: CRIME und BREACH-Angriffe zeigten, dass Kompression über TLS-Sitzungsgrenzen Seitenkanal-Angriffe ermöglicht. HPACK wurde speziell designt um diese Angriffe zu verhindern."
    ),
    // 18
    Question(
        categoryId = 7,
        questionText = "Was unterscheidet QPACK (HTTP/3) von HPACK (HTTP/2) in Bezug auf Head-of-Line-Blocking?",
        answerA = "QPACK verwendet zwei unidirektionale QUIC-Streams für Encoder- und Decoder-Kommunikation; Header eines Streams blockieren andere Streams nicht",
        answerB = "QPACK verzichtet komplett auf Header-Kompression um Blocking zu eliminieren",
        answerC = "QPACK sendet jeden Header unabhängig ohne Tabellen und vermeidet so Zustandssynchronisation",
        answerD = "QPACK ist identisch mit HPACK aber wird über UDP statt TCP übertragen",
        correctAnswer = 0,
        explanation = "HPACK ist zustandsbehaftet und setzt voraus, dass Header in Reihenfolge verarbeitet werden — was über TCP kein Problem ist. QUIC liefert Streams aber ungeordnet. QPACK löst dies mit zwei dedizierten QUIC-Streams: Ein Encoder-Stream sendet Tabellen-Updates, ein Decoder-Stream bestätigt sie. Request-Streams können optional auf Tabellen-Updates warten oder sofort senden ohne Tabellenzustände — kein Request blockiert einen anderen.",
        difficulty = 5,
        funFact = "Die QPACK-Spezifikation ist deutlich komplexer als HPACK weil sie Blocking-Freiheit mit Kompressionseffizienz balancieren muss. Das Ergebnis: QPACK erzielt typischerweise 95% der Kompressionseffizienz von HPACK ohne dessen Blocking-Problem."
    ),
    // 19
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert OpenFlow im Software Defined Networking (SDN) und welche Tabellen verwaltet ein OpenFlow-Switch?",
        answerA = "OpenFlow trennt Control Plane vom Data Plane; ein OpenFlow-Controller installiert Flow-Table-Regeln im Switch; der Switch führt Match-Action-Regeln aus ohne eigene Routing-Intelligenz",
        answerB = "OpenFlow ist ein proprietäres Cisco-Protokoll das BGP-Routing in Rechenzentren ersetzt",
        answerC = "OpenFlow-Switches berechnen selbst Routing-Entscheidungen und synchronisieren ihre Tabellen mit einem zentralen Server",
        answerD = "OpenFlow verwendet XML-basierte Konfigurationsdateien die auf jedem Switch manuell eingespielt werden",
        correctAnswer = 0,
        explanation = "OpenFlow-Switches haben Flow Tables mit Match-Action-Einträgen: {Match-Felder (Src/Dst-IP, Port, VLAN, etc.), Priority, Counters, Instructions (forward, drop, modify, send to controller)}. Der SDN-Controller verbindet sich via OpenFlow-Protokoll (TCP/TLS) mit Switches und installiert, modifiziert oder löscht Flow-Entries. Neue, unbekannte Pakete (Table-Miss) werden an den Controller gesendet, der eine Entscheidung trifft.",
        difficulty = 5,
        funFact = "Google's B4-Netzwerk war eines der ersten großen Produktionsnetzwerke das vollständig auf SDN/OpenFlow umgestellt wurde — 2013 berichtete Google von 100% Bandbreitenauslastung auf WAN-Links, verglichen mit 30-40% bei traditionellem Routing."
    ),
    // 20
    Question(
        categoryId = 7,
        questionText = "Was ist P4 (Programming Protocol-Independent Packet Processors) und was kann es, was OpenFlow nicht kann?",
        answerA = "P4 ist eine domänenspezifische Sprache um den Datenplan von Netzwerkgeräten zu programmieren — Parser, Match-Action-Tabellen und Deparser werden in P4 definiert; OpenFlow verwendet nur vordefinierte Header-Felder",
        answerB = "P4 ist ein Managementprotokoll für SDN-Controller das REST-APIs für Switch-Konfiguration bietet",
        answerC = "P4 ist die vierte Version des OpenFlow-Protokolls mit erweiterter IPv6-Unterstützung",
        answerD = "P4 ist ein paralleler Verarbeitungsstandard für Multi-Core-CPUs in Netzwerkprozessoren",
        correctAnswer = 0,
        explanation = "OpenFlow ist an vordefinierte Header-Felder gebunden (IP, TCP, Ethernet). Neue Protokolle wie VXLAN oder benutzerdefinierte Tunnel brauchen OpenFlow-Erweiterungen. P4 erlaubt dem Programmierer, den kompletten Packet-Processing-Pipeline zu definieren: Welche Header geparst werden, welche Tabellen existieren, welche Aktionen möglich sind. P4-Programme laufen auf programmierbaren ASICs (Tofino, Trident+) oder Software-Switches.",
        difficulty = 5,
        funFact = "Intel/Barefoot's Tofino-ASIC (P4-programmierbar) kann 12,8 Tbps an Paketen verarbeiten — mehr als mancher traditioneller Switch-ASIC. Microsofts Azure und Googles Jupiter-Netzwerk nutzen P4-programmierbare Hardware."
    ),
    // 21
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert Consistent Hashing als Load-Balancing-Algorithmus und was ist sein Hauptvorteil?",
        answerA = "Consistent Hashing bildet Requests und Server auf einen Ring ab; bei Hinzufügen/Entfernen von Servern werden nur die Keys des betroffenen Segments umverteilt, nicht alle Keys",
        answerB = "Consistent Hashing verteilt Last gleichmäßig durch Round-Robin und speichert die Zuordnung in einer zentralen Datenbank",
        answerC = "Consistent Hashing verwendet den HTTP-Host-Header als Hashwert und leitet alle Anfragen für eine Domain an denselben Server",
        answerD = "Consistent Hashing ist ein Algorithmus der alle Server gleich stark belastet unabhängig von der Request-Komplexität",
        correctAnswer = 0,
        explanation = "Normales Modular-Hashing (key % n) verteilt bei n→n+1 Servern fast alle Keys neu. Consistent Hashing platziert Server und Keys auf einem virtuellen Ring (z.B. 2³²). Jeder Key geht zum nächsten Server im Uhrzeigersinn. Beim Hinzufügen eines Servers werden nur die Keys zwischen dem neuen Server und seinem Vorgänger umverteilt (~1/n aller Keys) — alle anderen bleiben stabil.",
        difficulty = 5,
        funFact = "Consistent Hashing wurde 1997 von David Karger et al. für das Akamai-CDN entwickelt. Heute ist es fundamental für verteilte Systeme: Cassandra, DynamoDB, Memcached und viele CDNs verwenden Varianten davon."
    ),
    // 22
    Question(
        categoryId = 7,
        questionText = "Was ist ECMP (Equal-Cost Multi-Path) und welches Problem entsteht bei TCP-Flows?",
        answerA = "ECMP verteilt Traffic über mehrere gleichgewertete Pfade per Flow-basiertem Hashing; das Problem ist Flowlet-Polarisierung: bestimmte Hash-Werte überladen einzelne Pfade",
        answerB = "ECMP sendet jedes Paket abwechselnd über verschiedene Pfade, was zu Paket-Umordnung und TCP-Retransmissions führt",
        answerC = "ECMP ist nur für UDP-Traffic geeignet und verursacht bei TCP-Sessions immer Verbindungsabbrüche",
        answerD = "ECMP ist ein Cisco-proprietärer Algorithmus der nur mit OSPF-Routing funktioniert",
        correctAnswer = 0,
        explanation = "ECMP verwendet einen Hash über 5-Tupel (Src-IP, Dst-IP, Src-Port, Dst-Port, Protokoll) um Flows einem Pfad zuzuweisen — so bleibt ein TCP-Flow auf einem Pfad (keine Umordnung). Das Problem: Per-Paket-ECMP würde Umordnung verursachen und TCP-Performance zerstören. Flow-basiertes ECMP kann ungleich verteilen: Wenige Elephant-Flows überlasten einen Pfad während andere leer bleiben — Lastungleichgewicht trotz gleichwertiger Pfade.",
        difficulty = 5,
        funFact = "Flowlet-basiertes Load Balancing (FLARE, Conga) löst das Elephant-Flow-Problem: Wenn zwischen zwei Bursts eines Flows eine Pause auftritt (größer als maximale Paketlaufzeitdifferenz), kann der nächste Burst auf einen anderen Pfad gesendet werden ohne Umordnung zu riskieren."
    ),
    // 23
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert Anycast-Routing in CDN-Infrastrukturen und was passiert bei einem Anycast-Ausfall?",
        answerA = "Anycast kündigt dieselbe IP-Adresse von mehreren geografischen Standorten via BGP an; Clients routen automatisch zum nächsten Standort; bei Ausfall eines PoP zieht BGP die Route zurück",
        answerB = "Anycast ist ein DNS-Mechanismus der Clients auf den nächsten CDN-Server verweist ohne IP-Manipulation",
        answerC = "Anycast repliziert TCP-Sessions aktiv zwischen mehreren Servern um Ausfälle transparent zu behandeln",
        answerD = "Anycast verwendet ICMP-Redirects um Clients auf optimale Server umzuleiten",
        correctAnswer = 0,
        explanation = "Mehrere CDN-PoPs (Points of Presence) kündigen dieselbe Ziel-IP (z.B. 1.2.3.4) über BGP an. Das Internet-Routing bevorzugt den Pfad mit dem kürzesten AS-Pfad und niedrigsten Metriken — Clients werden automatisch zum geografisch nächsten PoP geroutet. Fällt ein PoP aus, zieht er seine BGP-Ankündigung zurück, und Traffic failover-t automatisch zum nächsten PoP. Cloudflare, Google und Akamai nutzen dies extensiv.",
        difficulty = 5,
        funFact = "Die 13 Root-DNS-Server (a.root-servers.net bis m.root-servers.net) sind tatsächlich über 1500 physische Server weltweit verteilt — alle über Anycast erreichbar. 'f.root-servers.net' (ISC) allein hat über 230 physische Standorte."
    ),
    // 24
    Question(
        categoryId = 7,
        questionText = "Was ist IPv6 Neighbor Discovery Protocol (NDP) und welche Protokolle aus IPv4 ersetzt es?",
        answerA = "NDP ersetzt ARP (Address Resolution), ICMP Router Discovery und ICMP Redirect; es verwendet ICMPv6 Neighbor Solicitation/Advertisement für MAC-Address-Auflösung",
        answerB = "NDP ist das IPv6-Äquivalent von DHCP und verteilt IP-Adressen an Clients in einem Subnetz",
        answerC = "NDP ist ein Routing-Protokoll das OSPFv3 in IPv6-Netzwerken ersetzt",
        answerD = "NDP ist ein Sicherheitsprotokoll das ARP-Poisoning durch kryptografische Signaturen verhindert",
        correctAnswer = 0,
        explanation = "NDP (RFC 4861) verwendet ICMPv6 (Typ 133-137) und ersetzt: ARP (durch Neighbor Solicitation/Advertisement für MAC-Auflösung), ICMP Router Discovery (durch Router Solicitation/Advertisement), ICMP Redirects. Zusätzlich implementiert NDP Duplicate Address Detection (DAD), Stateless Address Autoconfiguration (SLAAC) und Prefix-Ankündigung. Multicast statt Broadcast: Solicitations gehen an Solicited-Node Multicast-Adressen.",
        difficulty = 5,
        funFact = "NDP hat eine bekannte Sicherheitslücke: NDP-Spoofing (analog zu ARP-Poisoning). SEcure Neighbor Discovery (SEND, RFC 3971) verwendet kryptografisch generierte IPv6-Adressen (CGA) um NDP-Nachrichten zu authentifizieren — wird aber kaum eingesetzt."
    ),
    // 25
    Question(
        categoryId = 7,
        questionText = "Was ist IPv6 SLAAC (Stateless Address Autoconfiguration) und wie generiert es Adressen?",
        answerA = "SLAAC kombiniert den Netzwerk-Präfix aus Router Advertisement (64 Bit) mit einer Interface-ID (64 Bit) aus der MAC-Adresse (EUI-64) oder einer datenschutzfreundlichen Zufalls-ID",
        answerB = "SLAAC ist identisch mit DHCPv6 und erhält Adressen von einem zentralen Server",
        answerC = "SLAAC generiert IPv6-Adressen vollständig zufällig ohne Netzwerkkoordination",
        answerD = "SLAAC verwendet nur Link-Local-Adressen und ist nicht für globale Kommunikation geeignet",
        correctAnswer = 0,
        explanation = "SLAAC (RFC 4862): Router senden Router Advertisements mit dem Netzwerkpräfix (typisch /64). Hosts generieren die Interface-ID entweder aus der MAC-Adresse via EUI-64-Transformation (MAC wird auf 64 Bit erweitert, ff:fe in der Mitte eingefügt, 7. Bit invertiert) oder verwenden Privacy Extensions (RFC 4941) mit temporären Zufalls-IDs zur Verhinderung von User-Tracking.",
        difficulty = 5,
        funFact = "EUI-64-generierte Adressen sind ein Datenschutzproblem: Die MAC-Adresse, die Gerätehersteller identifiziert, ist weltweit sichtbar. Windows verwendet seit XP SP2 standardmäßig Privacy Extensions (temporäre Zufalls-Adressen), macOS seit 10.7."
    ),
    // 26
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen IPv6-Übergangsmechanismen 6to4, Teredo und ISATAP?",
        answerA = "6to4 tunnelt IPv6 in IPv4 (Protokoll 41) ohne NAT-Durchquerung; Teredo tunnelt IPv6 in UDP/IPv4 für NAT-Traversal; ISATAP ist für Intra-Site-Tunneling ohne NAT gedacht",
        answerB = "Alle drei sind identisch, unterscheiden sich nur in der maximalen Tunnellänge",
        answerC = "6to4 und Teredo sind veraltet und deaktiviert; ISATAP ist der aktuelle Standard für IPv6-Migration",
        answerD = "Teredo verwendet TCP statt UDP für zuverlässige IPv6-Pakete durch NAT",
        correctAnswer = 0,
        explanation = "6to4 (RFC 3056): IPv6-Pakete werden in IPv4-Protokoll-41-Pakete eingebettet. Benötigt eine öffentliche IPv4-Adresse. Scheitert an NAT. Teredo (RFC 4380): IPv6 in UDP/IPv4 — überwindet NAT durch UDP-Hole-Punching. Funktioniert auch hinter NAT aber mit Latenz-Overhead. ISATAP (RFC 5214): Für Unternehmensnetze, tunnelt IPv6 in IPv4, kein NAT-Traversal. Alle drei gelten heute als deprecated — natives IPv6 oder 464XLAT sind bevorzugt.",
        difficulty = 5,
        funFact = "Teredo war in Windows Vista und 7 standardmäßig aktiv und wurde von vielen als Sicherheitsrisiko gesehen: Es öffnete einen IPv6-Tunnel durch die Firewall, dessen Inhalt viele Firewalls nicht inspizierten."
    ),
    // 27
    Question(
        categoryId = 7,
        questionText = "Was ist DPDK (Data Plane Development Kit) und wie unterscheidet es sich von normalem Kernel-Networking?",
        answerA = "DPDK ermöglicht Kernel-Bypass-Networking: User-Space-Treiber übernehmen die NIC direkt, eliminieren Syscalls und Kontext-Wechsel, und erreichen Single-Core-Forwarding von 10-100 Mpps",
        answerB = "DPDK ist ein Linux-Kernel-Modul das Netzwerkpakete mit höherer Priorität als andere Prozesse verarbeitet",
        answerC = "DPDK ist ein Programmierframework für FPGA-basierte Netzwerkkarten mit dedizierter Hardware",
        answerD = "DPDK ist ein Debugging-Tool das Netzwerkpakete im Kernel-Space aufzeichnet ohne den Traffic zu beeinflussen",
        correctAnswer = 0,
        explanation = "Normaler Kernel-Netzwerkstack: Paket → Hardware-Interrupt → Kernel-Interrupt-Handler → Socket-Buffer → Syscall → User-Space. Jeder Interrupt und Syscall kostet Microsekunden. DPDK: User-Space-PMD (Poll Mode Driver) pollt die NIC kontinuierlich ohne Interrupts. Pakete gehen direkt in huge-pages-Speicher im User-Space. Ergebnis: <100ns Latenz, 100+ Mpps auf modernen NICs. Genutzt von Telekommunikation, High-Frequency-Trading, NFV.",
        difficulty = 5,
        funFact = "DPDK wurde 2010 von Intel entwickelt. VPP (Vector Packet Processing), Open vSwitch-DPDK und Snort IDS nutzen DPDK. Ein einziger CPU-Core kann mit DPDK bis zu 80 Mpps (Millionen Pakete pro Sekunde) weiterleiten — verglichen mit ~1 Mpps im Linux-Kernel."
    ),
    // 28
    Question(
        categoryId = 7,
        questionText = "Was ist RDMA (Remote Direct Memory Access) und welche Protokolle implementieren es im Ethernet-Umfeld?",
        answerA = "RDMA ermöglicht direkten Speicherzugriff zwischen Hosts ohne CPU-Beteiligung; RoCE (RDMA over Converged Ethernet) und iWARP implementieren es auf Ethernet",
        answerB = "RDMA ist ein proprietäres Infiniband-Protokoll das nur in HPC-Clustern ohne Ethernet eingesetzt wird",
        answerC = "RDMA ist ein Speicherbus-Protokoll für NVMe-SSDs das Netzwerklatenz durch lokale Cache-Kohärenz eliminiert",
        answerD = "RDMA überträgt Daten über TCP aber umgeht den TCP-Stack durch spezielle Kernel-Module",
        correctAnswer = 0,
        explanation = "RDMA ermöglicht Zero-Copy-Transfers: Daten werden direkt aus dem Speicher des Senders in den Speicher des Empfängers geschrieben, ohne dass die CPU des Empfängers involviert ist. Latenz: <2 Microsekunden. RoCE (v1: L2, v2: UDP/IP) ermöglicht RDMA über normale Ethernet-Infrastruktur. iWARP implementiert RDMA über TCP (weniger verbreitet wegen TCP-Overhead). Genutzt in AI-Training-Clustern (GPUDirect RDMA), Storage (NVMe-oF).",
        difficulty = 5,
        funFact = "NVIDIA's GPUDirect RDMA ermöglicht, dass GPUs direkt Daten aus dem Netzwerk empfangen ohne den CPU-RAM zu durchqueren. Das ist entscheidend für LLM-Training: Ein 'AllReduce' über 8 GPUs in verschiedenen Servern kann mit RDMA in Microsekunden statt Millisekunden abgeschlossen werden."
    ),
    // 29
    Question(
        categoryId = 7,
        questionText = "Wie unterscheidet sich IKEv2/IPsec von WireGuard bei der Schlüsselverwaltung und dem Verbindungsaufbau?",
        answerA = "WireGuard verwendet statisch konfigurierte Public Keys ohne Handshake-Phase; IKEv2 führt einen mehrstufigen Handshake zur dynamischen Schlüsselaushandlung durch",
        answerB = "WireGuard implementiert einen eigenen Handshake der komplexer als IKEv2 ist, aber mehr Cipher-Optionen bietet",
        answerC = "IKEv2 verwendet statische Keys während WireGuard dynamisch neue Keys für jede Session generiert",
        answerD = "Beide Protokolle sind funktional identisch, WireGuard ist nur eine vereinfachte Implementation",
        correctAnswer = 0,
        explanation = "IKEv2 (RFC 7296): Dynamischer Handshake (IKE_SA_INIT + IKE_AUTH), unterstützt viele Cipher Suites, Zertifikate, EAP. Flexibel aber komplex (~15.000 Zeilen Code). WireGuard: Peers werden durch statische Curve25519 Public Keys identifiziert, die vorab konfiguriert werden. Kein klassischer Handshake — ein 1-RTT Initiierungs-Austausch mit ChaCha20-Poly1305/BLAKE2s. ~4000 Zeilen Code — deutlich kleiner, auditierbar.",
        difficulty = 5,
        funFact = "WireGuard's Entwickler Jason Donenfeld hat es mit dem Ziel geschrieben, es auf einem Blatt Papier vollständig spezifizieren zu können. Linus Torvalds nannte es 'a work of art' und integrierte es direkt in Linux 5.6 (2020)."
    ),
    // 30
    Question(
        categoryId = 7,
        questionText = "Was ist das Cryptokey-Routing-Konzept in WireGuard?",
        answerA = "WireGuard verknüpft jeden Peer-Public-Key mit erlaubten IP-Ranges; eingehende Pakete werden nach Entschlüsselung anhand der Quell-IP dem richtigen Peer zugeordnet",
        answerB = "Cryptokey-Routing bedeutet dass WireGuard alle Routing-Entscheidungen durch den Public-Key-Fingerprint des Pakets trifft statt durch IP-Adressen",
        answerC = "WireGuard verschlüsselt Routing-Tabellen-Updates zwischen Peers kryptografisch um BGP-Hijacking zu verhindern",
        answerD = "Cryptokey-Routing ist ein Mechanismus der WireGuard-Pakete durch normale Firewalls ohne Port-Freigabe leitet",
        correctAnswer = 0,
        explanation = "In der WireGuard-Konfiguration wird jedem Peer-Public-Key eine Liste 'AllowedIPs' zugeordnet (z.B. Peer A → 10.0.0.1/32, Peer B → 10.0.0.2/32). Beim Senden: Ziel-IP → Lookup in AllowedIPs-Tabelle → verschlüsseln mit entsprechendem Peer-Key. Beim Empfangen: Paket entschlüsseln → Quell-IP mit AllowedIPs des verwendeten Peer-Keys vergleichen → wenn nicht in AllowedIPs: verwerfen.",
        difficulty = 5,
        funFact = "WireGuard ist zustandslos in einer interessanten Weise: Es gibt keine Session-Terminierung. Wenn ein Peer 3 Minuten keine authentifizierten Pakete sendet, wird die Session still verworfen — aber beim nächsten Paket wird automatisch ein neuer Handshake durchgeführt."
    ),
    // 31
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert PIM-SM (Protocol Independent Multicast - Sparse Mode) und was ist der Rendezvous Point?",
        answerA = "PIM-SM baut einen bidirektionalen Shared Tree über einen Rendezvous Point (RP) auf; Sources senden zum RP, Empfänger abonnieren über IGMP und der RP verbindet beide",
        answerB = "PIM-SM sendet Multicast-Pakete an alle Router im Netzwerk und lässt nicht interessierte Router sie verwerfen",
        answerC = "PIM-SM ist identisch mit PIM-DM (Dense Mode) aber optimiert für Netzwerke mit vielen Teilnehmern",
        answerD = "PIM-SM verwendet OSPF-Linkstate-Daten um optimale Multicast-Bäume zu berechnen",
        correctAnswer = 0,
        explanation = "PIM-SM (RFC 7761): Initialer Shared Tree: Empfänger melden Interesse via IGMP → nächster Router sendet PIM Join Richtung RP → Source sendet encapsulierte Pakete via Register-Nachrichten zum RP → RP verteilt auf Shared Tree (*,G). Optimierung: Switch to Shortest Path Tree (SPT): Wenn Traffic-Rate einen Schwellwert überschreitet, wechselt der Leaf-Router zu einem Source-spezifischen Shortest-Path-Tree (S,G) für optimale Pfade.",
        difficulty = 5,
        funFact = "PIM-SM wird für IPTV und professionelles Streaming verwendet — IPTV-Provider können Tausende von Kanälen über ein einziges Netzwerk liefern, ohne dass jeder Kanal separate Unicast-Streams zu jedem Empfänger sendet."
    ),
    // 32
    Question(
        categoryId = 7,
        questionText = "Was ist SSM (Source Specific Multicast) und welches Problem löst es gegenüber ASM (Any-Source Multicast)?",
        answerA = "SSM beschränkt Multicast auf einen spezifischen Sender (S,G)-Gruppen; Empfänger abonnieren eine Quelle direkt und eliminieren den Rendezvous Point, was DoS-Angriffe durch gefälschte Sources verhindert",
        answerB = "SSM ist eine vereinfachte Version von PIM-SM für kleine Netzwerke mit weniger als 100 Teilnehmern",
        answerC = "SSM sendet Multicast-Pakete über SSL/TLS verschlüsselt um Abhören zu verhindern",
        answerD = "SSM ist das Sicherheitsframework für Multicast das PIM durch RPKI-ähnliche Zertifikate ersetzt",
        correctAnswer = 0,
        explanation = "ASM (Any-Source Multicast, RFC 1112): Jeder kann zu einer Multicast-Gruppe (G) senden — DoS-Angriff durch gefälschte Sources möglich. RP ist Single Point of Failure. SSM (RFC 4607): Empfänger abonnieren (S,G)-Paare — eine spezifische Source-IP plus Gruppe. PIM-SSM baut direkt Source-spezifische Bäume ohne RP. IGMPv3/MLDv2 werden genutzt um Source-spezifische Joins zu signalisieren. DoS durch fremde Sources unmöglich.",
        difficulty = 5,
        funFact = "Die IANA reserviert 232.0.0.0/8 exklusiv für SSM. IPTV-Systeme verwenden fast ausschließlich SSM — ein TV-Kanal entspricht einem (Source,Group)-Paar. Der Receiver-seitige Switch zu SSM eliminiert rund 90% der Multicast-Routing-Komplexität."
    ),
    // 33
    Question(
        categoryId = 7,
        questionText = "Wie unterscheidet sich IGMPv3 von IGMPv2 in Bezug auf Source Filtering?",
        answerA = "IGMPv3 unterstützt Source-spezifische Reports: Hosts können (INCLUDE, {S1,S2}) oder (EXCLUDE, {S1}) für eine Gruppe signalisieren; IGMPv2 kennt nur (*, G)-Mitgliedschaften",
        answerB = "IGMPv3 verschlüsselt IGMP-Reports während IGMPv2 sie im Klartext sendet",
        answerC = "IGMPv3 verwendet UDP statt IP-Protokoll 2 für IGMP-Nachrichten",
        answerD = "IGMPv3 führt Acknowledge-Mechanismen für IGMP-Leaves ein um Packet Loss zu kompensieren",
        correctAnswer = 0,
        explanation = "IGMPv2 (RFC 2236): Hosts können Gruppen joinen (*,G) oder lassen (Leave). Kein Source-Filter. IGMPv3 (RFC 3376): Membership Reports enthalten Source-Listen. INCLUDE-Modus: 'Sende mir Traffic nur von diesen Quellen'. EXCLUDE-Modus: 'Sende mir Traffic von allen außer diesen'. IGMPv3 ist Voraussetzung für SSM (Source Specific Multicast). Router können mit IGMPv3 direkt Source-spezifische PIM-Joins aufbauen.",
        difficulty = 5,
        funFact = "MLDv2 (Multicast Listener Discovery v2) ist das IPv6-Äquivalent zu IGMPv3. Es verwendet ICMPv6 anstelle eines eigenen IP-Protokolls. Die Funktionalität ist identisch — Source-spezifische Subscriptions für IPv6-Multicast-Gruppen."
    ),
    // 34
    Question(
        categoryId = 7,
        questionText = "Was ist Network Function Virtualization (NFV) und wie unterscheidet es sich von SDN?",
        answerA = "NFV virtualisiert Netzwerkfunktionen (Firewall, Load Balancer, DPI) auf Standard-x86-Hardware statt dedizierter Appliances; SDN trennt Control von Data Plane — beide sind komplementär",
        answerB = "NFV und SDN sind zwei Namen für dasselbe Konzept — Virtualisierung des Netzwerk-Managements",
        answerC = "NFV ist der Nachfolger von SDN und macht OpenFlow überflüssig durch vollständige Software-Implementation",
        answerD = "NFV virtualisiert die physische Netzwerkinfrastruktur (Router, Switches) während SDN die Anwendungen virtualisiert",
        correctAnswer = 0,
        explanation = "SDN: Trennt Steuerungsebene (wo entscheide ich?) von Datenebene (wo führe ich aus?). Fokus: Programmierbares Netzwerk-Verhalten. NFV: Führt Netzwerkfunktionen als Software-VMs/Container auf Standard-Servern aus statt auf teuren proprietären Appliances. Fokus: Hardware-Unabhängigkeit. Ein SDN-Controller kann NFV-Instanzen steuern — sie ergänzen sich: SDN orchestriert, NFV virtualisiert die Funktionen selbst.",
        difficulty = 5,
        funFact = "Telekommunikationsunternehmen wie AT&T und Deutsche Telekom haben Milliarden in NFV investiert. AT&T hat 75% seiner Netzwerkfunktionen auf NFV migriert — von physischen Appliances zu Software auf White-Box-Servern."
    ),
    // 35
    Question(
        categoryId = 7,
        questionText = "Was ist HTTP/2 Server Push und warum hat es in der Praxis enttäuscht?",
        answerA = "Server Push erlaubt Servern, Ressourcen proaktiv zu senden bevor der Client sie anfordert; in der Praxis verschlechterte es oft Performance weil es mit Browser-Cache-Eviction kollidierte und Browser es deprioritisierten",
        answerB = "Server Push ist ein WebSocket-ähnliches Feature das bidirektionale HTTP-Kommunikation ohne Polling ermöglicht",
        answerC = "Server Push in HTTP/2 verwendet UDP für asynchrone Push-Nachrichten an mehrere Clients gleichzeitig",
        answerD = "Server Push ist eine Sicherheitsfunktion die Man-in-the-Middle-Angriffe verhindert indem der Server Zertifikate aktiv pusht",
        correctAnswer = 0,
        explanation = "HTTP/2 Server Push erlaubt dem Server via PUSH_PROMISE-Frame, Ressourcen zu senden die der Client vermutlich braucht (z.B. CSS wenn HTML angefragt wird). Problem: Der Server weiß nicht was im Browser-Cache ist — er pusht ggf. bereits gecachte Ressourcen. Browser implementierten keine effiziente Cache-Digests. Chrome hat Server Push in Chrome 106 komplett entfernt. HTTP/3 unterstützt Server Push zwar noch, aber auch hier ist die Adoption minimal.",
        difficulty = 5,
        funFact = "Twitch und Twitter haben Server Push intensiv getestet und festgestellt dass es ihre Performance verschlechterte. Der wahre Benefit von HTTP/2 kommt von Multiplexing und Header-Kompression — nicht von Server Push."
    ),
    // 36
    Question(
        categoryId = 7,
        questionText = "Was ist BGP Communities und wie werden sie für Traffic Engineering eingesetzt?",
        answerA = "BGP Communities sind optionale Attribute (32-Bit-Tag) die an Route-Updates angehängt werden; ISPs definieren Well-Known-Communities für Traffic-Steuerung (no-export, no-advertise) und Custom-Communities für Policy-Manipulation",
        answerB = "BGP Communities sind verschlüsselte Metadaten die den AS-Pfad vor anderen Netzwerken verbergen",
        answerC = "BGP Communities ersetzen den AS-PATH-Mechanismus für Routing-Loop-Prävention in modernen Netzwerken",
        answerD = "BGP Communities sind eine Art von VLAN-Tagging für WAN-Verbindungen zwischen verschiedenen Autonomen Systemen",
        correctAnswer = 0,
        explanation = "BGP Community (RFC 1997) ist ein 32-Bit-Attribut (AS:value). Well-Known: NO_EXPORT (nicht an eBGP-Peers) NO_ADVERTISE (gar nicht weitergeben). ISP-Custom: Kunden können durch Communities Policy beeinflussen — z.B. 'verbreite diese Route nicht nach Asien' (64512:4 bei manchen ISPs). Large Communities (RFC 8092) erweitern auf 96 Bit für größere AS.",
        difficulty = 5,
        funFact = "BGP Blackholing via Community 666: Viele ISPs bieten einen RTBH (Remotely Triggered Black Hole) Service — der Kunde tagged eine Route mit Community AS:666 und der ISP verwirft den Traffic an diese IP-Adresse, um DDoS-Angriffe abzumildern."
    ),
    // 37
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert TCP Fast Open (TFO) und welche Sicherheitsüberlegungen begrenzen seine Nutzung?",
        answerA = "TFO erlaubt Daten im TCP-SYN-Paket; der Server gibt beim ersten Handshake ein verschlüsseltes Cookie aus; nachfolgende Verbindungen senden Cookie+Daten sofort im SYN",
        answerB = "TCP Fast Open eliminiert den drei-Wege-Handshake vollständig durch pre-established persistente Verbindungen",
        answerC = "TFO verwendet UDP für den initialen Handshake und wechselt dann zu TCP für Datenübertragung",
        answerD = "TCP Fast Open ist identisch mit QUIC 0-RTT und wurde in HTTP/3 vollständig integriert",
        correctAnswer = 0,
        explanation = "TFO (RFC 7413): Erster Verbindungsaufbau: normaler 3-Way-Handshake + Server gibt TFO-Cookie (verschlüsselt mit Server-Key) an Client zurück. Folgeverbindungen: Client sendet SYN + Cookie + HTTP-Request in einem Paket. Server validiert Cookie und verarbeitet Request sofort ohne ACK abzuwarten. Spart 1-RTT. Sicherheitsproblem: Replay-Angriffe auf SYN-Daten, da SYN-Pakete oft mehrfach gesendet werden im Netz.",
        difficulty = 5,
        funFact = "Google hat TFO intensiv getestet und berichtet von 10-40% Reduktion in HTTP-Latenz für Folge-Verbindungen. Android und iOS unterstützen TFO, aber viele Middleboxes blockieren SYN-Pakete mit Datenpayload — was TFO in der Praxis limitiert."
    ),
    // 38
    Question(
        categoryId = 7,
        questionText = "Was ist ECMP-Hashing mit IP-Flow-Identifikation und wie beeinflusst es QUIC-Traffic?",
        answerA = "ECMP-Hashing über 5-Tupel (Src-IP, Dst-IP, Src-Port, Dst-Port, Proto) funktioniert für TCP; QUIC über UDP mit wechselnden Ports durch Connection Migration kann verschiedene Pfade nehmen und Pakete umordnen",
        answerB = "QUIC ist immun gegen ECMP-Hashing-Probleme weil es Pakete intern neu ordnet",
        answerC = "ECMP ist für QUIC nicht relevant da QUIC immer Single-Path-Übertragung verwendet",
        answerD = "QUIC verwendet feste UDP-Ports (443) weshalb ECMP es immer auf denselben Pfad hasht",
        correctAnswer = 0,
        explanation = "TCP-Flows bleiben durch 5-Tupel-Hashing auf einem ECMP-Pfad — der Tuple ändert sich nicht. QUIC über UDP: Bei Connection Migration ändert sich die Quell-IP oder der Quell-Port — damit ändert sich der ECMP-Hash und der Flow landet auf einem anderen Pfad. Übergangsphase: Pakete einer logischen QUIC-Verbindung kommen auf verschiedenen Pfaden an und müssen vom Empfänger geordnet werden. QUIC handles das — aber es ist suboptimal.",
        difficulty = 5,
        funFact = "IETF QUIC Bit Greasing (RFC 9287): QUIC kann zufällige Bits im Header setzen um Middlebox-Ossifikation zu vermeiden — Middleboxes die bestimmte Bit-Muster erwarten werden so gezwungen, sich korrekt zu verhalten oder den Traffic gar nicht zu inspizieren."
    ),
    // 39
    Question(
        categoryId = 7,
        questionText = "Was ist InfiniBand und in welchen Szenarien ist es Ethernet technisch überlegen?",
        answerA = "InfiniBand ist ein Hochgeschwindigkeits-Verbindungsprotokoll mit nativer RDMA-Unterstützung, ultraniedriger Latenz (<1µs) und verlustfreier Übertragung — überlegen bei HPC und AI-Training-Clustern",
        answerB = "InfiniBand ist eine veraltete Token-Ring-Technologie die in modernen Rechenzentren nicht mehr verwendet wird",
        answerC = "InfiniBand ist identisch mit 400GbE aber verwendet proprietäre Stecker die günstiger als SFP sind",
        answerD = "InfiniBand wird ausschließlich für Storage-Area-Networks verwendet und kann keine IP-Pakete transportieren",
        correctAnswer = 0,
        explanation = "InfiniBand (IB): Latenz <1 Mikrosekunde end-to-end (vs. Ethernet: 1-10µs), verlustfreie Credit-basierte Flusskontrolle, native RDMA ohne TCP/IP-Overhead. Bandbreiten: HDR (200 Gbps), NDR (400 Gbps). In AI-Clusters (GPT-4, LLaMA-Training): AllReduce-Operationen über IB statt Ethernet 5-10x schneller. Nachteil: proprietäres Ecosystem (früher Mellanox, jetzt NVIDIA), teurere Switches und Kabel.",
        difficulty = 5,
        funFact = "NVIDIA hat Mellanox (führender InfiniBand-Hersteller) 2020 für 6,9 Milliarden Dollar gekauft. Zufall? Sicher nicht — NVIDIAs GPU-Cluster brauchen InfiniBand für schnelle GPU-zu-GPU-Kommunikation. Das AI-Training-Boom hat InfiniBand-Preise explodieren lassen."
    ),
    // 40
    Question(
        categoryId = 7,
        questionText = "Was ist das BGP-Attribut MED (Multi-Exit Discriminator) und wie wird es für Inbound-Traffic-Engineering verwendet?",
        answerA = "MED (Attribut-Typ 4) ist ein optionales nicht-transitives Attribut das einem Upstream-AS signalisiert, welchen Eintrittspunkt es bei mehreren Verbindungen bevorzugen soll — niedrigerer MED wird bevorzugt",
        answerB = "MED ist eine kryptografische Signatur die BGP-Route-Updates authentifiziert und Hijacking verhindert",
        answerC = "MED bestimmt die maximale Anzahl von BGP-Verbindungen die ein AS gleichzeitig unterhalten kann",
        answerD = "MED ist ein Load-Balancing-Algorithmus der Traffic gleichmäßig über mehrere BGP-Sessions verteilt",
        correctAnswer = 0,
        explanation = "MED (RFC 4271, Attribute 4) wird von einem AS an seinen direkten eBGP-Nachbar-AS gesendet. Wenn AS B zwei Verbindungen zu AS A hat (Standort X und Y), kann AS A via MED signalisieren: 'Sende Traffic lieber durch X (MED=10) als durch Y (MED=100)'. MED ist aber schwach: Es wird nur innerhalb des empfangenden AS verglichen wenn es von derselben Origin kommt, und es ist nicht-transitiv (wird normalerweise nicht weitergegeben).",
        difficulty = 5,
        funFact = "BGP hat 13 Pfad-Attribute in seiner Entscheidungsmatrix. MED ist Position 6 von 13 in der BGP Best-Path-Selection. Die meisten BGP-Implementierungen folgen der Reihenfolge: Weight → LocalPref → AS_PATH → Origin → MED → ... — MED wird also erst sehr spät berücksichtigt."
    ),
    // 41
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert Least Connections Load Balancing und wann versagt es?",
        answerA = "Least Connections leitet neue Anfragen an den Server mit den wenigsten aktiven Verbindungen weiter; es versagt bei heterogenen Server-Kapazitäten und unterschiedlich schweren Requests",
        answerB = "Least Connections ist identisch mit Round Robin aber überspringt überlastete Server",
        answerC = "Least Connections zählt CPU-Auslastung der Server und sendet Requests immer an den am wenigsten belasteten",
        answerD = "Least Connections funktioniert nur mit UDP-Traffic da TCP-Sessions Zustandsinformationen im Load Balancer erfordern",
        correctAnswer = 0,
        explanation = "Least Connections wählt den Server mit min(active_connections). Problem 1: Nicht alle Requests sind gleich schwer — 1000 idle WebSocket-Verbindungen vs. 10 CPU-intensive API-Requests. Problem 2: Heterogene Server — Server A hat 2-fache Kapazität von Server B, erhält aber gleich viele Verbindungen. Lösung: Weighted Least Connections (berücksichtigt Server-Gewicht) oder Least Response Time (berücksichtigt Antwortzeit als Proxy für Auslastung).",
        difficulty = 5,
        funFact = "Nginx Plus, HAProxy und AWS ALB implementieren alle Varianten von Weighted Least Connections. HAProxy verwendet 'leastconn' als Algorithmus und kombiniert es intern mit Session-Persistenz für Sticky-Sessions — was die eigentliche Lastverteilung wieder undermines."
    ),
    // 42
    Question(
        categoryId = 7,
        questionText = "Was ist VXLAN (Virtual Extensible LAN) und wie löst es das VLAN-Skalierungsproblem?",
        answerA = "VXLAN kapselt Layer-2-Frames in UDP/IP; mit einem 24-Bit-VNI (VXLAN Network Identifier) unterstützt es 16 Millionen virtuelle Netzwerke statt 4094 bei 802.1Q-VLANs",
        answerB = "VXLAN ist eine Kompressionsschicht die VLAN-Headers verkleinert um mehr VLANs in dasselbe Netzwerk zu packen",
        answerC = "VXLAN ersetzt VLANs durch Layer-3-Routing und eliminiert Layer-2-Broadcasts vollständig",
        answerD = "VXLAN ist ein proprietäres VMware-Protokoll das nur in vSphere-Umgebungen funktioniert",
        correctAnswer = 0,
        explanation = "IEEE 802.1Q-VLANs: 12-Bit-VLAN-ID = maximal 4094 VLANs — unzureichend für moderne Multi-Tenant-Rechenzentren. VXLAN (RFC 7348): Kapselt Ethernet-Frames in UDP (Port 4789). 24-Bit-VNI im VXLAN-Header: 2^24 = ~16 Millionen virtuelle Netzwerke. VTEP (VXLAN Tunnel Endpoint) übernimmt Kapselung/Entkapselung. L2-Frames traversieren L3-Netzwerke transparent.",
        difficulty = 5,
        funFact = "AWS VPC nutzt eine VXLAN-ähnliche Overlay-Technologie. Microsoft Azure verwendet NVGRE (Network Virtualization using Generic Routing Encapsulation) — technisch ähnlich. Beide ermöglichen, dass Millionen von Kundennetzwerken isoliert auf derselben physischen Infrastruktur laufen."
    ),
    // 43
    Question(
        categoryId = 7,
        questionText = "Was ist Segment Routing (SR) und wie unterscheidet es sich von MPLS mit LDP/RSVP-TE?",
        answerA = "Segment Routing kodiert den Pfad als geordnete Liste von 'Segments' (SIDs) im Paket-Header; kein per-Flow-Zustand in Intermediate Nodes nötig — skalierbar ohne RSVP/LDP-Signalisierung",
        answerB = "Segment Routing ist eine verbesserte Version von MPLS die mehr Labels pro Paket erlaubt",
        answerC = "Segment Routing ersetzt BGP durch eine hop-by-hop-Entscheidungsfindung ähnlich wie Spanning Tree",
        answerD = "Segment Routing kodiert QoS-Anforderungen in IP-TOS-Bits und eliminiert MPLS komplett",
        correctAnswer = 0,
        explanation = "MPLS mit RSVP-TE: Für jeden Traffic-Engineering-Tunnel muss auf jedem Router Zustand (LFIB-Einträge) gehalten und via RSVP-Signalisierung synchronisiert werden. Skaliert schlecht. SR: Die Source kodiert den kompletten Pfad als Stack von Segment IDs (SIDs) direkt im Paket (MPLS-Labels oder IPv6-Extension-Headers). Intermediate Nodes müssen nur den Top-Segment kennen und weiterleiten — kein per-Flow-Zustand.",
        difficulty = 5,
        funFact = "Segment Routing over IPv6 (SRv6) kodiert Pfade in IPv6-Extension-Headers (Segment Routing Header, SRH). Jedes Segment ist eine vollständige IPv6-Adresse (128 Bit) — was SRv6-Pakete deutlich größer macht als MPLS-SR, aber dafür nativ in IPv6 integriert ist."
    ),
    // 44
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen IPsec Tunnel Mode und Transport Mode?",
        answerA = "Transport Mode verschlüsselt nur den Payload des IP-Pakets und behält den originalen IP-Header; Tunnel Mode kapselt das gesamte IP-Paket in ein neues IP-Paket mit neuem Header",
        answerB = "Tunnel Mode verwendet TLS für die Verschlüsselung während Transport Mode AES-GCM direkt auf IP anwendet",
        answerC = "Transport Mode ist nur für UDP geeignet, Tunnel Mode für TCP-Traffic",
        answerD = "Beide Modi sind identisch, unterscheiden sich nur in der verwendeten Schlüssellänge",
        correctAnswer = 0,
        explanation = "IPsec Transport Mode (RFC 4301): AH oder ESP wird zwischen IP-Header und Payload eingefügt. Src/Dst-IP bleiben sichtbar. Genutzt für End-to-End-Verschlüsselung zwischen zwei Hosts. IPsec Tunnel Mode: Das gesamte originale IP-Paket wird verschlüsselt/authentifiziert und in ein neues IP-Paket mit Gateway-IPs als Src/Dst eingebettet. Originale IPs sind verborgen. Standard für VPN-Gateways und Site-to-Site-VPNs.",
        difficulty = 5,
        funFact = "IPsec AH (Authentication Header) bietet nur Integrität und Authentizität — keine Vertraulichkeit. ESP (Encapsulating Security Payload) kann beides. In der Praxis wird AH kaum noch verwendet weil es mit NAT inkompatibel ist (NAT verändert IP-Header, was AH-Signaturen bricht)."
    ),
    // 45
    Question(
        categoryId = 7,
        questionText = "Wie funktioniert DNS TTL-basiertes Load Balancing und was sind seine fundamentalen Einschränkungen?",
        answerA = "DNS gibt mehrere A-Records zurück; kurze TTLs ermöglichen häufige Updates; aber Clients und Resolver cachen aggressiv und ignorieren TTLs — kein zuverlässiges Failover möglich",
        answerB = "DNS Load Balancing ist perfekt für Failover weil Resolver immer die aktuellsten Records abfragen",
        answerC = "DNS TTL-Werte unter 30 Sekunden werden von BIND und Unbound nicht akzeptiert",
        answerD = "DNS Load Balancing funktioniert nur mit IPv6-AAAA-Records, nicht mit IPv4-A-Records",
        correctAnswer = 0,
        explanation = "DNS-LB gibt multiple A-Records zurück (Round-Robin). Kurze TTLs (z.B. 30s) sollen schnelles Failover ermöglichen. Probleme: (1) Resolver-Caching: Stub-Resolver und OS-Caches ignorieren häufig TTL-Werte und cachen länger. (2) Aggressive Caching: CDNs und ISP-Resolver verletzen TTL-Standards. (3) Kein Healthcheck: DNS weiß nicht ob Server down ist — gibt unhealthy IPs zurück bis TTL abläuft. (4) Client-IP-Persistenz: TCP-Verbindungen bleiben auf der gecachten IP auch wenn DNS sich ändert.",
        difficulty = 5,
        funFact = "GitHub hatte 2012 einen langen Ausfall der zum Teil dadurch verlängert wurde, dass Nutzer und Resolver die alten DNS-Records trotz kurzem TTL aggresiv gecacht hatten. Das beschleunigte die Branche zur Verbesserung von Health-Check-basiertem DNS-Failover."
    ),
    // 46
    Question(
        categoryId = 7,
        questionText = "Was ist das Split-Horizon-Problem in Distance-Vector-Routing und wie lösen Split Horizon und Poison Reverse es?",
        answerA = "Split Horizon: Sende keine Route zurück zur Schnittstelle von der sie gelernt wurde; Poison Reverse: Sende die Route zurück aber mit unendlicher Metrik — beide verhindern 2-Knoten-Routing-Loops",
        answerB = "Split Horizon teilt Routing-Tabellen in zwei Hälften für schnelleres Lookup, Poison Reverse markiert gelöschte Routen als giftig",
        answerC = "Split Horizon ist ein OSPF-Mechanismus für Area-Border-Router; Poison Reverse wird nur in BGP verwendet",
        answerD = "Split Horizon verhindert Routing-Updates über WAN-Links; Poison Reverse beschleunigt Konvergenz durch sofortige Benachrichtigung aller Nachbarn",
        correctAnswer = 0,
        explanation = "Count-to-Infinity: A→B (1 Hop), B lernt A via A. Fällt A aus: B hat noch alte Route 'A via A'. A sieht Bs Route und glaubt A sei via B erreichbar (2 Hops). Metriken steigen bis Unendlich. Split Horizon: Router sendet Route X nicht zurück über die Schnittstelle von der er X gelernt hat — eliminiert 2-Knoten-Loops sofort. Poison Reverse: Sendet Route X zurück aber mit Metrik 16 (RIP-Infinity) — explizit als unerreichbar markiert, auch durch dicke Netzwerke.",
        difficulty = 5,
        funFact = "Count-to-Infinity ist in RIP auf 16 Hops begrenzt — das ist gleichzeitig das Maximum und das 'Unendlich'. Das bedeutet, dass ein RIP-Netzwerk maximal 15 Hops Durchmesser haben darf, bevor Routing-Loops nicht mehr erkannt werden können."
    ),
    // 47
    Question(
        categoryId = 7,
        questionText = "Was ist GRE (Generic Routing Encapsulation) und welche Limitierungen hat es gegenüber VXLAN?",
        answerA = "GRE ist ein simples Tunneling-Protokoll (IP-Protokoll 47) das beliebige Layer-3-Protokolle kapselt; es bietet kein natives Multiplexing, keine Verschlüsselung und problematisches NAT-Traversal",
        answerB = "GRE ist eine neuere Technologie als VXLAN und bietet bessere Sicherheit durch eingebaute AES-Verschlüsselung",
        answerC = "GRE verwendet UDP für besseres NAT-Traversal und ist der Nachfolger von VXLAN in modernen Rechenzentren",
        answerD = "GRE kann nur IP-Traffic tunneln während VXLAN beliebige Layer-2-Frames transportiert",
        correctAnswer = 0,
        explanation = "GRE (RFC 2784): Kapselt beliebige Netzwerk-Layer-Protokolle in IP. Header: 4-Byte GRE-Header + äußerer IP-Header. Kein Encryption (dafür GRE+IPsec). Kein Multiplexing für mehrere virtuelle Netzwerke (VXLAN hat 24-Bit-VNI). GRE traversiert NAT schlecht (IP-Protokoll 47, nicht TCP/UDP). VXLAN über UDP (Port 4789) traversiert NAT leichter. MTU-Problem: GRE fügt 24 Bytes Overhead hinzu — oft Fragmentierung oder MTU-Anpassung nötig.",
        difficulty = 5,
        funFact = "GRE wurde 1994 von Cisco entwickelt und ist trotz seines Alters und seiner Limitierungen noch weit verbreitet — besonders in MPLS-Netzwerken als Backup-Tunnel und in älteren VPN-Implementierungen. Cisco's DMVPN (Dynamic Multipoint VPN) basiert auf GRE mit NHRP."
    ),
    // 48
    Question(
        categoryId = 7,
        questionText = "Was ist der Unterschied zwischen reaktiver und proaktiver Congestion Control in Datacenter-Netzwerken?",
        answerA = "Reaktiv: TCP erkennt Verluste/ECN-Signale und reduziert Rate nach dem Fact; Proaktiv (DCQCN, SWIFT): Sender passt Rate basierend auf Vorhersagemodellen und frühen Signalen an bevor Queues überlaufen",
        answerB = "Reaktive Congestion Control verwendet UDP, proaktive verwendet TCP als Transportprotokoll",
        answerC = "Proaktive Congestion Control erhöht die Senderate aggressiver als reaktive und ist daher schneller",
        answerD = "Reaktiv und proaktiv sind Synonyme für TCP Reno und TCP CUBIC",
        correctAnswer = 0,
        explanation = "Reaktiv (TCP Reno/CUBIC/BBR): Sender reagiert auf Signale die Überlastung bereits anzeigen (Verlust, ECN-Markierung, Delay-Anstieg). Latenz zwischen Ereignis und Reaktion: mindestens 1 RTT. Proaktiv (DCQCN für RoCE, SWIFT für Google): Basieren auf Rate-Limitierung und frühzeitiger Signalisierung. DCQCN verwendet PFC (Priority Flow Control) und ECN in Kombination. SWIFT schätzt Queue-Depth anhand von Timestamps und agiert bevor Queues voll sind.",
        difficulty = 5,
        funFact = "Google's Swift-Protokoll (2020) wurde speziell für ihre Datacenter-Netzwerke entwickelt und soll DCQCN ersetzen. Es braucht keine PFC (Pause Frames) die in großen Netzwerken zu globalen Staus führen können — ein als 'PFC Deadlock' bekanntes Problem."
    ),
    // 49
    Question(
        categoryId = 7,
        questionText = "Was ist BGP Graceful Restart und warum ist es für Hochverfügbarkeits-Netzwerke kritisch?",
        answerA = "BGP Graceful Restart erlaubt einem Router nach einem Software-Neustart, seine BGP-Sessions wiederherzustellen ohne dass Nachbar-Router alle Routen entfernen und neu ankündigen müssen",
        answerB = "BGP Graceful Restart ist ein Failover-Mechanismus der BGP-Sessions automatisch auf Backup-Router überträgt",
        answerC = "BGP Graceful Restart deaktiviert Route-Flap-Damping um schnellere Konvergenz nach Ausfällen zu ermöglichen",
        answerD = "BGP Graceful Restart erzwingt bei Router-Neustart einen vollständigen Routing-Tabellen-Austausch mit allen Nachbarn",
        correctAnswer = 0,
        explanation = "Normaler BGP-Neustart: Session fällt weg → Peer löscht alle Routen von diesem Router → Network-wide Re-Konvergenz (Traffic-Ausfall für 30-300 Sekunden). Graceful Restart (RFC 4724): Restarting Router kündigt Graceful-Restart-Fähigkeit an. Beim Neustart: Peer-Router behalten Forwarding-State (Data Plane weiter aktiv) und Routen für eine konfigurierte Restart-Zeit. Nach Reconnect: normaler BGP-Update-Austausch, dann Stale-Routes entfernen. Traffic-Unterbrechung: Sekunden statt Minuten.",
        difficulty = 5,
        funFact = "Juniper und Cisco implementieren Graceful Restart unterschiedlich: Juniper nennt es 'Graceful Restart' (GR), Cisco nennt es 'Nonstop Forwarding' (NSF). NSF geht weiter und trennt Control Plane (Supervisor) von Data Plane (Line Cards) — die Data Plane läuft während des Supervisor-Neustarts weiter."
    ),
    // 50
    Question(
        categoryId = 7,
        questionText = "Was ist das Konzept des 'Ossification' im Kontext von Netzwerkprotokollen und wie adressiert QUIC es?",
        answerA = "Ossification bezeichnet die Versteinung von Protokollen durch Middleboxes die bestimmte Paketstrukturen erwarten; QUIC verschlüsselt fast seinen gesamten Header um Middlebox-Interferenz zu verhindern",
        answerB = "Ossification beschreibt das Einfrieren von IP-Adressen durch DHCP-Lease-Persistenz in Unternehmensnetzen",
        answerC = "Ossification ist ein BGP-Konzept das beschreibt wie alte Routen in Routing-Tabellen persistieren",
        answerD = "Ossification bezeichnet die mangelnde Unterstützung für neue Netzwerkprotokolle in alten Betriebssystemen",
        correctAnswer = 0,
        explanation = "TCP und TLS konnten über Jahrzehnte kaum verbessert werden: Middleboxes (Firewalls, NAT-Boxen, Performance-Enhancement-Proxies, DPI-Systeme) inspizieren TCP-Felder und gehen davon aus, dass bestimmte Bits bestimmte Bedeutungen haben. TCP-Optionsnummern werden selektiv gefiltert, SYN-mit-Daten wird geblockt. QUIC löst dies durch vollständige Verschlüsselung: Nur Version-Number und Connection-ID sind unverschlüsselt, alles andere (inkl. aller QUIC-Frames) ist mit TLS 1.3 verschlüsselt — Middleboxes können den Inhalt nicht inspizieren oder manipulieren.",
        difficulty = 5,
        funFact = "RFC 8546 ('The Wire Image of a Network Protocol') formalisiert das Ossification-Konzept. QUIC Bit Greasing (RFC 9287) setzt zufällige Bits in reservierten Feldern um Middleboxes zu testen — wenn eine Middlebox annimmt diese Bits müssen 0 sein und den Traffic blockt, wird das Ossification-Problem sofort sichtbar."
    )
)
