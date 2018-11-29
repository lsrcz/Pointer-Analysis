package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test15Lib{
public static Test15Class1 local1;
public static Test15Class1 local2;
public static Test15Class1 local3;
public static Test15Class1 local4;
public static Test15Class1 local5;
public static Test15Class2 local6;
public static Test15Class2 local7;
}
class Test15Class1 extends BasicClass {
public Test15Class1 field1;
public static Test15Class2 field2;
public static Test15Class2 field3;
public static Test15Class2 field4;
public Test15Class1 field5;
public Test15Class1 field6;
public Test15Class1 method1(Test15Class1 arg0, Test15Class2 arg1, int depth) {
if (depth == 0) return Test15Lib.local1;
arg0.field5=this.field2;
arg0.field5.method2(arg0.field4,depth-1);
arg0.field5=this.field4;
this.field2.method10(this.field2,depth-1);
arg0.field5=arg1.field2.method11(arg0.field3,arg1.field4,depth-1);
arg0.field3.method12(arg1.field3,arg0.field4,depth-1);
arg1.method12(arg0.field2,this.field6,depth-1);
this.field3=arg1.field2;
this.field2=arg1.field6.method3(depth-1);
return this.field4;
}
public void method2(Test15Class1 arg0, int depth) {
if (depth == 0) return;
this.field5=arg0.field3.method5(depth-1);
if (depth<2) {
for (int local8 = 0; local8<=0; local8 += 1) {
this.field2=arg0.field2;
}
}else {
for (int local9 = 0; local9<=3; local9 += 1) {
arg0.field4=this.field3;
}
}
arg0=this.field3;
if (depth>3) {
arg0.field3.method4(this.field3,depth-1);
}
if (depth>3) {
arg0.field6=arg0;
}else {
arg0.field4=this.field2;
}
if (depth==2) {
if (depth>=2) {
arg0.field4.method12(arg0.field4,this.field3,depth-1);
}else {
this.field4=this.field2;
}
}else {
if (depth<3) {
arg0.field1=arg0;
}
}
this.field1.method5(depth-1);
arg0=arg0.field1;
for (int local10 = 0; local10<=1; local10 += 1) {
if (depth>2) {
for (int local11 = 0; local11<=2; local11 += 1) {
if (depth>2) {
arg0.field2=this.field2;
}
}
}else {
for (int local12 = 0; local12<=0; local12 += 1) {
if (depth==1) {
arg0.field5.method2(this,depth-1);
}
}
}
}
}
public Test15Class2 method3(int depth) {
if (depth == 0) return Test15Lib.local7;
this.field6.method4(this.field1,depth-1);
if (depth>=3) {
if (depth<1) {
for (int local13 = 0; local13<=2; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
this.field6=this.field5.method3(depth-1);
}
}
}else {
this.field5=this.field1.method3(depth-1);
}
}else {
if (depth>2) {
this.field5=this.field6;
}else {
this.field2.method13(depth-1);
}
}
this.field5=this.field3;
return this.field2;
}
public void method4(Test15Class1 arg0, int depth) {
if (depth == 0) return;
arg0.field4=arg0.field2;
arg0.field5=arg0.field5;
for (int local15 = 0; local15<=1; local15 += 1) {
for (int local16 = 0; local16<=2; local16 += 1) {
if (depth==4) {
arg0.field4=arg0.field4;
}
}
}
arg0.field2=arg0.field2;
arg0.field4=arg0.field3;
this.field4=this.field4;
}
public Test15Class1 method5(int depth) {
if (depth == 0) return Test15Lib.local4;
for (int local17 = 0; local17<=2; local17 += 1) {
for (int local18 = 0; local18<=1; local18 += 1) {
for (int local19 = 0; local19<=2; local19 += 1) {
for (int local20 = 0; local20<=1; local20 += 1) {
if (depth>2) {
}
}
}
}
}
this.field6=this.field3;
this.field5=this.field6;
if (depth<1) {
for (int local21 = 0; local21<=1; local21 += 1) {
if (depth>=4) {
for (int local22 = 0; local22<=3; local22 += 1) {
if (depth>3) {
}else {
}
}
}else {
this.field5.method2(this.field6,depth-1);
}
}
}
this.field4.method12(this.field2,this.field2,depth-1);
this.field6=this.field2;
this.field5=this;
if (depth>1) {
this.field4.method14(this.field3,depth-1);
}
return this.field6;
}
public Test15Class2 method6(int depth) {
if (depth == 0) return Test15Lib.local6;
for (int local23 = 0; local23<=2; local23 += 1) {
this.field3=this.field4;
}
for (int local24 = 0; local24<=1; local24 += 1) {
this.field2.method13(depth-1);
}
if (depth>1) {
if (depth<4) {
for (int local25 = 0; local25<=0; local25 += 1) {
if (depth<2) {
for (int local26 = 0; local26<=3; local26 += 1) {
}
}
}
}
}
if (depth<2) {
this.field3=this.field3;
}
for (int local27 = 0; local27<=2; local27 += 1) {
if (depth>=1) {
this.field1=this;
}
}
this.field2.method12(this.field2,this,depth-1);
return this.field2;
}
public Test15Class1 method7(Test15Class2 arg0, int depth) {
if (depth == 0) return Test15Lib.local5;
for (int local28 = 0; local28<=2; local28 += 1) {
for (int local29 = 0; local29<=0; local29 += 1) {
for (int local30 = 0; local30<=2; local30 += 1) {
if (depth>=1) {
if (depth<4) {
}
}else {
this.field2.method8(depth-1);
}
}
}
}
if (depth<=3) {
arg0.field5.method7(this.field4,depth-1);
}
arg0.field1=arg0.field8;
return this.field6;
}
public static void method8(int depth) {
if (depth == 0) return;
if (depth==1) {
for (int local31 = 0; local31<=3; local31 += 1) {
if (depth<4) {
for (int local32 = 0; local32<=1; local32 += 1) {
field2.field7.method12(field4.field4,field4.field5,depth-1);
}
}else {
if (depth<=2) {
field2.field3=field4.field2;
}else {
field4.field8=field2.field3;
}
}
}
}
field2.field2=field4.field3;
field2.field7=field4.method6(depth-1);
for (int local33 = 0; local33<=1; local33 += 1) {
if (depth==3) {
field2=field2;
}
}
field2.field2=field3.field6.method3(depth-1);
field4.field8=field4.field8;
field3.field4=field2.field2;
}
}
class Test15Class2 extends Test15Class1 {
public Test15Class2 field7;
public static Test15Class2 field8;
public Test15Class1 method9(int depth) {
if (depth == 0) return Test15Lib.local7;
return this.field8;
}
public static void method10(Test15Class2 arg0, int depth) {
if (depth == 0) return;
field2.field8=field3;
if (depth>1) {
if (depth<=3) {
if (depth<=3) {
arg0.field1=field3.field4.method11(field4.field7,arg0.field7,depth-1);
}else {
field2.field1=arg0.field1;
}
}
}
field8.field3=field3.field8;
}
public static Test15Class1 method11(Test15Class2 arg0, Test15Class2 arg1, int depth) {
if (depth == 0) return Test15Lib.local1;
return arg0.field7;
}
public static void method12(Test15Class2 arg0, Test15Class1 arg1, int depth) {
if (depth == 0) return;
field8.field4=arg1.field3.method3(depth-1);
for (int local34 = 0; local34<=1; local34 += 1) {
if (depth<3) {
for (int local35 = 0; local35<=3; local35 += 1) {
if (depth>3) {
if (depth<3) {
}
}else {
for (int local36 = 0; local36<=0; local36 += 1) {
}
}
}
}else {
if (depth==1) {
if (depth>3) {
if (depth>3) {
}
}
}
}
}
field4.field1=arg1.field2;
for (int local37 = 0; local37<=2; local37 += 1) {
if (depth>3) {
field8.field6=arg0.field7.method1(field3.field5,field4.field2,depth-1);
}
}
for (int local38 = 0; local38<=3; local38 += 1) {
arg1.field4=field3.field4;
}
field4.field8=arg0.field1.method6(depth-1);
}
public void method13(int depth) {
if (depth == 0) return;
this.field8.method16(depth-1);
if (depth>=4) {
this.field7=this.field7;
}
for (int local39 = 0; local39<=3; local39 += 1) {
this.field5=this.field6;
}
this.field8.method6(depth-1);
this.field4=this.field2;
for (int local40 = 0; local40<=3; local40 += 1) {
if (depth==1) {
this.field4.method14(this.field7,depth-1);
}
}
this.field5=this.field8;
}
public void method14(Test15Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field4=arg0.field7;
for (int local41 = 0; local41<=3; local41 += 1) {
this.field4.method10(this.field3,depth-1);
}
this.field5.method6(depth-1);
arg0.field3=arg0.field8;
this.field5=arg0.field3.method5(depth-1);
for (int local42 = 0; local42<=1; local42 += 1) {
for (int local43 = 0; local43<=0; local43 += 1) {
if (depth>4) {
if (depth>=2) {
for (int local44 = 0; local44<=2; local44 += 1) {
}
}
}
}
}
}
public static void method15(Test15Class1 arg0, Test15Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<4) {
field8.field6=arg0.field2;
}else {
if (depth==2) {
for (int local45 = 0; local45<=2; local45 += 1) {
field8=field3.field3;
}
}else {
if (depth<=1) {
for (int local46 = 0; local46<=0; local46 += 1) {
if (depth>4) {
}else {
}
}
}else {
field3.field7=arg0.field4;
}
}
}
field8.field3=field3;
for (int local47 = 0; local47<=0; local47 += 1) {
for (int local48 = 0; local48<=1; local48 += 1) {
if (depth>=3) {
if (depth>1) {
if (depth<1) {
}else {
}
}
}else {
if (depth<=2) {
field2.field4.method17(field2.field4,depth-1);
}
}
}
}
if (depth==2) {
field8.method17(field4.field7,depth-1);
}
field2.method17(arg1.field3,depth-1);
if (depth==2) {
if (depth<2) {
field8.field5=arg0.field5;
}else {
field3.field5=field4.field8.method11(field3.field7,field4.field3,depth-1);
}
}
for (int local49 = 0; local49<=0; local49 += 1) {
for (int local50 = 0; local50<=1; local50 += 1) {
field2=field8.field4;
}
}
field3.field8.method10(field3.field3,depth-1);
}
public void method16(int depth) {
if (depth == 0) return;
for (int local51 = 0; local51<=2; local51 += 1) {
for (int local52 = 0; local52<=2; local52 += 1) {
for (int local53 = 0; local53<=0; local53 += 1) {
for (int local54 = 0; local54<=1; local54 += 1) {
if (depth<=1) {
}
}
}
}
}
for (int local55 = 0; local55<=0; local55 += 1) {
this.field1=this;
}
}
public void method17(Test15Class2 arg0, int depth) {
if (depth == 0) return;
if (depth>4) {
this.field5.method4(this.field3,depth-1);
}else {
arg0.field6=this.field8.method3(depth-1);
}
this.method6(depth-1);
arg0=this.field7;
arg0.field6=arg0.field1;
if (depth>=2) {
this.field8=arg0.field7;
}
arg0.field6=this;
}
}
public class Test15{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test15Lib.local1 = new Test15Class1();
Benchmark.alloc(2);
Test15Lib.local2 = new Test15Class1();
Benchmark.alloc(3);
Test15Lib.local3 = new Test15Class1();
Benchmark.alloc(4);
Test15Lib.local4 = new Test15Class1();
Benchmark.alloc(5);
Test15Lib.local5 = new Test15Class1();
Benchmark.alloc(6);
Test15Lib.local6 = new Test15Class2();
Benchmark.alloc(7);
Test15Lib.local7 = new Test15Class2();
Test15Lib.local1.field1 = Test15Lib.local7;
Test15Lib.local1.field2 = Test15Lib.local6;
Test15Lib.local1.field3 = Test15Lib.local6;
Test15Lib.local1.field4 = Test15Lib.local7;
Test15Lib.local1.field5 = Test15Lib.local3;
Test15Lib.local1.field6 = Test15Lib.local6;
Test15Lib.local2.field1 = Test15Lib.local7;
Test15Lib.local2.field2 = Test15Lib.local6;
Test15Lib.local2.field3 = Test15Lib.local7;
Test15Lib.local2.field4 = Test15Lib.local7;
Test15Lib.local2.field5 = Test15Lib.local2;
Test15Lib.local2.field6 = Test15Lib.local3;
Test15Lib.local3.field1 = Test15Lib.local1;
Test15Lib.local3.field2 = Test15Lib.local6;
Test15Lib.local3.field3 = Test15Lib.local6;
Test15Lib.local3.field4 = Test15Lib.local6;
Test15Lib.local3.field5 = Test15Lib.local7;
Test15Lib.local3.field6 = Test15Lib.local5;
Test15Lib.local4.field1 = Test15Lib.local3;
Test15Lib.local4.field2 = Test15Lib.local7;
Test15Lib.local4.field3 = Test15Lib.local6;
Test15Lib.local4.field4 = Test15Lib.local7;
Test15Lib.local4.field5 = Test15Lib.local1;
Test15Lib.local4.field6 = Test15Lib.local3;
Test15Lib.local5.field1 = Test15Lib.local2;
Test15Lib.local5.field2 = Test15Lib.local7;
Test15Lib.local5.field3 = Test15Lib.local7;
Test15Lib.local5.field4 = Test15Lib.local7;
Test15Lib.local5.field5 = Test15Lib.local1;
Test15Lib.local5.field6 = Test15Lib.local6;
Test15Lib.local6.field7 = Test15Lib.local7;
Test15Lib.local6.field8 = Test15Lib.local7;
Test15Lib.local6.field1 = Test15Lib.local1;
Test15Lib.local6.field2 = Test15Lib.local6;
Test15Lib.local6.field3 = Test15Lib.local6;
Test15Lib.local6.field4 = Test15Lib.local6;
Test15Lib.local6.field5 = Test15Lib.local1;
Test15Lib.local6.field6 = Test15Lib.local1;
Test15Lib.local7.field7 = Test15Lib.local7;
Test15Lib.local7.field8 = Test15Lib.local6;
Test15Lib.local7.field1 = Test15Lib.local3;
Test15Lib.local7.field2 = Test15Lib.local6;
Test15Lib.local7.field3 = Test15Lib.local6;
Test15Lib.local7.field4 = Test15Lib.local7;
Test15Lib.local7.field5 = Test15Lib.local4;
Test15Lib.local7.field6 = Test15Lib.local5;
Test15Lib.local4.field3=Test15Lib.local7.field8;
for (int local56 = 0; local56<=3; local56 += 1) {
Test15Lib.local4.field6.method7(Test15Lib.local7.field7,3);
}
Test15Lib.local4.field3.method13(3);
Test15Lib.local5.field4=Test15Lib.local1.field3;
Test15Lib.local7.field3.method11(Test15Lib.local7.field7,Test15Lib.local7.field3,3);
Test15Lib.local1.field2=Test15Lib.local2.field3;
Test15Lib.local3.method2(Test15Lib.local1,3);
Test15Lib.local6.field7.method16(3);
if (inputValue<1) {
for (int local57 = 0; local57<=1; local57 += 1) {
Test15Lib.local1.field3=Test15Lib.local6.field7;
}
}
Test15Lib.local2.field1.method8(3);
Benchmark.test(1,Test15Lib.local1);
Benchmark.test(2,Test15Lib.local2);
Benchmark.test(3,Test15Lib.local3);
Benchmark.test(4,Test15Lib.local4);
Benchmark.test(5,Test15Lib.local5);
Benchmark.test(6,Test15Lib.local6);
Benchmark.test(7,Test15Lib.local7);
Benchmark.test(8,Test15Lib.local1.field1);
Benchmark.test(9,Test15Lib.local1.field2);
Benchmark.test(10,Test15Lib.local1.field3);
Benchmark.test(11,Test15Lib.local1.field4);
Benchmark.test(12,Test15Lib.local1.field5);
Benchmark.test(13,Test15Lib.local1.field6);
Benchmark.test(14,Test15Lib.local2.field1);
Benchmark.test(15,Test15Lib.local2.field2);
Benchmark.test(16,Test15Lib.local2.field3);
Benchmark.test(17,Test15Lib.local2.field4);
Benchmark.test(18,Test15Lib.local2.field5);
Benchmark.test(19,Test15Lib.local2.field6);
Benchmark.test(20,Test15Lib.local3.field1);
Benchmark.test(21,Test15Lib.local3.field2);
Benchmark.test(22,Test15Lib.local3.field3);
Benchmark.test(23,Test15Lib.local3.field4);
Benchmark.test(24,Test15Lib.local3.field5);
Benchmark.test(25,Test15Lib.local3.field6);
Benchmark.test(26,Test15Lib.local4.field1);
Benchmark.test(27,Test15Lib.local4.field2);
Benchmark.test(28,Test15Lib.local4.field3);
Benchmark.test(29,Test15Lib.local4.field4);
Benchmark.test(30,Test15Lib.local4.field5);
Benchmark.test(31,Test15Lib.local4.field6);
Benchmark.test(32,Test15Lib.local5.field1);
Benchmark.test(33,Test15Lib.local5.field2);
Benchmark.test(34,Test15Lib.local5.field3);
Benchmark.test(35,Test15Lib.local5.field4);
Benchmark.test(36,Test15Lib.local5.field5);
Benchmark.test(37,Test15Lib.local5.field6);
Benchmark.test(38,Test15Lib.local6.field7);
Benchmark.test(39,Test15Lib.local6.field8);
Benchmark.test(40,Test15Lib.local6.field1);
Benchmark.test(41,Test15Lib.local6.field2);
Benchmark.test(42,Test15Lib.local6.field3);
Benchmark.test(43,Test15Lib.local6.field4);
Benchmark.test(44,Test15Lib.local6.field5);
Benchmark.test(45,Test15Lib.local6.field6);
Benchmark.test(46,Test15Lib.local7.field7);
Benchmark.test(47,Test15Lib.local7.field8);
Benchmark.test(48,Test15Lib.local7.field1);
Benchmark.test(49,Test15Lib.local7.field2);
Benchmark.test(50,Test15Lib.local7.field3);
Benchmark.test(51,Test15Lib.local7.field4);
Benchmark.test(52,Test15Lib.local7.field5);
Benchmark.test(53,Test15Lib.local7.field6);
Benchmark.print();
}
}
