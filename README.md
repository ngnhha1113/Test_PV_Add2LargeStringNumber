Viết phần lõi (core) trong 1 lớp riêng "MyBigNumber", method String sum(String stn1, String stn2) để cài đặt thuật toán cộng 2 số giống như các học sinh Tiểu học
thực hiện như sau
Duyệt đồng thời chuỗi stn1, stn2 từ phải sang trái, lấy ra từng kí tự (character), chuyển thành kí số (digit).
Cộng từng kí số.
Ghi nhận lại lịch sử phép toán vừa thực hiện (Ưu tiên dùng LOGGING. Không biết logging thì dùng PRINT cũng tạm chấp nhận)
Ví dụ lệnh sum("1234", "897") sẻ được thực hiện như sau:
Bước 1: Lấy 4 cộng với 7 được 11.
Lưu 1 vào kết quả và nhớ 1.
Bước 2: Lấy 3 cộng với 9 được 12. Cộng tiếp với nhớ 1 được 13
Lưu 3 vào kết quả được kết quả mới là "31"
Ghi nhớ 1.
Lặp lại các bước trên (nhớ lại học sinh lớp 3 đã cộng như thế nào thì lập trình tương tự như vậy)
…
Giả định: giá trị tham số truyền vào hàm là đúng, chỉ chứa các kí số hợp lệ, không có kí tự nào khác. Vì vậy chưa cần xử lý lỗi dữ liệu


Tải file về chỉ cần Run chạy trên Intellij hoặc esclip là được
