package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test4Lib{
public static Test4Class1 local1;
public static Test4Class1 local2;
public static Test4Class2 local3;
}
class Test4Class1 extends BasicClass {
public Test4Class1 field1;
public Test4Class1 field2;
public Test4Class1 method1(int depth) {
if (depth == 0) return Test4Lib.local1;
return this.field2;
}
public Test4Class2 method2(Test4Class1 arg0, Test4Class2 arg1, int depth) {
if (depth == 0) return Test4Lib.local3;
if (depth<=2) {
for (int local4 = 0; local4<=1; local4 += 1) {
arg1.field6.method9(depth-1);
}
}else {
arg1.field1=arg1.method8(depth-1);
}
for (int local5 = 0; local5<=2; local5 += 1) {
arg1.field7=arg1.field10.method3(depth-1);
}
return arg1.field9;
}
public static Test4Class1 method3(int depth) {
if (depth == 0) return Test4Lib.local3;
for (int local6 = 0; local6<=0; local6 += 1) {
for (int local7 = 0; local7<=0; local7 += 1) {
if (depth<3) {
if (depth>1) {
if (depth<=4) {
}
}
}else {
if (depth>1) {
for (int local8 = 0; local8<=0; local8 += 1) {
}
}else {
if (depth>=2) {
}
}
}
}
}
if (depth>1) {
if (depth>4) {
if (depth<1) {
for (int local9 = 0; local9<=3; local9 += 1) {
for (int local10 = 0; local10<=2; local10 += 1) {
}
}
}else {
if (depth>4) {
if (depth>3) {
}
}
}
}
}
for (int local11 = 0; local11<=1; local11 += 1) {
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth<2) {
for (int local13 = 0; local13<=1; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
}
}
}else {
if (depth==2) {
if (depth<=1) {
}
}
}
}
}
for (int local15 = 0; local15<=0; local15 += 1) {
if (depth>3) {
if (depth>2) {
if (depth<3) {
for (int local16 = 0; local16<=1; local16 += 1) {
}
}
}else {
if (depth>=4) {
for (int local17 = 0; local17<=0; local17 += 1) {
}
}
}
}else {
for (int local18 = 0; local18<=1; local18 += 1) {
for (int local19 = 0; local19<=1; local19 += 1) {
if (depth==4) {
}else {
}
}
}
}
}
if (depth>1) {
for (int local20 = 0; local20<=0; local20 += 1) {
if (depth>1) {
if (depth==1) {
for (int local21 = 0; local21<=2; local21 += 1) {
}
}else {
if (depth>=2) {
}else {
}
}
}
}
}else {
if (depth==1) {
if (depth<1) {
for (int local22 = 0; local22<=0; local22 += 1) {
for (int local23 = 0; local23<=0; local23 += 1) {
}
}
}else {
if (depth==3) {
if (depth>2) {
}
}
}
}
}
return Test4Lib.local2;
}
public Test4Class1 method4(int depth) {
if (depth == 0) return Test4Lib.local2;
this.field2=this.field2.method7(depth-1);
for (int local24 = 0; local24<=2; local24 += 1) {
if (depth>1) {
for (int local25 = 0; local25<=2; local25 += 1) {
if (depth>1) {
this.method7(depth-1);
}
}
}
}
for (int local26 = 0; local26<=3; local26 += 1) {
for (int local27 = 0; local27<=1; local27 += 1) {
this.field1=this.field1.method1(depth-1);
}
}
for (int local28 = 0; local28<=2; local28 += 1) {
this.method6(depth-1);
}
if (depth<=1) {
if (depth==3) {
this.field1.method1(depth-1);
}else {
this.field2=this.field1;
}
}
this.field1=this.field1.method7(depth-1);
this.field1=this.field1;
for (int local29 = 0; local29<=0; local29 += 1) {
for (int local30 = 0; local30<=0; local30 += 1) {
for (int local31 = 0; local31<=2; local31 += 1) {
this.field2.method4(depth-1);
}
}
}
if (depth<=2) {
for (int local32 = 0; local32<=1; local32 += 1) {
if (depth<=3) {
if (depth>=1) {
if (depth>1) {
}
}else {
this.field1=this.method3(depth-1);
}
}else {
for (int local33 = 0; local33<=1; local33 += 1) {
if (depth<=2) {
}
}
}
}
}else {
if (depth>=2) {
for (int local34 = 0; local34<=3; local34 += 1) {
this.field2.method6(depth-1);
}
}
}
return this.field1;
}
public static void method5(int depth) {
if (depth == 0) return;
if (depth<=2) {
for (int local35 = 0; local35<=1; local35 += 1) {
if (depth<4) {
if (depth<4) {
if (depth==3) {
}
}else {
for (int local36 = 0; local36<=3; local36 += 1) {
}
}
}else {
for (int local37 = 0; local37<=0; local37 += 1) {
for (int local38 = 0; local38<=0; local38 += 1) {
}
}
}
}
}
for (int local39 = 0; local39<=1; local39 += 1) {
if (depth>4) {
if (depth>4) {
if (depth>1) {
if (depth>=4) {
}
}else {
if (depth<=3) {
}else {
}
}
}
}
}
if (depth<=4) {
for (int local40 = 0; local40<=2; local40 += 1) {
for (int local41 = 0; local41<=3; local41 += 1) {
for (int local42 = 0; local42<=2; local42 += 1) {
for (int local43 = 0; local43<=0; local43 += 1) {
}
}
}
}
}
if (depth==1) {
if (depth<2) {
for (int local44 = 0; local44<=3; local44 += 1) {
if (depth==4) {
if (depth>4) {
}
}
}
}
}
for (int local45 = 0; local45<=0; local45 += 1) {
for (int local46 = 0; local46<=1; local46 += 1) {
for (int local47 = 0; local47<=0; local47 += 1) {
if (depth>3) {
for (int local48 = 0; local48<=2; local48 += 1) {
}
}else {
for (int local49 = 0; local49<=1; local49 += 1) {
}
}
}
}
}
}
public Test4Class2 method6(int depth) {
if (depth == 0) return Test4Lib.local3;
if (depth>=4) {
for (int local50 = 0; local50<=1; local50 += 1) {
if (depth>=2) {
this.field2=this.method7(depth-1);
}
}
}else {
this.field2=this.field1;
}
this.method1(depth-1);
this.field1.method5(depth-1);
this.field1=this.field1;
return Test4Lib.local3;
}
public static Test4Class2 method7(int depth) {
if (depth == 0) return Test4Lib.local3;
for (int local51 = 0; local51<=0; local51 += 1) {
if (depth>1) {
for (int local52 = 0; local52<=1; local52 += 1) {
if (depth>=2) {
for (int local53 = 0; local53<=0; local53 += 1) {
}
}else {
if (depth>1) {
}
}
}
}else {
for (int local54 = 0; local54<=2; local54 += 1) {
for (int local55 = 0; local55<=0; local55 += 1) {
for (int local56 = 0; local56<=2; local56 += 1) {
}
}
}
}
}
for (int local57 = 0; local57<=2; local57 += 1) {
for (int local58 = 0; local58<=2; local58 += 1) {
if (depth==2) {
if (depth<=3) {
for (int local59 = 0; local59<=1; local59 += 1) {
}
}else {
for (int local60 = 0; local60<=3; local60 += 1) {
}
}
}else {
if (depth>2) {
if (depth>=2) {
}else {
}
}
}
}
}
for (int local61 = 0; local61<=3; local61 += 1) {
if (depth>4) {
for (int local62 = 0; local62<=2; local62 += 1) {
for (int local63 = 0; local63<=2; local63 += 1) {
if (depth>3) {
}
}
}
}else {
if (depth<=4) {
for (int local64 = 0; local64<=3; local64 += 1) {
for (int local65 = 0; local65<=3; local65 += 1) {
}
}
}else {
for (int local66 = 0; local66<=1; local66 += 1) {
for (int local67 = 0; local67<=3; local67 += 1) {
}
}
}
}
}
for (int local68 = 0; local68<=2; local68 += 1) {
for (int local69 = 0; local69<=1; local69 += 1) {
for (int local70 = 0; local70<=3; local70 += 1) {
if (depth>=3) {
for (int local71 = 0; local71<=3; local71 += 1) {
}
}else {
for (int local72 = 0; local72<=3; local72 += 1) {
}
}
}
}
}
if (depth==3) {
for (int local73 = 0; local73<=3; local73 += 1) {
if (depth>=1) {
for (int local74 = 0; local74<=3; local74 += 1) {
for (int local75 = 0; local75<=0; local75 += 1) {
}
}
}
}
}
return Test4Lib.local3;
}
}
class Test4Class2 extends Test4Class1 {
public Test4Class2 field3;
public Test4Class1 field4;
public Test4Class2 field5;
public Test4Class2 field6;
public Test4Class1 field7;
public static Test4Class1 field8;
public static Test4Class2 field9;
public Test4Class2 field10;
public static Test4Class1 method8(int depth) {
if (depth == 0) return Test4Lib.local3;
for (int local76 = 0; local76<=2; local76 += 1) {
field9.field7=field9.field5.method3(depth-1);
}
field9.field5=field9.field3;
for (int local77 = 0; local77<=1; local77 += 1) {
field9.field9=field9;
}
for (int local78 = 0; local78<=0; local78 += 1) {
for (int local79 = 0; local79<=1; local79 += 1) {
if (depth>=3) {
field8.field1=field9.field1.method4(depth-1);
}else {
field9.field9=field9.field9;
}
}
}
return field9.field10;
}
public Test4Class2 method9(int depth) {
if (depth == 0) return Test4Lib.local3;
this.field7=this.field7;
for (int local80 = 0; local80<=0; local80 += 1) {
this.field5.method6(depth-1);
}
for (int local81 = 0; local81<=2; local81 += 1) {
this.field7=this.field2;
}
this.field10=this.field9;
return this.field6;
}
}
public class Test4{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test4Lib.local1 = new Test4Class1();
Benchmark.alloc(2);
Test4Lib.local2 = new Test4Class1();
Benchmark.alloc(3);
Test4Lib.local3 = new Test4Class2();
Test4Lib.local1.field1 = Test4Lib.local2;
Test4Lib.local1.field2 = Test4Lib.local1;
Test4Lib.local2.field1 = Test4Lib.local3;
Test4Lib.local2.field2 = Test4Lib.local2;
Test4Lib.local3.field3 = Test4Lib.local3;
Test4Lib.local3.field4 = Test4Lib.local3;
Test4Lib.local3.field5 = Test4Lib.local3;
Test4Lib.local3.field6 = Test4Lib.local3;
Test4Lib.local3.field7 = Test4Lib.local1;
Test4Lib.local3.field8 = Test4Lib.local2;
Test4Lib.local3.field9 = Test4Lib.local3;
Test4Lib.local3.field10 = Test4Lib.local3;
Test4Lib.local3.field1 = Test4Lib.local1;
Test4Lib.local3.field2 = Test4Lib.local2;
for (int local82 = 0; local82<=3; local82 += 1) {
for (int local83 = 0; local83<=2; local83 += 1) {
Test4Lib.local3=Test4Lib.local1.method6(3);
}
}
if (inputValue>=3) {
Test4Lib.local3.field7=Test4Lib.local1;
}else {
if (inputValue==3) {
Test4Lib.local3.field9.method8(3);
}
}
Test4Lib.local2=Test4Lib.local3.field7.method3(3);
if (inputValue<4) {
if (inputValue<3) {
if (inputValue<4) {
if (inputValue<1) {
Test4Lib.local3.field1=Test4Lib.local2.field2.method7(3);
}else {
if (inputValue<3) {
}else {
}
}
}
}else {
for (int local84 = 0; local84<=3; local84 += 1) {
if (inputValue==1) {
for (int local85 = 0; local85<=0; local85 += 1) {
}
}else {
Test4Lib.local3.field3=Test4Lib.local3.field5;
}
}
}
}
Test4Lib.local1.field2=Test4Lib.local3.field10;
for (int local86 = 0; local86<=3; local86 += 1) {
Test4Lib.local3.field6=Test4Lib.local3.field5.method9(3);
}
Test4Lib.local3.field7=Test4Lib.local2.field2;
Test4Lib.local2=Test4Lib.local2;
Test4Lib.local3.field1=Test4Lib.local3.field7;
Test4Lib.local3=Test4Lib.local3.field9;
Benchmark.test(1,Test4Lib.local1);
Benchmark.test(2,Test4Lib.local2);
Benchmark.test(3,Test4Lib.local3);
Benchmark.test(4,Test4Lib.local1.field1);
Benchmark.test(5,Test4Lib.local1.field2);
Benchmark.test(6,Test4Lib.local2.field1);
Benchmark.test(7,Test4Lib.local2.field2);
Benchmark.test(8,Test4Lib.local3.field3);
Benchmark.test(9,Test4Lib.local3.field4);
Benchmark.test(10,Test4Lib.local3.field5);
Benchmark.test(11,Test4Lib.local3.field6);
Benchmark.test(12,Test4Lib.local3.field7);
Benchmark.test(13,Test4Lib.local3.field8);
Benchmark.test(14,Test4Lib.local3.field9);
Benchmark.test(15,Test4Lib.local3.field10);
Benchmark.test(16,Test4Lib.local3.field1);
Benchmark.test(17,Test4Lib.local3.field2);
Benchmark.print();
}
}
