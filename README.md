# 中山大学 19级软件工程 Java与面向对象编程小组大作业

SYSU 19 SE Java Final Homework - Order System

Note:
*All the chinese characters in .java file use GKB coding, but the MEADME.md uses UTF-8 coding*

## 这是一个使用Java图形界面的点餐系统，体现了Java的许多如多线程编程，网络编程的知识。

## 文件布局

1. bill文件夹存储客户请求的签字账单
2. ClientGUI为用户界面源码
3. DataBase为食材管理源码
4. image存储GUI所使用的图片
5. ServerGUI为服务端界面源码

## 已知源码BUG

1. EastPanel 同时点CenterPanel某个菜的图片，该菜会在右边已选栏出现两次，而不是仅出现一次，把数量标为二。
2. 当前点菜总额不会显示茶味费。
