▪ Họ và tên sinh viên; Lê Quốc Hưng


▪ Mã số sinh viên; 1150080136 


▪ Tên bài Lab; Lab8 LOCAL DNS ATTACK
DNS SPOOFING VÀ CACHE POISONING TRONG MẠNG ẢO CÔ LẬP



▪ Nội dung đã thực hiện; 
-	pfSense DNSLAB interface 10.9.0.1/24 và ruleset cô lập.
-	IP của DNS-SERVER, Victim, Kali đúng bảng địa chỉ.
-	BIND9 named-checkconf/named-checkzone thành công.
-	Baseline www.external.lab9.test -> 172.16.6.10.
-	Task 1: browser/curl đi tới 10.9.0.200 trong khi dig trực tiếp vẫn trả 172.16.6.10.
-	Task 2: Wireshark có query + forged response; Victim nhận 10.9.0.200.
-	Task 3: forged response tới resolver và cache chứa 10.9.0.200.
-	Task 3: forged response tới resolver và cache chứa 10.9.0.200.
-	Promiscuous Mode được trả về Deny sau lab.



▪ Kết quả thực hiện;
link Youtube: https://www.youtube.com/watch?v=rK4Kz_rU1M4

