# 数据类型

## 基本类型(primitive type)

在java中，一共有8中基本类型，其中有4种整型、2种浮点型、1种用于表示Unicode编码的
字符单元的字符类型char和一种用于表示真值的boolean类型。

1. 整型

|类型|存储需求|取值范围|
|---|---|---|
|long|8字节|-9 223 372 036 854 775 808 ~ 9 223 372 036 854 775 807|
|int|4字节|-2 147 483 648 ~ 2 147 483 647(正好超过20亿)|
|short|2字节|-32768 ~ 32767|
|byte|1字节|-128 ~ 127|

long 类型数值有一个后缀L或l(如400000000000L)。

十六进制数值有一个0x 或 0X (如0xcafe)

八进制有一个前缀0, 如: 010

二进制加上前缀0b或0B, 如: 0b1001 就是 9。

字面量加下划线。 如: 1_000_000

2. 浮点型

|类型|存储需求|取值范围|
|---|---|---|
|float|4字节|大约(+/-)3.402 823 47E+38F (有效位数为6 ~ 7位)|
|double|8字节|大约(+/-)1.797 693 134 862 315 70E+308 (有效位数为15位)

float 类型的数值有一个后缀F或f, 如：3.14F，没有后缀默认为double

3. char类型

字面量单引号括起来，如: 'A' 编码值对应 65

十六进制值表示：范围从\u0000到\uffff

0-65535

unicode和char

码点(code point): 字符对应的代码值, 在Unicode标准中，采用16进制书写，并加上
U+， 如：U+0041 表示A的码点。Unicode 的码点可以分为17个代码级别（code plane）。
第一个代码级别为基本多语言级别，码点从U+0000到U+FFFF，包括经典Unicode代码；
其余16个级别从U+10000到U+10FFFF，其中包括一些辅助字符

UTF-16

UTF-16编码采用不同长度的编码表示所有 Unicode码点 。在基本的多语言级别中 ，每个
字符用 16位表示 ，通常被称为代码单元（code unit ) ; 而辅助字符采用一对连续的代码单元
进行编码 。这样构成的编码值落人基本的多语言级别中空闲的2048字节内 ，通常被称为替
代区域（surrogate area) [ U+D800 ~ U+DBFF 用于第一个代码单元，U+DC00 ~ U+DFFF 用
于第二个代码单元]
。这样设计十分巧妙 ，我们可以从中迅速地知道一个代码单元是一个字
符的编码 ，还是一个辅助字符的第一或第二部分 。例如 ，⑪是八元数集（http://math.ucr .edu
home/baez/octonions ) 的一个数学符号 ，码点为U+1D546, 编码为两个代码单兀 U+D835 和


4. boolean类型

true和false

## 变量

1. 变量

2. 常量

    final


##  运算符

strictfp 严格浮点运算


## 数值类型之间的转换

* 如果两个操作数中有一个是double类型，另一个操作数就会转换为double类型 。
* 否则 ，如果其中一个操作数是 float类型 ，另一个操作数将会转换为 float类型 。
* 否则， 如果其中一个操作数是 long 类型 ，另一个操作数将会转换为long类型 。
* 否则，两个操作数都将被转换为int 类型 。

![typeconvert](./typeconvert.png)