package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test28Lib{
public static Test28Class1 local1;
public static Test28Class1 local2;
public static Test28Class1 local3;
public static Test28Class2 local4;
public static Test28Class2 local5;
public static Test28Class2 local6;
public static Test28Class2 local7;
public static Test28Class2 local8;
public static Test28Class3 local9;
public static Test28Class3 local10;
public static Test28Class3 local11;
public static Test28Class3 local12;
public static Test28Class4 local13;
public static Test28Class4 local14;
public static Test28Class4 local15;
public static Test28Class4 local16;
public static Test28Class4 local17;
public static Test28Class5 local18;
public static Test28Class5 local19;
public static Test28Class5 local20;
public static Test28Class5 local21;
public static Test28Class5 local22;
public static Test28Class5 local23;
public static Test28Class5 local24;
public static Test28Class5 local25;
public static Test28Class5 local26;
}
class Test28Class1 extends BasicClass {
public static Test28Class4 field1;
public static Test28Class1 method1(int depth) {
if (depth == 0) return Test28Lib.local24;
for (int local27 = 0; local27<=3; local27 += 1) {
if (depth==2) {
field1.field8.method4(depth-1);
}
}
for (int local28 = 0; local28<=2; local28 += 1) {
field1.field8=field1.field8;
}
field1.field7=field1.field9;
if (depth==3) {
field1.field9=field1.field9;
}
return field1.field8;
}
public void method2(Test28Class5 arg0, int depth) {
if (depth == 0) return;
arg0.field8.method4(depth-1);
arg0.field10.method4(depth-1);
arg0.method13(arg0,arg0.field8,depth-1);
if (depth==3) {
for (int local29 = 0; local29<=0; local29 += 1) {
arg0.field10=arg0.field10;
}
}
for (int local30 = 0; local30<=3; local30 += 1) {
for (int local31 = 0; local31<=0; local31 += 1) {
if (depth<1) {
arg0=arg0.field9;
}else {
for (int local32 = 0; local32<=1; local32 += 1) {
for (int local33 = 0; local33<=3; local33 += 1) {
}
}
}
}
}
for (int local34 = 0; local34<=3; local34 += 1) {
for (int local35 = 0; local35<=0; local35 += 1) {
if (depth>4) {
if (depth<=2) {
arg0.field8=arg0.field10;
}
}
}
}
this.field1=arg0.field9;
arg0=arg0;
arg0.field9=arg0.field9;
}
public static Test28Class3 method3(Test28Class3 arg0, Test28Class1 arg1, int depth) {
if (depth == 0) return Test28Lib.local9;
arg0.method7(depth-1);
arg0.field4.method10(field1.field8,arg0,depth-1);
field1.field8.method4(depth-1);
field1.field7=arg0.field2.method1(depth-1);
for (int local36 = 0; local36<=2; local36 += 1) {
if (depth>1) {
for (int local37 = 0; local37<=0; local37 += 1) {
for (int local38 = 0; local38<=3; local38 += 1) {
for (int local39 = 0; local39<=0; local39 += 1) {
}
}
}
}
}
if (depth>=4) {
for (int local40 = 0; local40<=1; local40 += 1) {
if (depth<=3) {
field1.field9.method13(arg0.field3,arg0.field2,depth-1);
}
}
}else {
arg0.field3=arg0.field4;
}
return arg0;
}
}
class Test28Class2 extends Test28Class1 {
public static Test28Class3 field2;
public Test28Class5 field3;
public void method4(int depth) {
if (depth == 0) return;
if (depth<=3) {
for (int local41 = 0; local41<=0; local41 += 1) {
this.field3=this.field3;
}
}else {
this.field2=this.field2;
}
}
}
class Test28Class3 extends Test28Class2 {
public Test28Class5 field4;
public Test28Class2 field5;
public static Test28Class1 field6;
public Test28Class4 method5(Test28Class1 arg0, int depth) {
if (depth == 0) return Test28Lib.local17;
for (int local42 = 0; local42<=3; local42 += 1) {
if (depth>=3) {
for (int local43 = 0; local43<=3; local43 += 1) {
this.field3.method11(arg0.field1,depth-1);
}
}
}
for (int local44 = 0; local44<=0; local44 += 1) {
for (int local45 = 0; local45<=1; local45 += 1) {
this.method4(depth-1);
}
}
if (depth==2) {
for (int local46 = 0; local46<=0; local46 += 1) {
this.field6=this.field3;
}
}else {
for (int local47 = 0; local47<=1; local47 += 1) {
this.field3.method13(this.field3,this.field2,depth-1);
}
}
this.field4.method12(depth-1);
for (int local48 = 0; local48<=1; local48 += 1) {
for (int local49 = 0; local49<=2; local49 += 1) {
this.field1.method10(this.field2,this.field2,depth-1);
}
}
this.method6(depth-1);
this.field5=this.field2;
for (int local50 = 0; local50<=2; local50 += 1) {
for (int local51 = 0; local51<=1; local51 += 1) {
for (int local52 = 0; local52<=0; local52 += 1) {
arg0=arg0.method1(depth-1);
}
}
}
return this.field3;
}
public Test28Class2 method6(int depth) {
if (depth == 0) return Test28Lib.local5;
return this.field5;
}
public void method7(int depth) {
if (depth == 0) return;
if (depth>=2) {
this.field5=this.field5;
}
this.field1.method2(this.field3,depth-1);
}
}
class Test28Class4 extends Test28Class1 {
public Test28Class1 field7;
public Test28Class2 field8;
public Test28Class5 field9;
public Test28Class3 method8(int depth) {
if (depth == 0) return Test28Lib.local9;
for (int local53 = 0; local53<=0; local53 += 1) {
for (int local54 = 0; local54<=3; local54 += 1) {
this.field9=this.field9;
}
}
this.field1=this;
for (int local55 = 0; local55<=0; local55 += 1) {
if (depth==3) {
if (depth==3) {
for (int local56 = 0; local56<=1; local56 += 1) {
if (depth<1) {
}else {
}
}
}else {
this.field9.method13(this.field9,this.field8,depth-1);
}
}
}
this.field9.method12(depth-1);
this.field1=this;
this.field9.method8(depth-1);
for (int local57 = 0; local57<=2; local57 += 1) {
this.field8=this.field8;
}
return Test28Lib.local11;
}
public static void method9(Test28Class2 arg0, Test28Class1 arg1, int depth) {
if (depth == 0) return;
arg0.field1=field1.field9;
}
public static void method10(Test28Class2 arg0, Test28Class3 arg1, int depth) {
if (depth == 0) return;
for (int local58 = 0; local58<=2; local58 += 1) {
if (depth<1) {
arg1.field6=arg1.field2;
}else {
if (depth<=3) {
field1.field9=arg1.field3;
}
}
}
if (depth<1) {
field1.field7=arg0.field2;
}else {
if (depth>=3) {
if (depth==3) {
arg0.field2=arg0.field2;
}
}else {
for (int local59 = 0; local59<=1; local59 += 1) {
if (depth>4) {
field1.field9.method13(arg0.field3,field1.field8,depth-1);
}else {
if (depth<=1) {
}
}
}
}
}
for (int local60 = 0; local60<=0; local60 += 1) {
for (int local61 = 0; local61<=2; local61 += 1) {
field1.field1=arg1.field4;
}
}
}
}
class Test28Class5 extends Test28Class4 {
public static Test28Class2 field10;
public static Test28Class4 method11(Test28Class4 arg0, int depth) {
if (depth == 0) return Test28Lib.local16;
return field1.field1;
}
public static void method12(int depth) {
if (depth == 0) return;
field10.field2=field10.field2;
field1.field7=field1.field1;
}
public static void method13(Test28Class5 arg0, Test28Class2 arg1, int depth) {
if (depth == 0) return;
for (int local62 = 0; local62<=1; local62 += 1) {
arg0.field7=arg0.field9;
}
if (depth<3) {
field10.field3.method12(depth-1);
}else {
for (int local63 = 0; local63<=1; local63 += 1) {
arg0.field7=arg1;
}
}
if (depth>=1) {
field10.field1=field1.field9;
}else {
arg1.method4(depth-1);
}
for (int local64 = 0; local64<=0; local64 += 1) {
for (int local65 = 0; local65<=0; local65 += 1) {
if (depth>=2) {
if (depth<2) {
field1.field9.method12(depth-1);
}
}
}
}
field10.field2.method7(depth-1);
field10.field2=field10.field2;
if (depth<=2) {
arg1.method2(arg0.field9,depth-1);
}
if (depth<4) {
if (depth<=3) {
for (int local66 = 0; local66<=3; local66 += 1) {
field10.field2=arg0.field9.method3(arg1.field2,field10.field1,depth-1);
}
}else {
for (int local67 = 0; local67<=3; local67 += 1) {
for (int local68 = 0; local68<=3; local68 += 1) {
for (int local69 = 0; local69<=0; local69 += 1) {
}
}
}
}
}
}
}
public class Test28{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test28Lib.local1 = new Test28Class1();
Benchmark.alloc(2);
Test28Lib.local2 = new Test28Class1();
Benchmark.alloc(3);
Test28Lib.local3 = new Test28Class1();
Benchmark.alloc(4);
Test28Lib.local4 = new Test28Class2();
Benchmark.alloc(5);
Test28Lib.local5 = new Test28Class2();
Benchmark.alloc(6);
Test28Lib.local6 = new Test28Class2();
Benchmark.alloc(7);
Test28Lib.local7 = new Test28Class2();
Benchmark.alloc(8);
Test28Lib.local8 = new Test28Class2();
Benchmark.alloc(9);
Test28Lib.local9 = new Test28Class3();
Benchmark.alloc(10);
Test28Lib.local10 = new Test28Class3();
Benchmark.alloc(11);
Test28Lib.local11 = new Test28Class3();
Benchmark.alloc(12);
Test28Lib.local12 = new Test28Class3();
Benchmark.alloc(13);
Test28Lib.local13 = new Test28Class4();
Benchmark.alloc(14);
Test28Lib.local14 = new Test28Class4();
Benchmark.alloc(15);
Test28Lib.local15 = new Test28Class4();
Benchmark.alloc(16);
Test28Lib.local16 = new Test28Class4();
Benchmark.alloc(17);
Test28Lib.local17 = new Test28Class4();
Benchmark.alloc(18);
Test28Lib.local18 = new Test28Class5();
Benchmark.alloc(19);
Test28Lib.local19 = new Test28Class5();
Benchmark.alloc(20);
Test28Lib.local20 = new Test28Class5();
Benchmark.alloc(21);
Test28Lib.local21 = new Test28Class5();
Benchmark.alloc(22);
Test28Lib.local22 = new Test28Class5();
Benchmark.alloc(23);
Test28Lib.local23 = new Test28Class5();
Benchmark.alloc(24);
Test28Lib.local24 = new Test28Class5();
Benchmark.alloc(25);
Test28Lib.local25 = new Test28Class5();
Benchmark.alloc(26);
Test28Lib.local26 = new Test28Class5();
Test28Lib.local1.field1 = Test28Lib.local19;
Test28Lib.local2.field1 = Test28Lib.local17;
Test28Lib.local3.field1 = Test28Lib.local23;
Test28Lib.local4.field2 = Test28Lib.local11;
Test28Lib.local4.field3 = Test28Lib.local22;
Test28Lib.local4.field1 = Test28Lib.local13;
Test28Lib.local5.field2 = Test28Lib.local9;
Test28Lib.local5.field3 = Test28Lib.local21;
Test28Lib.local5.field1 = Test28Lib.local17;
Test28Lib.local6.field2 = Test28Lib.local9;
Test28Lib.local6.field3 = Test28Lib.local26;
Test28Lib.local6.field1 = Test28Lib.local25;
Test28Lib.local7.field2 = Test28Lib.local9;
Test28Lib.local7.field3 = Test28Lib.local22;
Test28Lib.local7.field1 = Test28Lib.local20;
Test28Lib.local8.field2 = Test28Lib.local12;
Test28Lib.local8.field3 = Test28Lib.local20;
Test28Lib.local8.field1 = Test28Lib.local15;
Test28Lib.local9.field4 = Test28Lib.local25;
Test28Lib.local9.field5 = Test28Lib.local4;
Test28Lib.local9.field6 = Test28Lib.local24;
Test28Lib.local9.field2 = Test28Lib.local11;
Test28Lib.local9.field3 = Test28Lib.local25;
Test28Lib.local9.field1 = Test28Lib.local23;
Test28Lib.local10.field4 = Test28Lib.local19;
Test28Lib.local10.field5 = Test28Lib.local12;
Test28Lib.local10.field6 = Test28Lib.local16;
Test28Lib.local10.field2 = Test28Lib.local12;
Test28Lib.local10.field3 = Test28Lib.local26;
Test28Lib.local10.field1 = Test28Lib.local16;
Test28Lib.local11.field4 = Test28Lib.local19;
Test28Lib.local11.field5 = Test28Lib.local10;
Test28Lib.local11.field6 = Test28Lib.local23;
Test28Lib.local11.field2 = Test28Lib.local11;
Test28Lib.local11.field3 = Test28Lib.local19;
Test28Lib.local11.field1 = Test28Lib.local15;
Test28Lib.local12.field4 = Test28Lib.local19;
Test28Lib.local12.field5 = Test28Lib.local7;
Test28Lib.local12.field6 = Test28Lib.local14;
Test28Lib.local12.field2 = Test28Lib.local12;
Test28Lib.local12.field3 = Test28Lib.local22;
Test28Lib.local12.field1 = Test28Lib.local23;
Test28Lib.local13.field7 = Test28Lib.local4;
Test28Lib.local13.field8 = Test28Lib.local6;
Test28Lib.local13.field9 = Test28Lib.local24;
Test28Lib.local13.field1 = Test28Lib.local13;
Test28Lib.local14.field7 = Test28Lib.local20;
Test28Lib.local14.field8 = Test28Lib.local12;
Test28Lib.local14.field9 = Test28Lib.local19;
Test28Lib.local14.field1 = Test28Lib.local23;
Test28Lib.local15.field7 = Test28Lib.local1;
Test28Lib.local15.field8 = Test28Lib.local5;
Test28Lib.local15.field9 = Test28Lib.local21;
Test28Lib.local15.field1 = Test28Lib.local14;
Test28Lib.local16.field7 = Test28Lib.local16;
Test28Lib.local16.field8 = Test28Lib.local10;
Test28Lib.local16.field9 = Test28Lib.local24;
Test28Lib.local16.field1 = Test28Lib.local26;
Test28Lib.local17.field7 = Test28Lib.local26;
Test28Lib.local17.field8 = Test28Lib.local6;
Test28Lib.local17.field9 = Test28Lib.local21;
Test28Lib.local17.field1 = Test28Lib.local17;
Test28Lib.local18.field10 = Test28Lib.local7;
Test28Lib.local18.field7 = Test28Lib.local16;
Test28Lib.local18.field8 = Test28Lib.local8;
Test28Lib.local18.field9 = Test28Lib.local19;
Test28Lib.local18.field1 = Test28Lib.local25;
Test28Lib.local19.field10 = Test28Lib.local12;
Test28Lib.local19.field7 = Test28Lib.local2;
Test28Lib.local19.field8 = Test28Lib.local10;
Test28Lib.local19.field9 = Test28Lib.local20;
Test28Lib.local19.field1 = Test28Lib.local20;
Test28Lib.local20.field10 = Test28Lib.local12;
Test28Lib.local20.field7 = Test28Lib.local5;
Test28Lib.local20.field8 = Test28Lib.local9;
Test28Lib.local20.field9 = Test28Lib.local22;
Test28Lib.local20.field1 = Test28Lib.local20;
Test28Lib.local21.field10 = Test28Lib.local9;
Test28Lib.local21.field7 = Test28Lib.local19;
Test28Lib.local21.field8 = Test28Lib.local10;
Test28Lib.local21.field9 = Test28Lib.local23;
Test28Lib.local21.field1 = Test28Lib.local21;
Test28Lib.local22.field10 = Test28Lib.local11;
Test28Lib.local22.field7 = Test28Lib.local25;
Test28Lib.local22.field8 = Test28Lib.local5;
Test28Lib.local22.field9 = Test28Lib.local21;
Test28Lib.local22.field1 = Test28Lib.local18;
Test28Lib.local23.field10 = Test28Lib.local11;
Test28Lib.local23.field7 = Test28Lib.local10;
Test28Lib.local23.field8 = Test28Lib.local4;
Test28Lib.local23.field9 = Test28Lib.local21;
Test28Lib.local23.field1 = Test28Lib.local25;
Test28Lib.local24.field10 = Test28Lib.local11;
Test28Lib.local24.field7 = Test28Lib.local8;
Test28Lib.local24.field8 = Test28Lib.local11;
Test28Lib.local24.field9 = Test28Lib.local22;
Test28Lib.local24.field1 = Test28Lib.local26;
Test28Lib.local25.field10 = Test28Lib.local4;
Test28Lib.local25.field7 = Test28Lib.local1;
Test28Lib.local25.field8 = Test28Lib.local9;
Test28Lib.local25.field9 = Test28Lib.local22;
Test28Lib.local25.field1 = Test28Lib.local22;
Test28Lib.local26.field10 = Test28Lib.local12;
Test28Lib.local26.field7 = Test28Lib.local14;
Test28Lib.local26.field8 = Test28Lib.local5;
Test28Lib.local26.field9 = Test28Lib.local23;
Test28Lib.local26.field1 = Test28Lib.local17;
if (inputValue>=1) {
Test28Lib.local11.field2=Test28Lib.local12.field4.method3(Test28Lib.local10,Test28Lib.local2.field1,3);
}
if (inputValue>=1) {
if (inputValue<=3) {
if (inputValue>1) {
Test28Lib.local22.field8=Test28Lib.local12.field2;
}else {
if (inputValue>=3) {
Test28Lib.local24.field10=Test28Lib.local8.field2;
}else {
Test28Lib.local22.method12(3);
}
}
}
}
Test28Lib.local11.field1.method9(Test28Lib.local11,Test28Lib.local24.field9,3);
if (inputValue==1) {
for (int local70 = 0; local70<=1; local70 += 1) {
if (inputValue>=2) {
Test28Lib.local12.field2.method7(3);
}
}
}
Test28Lib.local19.field7=Test28Lib.local9.field5;
Test28Lib.local16.field9=Test28Lib.local21.field9;
Test28Lib.local21.field7=Test28Lib.local2.field1.method1(3);
if (inputValue>=3) {
if (inputValue<=2) {
for (int local71 = 0; local71<=3; local71 += 1) {
Test28Lib.local20.field7=Test28Lib.local12.field3.method1(3);
}
}else {
Test28Lib.local12=Test28Lib.local8.field2;
}
}else {
for (int local72 = 0; local72<=0; local72 += 1) {
if (inputValue<3) {
Test28Lib.local9.field3=Test28Lib.local6.field3;
}
}
}
if (inputValue>=2) {
if (inputValue==3) {
Test28Lib.local14.field7=Test28Lib.local20.field8;
}else {
if (inputValue>3) {
Test28Lib.local24.method13(Test28Lib.local12.field4,Test28Lib.local14.field8,3);
}
}
}else {
for (int local73 = 0; local73<=1; local73 += 1) {
for (int local74 = 0; local74<=3; local74 += 1) {
Test28Lib.local6.field2=Test28Lib.local8.field2;
}
}
}
Test28Lib.local24.field8=Test28Lib.local13.method8(3);
Benchmark.test(1,Test28Lib.local1);
Benchmark.test(2,Test28Lib.local2);
Benchmark.test(3,Test28Lib.local3);
Benchmark.test(4,Test28Lib.local4);
Benchmark.test(5,Test28Lib.local5);
Benchmark.test(6,Test28Lib.local6);
Benchmark.test(7,Test28Lib.local7);
Benchmark.test(8,Test28Lib.local8);
Benchmark.test(9,Test28Lib.local9);
Benchmark.test(10,Test28Lib.local10);
Benchmark.test(11,Test28Lib.local11);
Benchmark.test(12,Test28Lib.local12);
Benchmark.test(13,Test28Lib.local13);
Benchmark.test(14,Test28Lib.local14);
Benchmark.test(15,Test28Lib.local15);
Benchmark.test(16,Test28Lib.local16);
Benchmark.test(17,Test28Lib.local17);
Benchmark.test(18,Test28Lib.local18);
Benchmark.test(19,Test28Lib.local19);
Benchmark.test(20,Test28Lib.local20);
Benchmark.test(21,Test28Lib.local21);
Benchmark.test(22,Test28Lib.local22);
Benchmark.test(23,Test28Lib.local23);
Benchmark.test(24,Test28Lib.local24);
Benchmark.test(25,Test28Lib.local25);
Benchmark.test(26,Test28Lib.local26);
Benchmark.test(27,Test28Lib.local1.field1);
Benchmark.test(28,Test28Lib.local2.field1);
Benchmark.test(29,Test28Lib.local3.field1);
Benchmark.test(30,Test28Lib.local4.field2);
Benchmark.test(31,Test28Lib.local4.field3);
Benchmark.test(32,Test28Lib.local4.field1);
Benchmark.test(33,Test28Lib.local5.field2);
Benchmark.test(34,Test28Lib.local5.field3);
Benchmark.test(35,Test28Lib.local5.field1);
Benchmark.test(36,Test28Lib.local6.field2);
Benchmark.test(37,Test28Lib.local6.field3);
Benchmark.test(38,Test28Lib.local6.field1);
Benchmark.test(39,Test28Lib.local7.field2);
Benchmark.test(40,Test28Lib.local7.field3);
Benchmark.test(41,Test28Lib.local7.field1);
Benchmark.test(42,Test28Lib.local8.field2);
Benchmark.test(43,Test28Lib.local8.field3);
Benchmark.test(44,Test28Lib.local8.field1);
Benchmark.test(45,Test28Lib.local9.field4);
Benchmark.test(46,Test28Lib.local9.field5);
Benchmark.test(47,Test28Lib.local9.field6);
Benchmark.test(48,Test28Lib.local9.field2);
Benchmark.test(49,Test28Lib.local9.field3);
Benchmark.test(50,Test28Lib.local9.field1);
Benchmark.test(51,Test28Lib.local10.field4);
Benchmark.test(52,Test28Lib.local10.field5);
Benchmark.test(53,Test28Lib.local10.field6);
Benchmark.test(54,Test28Lib.local10.field2);
Benchmark.test(55,Test28Lib.local10.field3);
Benchmark.test(56,Test28Lib.local10.field1);
Benchmark.test(57,Test28Lib.local11.field4);
Benchmark.test(58,Test28Lib.local11.field5);
Benchmark.test(59,Test28Lib.local11.field6);
Benchmark.test(60,Test28Lib.local11.field2);
Benchmark.test(61,Test28Lib.local11.field3);
Benchmark.test(62,Test28Lib.local11.field1);
Benchmark.test(63,Test28Lib.local12.field4);
Benchmark.test(64,Test28Lib.local12.field5);
Benchmark.test(65,Test28Lib.local12.field6);
Benchmark.test(66,Test28Lib.local12.field2);
Benchmark.test(67,Test28Lib.local12.field3);
Benchmark.test(68,Test28Lib.local12.field1);
Benchmark.test(69,Test28Lib.local13.field7);
Benchmark.test(70,Test28Lib.local13.field8);
Benchmark.test(71,Test28Lib.local13.field9);
Benchmark.test(72,Test28Lib.local13.field1);
Benchmark.test(73,Test28Lib.local14.field7);
Benchmark.test(74,Test28Lib.local14.field8);
Benchmark.test(75,Test28Lib.local14.field9);
Benchmark.test(76,Test28Lib.local14.field1);
Benchmark.test(77,Test28Lib.local15.field7);
Benchmark.test(78,Test28Lib.local15.field8);
Benchmark.test(79,Test28Lib.local15.field9);
Benchmark.test(80,Test28Lib.local15.field1);
Benchmark.test(81,Test28Lib.local16.field7);
Benchmark.test(82,Test28Lib.local16.field8);
Benchmark.test(83,Test28Lib.local16.field9);
Benchmark.test(84,Test28Lib.local16.field1);
Benchmark.test(85,Test28Lib.local17.field7);
Benchmark.test(86,Test28Lib.local17.field8);
Benchmark.test(87,Test28Lib.local17.field9);
Benchmark.test(88,Test28Lib.local17.field1);
Benchmark.test(89,Test28Lib.local18.field10);
Benchmark.test(90,Test28Lib.local18.field7);
Benchmark.test(91,Test28Lib.local18.field8);
Benchmark.test(92,Test28Lib.local18.field9);
Benchmark.test(93,Test28Lib.local18.field1);
Benchmark.test(94,Test28Lib.local19.field10);
Benchmark.test(95,Test28Lib.local19.field7);
Benchmark.test(96,Test28Lib.local19.field8);
Benchmark.test(97,Test28Lib.local19.field9);
Benchmark.test(98,Test28Lib.local19.field1);
Benchmark.test(99,Test28Lib.local20.field10);
Benchmark.test(100,Test28Lib.local20.field7);
Benchmark.test(101,Test28Lib.local20.field8);
Benchmark.test(102,Test28Lib.local20.field9);
Benchmark.test(103,Test28Lib.local20.field1);
Benchmark.test(104,Test28Lib.local21.field10);
Benchmark.test(105,Test28Lib.local21.field7);
Benchmark.test(106,Test28Lib.local21.field8);
Benchmark.test(107,Test28Lib.local21.field9);
Benchmark.test(108,Test28Lib.local21.field1);
Benchmark.test(109,Test28Lib.local22.field10);
Benchmark.test(110,Test28Lib.local22.field7);
Benchmark.test(111,Test28Lib.local22.field8);
Benchmark.test(112,Test28Lib.local22.field9);
Benchmark.test(113,Test28Lib.local22.field1);
Benchmark.test(114,Test28Lib.local23.field10);
Benchmark.test(115,Test28Lib.local23.field7);
Benchmark.test(116,Test28Lib.local23.field8);
Benchmark.test(117,Test28Lib.local23.field9);
Benchmark.test(118,Test28Lib.local23.field1);
Benchmark.test(119,Test28Lib.local24.field10);
Benchmark.test(120,Test28Lib.local24.field7);
Benchmark.test(121,Test28Lib.local24.field8);
Benchmark.test(122,Test28Lib.local24.field9);
Benchmark.test(123,Test28Lib.local24.field1);
Benchmark.test(124,Test28Lib.local25.field10);
Benchmark.test(125,Test28Lib.local25.field7);
Benchmark.test(126,Test28Lib.local25.field8);
Benchmark.test(127,Test28Lib.local25.field9);
Benchmark.test(128,Test28Lib.local25.field1);
Benchmark.test(129,Test28Lib.local26.field10);
Benchmark.test(130,Test28Lib.local26.field7);
Benchmark.test(131,Test28Lib.local26.field8);
Benchmark.test(132,Test28Lib.local26.field9);
Benchmark.test(133,Test28Lib.local26.field1);
Benchmark.print();
}
}
