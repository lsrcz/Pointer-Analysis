package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test8Lib{
public static Test8Class1 local1;
public static Test8Class1 local2;
public static Test8Class2 local3;
public static Test8Class2 local4;
public static Test8Class2 local5;
}
class Test8Class1 extends BasicClass {
public static Test8Class2 field1;
public static Test8Class2 field2;
public static void method1(int depth) {
if (depth == 0) return;
if (depth<2) {
field2.field1=field1.field2;
}else {
if (depth==2) {
for (int local6 = 0; local6<=0; local6 += 1) {
if (depth==3) {
if (depth>=4) {
}else {
}
}else {
for (int local7 = 0; local7<=1; local7 += 1) {
}
}
}
}
}
field2.field2.method1(depth-1);
field2.field1=field1.field2;
for (int local8 = 0; local8<=2; local8 += 1) {
if (depth>=2) {
field2.field4.method4(field2,depth-1);
}else {
if (depth<4) {
field2.field5=field2.field6.method5(depth-1);
}
}
}
field1=field2.field4;
if (depth>1) {
field2.field4=field2.field3;
}else {
field2.field3=field2.field2;
}
field2.field5=field2.field4;
if (depth>=1) {
if (depth==4) {
if (depth==1) {
for (int local9 = 0; local9<=2; local9 += 1) {
if (depth<2) {
}else {
}
}
}
}
}else {
field1=field2.field4.method6(field1.field4,depth-1);
}
if (depth==4) {
for (int local10 = 0; local10<=3; local10 += 1) {
field2=field1.field3;
}
}
}
public static Test8Class2 method2(Test8Class1 arg0, int depth) {
if (depth == 0) return Test8Lib.local4;
field2.field1=arg0.field1;
if (depth>3) {
if (depth<=3) {
field1.method7(field2,field1.field4,depth-1);
}else {
field1.field6=arg0;
}
}
for (int local11 = 0; local11<=0; local11 += 1) {
field2.field4.method1(depth-1);
}
field2.field1.method8(field2.field6,arg0.field2,depth-1);
for (int local12 = 0; local12<=2; local12 += 1) {
field2.field2=field2.field4.method7(field2.field5,arg0,depth-1);
}
if (depth>1) {
field1.field6=field2.field3;
}else {
if (depth>=2) {
field1.field4=field1.field4;
}
}
for (int local13 = 0; local13<=2; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
if (depth>1) {
for (int local15 = 0; local15<=1; local15 += 1) {
if (depth>2) {
}
}
}
}
}
for (int local16 = 0; local16<=3; local16 += 1) {
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=0; local18 += 1) {
field1.field5=field1.field4;
}
}
}
return field2.field2;
}
public Test8Class1 method3(int depth) {
if (depth == 0) return Test8Lib.local2;
for (int local19 = 0; local19<=0; local19 += 1) {
this.field1=this.field2;
}
this.field2=this.field2.method7(this.field2,this.field1,depth-1);
return this.field2;
}
public void method4(Test8Class1 arg0, int depth) {
if (depth == 0) return;
if (depth<3) {
for (int local20 = 0; local20<=0; local20 += 1) {
for (int local21 = 0; local21<=1; local21 += 1) {
for (int local22 = 0; local22<=2; local22 += 1) {
this.field1.method4(this.field1,depth-1);
}
}
}
}else {
for (int local23 = 0; local23<=2; local23 += 1) {
if (depth>=3) {
if (depth>=3) {
arg0.field2.method4(this,depth-1);
}else {
if (depth>=1) {
}else {
}
}
}
}
}
arg0.field1=this.field1;
arg0.field2.method6(arg0,depth-1);
for (int local24 = 0; local24<=3; local24 += 1) {
if (depth>4) {
this.field1=this.field2.method7(arg0.field2,arg0.field2,depth-1);
}
}
arg0=arg0;
for (int local25 = 0; local25<=1; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
this.field2=arg0.field1;
}
}
for (int local27 = 0; local27<=2; local27 += 1) {
for (int local28 = 0; local28<=0; local28 += 1) {
if (depth>=3) {
this.field1=arg0.field1;
}
}
}
}
public Test8Class1 method5(int depth) {
if (depth == 0) return Test8Lib.local4;
this.field1=this.field2;
this.field1.method6(this.field2,depth-1);
this.method3(depth-1);
return this.field1;
}
}
class Test8Class2 extends Test8Class1 {
public static Test8Class2 field3;
public Test8Class2 field4;
public static Test8Class1 field5;
public static Test8Class1 field6;
public static Test8Class2 method6(Test8Class1 arg0, int depth) {
if (depth == 0) return Test8Lib.local4;
for (int local29 = 0; local29<=3; local29 += 1) {
if (depth>=4) {
field5=field3.field2;
}else {
field1=field3.field1;
}
}
field1.field5=field3.field6;
field2.field1.method3(depth-1);
field3.field2=field2.field1.method2(field1,depth-1);
if (depth<3) {
field2.field5=field1.field2;
}
field1.field4.method4(field2.field1,depth-1);
field3.field6=field2.field4;
if (depth>2) {
if (depth<=3) {
field3.field6=field1.field2.method5(depth-1);
}else {
if (depth>2) {
if (depth<=4) {
for (int local30 = 0; local30<=2; local30 += 1) {
}
}
}
}
}else {
for (int local31 = 0; local31<=1; local31 += 1) {
if (depth==2) {
for (int local32 = 0; local32<=3; local32 += 1) {
for (int local33 = 0; local33<=1; local33 += 1) {
}
}
}else {
field6=field3.field1;
}
}
}
return field1.field1;
}
public Test8Class2 method7(Test8Class1 arg0, Test8Class1 arg1, int depth) {
if (depth == 0) return Test8Lib.local4;
arg0=arg1.field2.method7(this.field6,this.field5,depth-1);
this.field4=arg1.field1;
for (int local34 = 0; local34<=1; local34 += 1) {
arg1.field1.method1(depth-1);
}
arg0.field1=arg1.field2;
arg1.field2.method8(this.field2,arg0.field2,depth-1);
this.field6=this.method3(depth-1);
return arg1.field1;
}
public static void method8(Test8Class1 arg0, Test8Class2 arg1, int depth) {
if (depth == 0) return;
for (int local35 = 0; local35<=3; local35 += 1) {
field2.field1.method7(field5,field6,depth-1);
}
field2.field1=field2.field4.method2(field3.field4,depth-1);
field5=field2.field2.method3(depth-1);
}
}
public class Test8{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test8Lib.local1 = new Test8Class1();
Benchmark.alloc(2);
Test8Lib.local2 = new Test8Class1();
Benchmark.alloc(3);
Test8Lib.local3 = new Test8Class2();
Benchmark.alloc(4);
Test8Lib.local4 = new Test8Class2();
Benchmark.alloc(5);
Test8Lib.local5 = new Test8Class2();
Test8Lib.local1.field1 = Test8Lib.local3;
Test8Lib.local1.field2 = Test8Lib.local5;
Test8Lib.local2.field1 = Test8Lib.local5;
Test8Lib.local2.field2 = Test8Lib.local5;
Test8Lib.local3.field3 = Test8Lib.local5;
Test8Lib.local3.field4 = Test8Lib.local5;
Test8Lib.local3.field5 = Test8Lib.local3;
Test8Lib.local3.field6 = Test8Lib.local4;
Test8Lib.local3.field1 = Test8Lib.local3;
Test8Lib.local3.field2 = Test8Lib.local5;
Test8Lib.local4.field3 = Test8Lib.local4;
Test8Lib.local4.field4 = Test8Lib.local3;
Test8Lib.local4.field5 = Test8Lib.local5;
Test8Lib.local4.field6 = Test8Lib.local4;
Test8Lib.local4.field1 = Test8Lib.local3;
Test8Lib.local4.field2 = Test8Lib.local3;
Test8Lib.local5.field3 = Test8Lib.local4;
Test8Lib.local5.field4 = Test8Lib.local3;
Test8Lib.local5.field5 = Test8Lib.local3;
Test8Lib.local5.field6 = Test8Lib.local5;
Test8Lib.local5.field1 = Test8Lib.local5;
Test8Lib.local5.field2 = Test8Lib.local5;
if (inputValue==2) {
Test8Lib.local5.method8(Test8Lib.local3.field5,Test8Lib.local3.field4,3);
}
for (int local36 = 0; local36<=0; local36 += 1) {
if (inputValue<1) {
Test8Lib.local5=Test8Lib.local1.field1;
}else {
if (inputValue==2) {
Test8Lib.local4.field6=Test8Lib.local2.field1;
}
}
}
if (inputValue<1) {
for (int local37 = 0; local37<=3; local37 += 1) {
for (int local38 = 0; local38<=0; local38 += 1) {
if (inputValue>3) {
for (int local39 = 0; local39<=3; local39 += 1) {
}
}
}
}
}
Test8Lib.local4.field6=Test8Lib.local1.field1;
Test8Lib.local2=Test8Lib.local4.field6;
Test8Lib.local4=Test8Lib.local5.field1;
if (inputValue<=4) {
if (inputValue>4) {
Test8Lib.local1.field2.method7(Test8Lib.local2.field2,Test8Lib.local3,3);
}
}
Test8Lib.local4.method1(3);
if (inputValue<3) {
if (inputValue<=3) {
if (inputValue==3) {
Test8Lib.local2=Test8Lib.local4.field4;
}else {
Test8Lib.local3.field2=Test8Lib.local1.field1.method7(Test8Lib.local5.field4,Test8Lib.local4,3);
}
}else {
Test8Lib.local1=Test8Lib.local4.field2.method5(3);
}
}
Test8Lib.local4.field5=Test8Lib.local4.field1.method5(3);
Benchmark.test(1,Test8Lib.local1);
Benchmark.test(2,Test8Lib.local2);
Benchmark.test(3,Test8Lib.local3);
Benchmark.test(4,Test8Lib.local4);
Benchmark.test(5,Test8Lib.local5);
Benchmark.test(6,Test8Lib.local1.field1);
Benchmark.test(7,Test8Lib.local1.field2);
Benchmark.test(8,Test8Lib.local2.field1);
Benchmark.test(9,Test8Lib.local2.field2);
Benchmark.test(10,Test8Lib.local3.field3);
Benchmark.test(11,Test8Lib.local3.field4);
Benchmark.test(12,Test8Lib.local3.field5);
Benchmark.test(13,Test8Lib.local3.field6);
Benchmark.test(14,Test8Lib.local3.field1);
Benchmark.test(15,Test8Lib.local3.field2);
Benchmark.test(16,Test8Lib.local4.field3);
Benchmark.test(17,Test8Lib.local4.field4);
Benchmark.test(18,Test8Lib.local4.field5);
Benchmark.test(19,Test8Lib.local4.field6);
Benchmark.test(20,Test8Lib.local4.field1);
Benchmark.test(21,Test8Lib.local4.field2);
Benchmark.test(22,Test8Lib.local5.field3);
Benchmark.test(23,Test8Lib.local5.field4);
Benchmark.test(24,Test8Lib.local5.field5);
Benchmark.test(25,Test8Lib.local5.field6);
Benchmark.test(26,Test8Lib.local5.field1);
Benchmark.test(27,Test8Lib.local5.field2);
Benchmark.print();
}
}
