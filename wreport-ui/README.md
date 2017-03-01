# examonline  

## 说明  

本应用文档目录位于/doc下  
文本文档使用markdown编写，即后缀名为.md的文本文件  
markdown换行使用空格+空格+回车换行  

## 构建工具与框架  

* [angular.js 1.x](https://github.com/angular/angular.js)  
* [angular-ui](http://angular-ui.github.io/bootstrap/)  
* [nodejs](https://nodejs.org/en/)  
* [bower](https://bower.io/)  
* [gulpjs](http://gulpjs.com/)  
* [yeoman](http://yeoman.io/)  
* [yo angular generator](https://github.com/yeoman/generator-angular)  

## 环境搭建  

### 安装node.js  
windows下下载最新的node.js的LTS（长期支持版）一步一步安装即可  
官网地址：[nodejs](https://nodejs.org/en/)  
安装好后命令行输入node -v命令，看到以下字样为安装成功  
```
D:\..\examonline-ui>node -v
v6.9.4
```

### 更换国内的npm源(可选)  
以淘宝的https://registry.npm.taobao.org为例  
```
npm config set registry https://registry.npm.taobao.org
```

配置后可通过下面方式来验证是否成功  
```
npm config get registry
```

或  
```
npm info express
```

### 安装bower  
```
npm install -g bower
```

### 安装gulp  
```
npm install --global gulp
```

### 安装yo angular generator  
```
npm install -g yo generator-karma generator-angular
```

### 安装npm依赖和bower依赖  
```
cd examonline-ui
npm install
bower install
```

环境搭建完成  

This project is generated with [yo angular generator](https://github.com/yeoman/generator-angular)
version 0.15.1.

## Build & development

Run `gulp` for building and `gulp serve` for preview.

## Testing

Running `gulp test` will run the unit tests with karma.
