package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test22Lib{
public static Test22Class1 local1;
public static Test22Class1 local2;
public static Test22Class1 local3;
public static Test22Class1 local4;
public static Test22Class1 local5;
public static Test22Class1 local6;
public static Test22Class1 local7;
public static Test22Class1 local8;
public static Test22Class2 local9;
public static Test22Class2 local10;
public static Test22Class2 local11;
public static Test22Class3 local12;
public static Test22Class3 local13;
public static Test22Class3 local14;
public static Test22Class3 local15;
public static Test22Class3 local16;
public static Test22Class4 local17;
public static Test22Class5 local18;
public static Test22Class5 local19;
public static Test22Class5 local20;
public static Test22Class5 local21;
public static Test22Class5 local22;
public static Test22Class5 local23;
public static Test22Class5 local24;
}
class Test22Class1 extends BasicClass {
public Test22Class2 field1;
public static Test22Class3 field2;
public Test22Class2 field3;
public static void method1(Test22Class1 arg0, int depth) {
if (depth == 0) return;
for (int local25 = 0; local25<=1; local25 += 1) {
field2.field8=field2.field7;
}
if (depth==3) {
arg0.field2=field2.field7;
}
field2.field8.method1(arg0.field2,depth-1);
if (depth>3) {
arg0.field1=arg0.field1;
}
}
public void method2(Test22Class3 arg0, Test22Class3 arg1, int depth) {
if (depth == 0) return;
arg0.field8=arg1.field8;
for (int local26 = 0; local26<=3; local26 += 1) {
arg1.field6=this;
}
arg0.field8=arg0.field7;
for (int local27 = 0; local27<=1; local27 += 1) {
if (depth>3) {
for (int local28 = 0; local28<=2; local28 += 1) {
if (depth==1) {
for (int local29 = 0; local29<=3; local29 += 1) {
}
}
}
}
}
arg1.field1.method1(this.field3,depth-1);
for (int local30 = 0; local30<=3; local30 += 1) {
for (int local31 = 0; local31<=1; local31 += 1) {
if (depth>2) {
this.field1=this.field1;
}else {
if (depth<2) {
if (depth<=1) {
}
}
}
}
}
for (int local32 = 0; local32<=1; local32 += 1) {
for (int local33 = 0; local33<=0; local33 += 1) {
for (int local34 = 0; local34<=3; local34 += 1) {
this.field3=arg0.field1;
}
}
}
this.field2.method1(arg1.field2,depth-1);
}
}
class Test22Class2 extends Test22Class1 {
public static Test22Class3 field4;
public Test22Class5 field5;
public void method3(int depth) {
if (depth == 0) return;
this.field2=this.field2;
this.field5.method7(this,this.field5,depth-1);
this.method3(depth-1);
}
}
class Test22Class3 extends Test22Class1 {
public static Test22Class1 field6;
public static Test22Class3 field7;
public static Test22Class3 field8;
public static Test22Class2 field9;
public Test22Class3 method4(Test22Class3 arg0, Test22Class5 arg1, int depth) {
if (depth == 0) return Test22Lib.local16;
arg1.field2.method2(arg0,arg1.field14,depth-1);
for (int local35 = 0; local35<=1; local35 += 1) {
arg0.field9=arg0.field1;
}
return this;
}
}
class Test22Class4 extends Test22Class3 {
public static Test22Class3 field10;
public Test22Class3 field11;
public Test22Class3 field12;
public static Test22Class1 field13;
public static void method5(int depth) {
if (depth == 0) return;
for (int local36 = 0; local36<=1; local36 += 1) {
if (depth>=2) {
field8.field3=field13.field1;
}else {
if (depth<2) {
if (depth<1) {
for (int local37 = 0; local37<=2; local37 += 1) {
}
}
}
}
}
field7.field9.method3(depth-1);
for (int local38 = 0; local38<=2; local38 += 1) {
for (int local39 = 0; local39<=2; local39 += 1) {
field9.field1=field7.field3;
}
}
for (int local40 = 0; local40<=3; local40 += 1) {
field6=field8.field6;
}
for (int local41 = 0; local41<=0; local41 += 1) {
if (depth<=1) {
field10=field10;
}else {
field13=field6;
}
}
field6=field2.field1;
field8.field1.method3(depth-1);
if (depth<=4) {
field13.method2(field2,field8.field2,depth-1);
}
}
}
class Test22Class5 extends Test22Class1 {
public static Test22Class3 field14;
public void method6(Test22Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field2=this.field2;
if (depth<2) {
for (int local42 = 0; local42<=3; local42 += 1) {
if (depth<=3) {
if (depth>=3) {
for (int local43 = 0; local43<=1; local43 += 1) {
}
}
}else {
this.method6(arg0.field1,depth-1);
}
}
}
for (int local44 = 0; local44<=0; local44 += 1) {
arg0.field3=arg0.field1;
}
arg0.field5=arg0.field5;
this.method2(this.field14,this.field2,depth-1);
if (depth<=3) {
if (depth<=4) {
arg0.field3=arg0;
}else {
this.method6(arg0.field1,depth-1);
}
}
for (int local45 = 0; local45<=3; local45 += 1) {
for (int local46 = 0; local46<=0; local46 += 1) {
for (int local47 = 0; local47<=2; local47 += 1) {
for (int local48 = 0; local48<=1; local48 += 1) {
arg0.field4.method4(this.field14,this,depth-1);
}
}
}
}
if (depth==2) {
if (depth==1) {
arg0.field2.method1(arg0.field2,depth-1);
}else {
arg0.field1.method3(depth-1);
}
}
this.method1(this.field1,depth-1);
}
public void method7(Test22Class2 arg0, Test22Class5 arg1, int depth) {
if (depth == 0) return;
for (int local49 = 0; local49<=2; local49 += 1) {
if (depth>=3) {
if (depth<=2) {
arg0.field5=this;
}
}else {
for (int local50 = 0; local50<=0; local50 += 1) {
arg0.field5.method1(this.field2,depth-1);
}
}
}
for (int local51 = 0; local51<=0; local51 += 1) {
arg0.field4=this.field14.method4(arg0.field2,this,depth-1);
}
if (depth<=1) {
this.method7(arg1.field3,arg1,depth-1);
}else {
for (int local52 = 0; local52<=3; local52 += 1) {
this.method6(arg0,depth-1);
}
}
arg1.method6(arg0.field3,depth-1);
arg1=this;
if (depth<2) {
for (int local53 = 0; local53<=3; local53 += 1) {
arg0.field5.method6(arg0.field1,depth-1);
}
}else {
this.field3.method1(arg0.field5,depth-1);
}
arg0.field1=arg0.field3;
if (depth<4) {
for (int local54 = 0; local54<=0; local54 += 1) {
if (depth==1) {
arg0=arg0.field1;
}else {
arg0.field1.method2(arg1.field2,this.field14,depth-1);
}
}
}else {
if (depth==2) {
arg0=arg0.field3;
}
}
}
public static void method8(int depth) {
if (depth == 0) return;
field2.field7.method1(field2.field3,depth-1);
}
}
public class Test22{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test22Lib.local1 = new Test22Class1();
Benchmark.alloc(2);
Test22Lib.local2 = new Test22Class1();
Benchmark.alloc(3);
Test22Lib.local3 = new Test22Class1();
Benchmark.alloc(4);
Test22Lib.local4 = new Test22Class1();
Benchmark.alloc(5);
Test22Lib.local5 = new Test22Class1();
Benchmark.alloc(6);
Test22Lib.local6 = new Test22Class1();
Benchmark.alloc(7);
Test22Lib.local7 = new Test22Class1();
Benchmark.alloc(8);
Test22Lib.local8 = new Test22Class1();
Benchmark.alloc(9);
Test22Lib.local9 = new Test22Class2();
Benchmark.alloc(10);
Test22Lib.local10 = new Test22Class2();
Benchmark.alloc(11);
Test22Lib.local11 = new Test22Class2();
Benchmark.alloc(12);
Test22Lib.local12 = new Test22Class3();
Benchmark.alloc(13);
Test22Lib.local13 = new Test22Class3();
Benchmark.alloc(14);
Test22Lib.local14 = new Test22Class3();
Benchmark.alloc(15);
Test22Lib.local15 = new Test22Class3();
Benchmark.alloc(16);
Test22Lib.local16 = new Test22Class3();
Benchmark.alloc(17);
Test22Lib.local17 = new Test22Class4();
Benchmark.alloc(18);
Test22Lib.local18 = new Test22Class5();
Benchmark.alloc(19);
Test22Lib.local19 = new Test22Class5();
Benchmark.alloc(20);
Test22Lib.local20 = new Test22Class5();
Benchmark.alloc(21);
Test22Lib.local21 = new Test22Class5();
Benchmark.alloc(22);
Test22Lib.local22 = new Test22Class5();
Benchmark.alloc(23);
Test22Lib.local23 = new Test22Class5();
Benchmark.alloc(24);
Test22Lib.local24 = new Test22Class5();
Test22Lib.local1.field1 = Test22Lib.local11;
Test22Lib.local1.field2 = Test22Lib.local15;
Test22Lib.local1.field3 = Test22Lib.local11;
Test22Lib.local2.field1 = Test22Lib.local11;
Test22Lib.local2.field2 = Test22Lib.local12;
Test22Lib.local2.field3 = Test22Lib.local10;
Test22Lib.local3.field1 = Test22Lib.local9;
Test22Lib.local3.field2 = Test22Lib.local17;
Test22Lib.local3.field3 = Test22Lib.local10;
Test22Lib.local4.field1 = Test22Lib.local9;
Test22Lib.local4.field2 = Test22Lib.local16;
Test22Lib.local4.field3 = Test22Lib.local10;
Test22Lib.local5.field1 = Test22Lib.local10;
Test22Lib.local5.field2 = Test22Lib.local13;
Test22Lib.local5.field3 = Test22Lib.local10;
Test22Lib.local6.field1 = Test22Lib.local9;
Test22Lib.local6.field2 = Test22Lib.local16;
Test22Lib.local6.field3 = Test22Lib.local10;
Test22Lib.local7.field1 = Test22Lib.local11;
Test22Lib.local7.field2 = Test22Lib.local13;
Test22Lib.local7.field3 = Test22Lib.local11;
Test22Lib.local8.field1 = Test22Lib.local11;
Test22Lib.local8.field2 = Test22Lib.local12;
Test22Lib.local8.field3 = Test22Lib.local10;
Test22Lib.local9.field4 = Test22Lib.local17;
Test22Lib.local9.field5 = Test22Lib.local19;
Test22Lib.local9.field1 = Test22Lib.local10;
Test22Lib.local9.field2 = Test22Lib.local14;
Test22Lib.local9.field3 = Test22Lib.local11;
Test22Lib.local10.field4 = Test22Lib.local15;
Test22Lib.local10.field5 = Test22Lib.local19;
Test22Lib.local10.field1 = Test22Lib.local9;
Test22Lib.local10.field2 = Test22Lib.local14;
Test22Lib.local10.field3 = Test22Lib.local11;
Test22Lib.local11.field4 = Test22Lib.local12;
Test22Lib.local11.field5 = Test22Lib.local21;
Test22Lib.local11.field1 = Test22Lib.local10;
Test22Lib.local11.field2 = Test22Lib.local13;
Test22Lib.local11.field3 = Test22Lib.local11;
Test22Lib.local12.field6 = Test22Lib.local18;
Test22Lib.local12.field7 = Test22Lib.local13;
Test22Lib.local12.field8 = Test22Lib.local12;
Test22Lib.local12.field9 = Test22Lib.local10;
Test22Lib.local12.field1 = Test22Lib.local10;
Test22Lib.local12.field2 = Test22Lib.local14;
Test22Lib.local12.field3 = Test22Lib.local11;
Test22Lib.local13.field6 = Test22Lib.local15;
Test22Lib.local13.field7 = Test22Lib.local13;
Test22Lib.local13.field8 = Test22Lib.local12;
Test22Lib.local13.field9 = Test22Lib.local11;
Test22Lib.local13.field1 = Test22Lib.local11;
Test22Lib.local13.field2 = Test22Lib.local12;
Test22Lib.local13.field3 = Test22Lib.local9;
Test22Lib.local14.field6 = Test22Lib.local21;
Test22Lib.local14.field7 = Test22Lib.local17;
Test22Lib.local14.field8 = Test22Lib.local16;
Test22Lib.local14.field9 = Test22Lib.local10;
Test22Lib.local14.field1 = Test22Lib.local11;
Test22Lib.local14.field2 = Test22Lib.local17;
Test22Lib.local14.field3 = Test22Lib.local11;
Test22Lib.local15.field6 = Test22Lib.local21;
Test22Lib.local15.field7 = Test22Lib.local13;
Test22Lib.local15.field8 = Test22Lib.local13;
Test22Lib.local15.field9 = Test22Lib.local9;
Test22Lib.local15.field1 = Test22Lib.local11;
Test22Lib.local15.field2 = Test22Lib.local12;
Test22Lib.local15.field3 = Test22Lib.local11;
Test22Lib.local16.field6 = Test22Lib.local18;
Test22Lib.local16.field7 = Test22Lib.local12;
Test22Lib.local16.field8 = Test22Lib.local13;
Test22Lib.local16.field9 = Test22Lib.local10;
Test22Lib.local16.field1 = Test22Lib.local11;
Test22Lib.local16.field2 = Test22Lib.local16;
Test22Lib.local16.field3 = Test22Lib.local10;
Test22Lib.local17.field10 = Test22Lib.local15;
Test22Lib.local17.field11 = Test22Lib.local15;
Test22Lib.local17.field12 = Test22Lib.local13;
Test22Lib.local17.field13 = Test22Lib.local7;
Test22Lib.local17.field6 = Test22Lib.local11;
Test22Lib.local17.field7 = Test22Lib.local12;
Test22Lib.local17.field8 = Test22Lib.local16;
Test22Lib.local17.field9 = Test22Lib.local11;
Test22Lib.local17.field1 = Test22Lib.local10;
Test22Lib.local17.field2 = Test22Lib.local15;
Test22Lib.local17.field3 = Test22Lib.local10;
Test22Lib.local18.field14 = Test22Lib.local13;
Test22Lib.local18.field1 = Test22Lib.local11;
Test22Lib.local18.field2 = Test22Lib.local15;
Test22Lib.local18.field3 = Test22Lib.local9;
Test22Lib.local19.field14 = Test22Lib.local16;
Test22Lib.local19.field1 = Test22Lib.local10;
Test22Lib.local19.field2 = Test22Lib.local13;
Test22Lib.local19.field3 = Test22Lib.local9;
Test22Lib.local20.field14 = Test22Lib.local15;
Test22Lib.local20.field1 = Test22Lib.local9;
Test22Lib.local20.field2 = Test22Lib.local13;
Test22Lib.local20.field3 = Test22Lib.local11;
Test22Lib.local21.field14 = Test22Lib.local15;
Test22Lib.local21.field1 = Test22Lib.local10;
Test22Lib.local21.field2 = Test22Lib.local13;
Test22Lib.local21.field3 = Test22Lib.local11;
Test22Lib.local22.field14 = Test22Lib.local12;
Test22Lib.local22.field1 = Test22Lib.local10;
Test22Lib.local22.field2 = Test22Lib.local14;
Test22Lib.local22.field3 = Test22Lib.local10;
Test22Lib.local23.field14 = Test22Lib.local14;
Test22Lib.local23.field1 = Test22Lib.local9;
Test22Lib.local23.field2 = Test22Lib.local17;
Test22Lib.local23.field3 = Test22Lib.local10;
Test22Lib.local24.field14 = Test22Lib.local12;
Test22Lib.local24.field1 = Test22Lib.local11;
Test22Lib.local24.field2 = Test22Lib.local13;
Test22Lib.local24.field3 = Test22Lib.local10;
for (int local55 = 0; local55<=1; local55 += 1) {
for (int local56 = 0; local56<=0; local56 += 1) {
for (int local57 = 0; local57<=0; local57 += 1) {
Test22Lib.local9.field5=Test22Lib.local22;
}
}
}
Test22Lib.local10.field5.method7(Test22Lib.local19.field3,Test22Lib.local21,3);
if (inputValue<2) {
Test22Lib.local19.method8(3);
}
for (int local58 = 0; local58<=0; local58 += 1) {
Test22Lib.local11.field5.method6(Test22Lib.local12.field3,3);
}
Test22Lib.local9.field2.method1(Test22Lib.local10,3);
for (int local59 = 0; local59<=3; local59 += 1) {
for (int local60 = 0; local60<=2; local60 += 1) {
for (int local61 = 0; local61<=3; local61 += 1) {
Test22Lib.local18.field14.method4(Test22Lib.local10.field4,Test22Lib.local20,3);
}
}
}
Test22Lib.local17=Test22Lib.local17;
Test22Lib.local8.field1.method3(3);
Test22Lib.local17.field3.method2(Test22Lib.local7.field2,Test22Lib.local14.field7,3);
Test22Lib.local19.method8(3);
Benchmark.test(1,Test22Lib.local1);
Benchmark.test(2,Test22Lib.local2);
Benchmark.test(3,Test22Lib.local3);
Benchmark.test(4,Test22Lib.local4);
Benchmark.test(5,Test22Lib.local5);
Benchmark.test(6,Test22Lib.local6);
Benchmark.test(7,Test22Lib.local7);
Benchmark.test(8,Test22Lib.local8);
Benchmark.test(9,Test22Lib.local9);
Benchmark.test(10,Test22Lib.local10);
Benchmark.test(11,Test22Lib.local11);
Benchmark.test(12,Test22Lib.local12);
Benchmark.test(13,Test22Lib.local13);
Benchmark.test(14,Test22Lib.local14);
Benchmark.test(15,Test22Lib.local15);
Benchmark.test(16,Test22Lib.local16);
Benchmark.test(17,Test22Lib.local17);
Benchmark.test(18,Test22Lib.local18);
Benchmark.test(19,Test22Lib.local19);
Benchmark.test(20,Test22Lib.local20);
Benchmark.test(21,Test22Lib.local21);
Benchmark.test(22,Test22Lib.local22);
Benchmark.test(23,Test22Lib.local23);
Benchmark.test(24,Test22Lib.local24);
Benchmark.test(25,Test22Lib.local1.field1);
Benchmark.test(26,Test22Lib.local1.field2);
Benchmark.test(27,Test22Lib.local1.field3);
Benchmark.test(28,Test22Lib.local2.field1);
Benchmark.test(29,Test22Lib.local2.field2);
Benchmark.test(30,Test22Lib.local2.field3);
Benchmark.test(31,Test22Lib.local3.field1);
Benchmark.test(32,Test22Lib.local3.field2);
Benchmark.test(33,Test22Lib.local3.field3);
Benchmark.test(34,Test22Lib.local4.field1);
Benchmark.test(35,Test22Lib.local4.field2);
Benchmark.test(36,Test22Lib.local4.field3);
Benchmark.test(37,Test22Lib.local5.field1);
Benchmark.test(38,Test22Lib.local5.field2);
Benchmark.test(39,Test22Lib.local5.field3);
Benchmark.test(40,Test22Lib.local6.field1);
Benchmark.test(41,Test22Lib.local6.field2);
Benchmark.test(42,Test22Lib.local6.field3);
Benchmark.test(43,Test22Lib.local7.field1);
Benchmark.test(44,Test22Lib.local7.field2);
Benchmark.test(45,Test22Lib.local7.field3);
Benchmark.test(46,Test22Lib.local8.field1);
Benchmark.test(47,Test22Lib.local8.field2);
Benchmark.test(48,Test22Lib.local8.field3);
Benchmark.test(49,Test22Lib.local9.field4);
Benchmark.test(50,Test22Lib.local9.field5);
Benchmark.test(51,Test22Lib.local9.field1);
Benchmark.test(52,Test22Lib.local9.field2);
Benchmark.test(53,Test22Lib.local9.field3);
Benchmark.test(54,Test22Lib.local10.field4);
Benchmark.test(55,Test22Lib.local10.field5);
Benchmark.test(56,Test22Lib.local10.field1);
Benchmark.test(57,Test22Lib.local10.field2);
Benchmark.test(58,Test22Lib.local10.field3);
Benchmark.test(59,Test22Lib.local11.field4);
Benchmark.test(60,Test22Lib.local11.field5);
Benchmark.test(61,Test22Lib.local11.field1);
Benchmark.test(62,Test22Lib.local11.field2);
Benchmark.test(63,Test22Lib.local11.field3);
Benchmark.test(64,Test22Lib.local12.field6);
Benchmark.test(65,Test22Lib.local12.field7);
Benchmark.test(66,Test22Lib.local12.field8);
Benchmark.test(67,Test22Lib.local12.field9);
Benchmark.test(68,Test22Lib.local12.field1);
Benchmark.test(69,Test22Lib.local12.field2);
Benchmark.test(70,Test22Lib.local12.field3);
Benchmark.test(71,Test22Lib.local13.field6);
Benchmark.test(72,Test22Lib.local13.field7);
Benchmark.test(73,Test22Lib.local13.field8);
Benchmark.test(74,Test22Lib.local13.field9);
Benchmark.test(75,Test22Lib.local13.field1);
Benchmark.test(76,Test22Lib.local13.field2);
Benchmark.test(77,Test22Lib.local13.field3);
Benchmark.test(78,Test22Lib.local14.field6);
Benchmark.test(79,Test22Lib.local14.field7);
Benchmark.test(80,Test22Lib.local14.field8);
Benchmark.test(81,Test22Lib.local14.field9);
Benchmark.test(82,Test22Lib.local14.field1);
Benchmark.test(83,Test22Lib.local14.field2);
Benchmark.test(84,Test22Lib.local14.field3);
Benchmark.test(85,Test22Lib.local15.field6);
Benchmark.test(86,Test22Lib.local15.field7);
Benchmark.test(87,Test22Lib.local15.field8);
Benchmark.test(88,Test22Lib.local15.field9);
Benchmark.test(89,Test22Lib.local15.field1);
Benchmark.test(90,Test22Lib.local15.field2);
Benchmark.test(91,Test22Lib.local15.field3);
Benchmark.test(92,Test22Lib.local16.field6);
Benchmark.test(93,Test22Lib.local16.field7);
Benchmark.test(94,Test22Lib.local16.field8);
Benchmark.test(95,Test22Lib.local16.field9);
Benchmark.test(96,Test22Lib.local16.field1);
Benchmark.test(97,Test22Lib.local16.field2);
Benchmark.test(98,Test22Lib.local16.field3);
Benchmark.test(99,Test22Lib.local17.field10);
Benchmark.test(100,Test22Lib.local17.field11);
Benchmark.test(101,Test22Lib.local17.field12);
Benchmark.test(102,Test22Lib.local17.field13);
Benchmark.test(103,Test22Lib.local17.field6);
Benchmark.test(104,Test22Lib.local17.field7);
Benchmark.test(105,Test22Lib.local17.field8);
Benchmark.test(106,Test22Lib.local17.field9);
Benchmark.test(107,Test22Lib.local17.field1);
Benchmark.test(108,Test22Lib.local17.field2);
Benchmark.test(109,Test22Lib.local17.field3);
Benchmark.test(110,Test22Lib.local18.field14);
Benchmark.test(111,Test22Lib.local18.field1);
Benchmark.test(112,Test22Lib.local18.field2);
Benchmark.test(113,Test22Lib.local18.field3);
Benchmark.test(114,Test22Lib.local19.field14);
Benchmark.test(115,Test22Lib.local19.field1);
Benchmark.test(116,Test22Lib.local19.field2);
Benchmark.test(117,Test22Lib.local19.field3);
Benchmark.test(118,Test22Lib.local20.field14);
Benchmark.test(119,Test22Lib.local20.field1);
Benchmark.test(120,Test22Lib.local20.field2);
Benchmark.test(121,Test22Lib.local20.field3);
Benchmark.test(122,Test22Lib.local21.field14);
Benchmark.test(123,Test22Lib.local21.field1);
Benchmark.test(124,Test22Lib.local21.field2);
Benchmark.test(125,Test22Lib.local21.field3);
Benchmark.test(126,Test22Lib.local22.field14);
Benchmark.test(127,Test22Lib.local22.field1);
Benchmark.test(128,Test22Lib.local22.field2);
Benchmark.test(129,Test22Lib.local22.field3);
Benchmark.test(130,Test22Lib.local23.field14);
Benchmark.test(131,Test22Lib.local23.field1);
Benchmark.test(132,Test22Lib.local23.field2);
Benchmark.test(133,Test22Lib.local23.field3);
Benchmark.test(134,Test22Lib.local24.field14);
Benchmark.test(135,Test22Lib.local24.field1);
Benchmark.test(136,Test22Lib.local24.field2);
Benchmark.test(137,Test22Lib.local24.field3);
Benchmark.print();
}
}