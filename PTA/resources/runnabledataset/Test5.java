package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test5Lib{
public static Test5Class1 local1;
public static Test5Class2 local2;
public static Test5Class2 local3;
public static Test5Class2 local4;
}
class Test5Class1 extends BasicClass {
public Test5Class1 field1;
public static Test5Class2 field2;
public Test5Class2 field3;
public static Test5Class2 field4;
public Test5Class1 field5;
public Test5Class1 field6;
public static Test5Class2 field7;
public Test5Class1 field8;
public static void method1(Test5Class1 arg0, int depth) {
if (depth == 0) return;
field7.field5=field2.field2;
if (depth>=4) {
field4.field4.method10(depth-1);
}else {
for (int local5 = 0; local5<=3; local5 += 1) {
field7.field11=field7;
}
}
}
public void method2(Test5Class1 arg0, int depth) {
if (depth == 0) return;
if (depth>=1) {
for (int local6 = 0; local6<=1; local6 += 1) {
if (depth<4) {
if (depth<2) {
if (depth>3) {
}else {
}
}
}
}
}
}
public static Test5Class1 method3(int depth) {
if (depth == 0) return Test5Lib.local1;
for (int local7 = 0; local7<=0; local7 += 1) {
field2.field7=field7.field12;
}
for (int local8 = 0; local8<=3; local8 += 1) {
if (depth<=1) {
if (depth<=4) {
for (int local9 = 0; local9<=3; local9 += 1) {
field7.field3=field2.field3.method12(field4.field4,field2.field7,depth-1);
}
}
}else {
field4.field5=field4.field7;
}
}
for (int local10 = 0; local10<=2; local10 += 1) {
field2.field10.method4(field7.field9,depth-1);
}
if (depth>3) {
field2.field2=field4.field7;
}
field2.field5=field4.field8;
if (depth<2) {
if (depth<=4) {
field7.field9=field7.field2;
}
}else {
for (int local11 = 0; local11<=3; local11 += 1) {
if (depth>=1) {
for (int local12 = 0; local12<=3; local12 += 1) {
field4.field10=field2.field11;
}
}else {
field2.field4=field7.field2.method9(field7.field13,field7.field7,depth-1);
}
}
}
field7.field6.method6(field2.field6,depth-1);
field7.field5=field7.field8;
return field7;
}
public static void method4(Test5Class1 arg0, int depth) {
if (depth == 0) return;
field4.field6=arg0.field7;
field2.field12=field7.field4;
field4.field5=field2.field8.method3(depth-1);
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=1; local14 += 1) {
field2.method13(arg0.field1,field7.field12,depth-1);
}
}
for (int local15 = 0; local15<=3; local15 += 1) {
if (depth==3) {
field4.field11=field2;
}
}
field2=field4.field12;
}
public static Test5Class1 method5(Test5Class1 arg0, int depth) {
if (depth == 0) return Test5Lib.local2;
field2.field4=field4.field13;
if (depth>1) {
for (int local16 = 0; local16<=1; local16 += 1) {
if (depth>4) {
if (depth<=4) {
for (int local17 = 0; local17<=1; local17 += 1) {
}
}else {
for (int local18 = 0; local18<=2; local18 += 1) {
}
}
}else {
for (int local19 = 0; local19<=3; local19 += 1) {
for (int local20 = 0; local20<=1; local20 += 1) {
}
}
}
}
}else {
if (depth>4) {
field7.field2.method4(field7.field2,depth-1);
}
}
field7.method11(field4.field12,field4.field12,depth-1);
field4.field7.method12(arg0.field4,field4.field12,depth-1);
field4.field1=field4.field4.method3(depth-1);
field2.field5=field2.field6;
arg0.field5=arg0.field7.method7(field7.field4,depth-1);
field7.field4=field7.field12;
return arg0.field8;
}
public void method6(Test5Class1 arg0, int depth) {
if (depth == 0) return;
arg0.field4=this.field2.method12(this.field4,arg0.field7,depth-1);
for (int local21 = 0; local21<=3; local21 += 1) {
this.field3=this.field3;
}
arg0.field2=arg0.field4;
this.field7=arg0.field4;
this.field6=arg0.field8;
arg0.field7.method10(depth-1);
this.field7=arg0.field3;
for (int local22 = 0; local22<=1; local22 += 1) {
for (int local23 = 0; local23<=2; local23 += 1) {
if (depth>=4) {
for (int local24 = 0; local24<=1; local24 += 1) {
this.field5=this.field1;
}
}
}
}
if (depth>=1) {
this.field7=arg0.field7;
}else {
arg0.field1=arg0.field8;
}
}
public static Test5Class1 method7(Test5Class2 arg0, int depth) {
if (depth == 0) return Test5Lib.local2;
field7.field5=field7.field4.method7(field4.field13,depth-1);
return arg0.field6;
}
public Test5Class1 method8(int depth) {
if (depth == 0) return Test5Lib.local4;
for (int local25 = 0; local25<=3; local25 += 1) {
for (int local26 = 0; local26<=0; local26 += 1) {
for (int local27 = 0; local27<=2; local27 += 1) {
for (int local28 = 0; local28<=1; local28 += 1) {
this.field6.method1(this.field3,depth-1);
}
}
}
}
if (depth<4) {
for (int local29 = 0; local29<=2; local29 += 1) {
this.field7=this.field7;
}
}
this.field8=this.field7;
return this;
}
}
class Test5Class2 extends Test5Class1 {
public static Test5Class1 field9;
public static Test5Class1 field10;
public Test5Class1 field11;
public Test5Class2 field12;
public Test5Class2 field13;
public static Test5Class2 method9(Test5Class1 arg0, Test5Class1 arg1, int depth) {
if (depth == 0) return Test5Lib.local2;
if (depth<3) {
if (depth>3) {
for (int local30 = 0; local30<=0; local30 += 1) {
field2.field5.method1(field4,depth-1);
}
}else {
arg0=field2.field11.method8(depth-1);
}
}else {
for (int local31 = 0; local31<=3; local31 += 1) {
for (int local32 = 0; local32<=0; local32 += 1) {
field2.field6.method3(depth-1);
}
}
}
for (int local33 = 0; local33<=2; local33 += 1) {
field4.field3=field2.field2;
}
arg1.field7=field2.field4;
for (int local34 = 0; local34<=3; local34 += 1) {
field9.field8=field7.field2;
}
if (depth<3) {
field10=field9.field7;
}else {
field7.field8.method2(field4.field2,depth-1);
}
field7.field4=field2.field12;
return field2;
}
public void method10(int depth) {
if (depth == 0) return;
this.field2.method10(depth-1);
for (int local35 = 0; local35<=2; local35 += 1) {
this.field1=this.field9.method3(depth-1);
}
for (int local36 = 0; local36<=1; local36 += 1) {
this.field2=this.field7;
}
}
public void method11(Test5Class2 arg0, Test5Class2 arg1, int depth) {
if (depth == 0) return;
this.field11=this.field1;
if (depth>1) {
for (int local37 = 0; local37<=3; local37 += 1) {
if (depth<2) {
arg1.field1=arg1.field2.method3(depth-1);
}else {
for (int local38 = 0; local38<=3; local38 += 1) {
for (int local39 = 0; local39<=0; local39 += 1) {
}
}
}
}
}else {
arg1.field10=arg0.field9;
}
if (depth>=4) {
for (int local40 = 0; local40<=0; local40 += 1) {
arg1.field7=arg0.field3;
}
}
for (int local41 = 0; local41<=2; local41 += 1) {
for (int local42 = 0; local42<=0; local42 += 1) {
this.field6=arg1.field6;
}
}
if (depth<2) {
if (depth>2) {
if (depth==1) {
if (depth<4) {
arg1.field12.method11(arg1.field13,arg1,depth-1);
}else {
if (depth<4) {
}else {
}
}
}else {
for (int local43 = 0; local43<=2; local43 += 1) {
if (depth<3) {
}
}
}
}else {
arg0.field2=arg1.field2;
}
}else {
for (int local44 = 0; local44<=2; local44 += 1) {
for (int local45 = 0; local45<=0; local45 += 1) {
arg0.field4=this.field7;
}
}
}
arg1.field10=arg1;
for (int local46 = 0; local46<=2; local46 += 1) {
arg0.field1=arg0.field5;
}
if (depth>=2) {
for (int local47 = 0; local47<=1; local47 += 1) {
for (int local48 = 0; local48<=0; local48 += 1) {
if (depth==4) {
this.field10.method2(arg1.field6,depth-1);
}
}
}
}
for (int local49 = 0; local49<=1; local49 += 1) {
if (depth==3) {
arg1.field6=arg0.field11;
}else {
arg0.field9=arg0.field4.method12(arg0.field2,arg1.field13,depth-1);
}
}
}
public static Test5Class2 method12(Test5Class2 arg0, Test5Class2 arg1, int depth) {
if (depth == 0) return Test5Lib.local4;
for (int local50 = 0; local50<=0; local50 += 1) {
if (depth<=3) {
for (int local51 = 0; local51<=0; local51 += 1) {
arg1.field9=arg1.field1.method5(field4.field5,depth-1);
}
}
}
field4.field6=field4.field3;
for (int local52 = 0; local52<=1; local52 += 1) {
field2.field13.method2(field9.field7,depth-1);
}
field2.field11.method4(field7.field5,depth-1);
if (depth==1) {
if (depth<=4) {
for (int local53 = 0; local53<=0; local53 += 1) {
field10.field4=field10.field3;
}
}
}
if (depth>=3) {
field2.field4.method1(field4.field11,depth-1);
}
field2.field12=arg1.field4.method13(arg1.field5,arg1,depth-1);
return field9.field4;
}
public static Test5Class2 method13(Test5Class1 arg0, Test5Class2 arg1, int depth) {
if (depth == 0) return Test5Lib.local2;
arg0.field6=field7.field8;
if (depth<2) {
if (depth<=2) {
arg0=arg1.field10.method3(depth-1);
}else {
field9.field4.method10(depth-1);
}
}else {
if (depth<=2) {
field4.field11=field7.field13.method13(field7.field4,arg1.field12,depth-1);
}
}
if (depth<4) {
if (depth<=4) {
for (int local54 = 0; local54<=1; local54 += 1) {
if (depth<1) {
field2=arg1.field13.method13(field10.field4,field4.field7,depth-1);
}
}
}else {
field9.field3=field7.field3;
}
}
return field2;
}
}
public class Test5{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test5Lib.local1 = new Test5Class1();
Benchmark.alloc(2);
Test5Lib.local2 = new Test5Class2();
Benchmark.alloc(3);
Test5Lib.local3 = new Test5Class2();
Benchmark.alloc(4);
Test5Lib.local4 = new Test5Class2();
Test5Lib.local1.field1 = Test5Lib.local3;
Test5Lib.local1.field2 = Test5Lib.local2;
Test5Lib.local1.field3 = Test5Lib.local3;
Test5Lib.local1.field4 = Test5Lib.local3;
Test5Lib.local1.field5 = Test5Lib.local1;
Test5Lib.local1.field6 = Test5Lib.local2;
Test5Lib.local1.field7 = Test5Lib.local2;
Test5Lib.local1.field8 = Test5Lib.local1;
Test5Lib.local2.field9 = Test5Lib.local3;
Test5Lib.local2.field10 = Test5Lib.local1;
Test5Lib.local2.field11 = Test5Lib.local1;
Test5Lib.local2.field12 = Test5Lib.local3;
Test5Lib.local2.field13 = Test5Lib.local4;
Test5Lib.local2.field1 = Test5Lib.local1;
Test5Lib.local2.field2 = Test5Lib.local4;
Test5Lib.local2.field3 = Test5Lib.local3;
Test5Lib.local2.field4 = Test5Lib.local2;
Test5Lib.local2.field5 = Test5Lib.local1;
Test5Lib.local2.field6 = Test5Lib.local2;
Test5Lib.local2.field7 = Test5Lib.local3;
Test5Lib.local2.field8 = Test5Lib.local2;
Test5Lib.local3.field9 = Test5Lib.local2;
Test5Lib.local3.field10 = Test5Lib.local4;
Test5Lib.local3.field11 = Test5Lib.local2;
Test5Lib.local3.field12 = Test5Lib.local2;
Test5Lib.local3.field13 = Test5Lib.local2;
Test5Lib.local3.field1 = Test5Lib.local2;
Test5Lib.local3.field2 = Test5Lib.local3;
Test5Lib.local3.field3 = Test5Lib.local2;
Test5Lib.local3.field4 = Test5Lib.local2;
Test5Lib.local3.field5 = Test5Lib.local1;
Test5Lib.local3.field6 = Test5Lib.local4;
Test5Lib.local3.field7 = Test5Lib.local2;
Test5Lib.local3.field8 = Test5Lib.local4;
Test5Lib.local4.field9 = Test5Lib.local3;
Test5Lib.local4.field10 = Test5Lib.local2;
Test5Lib.local4.field11 = Test5Lib.local1;
Test5Lib.local4.field12 = Test5Lib.local3;
Test5Lib.local4.field13 = Test5Lib.local4;
Test5Lib.local4.field1 = Test5Lib.local3;
Test5Lib.local4.field2 = Test5Lib.local3;
Test5Lib.local4.field3 = Test5Lib.local4;
Test5Lib.local4.field4 = Test5Lib.local2;
Test5Lib.local4.field5 = Test5Lib.local3;
Test5Lib.local4.field6 = Test5Lib.local1;
Test5Lib.local4.field7 = Test5Lib.local2;
Test5Lib.local4.field8 = Test5Lib.local2;
Test5Lib.local2.field9=Test5Lib.local4.field4.method13(Test5Lib.local3.field9,Test5Lib.local3.field3,3);
for (int local55 = 0; local55<=2; local55 += 1) {
Test5Lib.local3.field12=Test5Lib.local4.field12;
}
if (inputValue>=1) {
Test5Lib.local4.field6.method4(Test5Lib.local3.field7,3);
}
if (inputValue<1) {
Test5Lib.local2.field7=Test5Lib.local1.field3;
}
for (int local56 = 0; local56<=0; local56 += 1) {
Test5Lib.local2.field12=Test5Lib.local4.field3.method12(Test5Lib.local2.field12,Test5Lib.local4.field7,3);
}
for (int local57 = 0; local57<=1; local57 += 1) {
Test5Lib.local3.field1=Test5Lib.local3.method7(Test5Lib.local2.field4,3);
}
for (int local58 = 0; local58<=1; local58 += 1) {
Test5Lib.local3.field4=Test5Lib.local2.field12;
}
if (inputValue>=4) {
Test5Lib.local3.field9=Test5Lib.local4.field2;
}else {
Test5Lib.local1.field3.method6(Test5Lib.local4.field8,3);
}
if (inputValue<=2) {
Test5Lib.local2.field13.method12(Test5Lib.local3.field3,Test5Lib.local4.field13,3);
}
for (int local59 = 0; local59<=0; local59 += 1) {
if (inputValue>=4) {
if (inputValue<=4) {
if (inputValue==2) {
if (inputValue==1) {
}
}
}else {
if (inputValue<3) {
for (int local60 = 0; local60<=3; local60 += 1) {
}
}else {
if (inputValue==3) {
}
}
}
}else {
if (inputValue<3) {
Test5Lib.local3.field3.method2(Test5Lib.local1.field5,3);
}else {
for (int local61 = 0; local61<=0; local61 += 1) {
if (inputValue<=3) {
}
}
}
}
}
Benchmark.test(1,Test5Lib.local1);
Benchmark.test(2,Test5Lib.local2);
Benchmark.test(3,Test5Lib.local3);
Benchmark.test(4,Test5Lib.local4);
Benchmark.test(5,Test5Lib.local1.field1);
Benchmark.test(6,Test5Lib.local1.field2);
Benchmark.test(7,Test5Lib.local1.field3);
Benchmark.test(8,Test5Lib.local1.field4);
Benchmark.test(9,Test5Lib.local1.field5);
Benchmark.test(10,Test5Lib.local1.field6);
Benchmark.test(11,Test5Lib.local1.field7);
Benchmark.test(12,Test5Lib.local1.field8);
Benchmark.test(13,Test5Lib.local2.field9);
Benchmark.test(14,Test5Lib.local2.field10);
Benchmark.test(15,Test5Lib.local2.field11);
Benchmark.test(16,Test5Lib.local2.field12);
Benchmark.test(17,Test5Lib.local2.field13);
Benchmark.test(18,Test5Lib.local2.field1);
Benchmark.test(19,Test5Lib.local2.field2);
Benchmark.test(20,Test5Lib.local2.field3);
Benchmark.test(21,Test5Lib.local2.field4);
Benchmark.test(22,Test5Lib.local2.field5);
Benchmark.test(23,Test5Lib.local2.field6);
Benchmark.test(24,Test5Lib.local2.field7);
Benchmark.test(25,Test5Lib.local2.field8);
Benchmark.test(26,Test5Lib.local3.field9);
Benchmark.test(27,Test5Lib.local3.field10);
Benchmark.test(28,Test5Lib.local3.field11);
Benchmark.test(29,Test5Lib.local3.field12);
Benchmark.test(30,Test5Lib.local3.field13);
Benchmark.test(31,Test5Lib.local3.field1);
Benchmark.test(32,Test5Lib.local3.field2);
Benchmark.test(33,Test5Lib.local3.field3);
Benchmark.test(34,Test5Lib.local3.field4);
Benchmark.test(35,Test5Lib.local3.field5);
Benchmark.test(36,Test5Lib.local3.field6);
Benchmark.test(37,Test5Lib.local3.field7);
Benchmark.test(38,Test5Lib.local3.field8);
Benchmark.test(39,Test5Lib.local4.field9);
Benchmark.test(40,Test5Lib.local4.field10);
Benchmark.test(41,Test5Lib.local4.field11);
Benchmark.test(42,Test5Lib.local4.field12);
Benchmark.test(43,Test5Lib.local4.field13);
Benchmark.test(44,Test5Lib.local4.field1);
Benchmark.test(45,Test5Lib.local4.field2);
Benchmark.test(46,Test5Lib.local4.field3);
Benchmark.test(47,Test5Lib.local4.field4);
Benchmark.test(48,Test5Lib.local4.field5);
Benchmark.test(49,Test5Lib.local4.field6);
Benchmark.test(50,Test5Lib.local4.field7);
Benchmark.test(51,Test5Lib.local4.field8);
Benchmark.print();
}
}
