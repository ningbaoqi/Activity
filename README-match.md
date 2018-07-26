### IntentFilter的匹配规则
#### action的匹配规则
+ 一个过滤规则中可以有多个action，那么只要Intent中的action能够和过滤规则中的`任何一个`action相同即可匹配成功；
#### category匹配规则
+ Intent中如果含有category，那么所有的category都必须和过滤规则中的其中一个category相同，换句话说，Intent中如果出现了category，不管有几个category，对于每个category来说，它必须是过滤规则中已经定义了的category；当然Intent中可以没有category，如果没有category的话，按照上面的描述，这个Intent仍然可以匹配成功；
#### data的匹配规则
+ 如果过滤规则中定义了data，那么Intent中必须也要定义了匹配的data；并且data数据能够完全匹配过滤规则中的某一个data；data由两个部分组成，mimeType和URI；mimeType指媒体类型，比如`image/jpeg`、`audio/mpeg4-generic`、`video/*`等；可以表示图片，文本，视频等不同的媒体格式；
```
//URI的结构
<scheme>://<host>:<port>/[<path>|<pathPrefix>|<pathPattern>]
```
|字段|含义|
|------|------|
|scheme|URI的模式如http、file、content等；如果URI中没有指定scheme，那么整个URI的其他参数无效，这也意味着URI是无效的|
|host|URI的主机名如www.baidu.com；如果host未指定，那么整个URI中的其他参数无效，这也意味着URI是无效的|
|port|URI中的端口号，如80；仅当URI中指定了scheme、host参数的时候port参数才是有意义的|
|Path、pathPattern、pathPrefix|这三个参数表述路径信息，其中path表示完整的路径信息；pathPattern也表示完整的路径信息，但是它里面可以包含`*`通配符，该通配符表示0个或多个任意字符，需要注意的是，由于正则表达式的规范，如果想表示真实的字符串，那么`*`要改写成`\\*`，`\`要写成`\\\\`；pathPrefix表示路径的前缀信息|
