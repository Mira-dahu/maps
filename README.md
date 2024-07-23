# Flutter 地图应用

## 目录
1. [项目概述](#项目概述)
2. [功能特性](#功能特性)
3. [安装指南](#安装指南)
4. [使用说明](#使用说明)
5. [开发文档](#开发文档)
6. [问题和解决方案](#问题和解决方案)
7. [未来计划](#未来计划)
8. [贡献指南](#贡献指南)
9. [许可证](#许可证)

## 项目概述

这是一个基于Flutter开发的地图应用,提供了多种地图管理和交互功能。本项目旨在为用户提供一个直观、易用的地图管理工具,支持多平台运行。

## 功能特性

- **地图管理**: 查看、添加、删除和编辑地图
- **添加新地图**: 支持用户上传和导入新的地图
- **设置禁区**: 在地图上绘制和管理禁区
- **旋转地图**: 支持360度旋转地图视图
- **双指缩放**: 使用双指手势放大和缩小地图
- **标记方向**: 在地图上添加方向标记
- **动画效果**: 页面切换和按钮交互的动画效果
## 安装指南  

1. 确保您的开发环境中已安装 [Flutter SDK](https://flutter.dev/docs/get-started/install)。  

2. 克隆此仓库:  
    ```bash  
    git clone https://github.com/yourusername/flutter-map-app.git  
    ```

3. 进入项目目录:  
    ```bash  
    cd flutter-map-app  
    ```

4. 安装依赖:  
    ```bash  
    flutter pub get  
    ```

5. 运行应用:  
    ```bash  
    flutter run  
    ```
## 使用说明

### 地图管理
- 在主页面查看所有已添加的地图
- 点击 "添加地图" 按钮上传新地图
- 长按地图项目进行编辑或删除操作

### 旋转地图
1. 在地图详情页面，找到旋转控制滑块
2. 左右滑动滑块以旋转地图
3. 旋转范围为0-360度

### 设置禁区
1. 在地图详情页面，点击 "设置禁区" 按钮
2. 使用手指在地图上绘制矩形区域
3. 点击 "保存" 以确认禁区设置

### 双指缩放
- 在查看地图时，使用两个手指进行捏合或张开动作以缩放地图

## 开发文档

### 项目结构
## 项目结构  

```plaintext  
lib/  
├── main.dart  
├── screens/  
│   ├── home_screen.dart  
│   ├── manage_maps_screen.dart  
│   ├── add_map_screen.dart  
│   └── rotate_map_screen.dart  
├── widgets/  
│   ├── map_item.dart  
│   └── restricted_area_painter.dart  
└── services/  
    └── api_service.dart
```
### 关键组件

- **InteractiveViewer**: 用于实现地图的缩放功能
- **GestureDetector**: 处理用户的触摸事件
- **CustomPaint**: 用于绘制禁区
- **AnimatedContainer**: 实现动画效果

### API 接口

使用 `http` 包进行网络请求。示例代码:

```dart
import 'package:http/http.dart' as http;
import 'dart:convert';

Future<void> sendData() async {
  var url = Uri.parse('https://api.example.com/data');
  var userData = {
    'name': 'John Doe',
    'email': 'johndoe@example.com',
  };
  var body = json.encode(userData);
  var response = await http.post(url, 
      body: body, 
      headers: {'Content-Type': 'application/json'});
  if (response.statusCode == 200) {
    // 处理响应数据
  } else {
    print('请求失败，状态码: ${response.statusCode}');
  }
}
```
## 问题和解决方案  

### 页面切换动画  
- **问题**: 需要为页面切换添加动画效果  
- **解决**: 使用 PageRouteBuilder 和 SlideTransition 实现滑动动画  

### 双指缩放实现  
- **问题**: 实现流畅的双指缩放功能  
- **解决**: 使用 InteractiveViewer 组件，并通过 TransformationController 控制缩放行为  

### HTTP请求处理  
- **问题**: 在Flutter中进行网络请求  
- **解决**: 使用 http 包，并确保正确配置 pubspec.yaml  

## 未来计划 

- [X] 实现离线地图功能  
- [ ] 添加地图分享功能  
- [ ] 优化大规模地图的性能  
- [ ] 支持自定义地图样式

## 贡献指南  

我们欢迎所有形式的贡献，包括但不限于：  
- 报告 bug  
- 提交功能请求   
- 编写文档  
- 提交代码修复或新功能  

请遵循以下步骤：  
1. Fork 本仓库  
2. 创建您的特性分支 (`git checkout -b feature/AmazingFeature`)  
3. 提交您的更改 (`git commit -m 'Add some AmazingFeature'`)  
4. 推送到分支 (`git push origin feature/AmazingFeature`)  
5. 开启一个 Pull Request  

