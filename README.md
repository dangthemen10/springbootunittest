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

**-File build.gradle:** `Thư mục gốc chứa file build.gradle dùng để cấu hình dự án.` `file build.gradle chứa thông tin cấu hình gradle như plugin, repository, dependency…`

**-File .gitignore:** `Thư mục gốc chứa file gitignore dùng để cấu hình dự án.`

**- Kubernetes — Learn Sidecar Container Pattern**: `https://docs.microsoft.com/en-us/azure/architecture/patterns/sidecar`  `https://hocweb.vn/kubernetes-service-la-gi-tai-sao-phai-su-dung-kubernetes-phan-3/#580e`

**-Thuật ngữ chuẩn hóa: ** `https://kubernetes.io/vi/docs/reference/glossary/?fundamental=true`

***Sidecar**: `https://www.bbva.com/en/sidecar-pattern-in-security/` `https://blog.vietnamlab.vn/container-design-pattern/`
 - **Nó là gì: **
    + Mẫu sidecar được sử dụng để mở rộng và / hoặc cải thiện chức năng của một quy trình (ứng dụng chính) bằng cách chạy song song các quy trình phụ trợ khác mà hầu như không có sự ghép nối nào giữa chúng. Thay vì sử dụng thư viện để triển khai chức năng, chúng tôi sử dụng một số quy trình hoặc vùng chứa có chức năng này được tích hợp sẵn, điều này cung cấp cho chúng tôi khả năng cách ly và đóng gói tốt hơn. Trong thời gian chạy, sidecar chia sẻ cùng một vòng đời (nó bắt đầu và dừng với tiến trình chính) cũng như các tài nguyên máy tính khác (lưu trữ, mạng,…). Nó là một thành phần riêng biệt, với vòng đời phần mềm riêng, được nhóm của ứng dụng chính kết hợp vào thời điểm triển khai.
- **Mô hình sidecar**:
    + Vòng đời thời gian chạy giống nhau, nhưng cho phép cập nhật độc lập
    + Quản lý phụ thuộc
    + Không chia sẻ, không có vấn đề tích hợp
    + Tính minh bạch (hầu như không bao giờ có), không có vấn đề tích hợp - Cạnh tranh tài nguyên
- **Khi nào sử dụng nó?**
    + Khi kiến trúc đa ngôn ngữ được hỗ trợ (và đang được sử dụng).
    + Thành phần thuộc sở hữu của một nhóm từ xa
    + Các vùng chứa chính và phụ đều được yêu cầu chạy trong cùng một máy chủ
    + Ứng dụng chính không có cơ chế mở rộng
    + Luôn có một vùng chứa orchestrator
    + Khi cần cùng một vòng đời thời gian chạy và cập nhật riêng lẻ cùng một lúc
      - Khi độ trễ là sự đánh đổi
      - Khi chi phí tài nguyên không đáng có thì lợi thế của sự cô lập
      - Khi ứng dụng và sidecar phải mở rộng quy mô khác nhau
- **Trường hợp sử dụng:**
  + Quản lý ứng dụng: Sidecar theo dõi môi trường để biết các thay đổi và khởi động lại hoặc thông báo cho ứng dụng chính để cập nhật cấu hình của nó.
  + Các dịch vụ cơ sở hạ tầng (quản lý thông tin xác thực, quản lý cấu hình, DNS, bộ điều hợp, bảo mật, kiểm soát truy cập,…)
  + Giám sát (tài nguyên, lưu lượng mạng,…)
  + Bộ điều hợp giao thức.

- **Design Pattern:** `https://itviec.com/blog/design-pattern/`
- **Fixtures:** sử dụng fixtures để tạo dữ liệu giả `https://viblo.asia/p/symfony2-doctrine-model-va-data-fixtures-ZK1ov1ENv5b9`.
- **SLF4J:** `https://stackjava.com/spring/code-vi-du-spring-boot-logging.html`
