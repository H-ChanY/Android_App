// main.dart

import 'package:flutter/material.dart';
import 'package:untitled1/main_page.dart';

// 1, 2
void main() => runApp(MyApp());

// 3
class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // 4
    return MaterialApp(
      title: 'Main Page',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MainPage(),
    );
  }
}