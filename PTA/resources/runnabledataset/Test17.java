package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test17Lib{
public static Test17Class1 local1;
public static Test17Class2 local2;
public static Test17Class3 local3;
public static Test17Class3 local4;
public static Test17Class3 local5;
public static Test17Class3 local6;
public static Test17Class3 local7;
public static Test17Class4 local8;
public static Test17Class4 local9;
public static Test17Class4 local10;
public static Test17Class4 local11;
public static Test17Class4 local12;
public static Test17Class4 local13;
public static Test17Class4 local14;
public static Test17Class4 local15;
public static Test17Class4 local16;
public static Test17Class4 local17;
public static Test17Class5 local18;
public static Test17Class5 local19;
public static Test17Class5 local20;
}
class Test17Class1 extends BasicClass {
public static Test17Class1 field1;
public Test17Class5 field2;
public static void method1(Test17Class4 arg0, int depth) {
if (depth == 0) return;
}
}
class Test17Class2 extends Test17Class1 {
public Test17Class4 field3;
public static Test17Class2 field4;
public static Test17Class5 field5;
public Test17Class5 field6;
public static Test17Class3 method2(Test17Class3 arg0, int depth) {
if (depth == 0) return Test17Lib.local6;
for (int local21 = 0; local21<=2; local21 += 1) {
for (int local22 = 0; local22<=3; local22 += 1) {
if (depth>=3) {
if (depth>=2) {
if (depth>=3) {
}
}
}
}
}
arg0=field5.field12;
if (depth==2) {
field5.field12=arg0;
}
arg0.field5=arg0.field8;
for (int local23 = 0; local23<=0; local23 += 1) {
field4.field1=arg0.field2;
}
for (int local24 = 0; local24<=0; local24 += 1) {
for (int local25 = 0; local25<=3; local25 += 1) {
arg0.field9.method1(arg0.field7,depth-1);
}
}
field4.field6.method10(field1.field2,arg0.field6,depth-1);
return arg0;
}
public Test17Class1 method3(Test17Class4 arg0, int depth) {
if (depth == 0) return Test17Lib.local10;
this.field4=this.field4;
arg0=this.field6;
this.field3.method7(depth-1);
arg0.field1=arg0;
for (int local26 = 0; local26<=3; local26 += 1) {
for (int local27 = 0; local27<=3; local27 += 1) {
for (int local28 = 0; local28<=0; local28 += 1) {
arg0.field2.method11(depth-1);
}
}
}
if (depth<=3) {
if (depth<=1) {
arg0.field11=this.field4.method4(depth-1);
}else {
arg0.field11=this.field4.method4(depth-1);
}
}else {
if (depth<4) {
for (int local29 = 0; local29<=0; local29 += 1) {
this.field2=this.field5;
}
}else {
this.field2.method9(depth-1);
}
}
this.field4=this;
this.field6.method7(depth-1);
if (depth==1) {
if (depth<3) {
for (int local30 = 0; local30<=0; local30 += 1) {
if (depth<2) {
if (depth<=4) {
}
}else {
arg0.field2.method8(arg0.field2,depth-1);
}
}
}
}
return this.field1;
}
public static Test17Class1 method4(int depth) {
if (depth == 0) return Test17Lib.local5;
if (depth>4) {
if (depth==1) {
field1.field1=field5.field12.method5(depth-1);
}else {
for (int local31 = 0; local31<=2; local31 += 1) {
field5.field11=field4.method4(depth-1);
}
}
}else {
field5.field12.method6(depth-1);
}
return field5.field11;
}
}
class Test17Class3 extends Test17Class2 {
public static Test17Class4 field7;
public Test17Class5 field8;
public static Test17Class5 field9;
public static Test17Class5 field10;
public Test17Class5 method5(int depth) {
if (depth == 0) return Test17Lib.local20;
this.field4=this.field4;
this.field1=this.field8;
this.field2=this.field2;
for (int local32 = 0; local32<=3; local32 += 1) {
for (int local33 = 0; local33<=1; local33 += 1) {
this.field6.method11(depth-1);
}
}
this.method6(depth-1);
this.field2.method11(depth-1);
return this.field10;
}
public static void method6(int depth) {
if (depth == 0) return;
if (depth>1) {
if (depth<2) {
field5.field2.method11(depth-1);
}else {
field5.field12=field5.field12.method2(field10.field12,depth-1);
}
}else {
for (int local34 = 0; local34<=1; local34 += 1) {
for (int local35 = 0; local35<=2; local35 += 1) {
field4.field3=field1.field2;
}
}
}
field5.field13.method1(field4.field6,depth-1);
field10.field12.method4(depth-1);
if (depth<=3) {
field9.field12=field10.field12;
}
}
}
class Test17Class4 extends Test17Class1 {
public static Test17Class1 field11;
public void method7(int depth) {
if (depth == 0) return;
if (depth==3) {
for (int local36 = 0; local36<=0; local36 += 1) {
this.field11=this.field1;
}
}else {
for (int local37 = 0; local37<=1; local37 += 1) {
this.field2=this.field2;
}
}
this.field2.method10(this.field11,this.field2,depth-1);
if (depth==3) {
for (int local38 = 0; local38<=3; local38 += 1) {
for (int local39 = 0; local39<=2; local39 += 1) {
this.field1=this.field1;
}
}
}
if (depth==3) {
if (depth>=2) {
this.field2=this.field2;
}else {
for (int local40 = 0; local40<=0; local40 += 1) {
if (depth<=4) {
if (depth==3) {
}else {
}
}else {
if (depth<1) {
}
}
}
}
}else {
if (depth>=4) {
for (int local41 = 0; local41<=0; local41 += 1) {
if (depth<4) {
for (int local42 = 0; local42<=1; local42 += 1) {
}
}else {
this.field2.method8(this,depth-1);
}
}
}
}
if (depth>2) {
for (int local43 = 0; local43<=2; local43 += 1) {
for (int local44 = 0; local44<=3; local44 += 1) {
for (int local45 = 0; local45<=2; local45 += 1) {
if (depth>3) {
}else {
}
}
}
}
}else {
this.field1=this.field1;
}
this.field1=this.field2;
if (depth<=1) {
this.field2.method9(depth-1);
}else {
this.field2.method10(this.field11,this.field2,depth-1);
}
if (depth==3) {
this.field11=this.field2;
}else {
this.field2.method11(depth-1);
}
}
public void method8(Test17Class4 arg0, int depth) {
if (depth == 0) return;
if (depth<4) {
if (depth>4) {
this.field2.method1(arg0.field2,depth-1);
}else {
if (depth>2) {
for (int local46 = 0; local46<=3; local46 += 1) {
if (depth<=4) {
}else {
}
}
}
}
}
for (int local47 = 0; local47<=3; local47 += 1) {
arg0.field11.method1(arg0.field2,depth-1);
}
if (depth>=4) {
if (depth>=3) {
this.field1.method1(arg0.field2,depth-1);
}
}else {
arg0=this;
}
arg0.field2.method10(this,arg0.field2,depth-1);
if (depth>2) {
arg0.field2.method10(arg0.field11,arg0.field2,depth-1);
}
this.field2.method10(arg0.field2,this.field2,depth-1);
for (int local48 = 0; local48<=2; local48 += 1) {
if (depth>4) {
for (int local49 = 0; local49<=3; local49 += 1) {
arg0.field2.method10(arg0.field1,this.field2,depth-1);
}
}else {
arg0.field2.method11(depth-1);
}
}
}
public void method9(int depth) {
if (depth == 0) return;
this.field11=this.field1;
if (depth>=4) {
this.field2=this.field2;
}
for (int local50 = 0; local50<=0; local50 += 1) {
if (depth>2) {
for (int local51 = 0; local51<=2; local51 += 1) {
if (depth<4) {
if (depth<2) {
}
}else {
for (int local52 = 0; local52<=1; local52 += 1) {
}
}
}
}else {
for (int local53 = 0; local53<=0; local53 += 1) {
for (int local54 = 0; local54<=2; local54 += 1) {
this.field1.method1(this,depth-1);
}
}
}
}
this.field2=this.field2;
this.field2.method11(depth-1);
}
}
class Test17Class5 extends Test17Class4 {
public static Test17Class3 field12;
public static Test17Class1 field13;
public void method10(Test17Class1 arg0, Test17Class5 arg1, int depth) {
if (depth == 0) return;
if (depth<4) {
for (int local55 = 0; local55<=2; local55 += 1) {
arg0.field2.method9(depth-1);
}
}
arg0.field2.method9(depth-1);
if (depth==4) {
if (depth>=2) {
for (int local56 = 0; local56<=0; local56 += 1) {
for (int local57 = 0; local57<=3; local57 += 1) {
this.field11=this.field12.method3(arg0.field2,depth-1);
}
}
}else {
if (depth<=3) {
for (int local58 = 0; local58<=3; local58 += 1) {
for (int local59 = 0; local59<=3; local59 += 1) {
}
}
}else {
if (depth>4) {
arg1.field2.method7(depth-1);
}else {
if (depth>4) {
}else {
}
}
}
}
}
}
public static void method11(int depth) {
if (depth == 0) return;
field1.field1=field12.field10;
field13=field12.field6;
field11.field1=field11.field2;
}
}
public class Test17{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test17Lib.local1 = new Test17Class1();
Benchmark.alloc(2);
Test17Lib.local2 = new Test17Class2();
Benchmark.alloc(3);
Test17Lib.local3 = new Test17Class3();
Benchmark.alloc(4);
Test17Lib.local4 = new Test17Class3();
Benchmark.alloc(5);
Test17Lib.local5 = new Test17Class3();
Benchmark.alloc(6);
Test17Lib.local6 = new Test17Class3();
Benchmark.alloc(7);
Test17Lib.local7 = new Test17Class3();
Benchmark.alloc(8);
Test17Lib.local8 = new Test17Class4();
Benchmark.alloc(9);
Test17Lib.local9 = new Test17Class4();
Benchmark.alloc(10);
Test17Lib.local10 = new Test17Class4();
Benchmark.alloc(11);
Test17Lib.local11 = new Test17Class4();
Benchmark.alloc(12);
Test17Lib.local12 = new Test17Class4();
Benchmark.alloc(13);
Test17Lib.local13 = new Test17Class4();
Benchmark.alloc(14);
Test17Lib.local14 = new Test17Class4();
Benchmark.alloc(15);
Test17Lib.local15 = new Test17Class4();
Benchmark.alloc(16);
Test17Lib.local16 = new Test17Class4();
Benchmark.alloc(17);
Test17Lib.local17 = new Test17Class4();
Benchmark.alloc(18);
Test17Lib.local18 = new Test17Class5();
Benchmark.alloc(19);
Test17Lib.local19 = new Test17Class5();
Benchmark.alloc(20);
Test17Lib.local20 = new Test17Class5();
Test17Lib.local1.field1 = Test17Lib.local15;
Test17Lib.local1.field2 = Test17Lib.local18;
Test17Lib.local2.field3 = Test17Lib.local10;
Test17Lib.local2.field4 = Test17Lib.local6;
Test17Lib.local2.field5 = Test17Lib.local20;
Test17Lib.local2.field6 = Test17Lib.local20;
Test17Lib.local2.field1 = Test17Lib.local11;
Test17Lib.local2.field2 = Test17Lib.local20;
Test17Lib.local3.field7 = Test17Lib.local19;
Test17Lib.local3.field8 = Test17Lib.local20;
Test17Lib.local3.field9 = Test17Lib.local19;
Test17Lib.local3.field10 = Test17Lib.local19;
Test17Lib.local3.field3 = Test17Lib.local17;
Test17Lib.local3.field4 = Test17Lib.local5;
Test17Lib.local3.field5 = Test17Lib.local19;
Test17Lib.local3.field6 = Test17Lib.local20;
Test17Lib.local3.field1 = Test17Lib.local11;
Test17Lib.local3.field2 = Test17Lib.local19;
Test17Lib.local4.field7 = Test17Lib.local19;
Test17Lib.local4.field8 = Test17Lib.local18;
Test17Lib.local4.field9 = Test17Lib.local20;
Test17Lib.local4.field10 = Test17Lib.local20;
Test17Lib.local4.field3 = Test17Lib.local11;
Test17Lib.local4.field4 = Test17Lib.local6;
Test17Lib.local4.field5 = Test17Lib.local19;
Test17Lib.local4.field6 = Test17Lib.local20;
Test17Lib.local4.field1 = Test17Lib.local17;
Test17Lib.local4.field2 = Test17Lib.local20;
Test17Lib.local5.field7 = Test17Lib.local19;
Test17Lib.local5.field8 = Test17Lib.local18;
Test17Lib.local5.field9 = Test17Lib.local18;
Test17Lib.local5.field10 = Test17Lib.local20;
Test17Lib.local5.field3 = Test17Lib.local16;
Test17Lib.local5.field4 = Test17Lib.local6;
Test17Lib.local5.field5 = Test17Lib.local20;
Test17Lib.local5.field6 = Test17Lib.local20;
Test17Lib.local5.field1 = Test17Lib.local18;
Test17Lib.local5.field2 = Test17Lib.local18;
Test17Lib.local6.field7 = Test17Lib.local8;
Test17Lib.local6.field8 = Test17Lib.local20;
Test17Lib.local6.field9 = Test17Lib.local19;
Test17Lib.local6.field10 = Test17Lib.local20;
Test17Lib.local6.field3 = Test17Lib.local20;
Test17Lib.local6.field4 = Test17Lib.local2;
Test17Lib.local6.field5 = Test17Lib.local19;
Test17Lib.local6.field6 = Test17Lib.local20;
Test17Lib.local6.field1 = Test17Lib.local19;
Test17Lib.local6.field2 = Test17Lib.local18;
Test17Lib.local7.field7 = Test17Lib.local18;
Test17Lib.local7.field8 = Test17Lib.local18;
Test17Lib.local7.field9 = Test17Lib.local19;
Test17Lib.local7.field10 = Test17Lib.local19;
Test17Lib.local7.field3 = Test17Lib.local9;
Test17Lib.local7.field4 = Test17Lib.local3;
Test17Lib.local7.field5 = Test17Lib.local19;
Test17Lib.local7.field6 = Test17Lib.local19;
Test17Lib.local7.field1 = Test17Lib.local16;
Test17Lib.local7.field2 = Test17Lib.local20;
Test17Lib.local8.field11 = Test17Lib.local4;
Test17Lib.local8.field1 = Test17Lib.local9;
Test17Lib.local8.field2 = Test17Lib.local18;
Test17Lib.local9.field11 = Test17Lib.local2;
Test17Lib.local9.field1 = Test17Lib.local16;
Test17Lib.local9.field2 = Test17Lib.local18;
Test17Lib.local10.field11 = Test17Lib.local12;
Test17Lib.local10.field1 = Test17Lib.local1;
Test17Lib.local10.field2 = Test17Lib.local18;
Test17Lib.local11.field11 = Test17Lib.local15;
Test17Lib.local11.field1 = Test17Lib.local7;
Test17Lib.local11.field2 = Test17Lib.local18;
Test17Lib.local12.field11 = Test17Lib.local8;
Test17Lib.local12.field1 = Test17Lib.local12;
Test17Lib.local12.field2 = Test17Lib.local19;
Test17Lib.local13.field11 = Test17Lib.local1;
Test17Lib.local13.field1 = Test17Lib.local16;
Test17Lib.local13.field2 = Test17Lib.local18;
Test17Lib.local14.field11 = Test17Lib.local1;
Test17Lib.local14.field1 = Test17Lib.local2;
Test17Lib.local14.field2 = Test17Lib.local19;
Test17Lib.local15.field11 = Test17Lib.local1;
Test17Lib.local15.field1 = Test17Lib.local7;
Test17Lib.local15.field2 = Test17Lib.local20;
Test17Lib.local16.field11 = Test17Lib.local12;
Test17Lib.local16.field1 = Test17Lib.local7;
Test17Lib.local16.field2 = Test17Lib.local19;
Test17Lib.local17.field11 = Test17Lib.local1;
Test17Lib.local17.field1 = Test17Lib.local15;
Test17Lib.local17.field2 = Test17Lib.local20;
Test17Lib.local18.field12 = Test17Lib.local5;
Test17Lib.local18.field13 = Test17Lib.local18;
Test17Lib.local18.field11 = Test17Lib.local14;
Test17Lib.local18.field1 = Test17Lib.local1;
Test17Lib.local18.field2 = Test17Lib.local19;
Test17Lib.local19.field12 = Test17Lib.local4;
Test17Lib.local19.field13 = Test17Lib.local12;
Test17Lib.local19.field11 = Test17Lib.local1;
Test17Lib.local19.field1 = Test17Lib.local8;
Test17Lib.local19.field2 = Test17Lib.local18;
Test17Lib.local20.field12 = Test17Lib.local7;
Test17Lib.local20.field13 = Test17Lib.local15;
Test17Lib.local20.field11 = Test17Lib.local9;
Test17Lib.local20.field1 = Test17Lib.local5;
Test17Lib.local20.field2 = Test17Lib.local20;
Test17Lib.local7.field5.method7(3);
for (int local60 = 0; local60<=1; local60 += 1) {
for (int local61 = 0; local61<=1; local61 += 1) {
Test17Lib.local13.field11=Test17Lib.local7.field9;
}
}
for (int local62 = 0; local62<=0; local62 += 1) {
Test17Lib.local5=Test17Lib.local6;
}
if (inputValue==4) {
Test17Lib.local6.field8.method7(3);
}
for (int local63 = 0; local63<=2; local63 += 1) {
if (inputValue<=2) {
if (inputValue==3) {
Test17Lib.local7.field6.method11(3);
}else {
Test17Lib.local10.field1=Test17Lib.local6.method3(Test17Lib.local4.field6,3);
}
}
}
Test17Lib.local10=Test17Lib.local3.method5(3);
Test17Lib.local2.field6=Test17Lib.local13.field2;
for (int local64 = 0; local64<=2; local64 += 1) {
Test17Lib.local10.field1=Test17Lib.local4.method3(Test17Lib.local9,3);
}
Test17Lib.local6.method6(3);
Test17Lib.local16.field2.method10(Test17Lib.local4.field4,Test17Lib.local6.field5,3);
Benchmark.test(1,Test17Lib.local1);
Benchmark.test(2,Test17Lib.local2);
Benchmark.test(3,Test17Lib.local3);
Benchmark.test(4,Test17Lib.local4);
Benchmark.test(5,Test17Lib.local5);
Benchmark.test(6,Test17Lib.local6);
Benchmark.test(7,Test17Lib.local7);
Benchmark.test(8,Test17Lib.local8);
Benchmark.test(9,Test17Lib.local9);
Benchmark.test(10,Test17Lib.local10);
Benchmark.test(11,Test17Lib.local11);
Benchmark.test(12,Test17Lib.local12);
Benchmark.test(13,Test17Lib.local13);
Benchmark.test(14,Test17Lib.local14);
Benchmark.test(15,Test17Lib.local15);
Benchmark.test(16,Test17Lib.local16);
Benchmark.test(17,Test17Lib.local17);
Benchmark.test(18,Test17Lib.local18);
Benchmark.test(19,Test17Lib.local19);
Benchmark.test(20,Test17Lib.local20);
Benchmark.test(21,Test17Lib.local1.field1);
Benchmark.test(22,Test17Lib.local1.field2);
Benchmark.test(23,Test17Lib.local2.field3);
Benchmark.test(24,Test17Lib.local2.field4);
Benchmark.test(25,Test17Lib.local2.field5);
Benchmark.test(26,Test17Lib.local2.field6);
Benchmark.test(27,Test17Lib.local2.field1);
Benchmark.test(28,Test17Lib.local2.field2);
Benchmark.test(29,Test17Lib.local3.field7);
Benchmark.test(30,Test17Lib.local3.field8);
Benchmark.test(31,Test17Lib.local3.field9);
Benchmark.test(32,Test17Lib.local3.field10);
Benchmark.test(33,Test17Lib.local3.field3);
Benchmark.test(34,Test17Lib.local3.field4);
Benchmark.test(35,Test17Lib.local3.field5);
Benchmark.test(36,Test17Lib.local3.field6);
Benchmark.test(37,Test17Lib.local3.field1);
Benchmark.test(38,Test17Lib.local3.field2);
Benchmark.test(39,Test17Lib.local4.field7);
Benchmark.test(40,Test17Lib.local4.field8);
Benchmark.test(41,Test17Lib.local4.field9);
Benchmark.test(42,Test17Lib.local4.field10);
Benchmark.test(43,Test17Lib.local4.field3);
Benchmark.test(44,Test17Lib.local4.field4);
Benchmark.test(45,Test17Lib.local4.field5);
Benchmark.test(46,Test17Lib.local4.field6);
Benchmark.test(47,Test17Lib.local4.field1);
Benchmark.test(48,Test17Lib.local4.field2);
Benchmark.test(49,Test17Lib.local5.field7);
Benchmark.test(50,Test17Lib.local5.field8);
Benchmark.test(51,Test17Lib.local5.field9);
Benchmark.test(52,Test17Lib.local5.field10);
Benchmark.test(53,Test17Lib.local5.field3);
Benchmark.test(54,Test17Lib.local5.field4);
Benchmark.test(55,Test17Lib.local5.field5);
Benchmark.test(56,Test17Lib.local5.field6);
Benchmark.test(57,Test17Lib.local5.field1);
Benchmark.test(58,Test17Lib.local5.field2);
Benchmark.test(59,Test17Lib.local6.field7);
Benchmark.test(60,Test17Lib.local6.field8);
Benchmark.test(61,Test17Lib.local6.field9);
Benchmark.test(62,Test17Lib.local6.field10);
Benchmark.test(63,Test17Lib.local6.field3);
Benchmark.test(64,Test17Lib.local6.field4);
Benchmark.test(65,Test17Lib.local6.field5);
Benchmark.test(66,Test17Lib.local6.field6);
Benchmark.test(67,Test17Lib.local6.field1);
Benchmark.test(68,Test17Lib.local6.field2);
Benchmark.test(69,Test17Lib.local7.field7);
Benchmark.test(70,Test17Lib.local7.field8);
Benchmark.test(71,Test17Lib.local7.field9);
Benchmark.test(72,Test17Lib.local7.field10);
Benchmark.test(73,Test17Lib.local7.field3);
Benchmark.test(74,Test17Lib.local7.field4);
Benchmark.test(75,Test17Lib.local7.field5);
Benchmark.test(76,Test17Lib.local7.field6);
Benchmark.test(77,Test17Lib.local7.field1);
Benchmark.test(78,Test17Lib.local7.field2);
Benchmark.test(79,Test17Lib.local8.field11);
Benchmark.test(80,Test17Lib.local8.field1);
Benchmark.test(81,Test17Lib.local8.field2);
Benchmark.test(82,Test17Lib.local9.field11);
Benchmark.test(83,Test17Lib.local9.field1);
Benchmark.test(84,Test17Lib.local9.field2);
Benchmark.test(85,Test17Lib.local10.field11);
Benchmark.test(86,Test17Lib.local10.field1);
Benchmark.test(87,Test17Lib.local10.field2);
Benchmark.test(88,Test17Lib.local11.field11);
Benchmark.test(89,Test17Lib.local11.field1);
Benchmark.test(90,Test17Lib.local11.field2);
Benchmark.test(91,Test17Lib.local12.field11);
Benchmark.test(92,Test17Lib.local12.field1);
Benchmark.test(93,Test17Lib.local12.field2);
Benchmark.test(94,Test17Lib.local13.field11);
Benchmark.test(95,Test17Lib.local13.field1);
Benchmark.test(96,Test17Lib.local13.field2);
Benchmark.test(97,Test17Lib.local14.field11);
Benchmark.test(98,Test17Lib.local14.field1);
Benchmark.test(99,Test17Lib.local14.field2);
Benchmark.test(100,Test17Lib.local15.field11);
Benchmark.test(101,Test17Lib.local15.field1);
Benchmark.test(102,Test17Lib.local15.field2);
Benchmark.test(103,Test17Lib.local16.field11);
Benchmark.test(104,Test17Lib.local16.field1);
Benchmark.test(105,Test17Lib.local16.field2);
Benchmark.test(106,Test17Lib.local17.field11);
Benchmark.test(107,Test17Lib.local17.field1);
Benchmark.test(108,Test17Lib.local17.field2);
Benchmark.test(109,Test17Lib.local18.field12);
Benchmark.test(110,Test17Lib.local18.field13);
Benchmark.test(111,Test17Lib.local18.field11);
Benchmark.test(112,Test17Lib.local18.field1);
Benchmark.test(113,Test17Lib.local18.field2);
Benchmark.test(114,Test17Lib.local19.field12);
Benchmark.test(115,Test17Lib.local19.field13);
Benchmark.test(116,Test17Lib.local19.field11);
Benchmark.test(117,Test17Lib.local19.field1);
Benchmark.test(118,Test17Lib.local19.field2);
Benchmark.test(119,Test17Lib.local20.field12);
Benchmark.test(120,Test17Lib.local20.field13);
Benchmark.test(121,Test17Lib.local20.field11);
Benchmark.test(122,Test17Lib.local20.field1);
Benchmark.test(123,Test17Lib.local20.field2);
Benchmark.print();
}
}
