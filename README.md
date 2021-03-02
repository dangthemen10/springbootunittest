**- src:** `Code được chứa trong thư mục src.`

**- Thư mục build:** `Thư mục build ra chứa các file class, file JAR. Với Maven là target còn Gradle là build.`

**- src/test:** `dùng để chứa các test class, dùng cho unit test.`

**- common package:** `chứa các class định nghĩa như enum, interface, class dùng chung và đơn giản.`

**- util package:** `chứa các lớp util (xử lý linh tinh), ví dụ như convert end date, tính toán đơn giản,...`

**- exception package:** `chứa các class có nhiệm vụ xử lý exception trong Spring Boot.`

**- Entity:**
`Đây là các java bean được ánh xạ từ các bảng trong cơ sở dữ liệu. Với chỉ duy nhất một bảng. cũng là domain model nhưng tương ứng với table trong DB, có thể map vào DB được. Lưu ý chỉ có entity mới có thể đại diện cho data trong DB.`

**- DTO (Data transfer
object):** `là các class đóng gói data để chuyển giữa client - server hoặc giữa các service trong microservice. Mục đích tạo ra DTO là để giảm bớt lượng info không cần thiết phải chuyển đi, và cũng tăng cường độ bảo mật.`

**- Domain
model:** `là các class đại diện cho các domain, hiểu là các đối tượng thuộc business như Client, Report, Department,... chẳng hạn. Trong ứng dụng thực, các class đại diện cho kết quả tính toán, các class làm tham số đầu vào cho service tính toán,... được coi là domain model.`

**- Repository (Data Access Layer)**
`Đại diện cho tầng data access. Đây là các interface giúp chúng ta thao tác với CSDL. Trong Spring Data JPA có một tính năng rất hay đó là CRUD Repository. Đây là một interface cung cấp các phương thức CRUD cơ bản. Chúng ta chỉ cần định nghĩa một interface kế thừa CRUD Repository, Spring Data JPA sẽ dùng các generic và reflection để sinh implementation tương ứng với interface đó. - Service còn có thể tương tác với service khác, hoặc dùng Repository để gọi DB. Repository là thằng trực tiếp tương tác, đọc ghi dữ liệu trong DB và trả cho service.`
`- Đây là nơi thực hiện giao tiếp với cơ sở dữ liệu, xử lý truy vấn và trả về dữ liệu service mong muốn`

**- Service (Business Logic Layer):**
`Chứa các code tính toán, xử lý. Khi Controller yêu cầu, thì Service tương ứng sẽ tiếp nhận và cho ra dữ liệu trả cho Controller (trả về Model). Controller sẽ gửi về View như trên.`
`- Đây là nới kiểm tra các ràng buộc, tính toàn vẹn và hợp lệ của dữ liệu. Đây là cũng là nơi tính toán, xử lý theo các nghiệp vụ và logic của yêu cầu.`

**- Controller (Presentation
Layer):** `controller để điều hướng các request đến business logic. trả về View (có chứa data sẵn, dạng trang HTML), hoặc Model thể hiện dưới dạng API cho View (View viết riêng bằng React, Vue, hoặc Angular).`
`- Là tầng giao tiếp với người dùng cuối (client) để hiển thị dữ liệu, thu thập dữ liệu, kiểm tra tính đúng đắn của dữ liệu trước khi gọi tầng service.`

**- Resources:** `Chứa các tài nguyên của ứng dụng như hình ảnh, static file, properties file,...`

**- Thư mục .gradle:** `là thư mục riêng của Gradle, không nên đụng tới hay exclude nó ra khỏi source code.`

**-File build.gradle:** `Thư mục gốc chứa file build.gradle dùng để cấu hình dự án.`

**-File .gitignore:** `Thư mục gốc chứa file gitignore dùng để cấu hình dự án.`



