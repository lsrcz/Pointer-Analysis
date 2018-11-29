package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test36Lib{
public static Test36Class1 local1;
public static Test36Class1 local2;
public static Test36Class1 local3;
public static Test36Class1 local4;
public static Test36Class1 local5;
public static Test36Class1 local6;
public static Test36Class1 local7;
public static Test36Class2 local8;
public static Test36Class2 local9;
public static Test36Class2 local10;
public static Test36Class2 local11;
public static Test36Class3 local12;
public static Test36Class3 local13;
public static Test36Class3 local14;
public static Test36Class4 local15;
public static Test36Class4 local16;
public static Test36Class4 local17;
public static Test36Class4 local18;
public static Test36Class4 local19;
public static Test36Class4 local20;
public static Test36Class5 local21;
public static Test36Class5 local22;
public static Test36Class5 local23;
public static Test36Class5 local24;
public static Test36Class5 local25;
public static Test36Class5 local26;
public static Test36Class5 local27;
}
class Test36Class1 extends BasicClass {
public Test36Class1 field1;
public static Test36Class5 field2;
public Test36Class4 method1(Test36Class3 arg0, Test36Class1 arg1, int depth) {
if (depth == 0) return Test36Lib.local15;
return Test36Lib.local16;
}
public Test36Class5 method2(int depth) {
if (depth == 0) return Test36Lib.local24;
return this.field2;
}
public Test36Class4 method3(Test36Class2 arg0, Test36Class2 arg1, int depth) {
if (depth == 0) return Test36Lib.local15;
for (int local28 = 0; local28<=1; local28 += 1) {
arg1.field3=arg1.field2;
}
for (int local29 = 0; local29<=2; local29 += 1) {
for (int local30 = 0; local30<=0; local30 += 1) {
arg0.field4=arg0.field4;
}
}
return arg0.field4;
}
public Test36Class3 method4(Test36Class2 arg0, int depth) {
if (depth == 0) return Test36Lib.local27;
for (int local31 = 0; local31<=1; local31 += 1) {
arg0.field4.method6(arg0.field2,arg0.field2,depth-1);
}
arg0.method9(arg0.field4,arg0.field4,depth-1);
return arg0.field3;
}
public static void method5(int depth) {
if (depth == 0) return;
field2.field6.method1(field2.field10,field2.field5,depth-1);
field2.field1=field2.field9;
}
public Test36Class5 method6(Test36Class3 arg0, Test36Class5 arg1, int depth) {
if (depth == 0) return Test36Lib.local25;
arg0.method6(arg0.field2,arg1,depth-1);
if (depth>=2) {
for (int local32 = 0; local32<=1; local32 += 1) {
if (depth>=2) {
this.field2.method19(arg1.field9,arg0.field5,depth-1);
}
}
}
return arg1;
}
}
class Test36Class2 extends Test36Class1 {
public Test36Class3 field3;
public static Test36Class4 field4;
public static void method7(Test36Class3 arg0, Test36Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<=2) {
for (int local33 = 0; local33<=0; local33 += 1) {
if (depth>=4) {
arg0=field4.field7;
}
}
}
}
public static void method8(int depth) {
if (depth == 0) return;
}
public void method9(Test36Class4 arg0, Test36Class3 arg1, int depth) {
if (depth == 0) return;
if (depth>3) {
if (depth==1) {
this.method13(depth-1);
}
}
}
public void method10(Test36Class3 arg0, Test36Class4 arg1, int depth) {
if (depth == 0) return;
if (depth>=2) {
for (int local34 = 0; local34<=0; local34 += 1) {
arg0.field6=this;
}
}else {
if (depth>=3) {
for (int local35 = 0; local35<=0; local35 += 1) {
this.method8(depth-1);
}
}
}
for (int local36 = 0; local36<=1; local36 += 1) {
this.field2=arg1.field2;
}
}
public Test36Class4 method11(Test36Class3 arg0, int depth) {
if (depth == 0) return Test36Lib.local18;
return this.field4;
}
public static Test36Class3 method12(Test36Class2 arg0, int depth) {
if (depth == 0) return Test36Lib.local17;
return field2.field2;
}
public void method13(int depth) {
if (depth == 0) return;
this.field4.method21(depth-1);
this.method16(depth-1);
}
public static Test36Class3 method14(Test36Class2 arg0, int depth) {
if (depth == 0) return Test36Lib.local18;
field2.method18(arg0,depth-1);
return arg0.field4;
}
public void method15(int depth) {
if (depth == 0) return;
this.field3=this.field2.method6(this.field2,this.field2,depth-1);
this.field1=this.field2;
}
public void method16(int depth) {
if (depth == 0) return;
}
}
class Test36Class3 extends Test36Class1 {
public static Test36Class3 field5;
public static Test36Class1 field6;
public static void method17(Test36Class5 arg0, Test36Class2 arg1, int depth) {
if (depth == 0) return;
arg1.method10(field2.field9,arg0.field9,depth-1);
field6=field2;
}
public static void method18(Test36Class2 arg0, int depth) {
if (depth == 0) return;
field2.field6=field5.field2.method24(depth-1);
arg0.field4=field2.field9;
}
public Test36Class1 method19(Test36Class4 arg0, Test36Class1 arg1, int depth) {
if (depth == 0) return Test36Lib.local8;
return arg0.field2;
}
}
class Test36Class4 extends Test36Class3 {
public Test36Class3 field7;
public static Test36Class4 field8;
public static void method20(Test36Class1 arg0, Test36Class1 arg1, int depth) {
if (depth == 0) return;
for (int local37 = 0; local37<=0; local37 += 1) {
if (depth<=1) {
for (int local38 = 0; local38<=2; local38 += 1) {
field5.field2=field2.field2;
}
}else {
if (depth>=3) {
field2.field1=arg0.field2;
}
}
}
}
public void method21(int depth) {
if (depth == 0) return;
this.field2=this.field2;
if (depth>2) {
if (depth>4) {
for (int local39 = 0; local39<=1; local39 += 1) {
this.field5=this.field5;
}
}else {
for (int local40 = 0; local40<=1; local40 += 1) {
this.field1=this;
}
}
}
}
public static void method22(Test36Class4 arg0, Test36Class1 arg1, int depth) {
if (depth == 0) return;
}
public static Test36Class5 method23(Test36Class4 arg0, int depth) {
if (depth == 0) return Test36Lib.local26;
return field2.field2;
}
}
class Test36Class5 extends Test36Class3 {
public static Test36Class4 field9;
public Test36Class4 field10;
public static Test36Class2 method24(int depth) {
if (depth == 0) return Test36Lib.local11;
field2.field6=field9.field6;
for (int local41 = 0; local41<=3; local41 += 1) {
field9.field6=field9;
}
return Test36Lib.local10;
}
public Test36Class5 method25(Test36Class1 arg0, Test36Class4 arg1, int depth) {
if (depth == 0) return Test36Lib.local22;
this.field10=this.field9;
for (int local42 = 0; local42<=3; local42 += 1) {
for (int local43 = 0; local43<=2; local43 += 1) {
this.field10=this.field9;
}
}
return arg0.field2;
}
public static void method26(Test36Class5 arg0, int depth) {
if (depth == 0) return;
for (int local44 = 0; local44<=0; local44 += 1) {
for (int local45 = 0; local45<=1; local45 += 1) {
field5.field1=field2.field5;
}
}
field5=field2.field2;
}
}
public class Test36{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test36Lib.local1 = new Test36Class1();
Benchmark.alloc(2);
Test36Lib.local2 = new Test36Class1();
Benchmark.alloc(3);
Test36Lib.local3 = new Test36Class1();
Benchmark.alloc(4);
Test36Lib.local4 = new Test36Class1();
Benchmark.alloc(5);
Test36Lib.local5 = new Test36Class1();
Benchmark.alloc(6);
Test36Lib.local6 = new Test36Class1();
Benchmark.alloc(7);
Test36Lib.local7 = new Test36Class1();
Benchmark.alloc(8);
Test36Lib.local8 = new Test36Class2();
Benchmark.alloc(9);
Test36Lib.local9 = new Test36Class2();
Benchmark.alloc(10);
Test36Lib.local10 = new Test36Class2();
Benchmark.alloc(11);
Test36Lib.local11 = new Test36Class2();
Benchmark.alloc(12);
Test36Lib.local12 = new Test36Class3();
Benchmark.alloc(13);
Test36Lib.local13 = new Test36Class3();
Benchmark.alloc(14);
Test36Lib.local14 = new Test36Class3();
Benchmark.alloc(15);
Test36Lib.local15 = new Test36Class4();
Benchmark.alloc(16);
Test36Lib.local16 = new Test36Class4();
Benchmark.alloc(17);
Test36Lib.local17 = new Test36Class4();
Benchmark.alloc(18);
Test36Lib.local18 = new Test36Class4();
Benchmark.alloc(19);
Test36Lib.local19 = new Test36Class4();
Benchmark.alloc(20);
Test36Lib.local20 = new Test36Class4();
Benchmark.alloc(21);
Test36Lib.local21 = new Test36Class5();
Benchmark.alloc(22);
Test36Lib.local22 = new Test36Class5();
Benchmark.alloc(23);
Test36Lib.local23 = new Test36Class5();
Benchmark.alloc(24);
Test36Lib.local24 = new Test36Class5();
Benchmark.alloc(25);
Test36Lib.local25 = new Test36Class5();
Benchmark.alloc(26);
Test36Lib.local26 = new Test36Class5();
Benchmark.alloc(27);
Test36Lib.local27 = new Test36Class5();
Test36Lib.local1.field1 = Test36Lib.local3;
Test36Lib.local1.field2 = Test36Lib.local24;
Test36Lib.local2.field1 = Test36Lib.local5;
Test36Lib.local2.field2 = Test36Lib.local24;
Test36Lib.local3.field1 = Test36Lib.local23;
Test36Lib.local3.field2 = Test36Lib.local23;
Test36Lib.local4.field1 = Test36Lib.local15;
Test36Lib.local4.field2 = Test36Lib.local21;
Test36Lib.local5.field1 = Test36Lib.local26;
Test36Lib.local5.field2 = Test36Lib.local27;
Test36Lib.local6.field1 = Test36Lib.local24;
Test36Lib.local6.field2 = Test36Lib.local24;
Test36Lib.local7.field1 = Test36Lib.local13;
Test36Lib.local7.field2 = Test36Lib.local21;
Test36Lib.local8.field3 = Test36Lib.local18;
Test36Lib.local8.field4 = Test36Lib.local17;
Test36Lib.local8.field1 = Test36Lib.local17;
Test36Lib.local8.field2 = Test36Lib.local21;
Test36Lib.local9.field3 = Test36Lib.local20;
Test36Lib.local9.field4 = Test36Lib.local18;
Test36Lib.local9.field1 = Test36Lib.local2;
Test36Lib.local9.field2 = Test36Lib.local23;
Test36Lib.local10.field3 = Test36Lib.local15;
Test36Lib.local10.field4 = Test36Lib.local15;
Test36Lib.local10.field1 = Test36Lib.local15;
Test36Lib.local10.field2 = Test36Lib.local22;
Test36Lib.local11.field3 = Test36Lib.local20;
Test36Lib.local11.field4 = Test36Lib.local17;
Test36Lib.local11.field1 = Test36Lib.local5;
Test36Lib.local11.field2 = Test36Lib.local21;
Test36Lib.local12.field5 = Test36Lib.local19;
Test36Lib.local12.field6 = Test36Lib.local6;
Test36Lib.local12.field1 = Test36Lib.local18;
Test36Lib.local12.field2 = Test36Lib.local25;
Test36Lib.local13.field5 = Test36Lib.local26;
Test36Lib.local13.field6 = Test36Lib.local26;
Test36Lib.local13.field1 = Test36Lib.local10;
Test36Lib.local13.field2 = Test36Lib.local26;
Test36Lib.local14.field5 = Test36Lib.local27;
Test36Lib.local14.field6 = Test36Lib.local24;
Test36Lib.local14.field1 = Test36Lib.local26;
Test36Lib.local14.field2 = Test36Lib.local27;
Test36Lib.local15.field7 = Test36Lib.local25;
Test36Lib.local15.field8 = Test36Lib.local16;
Test36Lib.local15.field5 = Test36Lib.local18;
Test36Lib.local15.field6 = Test36Lib.local7;
Test36Lib.local15.field1 = Test36Lib.local10;
Test36Lib.local15.field2 = Test36Lib.local26;
Test36Lib.local16.field7 = Test36Lib.local19;
Test36Lib.local16.field8 = Test36Lib.local18;
Test36Lib.local16.field5 = Test36Lib.local12;
Test36Lib.local16.field6 = Test36Lib.local11;
Test36Lib.local16.field1 = Test36Lib.local20;
Test36Lib.local16.field2 = Test36Lib.local22;
Test36Lib.local17.field7 = Test36Lib.local27;
Test36Lib.local17.field8 = Test36Lib.local20;
Test36Lib.local17.field5 = Test36Lib.local21;
Test36Lib.local17.field6 = Test36Lib.local25;
Test36Lib.local17.field1 = Test36Lib.local27;
Test36Lib.local17.field2 = Test36Lib.local23;
Test36Lib.local18.field7 = Test36Lib.local13;
Test36Lib.local18.field8 = Test36Lib.local20;
Test36Lib.local18.field5 = Test36Lib.local20;
Test36Lib.local18.field6 = Test36Lib.local17;
Test36Lib.local18.field1 = Test36Lib.local9;
Test36Lib.local18.field2 = Test36Lib.local26;
Test36Lib.local19.field7 = Test36Lib.local19;
Test36Lib.local19.field8 = Test36Lib.local15;
Test36Lib.local19.field5 = Test36Lib.local14;
Test36Lib.local19.field6 = Test36Lib.local17;
Test36Lib.local19.field1 = Test36Lib.local22;
Test36Lib.local19.field2 = Test36Lib.local21;
Test36Lib.local20.field7 = Test36Lib.local12;
Test36Lib.local20.field8 = Test36Lib.local19;
Test36Lib.local20.field5 = Test36Lib.local23;
Test36Lib.local20.field6 = Test36Lib.local2;
Test36Lib.local20.field1 = Test36Lib.local20;
Test36Lib.local20.field2 = Test36Lib.local24;
Test36Lib.local21.field9 = Test36Lib.local20;
Test36Lib.local21.field10 = Test36Lib.local20;
Test36Lib.local21.field5 = Test36Lib.local17;
Test36Lib.local21.field6 = Test36Lib.local7;
Test36Lib.local21.field1 = Test36Lib.local14;
Test36Lib.local21.field2 = Test36Lib.local23;
Test36Lib.local22.field9 = Test36Lib.local16;
Test36Lib.local22.field10 = Test36Lib.local16;
Test36Lib.local22.field5 = Test36Lib.local17;
Test36Lib.local22.field6 = Test36Lib.local12;
Test36Lib.local22.field1 = Test36Lib.local3;
Test36Lib.local22.field2 = Test36Lib.local27;
Test36Lib.local23.field9 = Test36Lib.local16;
Test36Lib.local23.field10 = Test36Lib.local17;
Test36Lib.local23.field5 = Test36Lib.local27;
Test36Lib.local23.field6 = Test36Lib.local23;
Test36Lib.local23.field1 = Test36Lib.local9;
Test36Lib.local23.field2 = Test36Lib.local22;
Test36Lib.local24.field9 = Test36Lib.local18;
Test36Lib.local24.field10 = Test36Lib.local18;
Test36Lib.local24.field5 = Test36Lib.local23;
Test36Lib.local24.field6 = Test36Lib.local20;
Test36Lib.local24.field1 = Test36Lib.local27;
Test36Lib.local24.field2 = Test36Lib.local25;
Test36Lib.local25.field9 = Test36Lib.local15;
Test36Lib.local25.field10 = Test36Lib.local17;
Test36Lib.local25.field5 = Test36Lib.local18;
Test36Lib.local25.field6 = Test36Lib.local13;
Test36Lib.local25.field1 = Test36Lib.local25;
Test36Lib.local25.field2 = Test36Lib.local23;
Test36Lib.local26.field9 = Test36Lib.local17;
Test36Lib.local26.field10 = Test36Lib.local19;
Test36Lib.local26.field5 = Test36Lib.local21;
Test36Lib.local26.field6 = Test36Lib.local15;
Test36Lib.local26.field1 = Test36Lib.local2;
Test36Lib.local26.field2 = Test36Lib.local25;
Test36Lib.local27.field9 = Test36Lib.local16;
Test36Lib.local27.field10 = Test36Lib.local16;
Test36Lib.local27.field5 = Test36Lib.local18;
Test36Lib.local27.field6 = Test36Lib.local23;
Test36Lib.local27.field1 = Test36Lib.local12;
Test36Lib.local27.field2 = Test36Lib.local24;
for (int local46 = 0; local46<=2; local46 += 1) {
Test36Lib.local19.field8.method1(Test36Lib.local25.field5,Test36Lib.local27.field9,3);
}
for (int local47 = 0; local47<=1; local47 += 1) {
Test36Lib.local5.field1=Test36Lib.local7.field2.method24(3);
}
Test36Lib.local4.field1=Test36Lib.local12.field5;
Test36Lib.local27.field2.method3(Test36Lib.local8,Test36Lib.local9,3);
Test36Lib.local17.field8.method22(Test36Lib.local8.field4,Test36Lib.local18.field1,3);
for (int local48 = 0; local48<=3; local48 += 1) {
if (inputValue==4) {
if (inputValue>=1) {
Test36Lib.local10.method14(Test36Lib.local9,3);
}
}
}
for (int local49 = 0; local49<=2; local49 += 1) {
Test36Lib.local19.field1=Test36Lib.local13;
}
for (int local50 = 0; local50<=2; local50 += 1) {
if (inputValue>=3) {
Test36Lib.local10.field3=Test36Lib.local25.field2;
}
}
if (inputValue>4) {
for (int local51 = 0; local51<=1; local51 += 1) {
if (inputValue>=1) {
if (inputValue>4) {
Test36Lib.local23.field2=Test36Lib.local24.field2;
}else {
Test36Lib.local16.field5=Test36Lib.local11.field4;
}
}
}
}
for (int local52 = 0; local52<=3; local52 += 1) {
Test36Lib.local11.method15(3);
}
Benchmark.test(1,Test36Lib.local1);
Benchmark.test(2,Test36Lib.local2);
Benchmark.test(3,Test36Lib.local3);
Benchmark.test(4,Test36Lib.local4);
Benchmark.test(5,Test36Lib.local5);
Benchmark.test(6,Test36Lib.local6);
Benchmark.test(7,Test36Lib.local7);
Benchmark.test(8,Test36Lib.local8);
Benchmark.test(9,Test36Lib.local9);
Benchmark.test(10,Test36Lib.local10);
Benchmark.test(11,Test36Lib.local11);
Benchmark.test(12,Test36Lib.local12);
Benchmark.test(13,Test36Lib.local13);
Benchmark.test(14,Test36Lib.local14);
Benchmark.test(15,Test36Lib.local15);
Benchmark.test(16,Test36Lib.local16);
Benchmark.test(17,Test36Lib.local17);
Benchmark.test(18,Test36Lib.local18);
Benchmark.test(19,Test36Lib.local19);
Benchmark.test(20,Test36Lib.local20);
Benchmark.test(21,Test36Lib.local21);
Benchmark.test(22,Test36Lib.local22);
Benchmark.test(23,Test36Lib.local23);
Benchmark.test(24,Test36Lib.local24);
Benchmark.test(25,Test36Lib.local25);
Benchmark.test(26,Test36Lib.local26);
Benchmark.test(27,Test36Lib.local27);
Benchmark.test(28,Test36Lib.local1.field1);
Benchmark.test(29,Test36Lib.local1.field2);
Benchmark.test(30,Test36Lib.local2.field1);
Benchmark.test(31,Test36Lib.local2.field2);
Benchmark.test(32,Test36Lib.local3.field1);
Benchmark.test(33,Test36Lib.local3.field2);
Benchmark.test(34,Test36Lib.local4.field1);
Benchmark.test(35,Test36Lib.local4.field2);
Benchmark.test(36,Test36Lib.local5.field1);
Benchmark.test(37,Test36Lib.local5.field2);
Benchmark.test(38,Test36Lib.local6.field1);
Benchmark.test(39,Test36Lib.local6.field2);
Benchmark.test(40,Test36Lib.local7.field1);
Benchmark.test(41,Test36Lib.local7.field2);
Benchmark.test(42,Test36Lib.local8.field3);
Benchmark.test(43,Test36Lib.local8.field4);
Benchmark.test(44,Test36Lib.local8.field1);
Benchmark.test(45,Test36Lib.local8.field2);
Benchmark.test(46,Test36Lib.local9.field3);
Benchmark.test(47,Test36Lib.local9.field4);
Benchmark.test(48,Test36Lib.local9.field1);
Benchmark.test(49,Test36Lib.local9.field2);
Benchmark.test(50,Test36Lib.local10.field3);
Benchmark.test(51,Test36Lib.local10.field4);
Benchmark.test(52,Test36Lib.local10.field1);
Benchmark.test(53,Test36Lib.local10.field2);
Benchmark.test(54,Test36Lib.local11.field3);
Benchmark.test(55,Test36Lib.local11.field4);
Benchmark.test(56,Test36Lib.local11.field1);
Benchmark.test(57,Test36Lib.local11.field2);
Benchmark.test(58,Test36Lib.local12.field5);
Benchmark.test(59,Test36Lib.local12.field6);
Benchmark.test(60,Test36Lib.local12.field1);
Benchmark.test(61,Test36Lib.local12.field2);
Benchmark.test(62,Test36Lib.local13.field5);
Benchmark.test(63,Test36Lib.local13.field6);
Benchmark.test(64,Test36Lib.local13.field1);
Benchmark.test(65,Test36Lib.local13.field2);
Benchmark.test(66,Test36Lib.local14.field5);
Benchmark.test(67,Test36Lib.local14.field6);
Benchmark.test(68,Test36Lib.local14.field1);
Benchmark.test(69,Test36Lib.local14.field2);
Benchmark.test(70,Test36Lib.local15.field7);
Benchmark.test(71,Test36Lib.local15.field8);
Benchmark.test(72,Test36Lib.local15.field5);
Benchmark.test(73,Test36Lib.local15.field6);
Benchmark.test(74,Test36Lib.local15.field1);
Benchmark.test(75,Test36Lib.local15.field2);
Benchmark.test(76,Test36Lib.local16.field7);
Benchmark.test(77,Test36Lib.local16.field8);
Benchmark.test(78,Test36Lib.local16.field5);
Benchmark.test(79,Test36Lib.local16.field6);
Benchmark.test(80,Test36Lib.local16.field1);
Benchmark.test(81,Test36Lib.local16.field2);
Benchmark.test(82,Test36Lib.local17.field7);
Benchmark.test(83,Test36Lib.local17.field8);
Benchmark.test(84,Test36Lib.local17.field5);
Benchmark.test(85,Test36Lib.local17.field6);
Benchmark.test(86,Test36Lib.local17.field1);
Benchmark.test(87,Test36Lib.local17.field2);
Benchmark.test(88,Test36Lib.local18.field7);
Benchmark.test(89,Test36Lib.local18.field8);
Benchmark.test(90,Test36Lib.local18.field5);
Benchmark.test(91,Test36Lib.local18.field6);
Benchmark.test(92,Test36Lib.local18.field1);
Benchmark.test(93,Test36Lib.local18.field2);
Benchmark.test(94,Test36Lib.local19.field7);
Benchmark.test(95,Test36Lib.local19.field8);
Benchmark.test(96,Test36Lib.local19.field5);
Benchmark.test(97,Test36Lib.local19.field6);
Benchmark.test(98,Test36Lib.local19.field1);
Benchmark.test(99,Test36Lib.local19.field2);
Benchmark.test(100,Test36Lib.local20.field7);
Benchmark.test(101,Test36Lib.local20.field8);
Benchmark.test(102,Test36Lib.local20.field5);
Benchmark.test(103,Test36Lib.local20.field6);
Benchmark.test(104,Test36Lib.local20.field1);
Benchmark.test(105,Test36Lib.local20.field2);
Benchmark.test(106,Test36Lib.local21.field9);
Benchmark.test(107,Test36Lib.local21.field10);
Benchmark.test(108,Test36Lib.local21.field5);
Benchmark.test(109,Test36Lib.local21.field6);
Benchmark.test(110,Test36Lib.local21.field1);
Benchmark.test(111,Test36Lib.local21.field2);
Benchmark.test(112,Test36Lib.local22.field9);
Benchmark.test(113,Test36Lib.local22.field10);
Benchmark.test(114,Test36Lib.local22.field5);
Benchmark.test(115,Test36Lib.local22.field6);
Benchmark.test(116,Test36Lib.local22.field1);
Benchmark.test(117,Test36Lib.local22.field2);
Benchmark.test(118,Test36Lib.local23.field9);
Benchmark.test(119,Test36Lib.local23.field10);
Benchmark.test(120,Test36Lib.local23.field5);
Benchmark.test(121,Test36Lib.local23.field6);
Benchmark.test(122,Test36Lib.local23.field1);
Benchmark.test(123,Test36Lib.local23.field2);
Benchmark.test(124,Test36Lib.local24.field9);
Benchmark.test(125,Test36Lib.local24.field10);
Benchmark.test(126,Test36Lib.local24.field5);
Benchmark.test(127,Test36Lib.local24.field6);
Benchmark.test(128,Test36Lib.local24.field1);
Benchmark.test(129,Test36Lib.local24.field2);
Benchmark.test(130,Test36Lib.local25.field9);
Benchmark.test(131,Test36Lib.local25.field10);
Benchmark.test(132,Test36Lib.local25.field5);
Benchmark.test(133,Test36Lib.local25.field6);
Benchmark.test(134,Test36Lib.local25.field1);
Benchmark.test(135,Test36Lib.local25.field2);
Benchmark.test(136,Test36Lib.local26.field9);
Benchmark.test(137,Test36Lib.local26.field10);
Benchmark.test(138,Test36Lib.local26.field5);
Benchmark.test(139,Test36Lib.local26.field6);
Benchmark.test(140,Test36Lib.local26.field1);
Benchmark.test(141,Test36Lib.local26.field2);
Benchmark.test(142,Test36Lib.local27.field9);
Benchmark.test(143,Test36Lib.local27.field10);
Benchmark.test(144,Test36Lib.local27.field5);
Benchmark.test(145,Test36Lib.local27.field6);
Benchmark.test(146,Test36Lib.local27.field1);
Benchmark.test(147,Test36Lib.local27.field2);
Benchmark.print();
}
}
