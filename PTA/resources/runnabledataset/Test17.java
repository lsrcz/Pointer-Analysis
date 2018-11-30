package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test17Lib{
public static Test17Class1 local1;
public static Test17Class2 local2;
public static Test17Class2 local3;
public static Test17Class2 local4;
public static Test17Class3 local5;
public static Test17Class3 local6;
public static Test17Class3 local7;
}
class Test17Class1 extends BasicClass {
public Test17Class1 field1;
public static void method1(int depth) {
if (depth == 0) return;
if (depth>=4) {
if (depth>2) {
for (int local8 = 0; local8<=0; local8 += 1) {
for (int local9 = 0; local9<=1; local9 += 1) {
for (int local10 = 0; local10<=3; local10 += 1) {
}
}
}
}else {
if (depth==1) {
if (depth>2) {
if (depth<3) {
}else {
}
}else {
for (int local11 = 0; local11<=1; local11 += 1) {
}
}
}
}
}
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth<=4) {
if (depth<4) {
if (depth>=3) {
for (int local13 = 0; local13<=3; local13 += 1) {
}
}else {
for (int local14 = 0; local14<=3; local14 += 1) {
}
}
}else {
if (depth<1) {
for (int local15 = 0; local15<=2; local15 += 1) {
}
}else {
for (int local16 = 0; local16<=3; local16 += 1) {
}
}
}
}else {
if (depth<3) {
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=3; local18 += 1) {
}
}
}
}
}
for (int local19 = 0; local19<=3; local19 += 1) {
for (int local20 = 0; local20<=1; local20 += 1) {
if (depth==1) {
if (depth==1) {
if (depth==4) {
}else {
}
}
}
}
}
if (depth<4) {
if (depth==1) {
if (depth==2) {
for (int local21 = 0; local21<=1; local21 += 1) {
for (int local22 = 0; local22<=0; local22 += 1) {
}
}
}
}else {
if (depth>3) {
if (depth>=3) {
for (int local23 = 0; local23<=2; local23 += 1) {
}
}
}
}
}
if (depth==3) {
if (depth==3) {
for (int local24 = 0; local24<=3; local24 += 1) {
if (depth<3) {
for (int local25 = 0; local25<=2; local25 += 1) {
}
}else {
for (int local26 = 0; local26<=2; local26 += 1) {
}
}
}
}else {
for (int local27 = 0; local27<=3; local27 += 1) {
for (int local28 = 0; local28<=3; local28 += 1) {
if (depth<=4) {
}
}
}
}
}
}
public void method2(int depth) {
if (depth == 0) return;
this.field1.method4(depth-1);
for (int local29 = 0; local29<=2; local29 += 1) {
for (int local30 = 0; local30<=1; local30 += 1) {
for (int local31 = 0; local31<=1; local31 += 1) {
if (depth>3) {
this.method4(depth-1);
}else {
for (int local32 = 0; local32<=0; local32 += 1) {
}
}
}
}
}
if (depth==2) {
this.field1=this.field1;
}
for (int local33 = 0; local33<=3; local33 += 1) {
if (depth<3) {
for (int local34 = 0; local34<=1; local34 += 1) {
if (depth==3) {
if (depth>=3) {
}else {
}
}else {
this.field1=this.field1;
}
}
}
}
}
public static void method3(Test17Class1 arg0, Test17Class3 arg1, int depth) {
if (depth == 0) return;
for (int local35 = 0; local35<=2; local35 += 1) {
for (int local36 = 0; local36<=1; local36 += 1) {
arg1.field5=arg1.field2;
}
}
arg1.field4=arg1;
arg1.field7=arg1.field8.method6(depth-1);
arg1.field1.method3(arg1.field7,arg1.field2,depth-1);
for (int local37 = 0; local37<=1; local37 += 1) {
if (depth<4) {
if (depth<=1) {
arg1.field1=arg1.field4;
}
}
}
for (int local38 = 0; local38<=1; local38 += 1) {
arg1.field1=arg0.field1;
}
}
public static void method4(int depth) {
if (depth == 0) return;
}
}
class Test17Class2 extends Test17Class1 {
public static Test17Class3 field2;
public Test17Class3 field3;
public static Test17Class3 field4;
public static void method5(int depth) {
if (depth == 0) return;
if (depth<=4) {
if (depth<1) {
for (int local39 = 0; local39<=2; local39 += 1) {
if (depth<1) {
field4.field4=field2;
}else {
for (int local40 = 0; local40<=0; local40 += 1) {
}
}
}
}else {
field4=field4.field2;
}
}
if (depth<1) {
field2.field1=field4.field1;
}else {
for (int local41 = 0; local41<=0; local41 += 1) {
field4.field6=field4.field2.method7(depth-1);
}
}
}
public static Test17Class1 method6(int depth) {
if (depth == 0) return Test17Lib.local7;
if (depth==1) {
field4.field1=field4;
}else {
if (depth<3) {
if (depth<=3) {
field2.field7.method4(depth-1);
}else {
for (int local42 = 0; local42<=0; local42 += 1) {
field2.field4.method3(field2.field2,field2,depth-1);
}
}
}
}
if (depth==3) {
if (depth>=2) {
for (int local43 = 0; local43<=0; local43 += 1) {
for (int local44 = 0; local44<=2; local44 += 1) {
for (int local45 = 0; local45<=2; local45 += 1) {
}
}
}
}
}else {
for (int local46 = 0; local46<=3; local46 += 1) {
field2.field1=field4.field2.method6(depth-1);
}
}
field4.field2.method4(depth-1);
for (int local47 = 0; local47<=2; local47 += 1) {
field2.field2.method1(depth-1);
}
return field2.field7;
}
}
class Test17Class3 extends Test17Class2 {
public static Test17Class3 field5;
public static Test17Class1 field6;
public static Test17Class1 field7;
public static Test17Class3 field8;
public Test17Class2 method7(int depth) {
if (depth == 0) return Test17Lib.local2;
for (int local48 = 0; local48<=1; local48 += 1) {
if (depth>=4) {
for (int local49 = 0; local49<=1; local49 += 1) {
for (int local50 = 0; local50<=0; local50 += 1) {
if (depth>3) {
}else {
}
}
}
}else {
this.method2(depth-1);
}
}
for (int local51 = 0; local51<=1; local51 += 1) {
this.field4=this;
}
return this;
}
public static void method8(int depth) {
if (depth == 0) return;
field2=field5.field8;
field8.method2(depth-1);
if (depth<4) {
field4.field7=field5.field6;
}
for (int local52 = 0; local52<=2; local52 += 1) {
field8.method2(depth-1);
}
field8.field7.method1(depth-1);
field4.field1=field2.field6;
if (depth==2) {
if (depth>=3) {
field4=field8.field5;
}else {
field8.field6.method1(depth-1);
}
}else {
field4.field6.method1(depth-1);
}
field5.field4=field4.field2;
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
Test17Lib.local3 = new Test17Class2();
Benchmark.alloc(4);
Test17Lib.local4 = new Test17Class2();
Benchmark.alloc(5);
Test17Lib.local5 = new Test17Class3();
Benchmark.alloc(6);
Test17Lib.local6 = new Test17Class3();
Benchmark.alloc(7);
Test17Lib.local7 = new Test17Class3();
Test17Lib.local1.field1 = Test17Lib.local3;
Test17Lib.local2.field2 = Test17Lib.local5;
Test17Lib.local2.field3 = Test17Lib.local7;
Test17Lib.local2.field4 = Test17Lib.local5;
Test17Lib.local2.field1 = Test17Lib.local7;
Test17Lib.local3.field2 = Test17Lib.local7;
Test17Lib.local3.field3 = Test17Lib.local7;
Test17Lib.local3.field4 = Test17Lib.local5;
Test17Lib.local3.field1 = Test17Lib.local1;
Test17Lib.local4.field2 = Test17Lib.local6;
Test17Lib.local4.field3 = Test17Lib.local7;
Test17Lib.local4.field4 = Test17Lib.local7;
Test17Lib.local4.field1 = Test17Lib.local7;
Test17Lib.local5.field5 = Test17Lib.local6;
Test17Lib.local5.field6 = Test17Lib.local3;
Test17Lib.local5.field7 = Test17Lib.local6;
Test17Lib.local5.field8 = Test17Lib.local6;
Test17Lib.local5.field2 = Test17Lib.local6;
Test17Lib.local5.field3 = Test17Lib.local5;
Test17Lib.local5.field4 = Test17Lib.local6;
Test17Lib.local5.field1 = Test17Lib.local7;
Test17Lib.local6.field5 = Test17Lib.local5;
Test17Lib.local6.field6 = Test17Lib.local1;
Test17Lib.local6.field7 = Test17Lib.local6;
Test17Lib.local6.field8 = Test17Lib.local7;
Test17Lib.local6.field2 = Test17Lib.local6;
Test17Lib.local6.field3 = Test17Lib.local7;
Test17Lib.local6.field4 = Test17Lib.local7;
Test17Lib.local6.field1 = Test17Lib.local1;
Test17Lib.local7.field5 = Test17Lib.local5;
Test17Lib.local7.field6 = Test17Lib.local4;
Test17Lib.local7.field7 = Test17Lib.local5;
Test17Lib.local7.field8 = Test17Lib.local7;
Test17Lib.local7.field2 = Test17Lib.local7;
Test17Lib.local7.field3 = Test17Lib.local6;
Test17Lib.local7.field4 = Test17Lib.local7;
Test17Lib.local7.field1 = Test17Lib.local1;
if (inputValue==1) {
Test17Lib.local5.field2=Test17Lib.local7.field2;
}else {
for (int local53 = 0; local53<=1; local53 += 1) {
for (int local54 = 0; local54<=2; local54 += 1) {
Test17Lib.local4.field4.method4(3);
}
}
}
Test17Lib.local3.method4(3);
Test17Lib.local7.field8.method5(3);
for (int local55 = 0; local55<=0; local55 += 1) {
if (inputValue>3) {
if (inputValue>=1) {
if (inputValue>=2) {
for (int local56 = 0; local56<=2; local56 += 1) {
}
}else {
Test17Lib.local2=Test17Lib.local6;
}
}
}
}
if (inputValue<1) {
Test17Lib.local7.field5=Test17Lib.local7.field2;
}else {
if (inputValue==4) {
Test17Lib.local3.field4.method8(3);
}
}
Test17Lib.local7.field4.method2(3);
if (inputValue<1) {
for (int local57 = 0; local57<=1; local57 += 1) {
if (inputValue<4) {
Test17Lib.local7.field2.method1(3);
}
}
}else {
for (int local58 = 0; local58<=0; local58 += 1) {
Test17Lib.local3.field4.method2(3);
}
}
if (inputValue==3) {
Test17Lib.local7=Test17Lib.local3.field3;
}
if (inputValue>=3) {
if (inputValue==3) {
Test17Lib.local3.field1=Test17Lib.local5.field2.method6(3);
}
}
if (inputValue<=3) {
Test17Lib.local2=Test17Lib.local3.field4;
}else {
if (inputValue>=4) {
for (int local59 = 0; local59<=2; local59 += 1) {
if (inputValue<3) {
if (inputValue<=2) {
}
}else {
if (inputValue>=1) {
}
}
}
}
}
Benchmark.test(1,Test17Lib.local1);
Benchmark.test(2,Test17Lib.local2);
Benchmark.test(3,Test17Lib.local3);
Benchmark.test(4,Test17Lib.local4);
Benchmark.test(5,Test17Lib.local5);
Benchmark.test(6,Test17Lib.local6);
Benchmark.test(7,Test17Lib.local7);
Benchmark.test(8,Test17Lib.local1.field1);
Benchmark.test(9,Test17Lib.local2.field2);
Benchmark.test(10,Test17Lib.local2.field3);
Benchmark.test(11,Test17Lib.local2.field4);
Benchmark.test(12,Test17Lib.local2.field1);
Benchmark.test(13,Test17Lib.local3.field2);
Benchmark.test(14,Test17Lib.local3.field3);
Benchmark.test(15,Test17Lib.local3.field4);
Benchmark.test(16,Test17Lib.local3.field1);
Benchmark.test(17,Test17Lib.local4.field2);
Benchmark.test(18,Test17Lib.local4.field3);
Benchmark.test(19,Test17Lib.local4.field4);
Benchmark.test(20,Test17Lib.local4.field1);
Benchmark.test(21,Test17Lib.local5.field5);
Benchmark.test(22,Test17Lib.local5.field6);
Benchmark.test(23,Test17Lib.local5.field7);
Benchmark.test(24,Test17Lib.local5.field8);
Benchmark.test(25,Test17Lib.local5.field2);
Benchmark.test(26,Test17Lib.local5.field3);
Benchmark.test(27,Test17Lib.local5.field4);
Benchmark.test(28,Test17Lib.local5.field1);
Benchmark.test(29,Test17Lib.local6.field5);
Benchmark.test(30,Test17Lib.local6.field6);
Benchmark.test(31,Test17Lib.local6.field7);
Benchmark.test(32,Test17Lib.local6.field8);
Benchmark.test(33,Test17Lib.local6.field2);
Benchmark.test(34,Test17Lib.local6.field3);
Benchmark.test(35,Test17Lib.local6.field4);
Benchmark.test(36,Test17Lib.local6.field1);
Benchmark.test(37,Test17Lib.local7.field5);
Benchmark.test(38,Test17Lib.local7.field6);
Benchmark.test(39,Test17Lib.local7.field7);
Benchmark.test(40,Test17Lib.local7.field8);
Benchmark.test(41,Test17Lib.local7.field2);
Benchmark.test(42,Test17Lib.local7.field3);
Benchmark.test(43,Test17Lib.local7.field4);
Benchmark.test(44,Test17Lib.local7.field1);
Benchmark.print();
}
}
