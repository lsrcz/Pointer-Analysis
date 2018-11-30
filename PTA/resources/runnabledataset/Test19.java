package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test19Lib{
public static Test19Class1 local1;
public static Test19Class1 local2;
public static Test19Class1 local3;
public static Test19Class1 local4;
public static Test19Class2 local5;
public static Test19Class2 local6;
public static Test19Class2 local7;
public static Test19Class2 local8;
public static Test19Class2 local9;
public static Test19Class3 local10;
public static Test19Class3 local11;
}
class Test19Class1 extends BasicClass {
public Test19Class2 field1;
public Test19Class2 field2;
public void method1(int depth) {
if (depth == 0) return;
this.field1=this.field2;
for (int local12 = 0; local12<=3; local12 += 1) {
for (int local13 = 0; local13<=0; local13 += 1) {
if (depth<=4) {
for (int local14 = 0; local14<=3; local14 += 1) {
if (depth<3) {
}else {
}
}
}
}
}
if (depth>4) {
this.field2.method4(depth-1);
}else {
if (depth==2) {
for (int local15 = 0; local15<=1; local15 += 1) {
if (depth<2) {
if (depth==1) {
}
}else {
this.method1(depth-1);
}
}
}
}
if (depth==2) {
if (depth<2) {
if (depth<2) {
if (depth<=3) {
if (depth<=3) {
}else {
}
}else {
for (int local16 = 0; local16<=0; local16 += 1) {
}
}
}else {
this.field2=this.field2;
}
}
}else {
this.field2=this.field2;
}
if (depth>=2) {
this.field2.method4(depth-1);
}else {
for (int local17 = 0; local17<=3; local17 += 1) {
if (depth>=1) {
this.field2.method4(depth-1);
}
}
}
if (depth<3) {
if (depth>4) {
if (depth==2) {
if (depth==1) {
if (depth<=1) {
}else {
}
}
}else {
this.field2=this.field1;
}
}else {
for (int local18 = 0; local18<=3; local18 += 1) {
for (int local19 = 0; local19<=2; local19 += 1) {
this.field1.method1(depth-1);
}
}
}
}
this.field1=this.field2;
if (depth>=4) {
if (depth<=4) {
if (depth<=2) {
this.field1=this.field2;
}
}else {
if (depth>=3) {
for (int local20 = 0; local20<=3; local20 += 1) {
if (depth>3) {
}
}
}
}
}
for (int local21 = 0; local21<=2; local21 += 1) {
if (depth>=4) {
if (depth==1) {
this.field2=this.field1;
}else {
for (int local22 = 0; local22<=0; local22 += 1) {
if (depth==2) {
}else {
}
}
}
}else {
if (depth>3) {
for (int local23 = 0; local23<=0; local23 += 1) {
if (depth>=1) {
}else {
}
}
}
}
}
}
}
class Test19Class2 extends Test19Class1 {
public Test19Class1 field3;
public Test19Class1 field4;
public Test19Class1 field5;
public static Test19Class2 method2(Test19Class3 arg0, Test19Class2 arg1, int depth) {
if (depth == 0) return Test19Lib.local8;
arg0=arg0;
arg1.field1.method3(arg0,depth-1);
arg0=arg0.field7;
arg1.field1.method4(depth-1);
for (int local24 = 0; local24<=0; local24 += 1) {
arg1.field1.method3(arg0,depth-1);
}
arg1.field5=arg1.field1.method5(arg0,depth-1);
if (depth<=4) {
if (depth==2) {
for (int local25 = 0; local25<=1; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
for (int local27 = 0; local27<=3; local27 += 1) {
}
}
}
}
}
arg0.field6=arg0.field6;
if (depth==2) {
arg0.field2.method2(arg0,arg1.field2,depth-1);
}
return arg0.field6;
}
public static void method3(Test19Class3 arg0, int depth) {
if (depth == 0) return;
for (int local28 = 0; local28<=0; local28 += 1) {
if (depth>4) {
if (depth>3) {
for (int local29 = 0; local29<=2; local29 += 1) {
if (depth==3) {
}else {
}
}
}
}
}
if (depth<4) {
arg0.method8(depth-1);
}else {
arg0.field7.method6(depth-1);
}
}
public static void method4(int depth) {
if (depth == 0) return;
if (depth>=4) {
if (depth<=1) {
if (depth<2) {
for (int local30 = 0; local30<=1; local30 += 1) {
for (int local31 = 0; local31<=2; local31 += 1) {
}
}
}else {
for (int local32 = 0; local32<=3; local32 += 1) {
if (depth>1) {
}
}
}
}else {
if (depth<=4) {
for (int local33 = 0; local33<=3; local33 += 1) {
for (int local34 = 0; local34<=1; local34 += 1) {
}
}
}
}
}
if (depth<4) {
for (int local35 = 0; local35<=1; local35 += 1) {
for (int local36 = 0; local36<=2; local36 += 1) {
if (depth<4) {
for (int local37 = 0; local37<=2; local37 += 1) {
}
}else {
if (depth==1) {
}else {
}
}
}
}
}
if (depth>2) {
for (int local38 = 0; local38<=1; local38 += 1) {
if (depth>=1) {
for (int local39 = 0; local39<=3; local39 += 1) {
for (int local40 = 0; local40<=3; local40 += 1) {
}
}
}
}
}
if (depth>4) {
if (depth>2) {
if (depth>=3) {
for (int local41 = 0; local41<=1; local41 += 1) {
for (int local42 = 0; local42<=0; local42 += 1) {
}
}
}
}else {
if (depth>4) {
if (depth<4) {
for (int local43 = 0; local43<=3; local43 += 1) {
}
}
}
}
}else {
if (depth<=1) {
if (depth<4) {
for (int local44 = 0; local44<=0; local44 += 1) {
if (depth<=3) {
}
}
}else {
for (int local45 = 0; local45<=1; local45 += 1) {
if (depth==3) {
}else {
}
}
}
}
}
if (depth>=3) {
for (int local46 = 0; local46<=2; local46 += 1) {
if (depth>4) {
for (int local47 = 0; local47<=0; local47 += 1) {
if (depth>4) {
}else {
}
}
}else {
if (depth>=2) {
for (int local48 = 0; local48<=2; local48 += 1) {
}
}else {
if (depth==3) {
}else {
}
}
}
}
}else {
for (int local49 = 0; local49<=2; local49 += 1) {
for (int local50 = 0; local50<=1; local50 += 1) {
if (depth==4) {
if (depth<4) {
}
}
}
}
}
for (int local51 = 0; local51<=1; local51 += 1) {
if (depth==1) {
for (int local52 = 0; local52<=1; local52 += 1) {
if (depth>=4) {
if (depth<3) {
}
}else {
for (int local53 = 0; local53<=2; local53 += 1) {
}
}
}
}else {
for (int local54 = 0; local54<=1; local54 += 1) {
if (depth<=1) {
for (int local55 = 0; local55<=1; local55 += 1) {
}
}
}
}
}
}
public Test19Class2 method5(Test19Class3 arg0, int depth) {
if (depth == 0) return Test19Lib.local9;
for (int local56 = 0; local56<=0; local56 += 1) {
if (depth<4) {
this.field2.method4(depth-1);
}else {
if (depth>=1) {
for (int local57 = 0; local57<=2; local57 += 1) {
this.field3=this;
}
}else {
arg0=arg0;
}
}
}
arg0=arg0.field7;
arg0.method9(depth-1);
for (int local58 = 0; local58<=0; local58 += 1) {
arg0.method7(arg0.field7,this,depth-1);
}
if (depth>2) {
this.method3(arg0.field7,depth-1);
}
arg0.field7.method7(arg0.field7,arg0.field2,depth-1);
for (int local59 = 0; local59<=2; local59 += 1) {
if (depth>1) {
if (depth==1) {
if (depth>3) {
if (depth>1) {
}else {
}
}else {
arg0.field7=arg0.field7;
}
}
}
}
arg0.field6.method4(depth-1);
return arg0.field8;
}
}
class Test19Class3 extends Test19Class1 {
public static Test19Class2 field6;
public static Test19Class3 field7;
public Test19Class2 field8;
public static void method6(int depth) {
if (depth == 0) return;
for (int local60 = 0; local60<=2; local60 += 1) {
if (depth==4) {
for (int local61 = 0; local61<=0; local61 += 1) {
field7.field7.method8(depth-1);
}
}
}
field7.method8(depth-1);
}
public static void method7(Test19Class3 arg0, Test19Class2 arg1, int depth) {
if (depth == 0) return;
if (depth>1) {
if (depth>=2) {
arg0.field7.method9(depth-1);
}else {
arg0=arg0.field7;
}
}else {
for (int local62 = 0; local62<=0; local62 += 1) {
field6.field4=arg1.field3;
}
}
for (int local63 = 0; local63<=1; local63 += 1) {
if (depth==4) {
field6.field5=field7.field8;
}
}
field7.field7.method9(depth-1);
field6.field4=arg1.field4;
for (int local64 = 0; local64<=1; local64 += 1) {
for (int local65 = 0; local65<=3; local65 += 1) {
arg0.field2.method4(depth-1);
}
}
for (int local66 = 0; local66<=0; local66 += 1) {
if (depth>3) {
field7.field7.method7(arg0,field7.field8,depth-1);
}else {
if (depth>=2) {
field7.field7.method9(depth-1);
}
}
}
arg1.field2.method1(depth-1);
}
public void method8(int depth) {
if (depth == 0) return;
this.field8=this.field2.method2(this.field7,this.field8,depth-1);
this.field7=this;
for (int local67 = 0; local67<=3; local67 += 1) {
if (depth>3) {
this.method9(depth-1);
}else {
this.field7=this.field7;
}
}
this.field7=this.field7;
this.field7.method6(depth-1);
for (int local68 = 0; local68<=0; local68 += 1) {
if (depth<=3) {
this.field2=this.field6.method2(this,this.field6,depth-1);
}
}
this.field8.method3(this.field7,depth-1);
this.field2=this.field8;
this.field7=this;
}
public void method9(int depth) {
if (depth == 0) return;
if (depth<1) {
if (depth<3) {
this.field7.method8(depth-1);
}else {
if (depth==3) {
if (depth>1) {
for (int local69 = 0; local69<=2; local69 += 1) {
}
}
}else {
for (int local70 = 0; local70<=3; local70 += 1) {
for (int local71 = 0; local71<=2; local71 += 1) {
}
}
}
}
}else {
this.field1.method3(this,depth-1);
}
this.field7=this;
this.field7=this;
if (depth<=4) {
if (depth>1) {
if (depth>=2) {
if (depth==3) {
this.field6=this.field2;
}
}else {
this.field8=this.field2;
}
}else {
this.method7(this,this.field1,depth-1);
}
}else {
if (depth>=2) {
this.field8=this.field8;
}
}
if (depth<2) {
for (int local72 = 0; local72<=1; local72 += 1) {
this.field7.method6(depth-1);
}
}
if (depth==2) {
this.field8.method4(depth-1);
}
}
}
public class Test19{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test19Lib.local1 = new Test19Class1();
Benchmark.alloc(2);
Test19Lib.local2 = new Test19Class1();
Benchmark.alloc(3);
Test19Lib.local3 = new Test19Class1();
Benchmark.alloc(4);
Test19Lib.local4 = new Test19Class1();
Benchmark.alloc(5);
Test19Lib.local5 = new Test19Class2();
Benchmark.alloc(6);
Test19Lib.local6 = new Test19Class2();
Benchmark.alloc(7);
Test19Lib.local7 = new Test19Class2();
Benchmark.alloc(8);
Test19Lib.local8 = new Test19Class2();
Benchmark.alloc(9);
Test19Lib.local9 = new Test19Class2();
Benchmark.alloc(10);
Test19Lib.local10 = new Test19Class3();
Benchmark.alloc(11);
Test19Lib.local11 = new Test19Class3();
Test19Lib.local1.field1 = Test19Lib.local6;
Test19Lib.local1.field2 = Test19Lib.local5;
Test19Lib.local2.field1 = Test19Lib.local7;
Test19Lib.local2.field2 = Test19Lib.local9;
Test19Lib.local3.field1 = Test19Lib.local8;
Test19Lib.local3.field2 = Test19Lib.local7;
Test19Lib.local4.field1 = Test19Lib.local8;
Test19Lib.local4.field2 = Test19Lib.local9;
Test19Lib.local5.field3 = Test19Lib.local6;
Test19Lib.local5.field4 = Test19Lib.local10;
Test19Lib.local5.field5 = Test19Lib.local10;
Test19Lib.local5.field1 = Test19Lib.local6;
Test19Lib.local5.field2 = Test19Lib.local9;
Test19Lib.local6.field3 = Test19Lib.local1;
Test19Lib.local6.field4 = Test19Lib.local10;
Test19Lib.local6.field5 = Test19Lib.local6;
Test19Lib.local6.field1 = Test19Lib.local7;
Test19Lib.local6.field2 = Test19Lib.local8;
Test19Lib.local7.field3 = Test19Lib.local6;
Test19Lib.local7.field4 = Test19Lib.local4;
Test19Lib.local7.field5 = Test19Lib.local9;
Test19Lib.local7.field1 = Test19Lib.local9;
Test19Lib.local7.field2 = Test19Lib.local5;
Test19Lib.local8.field3 = Test19Lib.local5;
Test19Lib.local8.field4 = Test19Lib.local5;
Test19Lib.local8.field5 = Test19Lib.local7;
Test19Lib.local8.field1 = Test19Lib.local7;
Test19Lib.local8.field2 = Test19Lib.local9;
Test19Lib.local9.field3 = Test19Lib.local7;
Test19Lib.local9.field4 = Test19Lib.local8;
Test19Lib.local9.field5 = Test19Lib.local7;
Test19Lib.local9.field1 = Test19Lib.local5;
Test19Lib.local9.field2 = Test19Lib.local9;
Test19Lib.local10.field6 = Test19Lib.local8;
Test19Lib.local10.field7 = Test19Lib.local11;
Test19Lib.local10.field8 = Test19Lib.local7;
Test19Lib.local10.field1 = Test19Lib.local5;
Test19Lib.local10.field2 = Test19Lib.local5;
Test19Lib.local11.field6 = Test19Lib.local6;
Test19Lib.local11.field7 = Test19Lib.local11;
Test19Lib.local11.field8 = Test19Lib.local5;
Test19Lib.local11.field1 = Test19Lib.local6;
Test19Lib.local11.field2 = Test19Lib.local9;
for (int local73 = 0; local73<=0; local73 += 1) {
if (inputValue>=2) {
Test19Lib.local10.method6(3);
}
}
Test19Lib.local10.field7.method6(3);
if (inputValue>=3) {
Test19Lib.local10.method9(3);
}else {
Test19Lib.local10.field8=Test19Lib.local10.field2;
}
for (int local74 = 0; local74<=1; local74 += 1) {
for (int local75 = 0; local75<=1; local75 += 1) {
if (inputValue>2) {
if (inputValue>3) {
Test19Lib.local6=Test19Lib.local10.field1;
}
}
}
}
Test19Lib.local11=Test19Lib.local11.field7;
Test19Lib.local10.method9(3);
Test19Lib.local9=Test19Lib.local3.field2.method5(Test19Lib.local10,3);
for (int local76 = 0; local76<=0; local76 += 1) {
Test19Lib.local1=Test19Lib.local1.field2;
}
if (inputValue<=1) {
if (inputValue>1) {
Test19Lib.local4.field1.method1(3);
}
}else {
Test19Lib.local4=Test19Lib.local7.field2;
}
if (inputValue>2) {
if (inputValue==4) {
if (inputValue<=4) {
if (inputValue>4) {
Test19Lib.local11.field7.method8(3);
}
}else {
for (int local77 = 0; local77<=2; local77 += 1) {
if (inputValue>=3) {
}else {
}
}
}
}else {
Test19Lib.local11.field2.method2(Test19Lib.local10.field7,Test19Lib.local7.field1,3);
}
}else {
Test19Lib.local2.field2.method1(3);
}
Benchmark.test(1,Test19Lib.local1);
Benchmark.test(2,Test19Lib.local2);
Benchmark.test(3,Test19Lib.local3);
Benchmark.test(4,Test19Lib.local4);
Benchmark.test(5,Test19Lib.local5);
Benchmark.test(6,Test19Lib.local6);
Benchmark.test(7,Test19Lib.local7);
Benchmark.test(8,Test19Lib.local8);
Benchmark.test(9,Test19Lib.local9);
Benchmark.test(10,Test19Lib.local10);
Benchmark.test(11,Test19Lib.local11);
Benchmark.test(12,Test19Lib.local1.field1);
Benchmark.test(13,Test19Lib.local1.field2);
Benchmark.test(14,Test19Lib.local2.field1);
Benchmark.test(15,Test19Lib.local2.field2);
Benchmark.test(16,Test19Lib.local3.field1);
Benchmark.test(17,Test19Lib.local3.field2);
Benchmark.test(18,Test19Lib.local4.field1);
Benchmark.test(19,Test19Lib.local4.field2);
Benchmark.test(20,Test19Lib.local5.field3);
Benchmark.test(21,Test19Lib.local5.field4);
Benchmark.test(22,Test19Lib.local5.field5);
Benchmark.test(23,Test19Lib.local5.field1);
Benchmark.test(24,Test19Lib.local5.field2);
Benchmark.test(25,Test19Lib.local6.field3);
Benchmark.test(26,Test19Lib.local6.field4);
Benchmark.test(27,Test19Lib.local6.field5);
Benchmark.test(28,Test19Lib.local6.field1);
Benchmark.test(29,Test19Lib.local6.field2);
Benchmark.test(30,Test19Lib.local7.field3);
Benchmark.test(31,Test19Lib.local7.field4);
Benchmark.test(32,Test19Lib.local7.field5);
Benchmark.test(33,Test19Lib.local7.field1);
Benchmark.test(34,Test19Lib.local7.field2);
Benchmark.test(35,Test19Lib.local8.field3);
Benchmark.test(36,Test19Lib.local8.field4);
Benchmark.test(37,Test19Lib.local8.field5);
Benchmark.test(38,Test19Lib.local8.field1);
Benchmark.test(39,Test19Lib.local8.field2);
Benchmark.test(40,Test19Lib.local9.field3);
Benchmark.test(41,Test19Lib.local9.field4);
Benchmark.test(42,Test19Lib.local9.field5);
Benchmark.test(43,Test19Lib.local9.field1);
Benchmark.test(44,Test19Lib.local9.field2);
Benchmark.test(45,Test19Lib.local10.field6);
Benchmark.test(46,Test19Lib.local10.field7);
Benchmark.test(47,Test19Lib.local10.field8);
Benchmark.test(48,Test19Lib.local10.field1);
Benchmark.test(49,Test19Lib.local10.field2);
Benchmark.test(50,Test19Lib.local11.field6);
Benchmark.test(51,Test19Lib.local11.field7);
Benchmark.test(52,Test19Lib.local11.field8);
Benchmark.test(53,Test19Lib.local11.field1);
Benchmark.test(54,Test19Lib.local11.field2);
Benchmark.print();
}
}
