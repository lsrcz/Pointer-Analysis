package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test10Lib{
public static Test10Class1 local1;
public static Test10Class1 local2;
public static Test10Class1 local3;
public static Test10Class1 local4;
public static Test10Class1 local5;
public static Test10Class2 local6;
public static Test10Class2 local7;
public static Test10Class2 local8;
}
class Test10Class1 extends BasicClass {
public Test10Class2 field1;
public Test10Class1 method1(Test10Class2 arg0, int depth) {
if (depth == 0) return Test10Lib.local2;
for (int local9 = 0; local9<=0; local9 += 1) {
arg0=arg0;
}
arg0.field2=arg0;
if (depth<1) {
arg0.field2=arg0;
}else {
arg0.field2=arg0.field1;
}
arg0.field2=this.field1.method8(arg0,arg0.field1,depth-1);
if (depth<=4) {
arg0.field2=arg0;
}else {
arg0.field1=arg0;
}
if (depth>2) {
for (int local10 = 0; local10<=0; local10 += 1) {
arg0.field2=arg0.field1;
}
}
return arg0.field1;
}
public static Test10Class2 method2(Test10Class1 arg0, Test10Class1 arg1, int depth) {
if (depth == 0) return Test10Lib.local7;
arg0.field1=arg0.field1;
arg0.field1=arg0.field1.method3(arg1.field1,arg0.field1,depth-1);
arg0.field1=arg1.field1;
arg1=arg1;
if (depth>=2) {
arg0=arg0;
}else {
if (depth<2) {
for (int local11 = 0; local11<=0; local11 += 1) {
if (depth==3) {
arg0=arg0;
}else {
for (int local12 = 0; local12<=1; local12 += 1) {
}
}
}
}else {
if (depth>=4) {
if (depth<1) {
arg1=arg0.field1;
}
}else {
if (depth>1) {
for (int local13 = 0; local13<=0; local13 += 1) {
}
}
}
}
}
return arg0.field1;
}
public Test10Class2 method3(Test10Class2 arg0, Test10Class2 arg1, int depth) {
if (depth == 0) return Test10Lib.local6;
arg0.field2=arg1.field1;
this.field1.method5(arg1.field1,this.field1,depth-1);
return this.field1;
}
public static Test10Class2 method4(int depth) {
if (depth == 0) return Test10Lib.local7;
for (int local14 = 0; local14<=2; local14 += 1) {
for (int local15 = 0; local15<=1; local15 += 1) {
if (depth>2) {
for (int local16 = 0; local16<=2; local16 += 1) {
if (depth<=4) {
}else {
}
}
}
}
}
if (depth>2) {
if (depth>3) {
if (depth==2) {
for (int local17 = 0; local17<=1; local17 += 1) {
if (depth>1) {
}
}
}
}else {
if (depth<=3) {
if (depth<=3) {
for (int local18 = 0; local18<=2; local18 += 1) {
}
}else {
for (int local19 = 0; local19<=3; local19 += 1) {
}
}
}
}
}
for (int local20 = 0; local20<=1; local20 += 1) {
if (depth<3) {
if (depth==4) {
for (int local21 = 0; local21<=3; local21 += 1) {
for (int local22 = 0; local22<=1; local22 += 1) {
}
}
}
}
}
if (depth>4) {
for (int local23 = 0; local23<=1; local23 += 1) {
for (int local24 = 0; local24<=3; local24 += 1) {
if (depth<2) {
if (depth>=1) {
}else {
}
}else {
if (depth==1) {
}
}
}
}
}
for (int local25 = 0; local25<=0; local25 += 1) {
for (int local26 = 0; local26<=2; local26 += 1) {
for (int local27 = 0; local27<=3; local27 += 1) {
if (depth>4) {
for (int local28 = 0; local28<=0; local28 += 1) {
}
}else {
if (depth==3) {
}else {
}
}
}
}
}
for (int local29 = 0; local29<=0; local29 += 1) {
if (depth>=1) {
if (depth>2) {
for (int local30 = 0; local30<=2; local30 += 1) {
for (int local31 = 0; local31<=0; local31 += 1) {
}
}
}
}
}
for (int local32 = 0; local32<=2; local32 += 1) {
if (depth<=1) {
for (int local33 = 0; local33<=0; local33 += 1) {
for (int local34 = 0; local34<=1; local34 += 1) {
if (depth<=4) {
}
}
}
}else {
if (depth==3) {
if (depth<2) {
if (depth>4) {
}else {
}
}else {
for (int local35 = 0; local35<=2; local35 += 1) {
}
}
}else {
if (depth>2) {
if (depth==2) {
}
}
}
}
}
return Test10Lib.local7;
}
public void method5(Test10Class2 arg0, Test10Class1 arg1, int depth) {
if (depth == 0) return;
}
public void method6(Test10Class1 arg0, Test10Class2 arg1, int depth) {
if (depth == 0) return;
arg1.field2=this;
arg1.field2.method5(arg1,arg1.field1,depth-1);
arg0=arg0.field1;
arg0.field1.method7(arg1.field2,depth-1);
arg0.field1=arg0.field1;
arg1=arg0.field1;
}
public Test10Class2 method7(Test10Class1 arg0, int depth) {
if (depth == 0) return Test10Lib.local8;
this.field1=this.method7(arg0.field1,depth-1);
if (depth==4) {
arg0=arg0.method7(arg0,depth-1);
}
for (int local36 = 0; local36<=1; local36 += 1) {
this.field1=this.method2(arg0,this.field1,depth-1);
}
for (int local37 = 0; local37<=2; local37 += 1) {
for (int local38 = 0; local38<=2; local38 += 1) {
for (int local39 = 0; local39<=3; local39 += 1) {
arg0=arg0;
}
}
}
return this.field1;
}
public static Test10Class1 method8(Test10Class1 arg0, Test10Class1 arg1, int depth) {
if (depth == 0) return Test10Lib.local8;
arg1=arg1;
arg1.field1=arg1.field1;
arg1=arg0.field1;
if (depth>=4) {
for (int local40 = 0; local40<=0; local40 += 1) {
arg1.field1.method6(arg0,arg1.field1,depth-1);
}
}
arg1.field1=arg0.method7(arg1,depth-1);
return arg0;
}
public Test10Class1 method9(Test10Class1 arg0, Test10Class1 arg1, int depth) {
if (depth == 0) return Test10Lib.local3;
for (int local41 = 0; local41<=1; local41 += 1) {
this.field1=this.field1;
}
arg1.method5(this.field1,arg0.field1,depth-1);
for (int local42 = 0; local42<=2; local42 += 1) {
if (depth>=4) {
arg1.method6(this,arg0.field1,depth-1);
}
}
for (int local43 = 0; local43<=3; local43 += 1) {
for (int local44 = 0; local44<=2; local44 += 1) {
this.field1=arg0.method4(depth-1);
}
}
return this;
}
}
class Test10Class2 extends Test10Class1 {
public Test10Class1 field2;
public static void method10(Test10Class2 arg0, Test10Class2 arg1, int depth) {
if (depth == 0) return;
arg1.field1=arg1;
}
}
public class Test10{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test10Lib.local1 = new Test10Class1();
Benchmark.alloc(2);
Test10Lib.local2 = new Test10Class1();
Benchmark.alloc(3);
Test10Lib.local3 = new Test10Class1();
Benchmark.alloc(4);
Test10Lib.local4 = new Test10Class1();
Benchmark.alloc(5);
Test10Lib.local5 = new Test10Class1();
Benchmark.alloc(6);
Test10Lib.local6 = new Test10Class2();
Benchmark.alloc(7);
Test10Lib.local7 = new Test10Class2();
Benchmark.alloc(8);
Test10Lib.local8 = new Test10Class2();
Test10Lib.local1.field1 = Test10Lib.local7;
Test10Lib.local2.field1 = Test10Lib.local6;
Test10Lib.local3.field1 = Test10Lib.local7;
Test10Lib.local4.field1 = Test10Lib.local7;
Test10Lib.local5.field1 = Test10Lib.local6;
Test10Lib.local6.field2 = Test10Lib.local2;
Test10Lib.local6.field1 = Test10Lib.local6;
Test10Lib.local7.field2 = Test10Lib.local8;
Test10Lib.local7.field1 = Test10Lib.local7;
Test10Lib.local8.field2 = Test10Lib.local7;
Test10Lib.local8.field1 = Test10Lib.local7;
for (int local45 = 0; local45<=0; local45 += 1) {
for (int local46 = 0; local46<=3; local46 += 1) {
if (inputValue==1) {
if (inputValue<=4) {
if (inputValue>=2) {
}
}else {
Test10Lib.local7.method5(Test10Lib.local2.field1,Test10Lib.local7.field2,3);
}
}else {
if (inputValue==4) {
for (int local47 = 0; local47<=2; local47 += 1) {
}
}
}
}
}
Test10Lib.local6.field1=Test10Lib.local8;
if (inputValue>2) {
for (int local48 = 0; local48<=0; local48 += 1) {
Test10Lib.local5.field1=Test10Lib.local7;
}
}else {
Test10Lib.local4.field1=Test10Lib.local1.field1;
}
for (int local49 = 0; local49<=1; local49 += 1) {
if (inputValue<1) {
for (int local50 = 0; local50<=2; local50 += 1) {
Test10Lib.local7.field2.method1(Test10Lib.local2.field1,3);
}
}
}
for (int local51 = 0; local51<=2; local51 += 1) {
for (int local52 = 0; local52<=2; local52 += 1) {
Test10Lib.local6.method10(Test10Lib.local4.field1,Test10Lib.local8.field1,3);
}
}
if (inputValue<=1) {
Test10Lib.local5=Test10Lib.local1;
}else {
if (inputValue==3) {
Test10Lib.local2=Test10Lib.local6;
}else {
Test10Lib.local7=Test10Lib.local7;
}
}
Test10Lib.local6.field1=Test10Lib.local5.field1;
if (inputValue==2) {
Test10Lib.local4=Test10Lib.local4;
}
Test10Lib.local1.field1=Test10Lib.local8;
if (inputValue<=2) {
if (inputValue==1) {
Test10Lib.local7.field2=Test10Lib.local6.field2;
}
}else {
Test10Lib.local8.field2.method8(Test10Lib.local6.field1,Test10Lib.local4,3);
}
Benchmark.test(1,Test10Lib.local1);
Benchmark.test(2,Test10Lib.local2);
Benchmark.test(3,Test10Lib.local3);
Benchmark.test(4,Test10Lib.local4);
Benchmark.test(5,Test10Lib.local5);
Benchmark.test(6,Test10Lib.local6);
Benchmark.test(7,Test10Lib.local7);
Benchmark.test(8,Test10Lib.local8);
Benchmark.test(9,Test10Lib.local1.field1);
Benchmark.test(10,Test10Lib.local2.field1);
Benchmark.test(11,Test10Lib.local3.field1);
Benchmark.test(12,Test10Lib.local4.field1);
Benchmark.test(13,Test10Lib.local5.field1);
Benchmark.test(14,Test10Lib.local6.field2);
Benchmark.test(15,Test10Lib.local6.field1);
Benchmark.test(16,Test10Lib.local7.field2);
Benchmark.test(17,Test10Lib.local7.field1);
Benchmark.test(18,Test10Lib.local8.field2);
Benchmark.test(19,Test10Lib.local8.field1);
Benchmark.print();
}
}
