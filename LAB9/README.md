▪ Họ và tên sinh viên; Lê Quốc Hưng


▪ Mã số sinh viên; 1150080136 


▪ Tên bài Lab; Lab9 REMOTE DNS CACHE POISONING
TRONG MÔI TRƯỜNG pfSense CÔ LẬP




▪ Nội dung đã thực hiện; 
-	Ảnh pfSense ATTACKNET 10.10.0.1/24 và ruleset cô lập.
-	Ảnh Kali 10.10.0.200, không còn card DNSLAB; Promiscuous Mode = Deny.
-	Baseline VICTIM: www.example.lab10.test -> 172.16.6.10.
-	Ảnh AUTH-DNS [PENDING] và [HIT].
-	Ảnh resolver [CACHE] malicious delegation.
-	Wireshark/tcpdump trên DNS-SERVER hoặc APP-TEST thể hiện 10.9.0.10:33333 -> 172.16.6.20:53 và forged response ngược lại.
-	Ảnh VICTIM sau poison trả 10.10.0.200 và mở Fake Site.
-	Ảnh hardening: BIND9 chạy lại và source port không còn cố định 33333.
-	Bảng so sánh baseline / attack / restore.
-	Tên file: [Mã lớp]-Lab10_MSSV-HoTen.docx. Thực hiện cá nhân; không dùng ảnh minh họa trong tài liệu làm kết quả.



▪ Kết quả thực hiện;
link Youtube: 

