USE master
GO
--
IF  EXISTS(SELECT name FROM sys.databases
			WHERE name = 'BT1_Module4')
	DROP DATABASE BT1_Module4
--
CREATE DATABASE BT1_Module4
GO
--Kết nối CSDL
USE BT1_Module4
GO
--Tạo bảng LoaiSanPham
CREATE TABLE LoaiSanPham
(
	MaLoaiSP char(4) PRIMARY KEY,
	TenLoaiSP nvarchar(200)
)
--Tạo bảng SanPham
CREATE TABLE SanPham
(
	MaSP char(4) PRIMARY KEY,
	TenSP nvarchar(150),
	NhaSanXuat nvarchar(200),
	MaLoaiSP char(4),
	CONSTRAINT fk_sp_masp FOREIGN KEY(MaLoaiSP) REFERENCES LoaiSanPham(MaLoaiSP)
)
--Thêm dữ liệu vào bảng LoaiSanPham
INSERT INTO LoaiSanPham
VALUES('L001', N'Dụng cụ học tập')
INSERT INTO LoaiSanPham
VALUES('L002', N'Tạp chí')
INSERT INTO LoaiSanPham
VALUES('L003', N'Sách giáo khoa')
INSERT INTO LoaiSanPham
VALUES('L004', N'Sách tham khảo')
INSERT INTO LoaiSanPham
VALUES('L005', N'Truyện tranh')
--Thêm dữ liệu vào bảng SanPham
INSERT INTO SanPham
VALUES('SP01', N'Bút chì', N'Thiên Long', 'L001')
INSERT INTO SanPham
VALUES('SP02', N'Tiếng Việt 2', N'Giáo dục', 'L003')
INSERT INTO SanPham
VALUES('SP03', N'Toán 2', N'Giáo dục', 'L003')
INSERT INTO SanPham
VALUES('SP04', N'Conan', N'Kim Đồng', 'L005')
INSERT INTO SanPham
VALUES('SP05', N'Bảy viên ngọc rồng', N'NXB Giáo dục', 'L005')
INSERT INTO SanPham
VALUES('SP06', N'Tẩy', N'Thiên Long', 'L001')
INSERT INTO SanPham
VALUES('SP07', N'Life style', N'Báo mới', 'L002')
INSERT INTO SanPham
VALUES('SP08', N'Để học tốt ngữ văn 12', N'Giáo dục', 'L004')
INSERT INTO SanPham
VALUES('SP09', N'Vật lý nâng cao', N'Giáo dục', 'L004')
INSERT INTO SanPham
VALUES('SP10', N'Thước kẻ', N'Thiên Long', 'L001')
--
SELECT * FROM LoaiSanPham
SELECT * FROM SanPham