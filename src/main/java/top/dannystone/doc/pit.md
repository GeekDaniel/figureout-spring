# 坑
变强的路上总是坑坑洼洼！！！

### ClassPathXmlApplicationContext
- new ClassPathXmlApplicationContext(${path}) 只要是以ClassPath: 或者ClassPath*: 开头的的入参如果文件不存在并不会报"file not exists" 的错误提示。
- 注意Intellij idea 建目录的时候如果想建多级目录 。不能直接写aaa.bbb,应该先见aaa 在建bbb 。否则并不会按预想出现物理目录aaa/bbb而是会出现一个aaa.bbb的目录。造成"file not exists"的错误。
