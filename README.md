# SSO-SpringBoot

# Spring Boot Demo Screenshots

Dưới đây là các ảnh minh họa cho ứng dụng Spring Boot của chúng tôi.

## 1. Admin Login

![Admin Login](src/main/resources/images/adminlogin.png)

Đăng nhập bằng tài khoản **admin** để tạo một realm có tên **spring-demo**. Trong realm này, bạn có thể tạo tài khoản người dùng và thiết lập các **clients**.

## 2. User Account Page

![User Account](src/main/resources/images/useraccount.png)

Tạo tài khoản dành cho người dùng trong realm **spring-demo**.

## 3. User Login

![User Login](src/main/resources/images/userlogin.png)

Người dùng đăng nhập vào ứng dụng bằng tài khoản đã được tạo.

## 4. Result Page

![Result Page](src/main/resources/images/result.png)

Sau khi được **ủy quyền** từ Keycloak, người dùng sẽ được chuyển hướng trở về trang ứng dụng Spring Boot. Trang này sẽ hiển thị **email** và **tên** của người dùng.

## 5.refresh token


![Result Page](src/main/resources/images/resultrefreshtoken.png)
