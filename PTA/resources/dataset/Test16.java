package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test16Lib{
public static Test16Class1 local1;
public static Test16Class2 local2;
public static Test16Class2 local3;
public static Test16Class2 local4;
public static Test16Class3 local5;
public static Test16Class3 local6;
}
class Test16Class1 extends BasicClass {
public static Test16Class2 field1;
public Test16Class2 field2;
public Test16Class3 field3;
public static Test16Class3 method1(Test16Class2 arg0, Test16Class2 arg1, int depth) {
if (depth == 0) return Test16Lib.local6;
arg1.field3=arg1.field2.method2(arg1.field5,arg0.field2,depth-1);
arg1.field1=arg0.field5;
field1.field4=arg1.method2(field1.field4,arg0.field5,depth-1);
arg0.field4.method3(arg0.field2,depth-1);
arg0.field5=arg1.field3;
if (depth>3) {
for (int local7 = 0; local7<=1; local7 += 1) {
if (depth==4) {
for (int local8 = 0; local8<=0; local8 += 1) {
arg1.field1=field1.field5;
}
}else {
arg0.field4.method9(depth-1);
}
}
}else {
arg1.field5=arg1.field2.method2(field1.field3,field1.field4,depth-1);
}
arg1.field3=arg1.field4;
for (int local9 = 0; local9<=1; local9 += 1) {
if (depth>1) {
for (int local10 = 0; local10<=2; local10 += 1) {
field1.field4.method9(depth-1);
}
}else {
if (depth>4) {
arg1.field3=arg0.field3;
}else {
arg1.field3=arg0.field4;
}
}
}
arg1.field5.method2(arg0,arg1.field3,depth-1);
return field1.field3;
}
public Test16Class3 method2(Test16Class2 arg0, Test16Class1 arg1, int depth) {
if (depth == 0) return Test16Lib.local5;
arg1=arg0.field3.method5(depth-1);
for (int local11 = 0; local11<=3; local11 += 1) {
if (depth==1) {
for (int local12 = 0; local12<=1; local12 += 1) {
arg0.field4.method6(this.field3,depth-1);
}
}else {
if (depth<=4) {
if (depth<=3) {
for (int local13 = 0; local13<=1; local13 += 1) {
}
}else {
if (depth>=4) {
}
}
}else {
for (int local14 = 0; local14<=0; local14 += 1) {
for (int local15 = 0; local15<=1; local15 += 1) {
}
}
}
}
}
return this.field3;
}
public static void method3(Test16Class2 arg0, int depth) {
if (depth == 0) return;
}
public static void method4(int depth) {
if (depth == 0) return;
if (depth<2) {
field1.field4=field1.field3;
}else {
field1.field3.method3(field1.field2,depth-1);
}
if (depth==4) {
field1.field1=field1.field3.method10(depth-1);
}
field1.field4.method11(field1.field2,field1,depth-1);
}
}
class Test16Class2 extends Test16Class1 {
public Test16Class3 field4;
public static Test16Class2 field5;
public Test16Class1 method5(int depth) {
if (depth == 0) return Test16Lib.local3;
return this.field2;
}
public static void method6(Test16Class2 arg0, int depth) {
if (depth == 0) return;
field1.field2=field1;
for (int local16 = 0; local16<=2; local16 += 1) {
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=0; local18 += 1) {
for (int local19 = 0; local19<=1; local19 += 1) {
for (int local20 = 0; local20<=0; local20 += 1) {
}
}
}
}
}
field1.field5=arg0.field2;
if (depth<2) {
if (depth<4) {
for (int local21 = 0; local21<=3; local21 += 1) {
arg0.field4.method1(arg0,field5.field4,depth-1);
}
}else {
arg0.field3=arg0.field4;
}
}else {
for (int local22 = 0; local22<=1; local22 += 1) {
arg0.field4=field5.field3;
}
}
}
public Test16Class3 method7(Test16Class2 arg0, int depth) {
if (depth == 0) return Test16Lib.local5;
return arg0.field3;
}
}
class Test16Class3 extends Test16Class2 {
public static Test16Class3 field6;
public void method8(Test16Class3 arg0, int depth) {
if (depth == 0) return;
for (int local23 = 0; local23<=3; local23 += 1) {
for (int local24 = 0; local24<=0; local24 += 1) {
arg0=arg0.field4;
}
}
for (int local25 = 0; local25<=3; local25 += 1) {
if (depth<2) {
for (int local26 = 0; local26<=0; local26 += 1) {
if (depth<=1) {
this.field3.method3(arg0.field1,depth-1);
}
}
}else {
this.field6=arg0.field6;
}
}
arg0.field3.method8(this.field3,depth-1);
this.field3.method3(arg0,depth-1);
for (int local27 = 0; local27<=3; local27 += 1) {
arg0.method9(depth-1);
}
for (int local28 = 0; local28<=3; local28 += 1) {
if (depth>4) {
for (int local29 = 0; local29<=2; local29 += 1) {
if (depth<3) {
if (depth>=3) {
}
}
}
}else {
this.field3.method11(arg0.field4,this.field2,depth-1);
}
}
}
public void method9(int depth) {
if (depth == 0) return;
for (int local30 = 0; local30<=0; local30 += 1) {
this.method5(depth-1);
}
for (int local31 = 0; local31<=0; local31 += 1) {
if (depth>=2) {
this.field3.method9(depth-1);
}else {
if (depth<=3) {
if (depth<=3) {
if (depth<3) {
}else {
}
}else {
if (depth>1) {
}
}
}else {
this.field2.method1(this.field2,this.field2,depth-1);
}
}
}
if (depth>=4) {
if (depth<=2) {
for (int local32 = 0; local32<=3; local32 += 1) {
this.field4=this.field3;
}
}
}else {
this.field4.method9(depth-1);
}
this.field3=this.field3;
for (int local33 = 0; local33<=2; local33 += 1) {
this.method6(this.field6,depth-1);
}
}
public static Test16Class3 method10(int depth) {
if (depth == 0) return Test16Lib.local5;
if (depth<=2) {
if (depth==4) {
for (int local34 = 0; local34<=2; local34 += 1) {
for (int local35 = 0; local35<=2; local35 += 1) {
for (int local36 = 0; local36<=2; local36 += 1) {
}
}
}
}
}
if (depth<2) {
if (depth>=1) {
field6.field6=field1.field3;
}
}else {
for (int local37 = 0; local37<=3; local37 += 1) {
for (int local38 = 0; local38<=3; local38 += 1) {
if (depth<=2) {
field6.field5.method5(depth-1);
}
}
}
}
for (int local39 = 0; local39<=3; local39 += 1) {
field1=field1.field3;
}
for (int local40 = 0; local40<=1; local40 += 1) {
field1.field1=field1.field2;
}
field5.field3=field6.field4;
for (int local41 = 0; local41<=2; local41 += 1) {
field5.field4=field6.field2.method7(field6.field3,depth-1);
}
if (depth==1) {
if (depth>1) {
for (int local42 = 0; local42<=1; local42 += 1) {
field1.field1.method3(field5.field1,depth-1);
}
}else {
for (int local43 = 0; local43<=1; local43 += 1) {
field5.field4.method11(field6.field2,field6,depth-1);
}
}
}else {
field1.field1.method6(field1.field1,depth-1);
}
field6.field2=field6.field5;
field6.field6=field6.field4;
return field6.field6;
}
public void method11(Test16Class2 arg0, Test16Class1 arg1, int depth) {
if (depth == 0) return;
for (int local44 = 0; local44<=3; local44 += 1) {
for (int local45 = 0; local45<=3; local45 += 1) {
if (depth<4) {
for (int local46 = 0; local46<=2; local46 += 1) {
arg1.field2=arg0.field2;
}
}else {
this.field4.method8(arg0.field3,depth-1);
}
}
}
if (depth>=2) {
this.method11(arg1.field3,arg1.field3,depth-1);
}else {
arg1=arg0.field2;
}
if (depth>2) {
for (int local47 = 0; local47<=3; local47 += 1) {
for (int local48 = 0; local48<=3; local48 += 1) {
arg0.field1.method3(arg1.field1,depth-1);
}
}
}
}
}
public class Test16{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test16Lib.local1 = new Test16Class1();
Benchmark.alloc(2);
Test16Lib.local2 = new Test16Class2();
Benchmark.alloc(3);
Test16Lib.local3 = new Test16Class2();
Benchmark.alloc(4);
Test16Lib.local4 = new Test16Class2();
Benchmark.alloc(5);
Test16Lib.local5 = new Test16Class3();
Benchmark.alloc(6);
Test16Lib.local6 = new Test16Class3();
Test16Lib.local1.field1 = Test16Lib.local5;
Test16Lib.local1.field2 = Test16Lib.local6;
Test16Lib.local1.field3 = Test16Lib.local6;
Test16Lib.local2.field4 = Test16Lib.local6;
Test16Lib.local2.field5 = Test16Lib.local2;
Test16Lib.local2.field1 = Test16Lib.local2;
Test16Lib.local2.field2 = Test16Lib.local2;
Test16Lib.local2.field3 = Test16Lib.local6;
Test16Lib.local3.field4 = Test16Lib.local5;
Test16Lib.local3.field5 = Test16Lib.local3;
Test16Lib.local3.field1 = Test16Lib.local4;
Test16Lib.local3.field2 = Test16Lib.local4;
Test16Lib.local3.field3 = Test16Lib.local5;
Test16Lib.local4.field4 = Test16Lib.local5;
Test16Lib.local4.field5 = Test16Lib.local2;
Test16Lib.local4.field1 = Test16Lib.local6;
Test16Lib.local4.field2 = Test16Lib.local2;
Test16Lib.local4.field3 = Test16Lib.local5;
Test16Lib.local5.field6 = Test16Lib.local5;
Test16Lib.local5.field4 = Test16Lib.local5;
Test16Lib.local5.field5 = Test16Lib.local5;
Test16Lib.local5.field1 = Test16Lib.local4;
Test16Lib.local5.field2 = Test16Lib.local6;
Test16Lib.local5.field3 = Test16Lib.local6;
Test16Lib.local6.field6 = Test16Lib.local5;
Test16Lib.local6.field4 = Test16Lib.local5;
Test16Lib.local6.field5 = Test16Lib.local6;
Test16Lib.local6.field1 = Test16Lib.local2;
Test16Lib.local6.field2 = Test16Lib.local2;
Test16Lib.local6.field3 = Test16Lib.local5;
for (int local49 = 0; local49<=1; local49 += 1) {
if (inputValue<2) {
if (inputValue<=4) {
if (inputValue<=4) {
Test16Lib.local5.field4.method9(3);
}
}else {
Test16Lib.local1=Test16Lib.local1.method2(Test16Lib.local5.field2,Test16Lib.local1.field3,3);
}
}
}
if (inputValue>=4) {
for (int local50 = 0; local50<=0; local50 += 1) {
if (inputValue<=2) {
for (int local51 = 0; local51<=2; local51 += 1) {
if (inputValue<=4) {
}
}
}else {
Test16Lib.local3.field2=Test16Lib.local6.field3.method1(Test16Lib.local3.field5,Test16Lib.local2.field4,3);
}
}
}
if (inputValue<3) {
Test16Lib.local5.field4=Test16Lib.local6;
}
for (int local52 = 0; local52<=0; local52 += 1) {
for (int local53 = 0; local53<=2; local53 += 1) {
Test16Lib.local2.field3.method9(3);
}
}
if (inputValue>=1) {
if (inputValue>=2) {
Test16Lib.local3.field4.method8(Test16Lib.local5.field4,3);
}else {
Test16Lib.local4.field3=Test16Lib.local2.field3;
}
}else {
if (inputValue<3) {
for (int local54 = 0; local54<=1; local54 += 1) {
for (int local55 = 0; local55<=2; local55 += 1) {
if (inputValue>4) {
}else {
}
}
}
}else {
Test16Lib.local2.field2=Test16Lib.local1.field2;
}
}
if (inputValue<1) {
Test16Lib.local6=Test16Lib.local6;
}else {
if (inputValue<=4) {
if (inputValue<3) {
if (inputValue>1) {
Test16Lib.local1.field3=Test16Lib.local4.field3;
}
}
}
}
Test16Lib.local1=Test16Lib.local5.field1;
Test16Lib.local3=Test16Lib.local5.field4.method10(3);
Test16Lib.local3.field2.method3(Test16Lib.local4.field4,3);
for (int local56 = 0; local56<=1; local56 += 1) {
Test16Lib.local3.field2.method4(3);
}
Benchmark.test(1,Test16Lib.local1);
Benchmark.test(2,Test16Lib.local2);
Benchmark.test(3,Test16Lib.local3);
Benchmark.test(4,Test16Lib.local4);
Benchmark.test(5,Test16Lib.local5);
Benchmark.test(6,Test16Lib.local6);
Benchmark.test(7,Test16Lib.local1.field1);
Benchmark.test(8,Test16Lib.local1.field2);
Benchmark.test(9,Test16Lib.local1.field3);
Benchmark.test(10,Test16Lib.local2.field4);
Benchmark.test(11,Test16Lib.local2.field5);
Benchmark.test(12,Test16Lib.local2.field1);
Benchmark.test(13,Test16Lib.local2.field2);
Benchmark.test(14,Test16Lib.local2.field3);
Benchmark.test(15,Test16Lib.local3.field4);
Benchmark.test(16,Test16Lib.local3.field5);
Benchmark.test(17,Test16Lib.local3.field1);
Benchmark.test(18,Test16Lib.local3.field2);
Benchmark.test(19,Test16Lib.local3.field3);
Benchmark.test(20,Test16Lib.local4.field4);
Benchmark.test(21,Test16Lib.local4.field5);
Benchmark.test(22,Test16Lib.local4.field1);
Benchmark.test(23,Test16Lib.local4.field2);
Benchmark.test(24,Test16Lib.local4.field3);
Benchmark.test(25,Test16Lib.local5.field6);
Benchmark.test(26,Test16Lib.local5.field4);
Benchmark.test(27,Test16Lib.local5.field5);
Benchmark.test(28,Test16Lib.local5.field1);
Benchmark.test(29,Test16Lib.local5.field2);
Benchmark.test(30,Test16Lib.local5.field3);
Benchmark.test(31,Test16Lib.local6.field6);
Benchmark.test(32,Test16Lib.local6.field4);
Benchmark.test(33,Test16Lib.local6.field5);
Benchmark.test(34,Test16Lib.local6.field1);
Benchmark.test(35,Test16Lib.local6.field2);
Benchmark.test(36,Test16Lib.local6.field3);
Benchmark.print();
}
}
