# 用 TextView 来显示图片

通过给 TextView 设置图标字体库来显示图片，以到达适配图片和优化App的效果。  

效果图如下：  

![图中的图标全都是 TextView ](http://obbu6r1mi.bkt.clouddn.com/ocnyang/iconfont/iconfont_.png)   

## 仓库文件说明  

* FontTest 是项目的 Demo 源码  
* FontAwesome 文件夹内包含两个与 FontAwesome 字体库相关的文件
	1. `fontawesome-webfont.ttf` 是字体库文件。  
	2. `string.xml` 是 `font-awsome-for-android` 文件，即 FontAwesome 在 Android 开发使用中，图标和字符的对照资源文件。  

## Demo 源码说明  

在 FontTest 是一个通过字体库使 TextView 来显示图片的实例，其中提供了四种不同的设置字体的方法：  

1. 手动动态方式。（普通方法）  
2. 通过创建一个递归遍历给所有 TextView 设置字体的 FontHelper 工具类的方式。（适用与全局 TextView 都需要设置字体）  
3. 通过 LayoutInflateFactory 的方式。（适用与全局 TextView 都需要设置字体，高效）  
4. 自定义 View 的方式。（使用灵活，逻辑简单）  

## 项目详细介绍 & 生成自己的字体库  

本项目详细的原理介绍和如何生成自己的字体库的详细教程点击下面博客地址：  
**[http://ocnyang.com/2016/12/06/IconFont/](http://ocnyang.com/2016/12/06/IconFont/)**  
或  
**[http://www.jianshu.com/p/e95890e56bc2](http://www.jianshu.com/p/e95890e56bc2)**  

<br>
<br>
<br>

> **附录及感谢：**  
> [Font-Awesome 字体库](https://github.com/FortAwesome/Font-Awesome/)  
> [font-awsome-for-android 图标字符对照表](https://github.com/aasdkl/font-awsome-for-android)  
> [Font Awsome Cheatsheet 官方提供的 图标字符对照表](http://fontawesome.io/cheatsheet/)  
