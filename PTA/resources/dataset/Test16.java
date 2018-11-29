package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test16Lib{
public static Test16Class1 local1;
public static Test16Class1 local2;
public static Test16Class2 local3;
public static Test16Class2 local4;
public static Test16Class2 local5;
public static Test16Class2 local6;
public static Test16Class2 local7;
public static Test16Class2 local8;
public static Test16Class2 local9;
public static Test16Class3 local10;
public static Test16Class3 local11;
public static Test16Class3 local12;
public static Test16Class3 local13;
public static Test16Class3 local14;
public static Test16Class4 local15;
public static Test16Class5 local16;
public static Test16Class5 local17;
public static Test16Class5 local18;
public static Test16Class5 local19;
public static Test16Class5 local20;
public static Test16Class5 local21;
public static Test16Class5 local22;
public static Test16Class5 local23;
public static Test16Class5 local24;
}
class Test16Class1 extends BasicClass {
public static Test16Class1 field1;
public Test16Class3 field2;
public Test16Class5 field3;
public Test16Class4 field4;
public void method1(Test16Class3 arg0, int depth) {
if (depth == 0) return;
this.field1.method1(arg0.field5,depth-1);
if (depth>1) {
arg0.field7=arg0.field5;
}else {
if (depth<1) {
arg0.field3.method11(arg0.field5,this.field2,depth-1);
}else {
if (depth<=3) {
arg0.field1=this.field4.method9(depth-1);
}
}
}
for (int local25 = 0; local25<=2; local25 += 1) {
for (int local26 = 0; local26<=2; local26 += 1) {
for (int local27 = 0; local27<=0; local27 += 1) {
this.field4.method8(arg0,this.field2,depth-1);
}
}
}
if (depth>=4) {
this.field3=arg0.field3;
}else {
if (depth<=1) {
arg0.field5.method4(depth-1);
}
}
}
public static void method2(Test16Class4 arg0, int depth) {
if (depth == 0) return;
field1=field1.field2.method6(arg0.field2,depth-1);
for (int local28 = 0; local28<=3; local28 += 1) {
arg0.field10=arg0;
}
}
public static void method3(Test16Class4 arg0, Test16Class3 arg1, int depth) {
if (depth == 0) return;
if (depth<3) {
if (depth<1) {
arg1.field5.method4(depth-1);
}else {
for (int local29 = 0; local29<=2; local29 += 1) {
for (int local30 = 0; local30<=2; local30 += 1) {
arg0.field11.method1(arg1,depth-1);
}
}
}
}
if (depth>3) {
if (depth>=3) {
for (int local31 = 0; local31<=3; local31 += 1) {
field1.field4=arg0.field11;
}
}else {
for (int local32 = 0; local32<=3; local32 += 1) {
arg1.field1=arg0.field4.method9(depth-1);
}
}
}else {
if (depth<=1) {
if (depth>=4) {
arg1.field5=field1.field2;
}else {
arg0.field11.method3(field1.field4,arg1.field6,depth-1);
}
}else {
arg1.field3=arg1.field3;
}
}
for (int local33 = 0; local33<=0; local33 += 1) {
for (int local34 = 0; local34<=2; local34 += 1) {
if (depth<=3) {
arg0.field11.method3(arg0.field11,arg1.field2,depth-1);
}
}
}
}
}
class Test16Class2 extends Test16Class1 {
public Test16Class3 field5;
public void method4(int depth) {
if (depth == 0) return;
this.field4.method3(this.field4,this.field5,depth-1);
this.field4=this.field4.method8(this.field2,this.field2,depth-1);
}
}
class Test16Class3 extends Test16Class2 {
public Test16Class3 field6;
public static Test16Class2 field7;
public Test16Class3 field8;
public static Test16Class1 field9;
public static void method5(int depth) {
if (depth == 0) return;
field7=field7;
if (depth>4) {
field7.field4=field9.field4;
}else {
field7.field4.method8(field1.field2,field7.field2,depth-1);
}
if (depth<3) {
field7.field3.method11(field7.field5,field1.field2,depth-1);
}else {
if (depth<4) {
for (int local35 = 0; local35<=0; local35 += 1) {
field7.field2.method4(depth-1);
}
}
}
if (depth>=4) {
if (depth<3) {
field7.field5.method5(depth-1);
}
}else {
if (depth>2) {
if (depth<=4) {
field9.field3.method11(field9.field2,field1.field2,depth-1);
}else {
field7=field1.field2;
}
}else {
if (depth<2) {
field7.field3.method10(depth-1);
}else {
if (depth==3) {
field1.field2=field7.field5;
}else {
field7.field4=field9.field4;
}
}
}
}
field1=field7.field4.method8(field7.field5,field7.field5,depth-1);
}
public Test16Class2 method6(Test16Class3 arg0, int depth) {
if (depth == 0) return Test16Lib.local14;
for (int local36 = 0; local36<=0; local36 += 1) {
arg0.field5=arg0.field8;
}
if (depth<2) {
for (int local37 = 0; local37<=3; local37 += 1) {
this.field3=this.field3;
}
}
if (depth>=4) {
for (int local38 = 0; local38<=1; local38 += 1) {
for (int local39 = 0; local39<=0; local39 += 1) {
for (int local40 = 0; local40<=3; local40 += 1) {
for (int local41 = 0; local41<=2; local41 += 1) {
}
}
}
}
}
for (int local42 = 0; local42<=0; local42 += 1) {
for (int local43 = 0; local43<=0; local43 += 1) {
for (int local44 = 0; local44<=2; local44 += 1) {
this.field3.method11(this.field8,arg0.field8,depth-1);
}
}
}
return arg0.field6;
}
public Test16Class3 method7(Test16Class2 arg0, Test16Class2 arg1, int depth) {
if (depth == 0) return Test16Lib.local10;
return this.field6;
}
}
class Test16Class4 extends Test16Class1 {
public static Test16Class1 field10;
public static Test16Class4 field11;
public Test16Class1 field12;
public static Test16Class4 method8(Test16Class3 arg0, Test16Class3 arg1, int depth) {
if (depth == 0) return Test16Lib.local15;
field11.field1=field11;
return field1.field4;
}
public static Test16Class1 method9(int depth) {
if (depth == 0) return Test16Lib.local19;
field1.field3=field1.field3;
field11.field2=field10.field2;
if (depth>=2) {
field1.field4=field1.field4;
}else {
field11.field10.method3(field11,field1.field2,depth-1);
}
if (depth<=4) {
for (int local45 = 0; local45<=3; local45 += 1) {
for (int local46 = 0; local46<=0; local46 += 1) {
if (depth<=4) {
if (depth==1) {
}
}else {
for (int local47 = 0; local47<=0; local47 += 1) {
}
}
}
}
}
if (depth==1) {
for (int local48 = 0; local48<=3; local48 += 1) {
field10.field3=field1.field3;
}
}
field1.field3.method3(field1.field4,field11.field2,depth-1);
if (depth==4) {
for (int local49 = 0; local49<=0; local49 += 1) {
for (int local50 = 0; local50<=3; local50 += 1) {
for (int local51 = 0; local51<=0; local51 += 1) {
field10.field2=field10.field2;
}
}
}
}else {
for (int local52 = 0; local52<=1; local52 += 1) {
if (depth<=1) {
for (int local53 = 0; local53<=1; local53 += 1) {
field11.field12=field11.field4;
}
}else {
for (int local54 = 0; local54<=3; local54 += 1) {
for (int local55 = 0; local55<=2; local55 += 1) {
}
}
}
}
}
return field10.field1;
}
}
class Test16Class5 extends Test16Class1 {
public Test16Class5 field13;
public void method10(int depth) {
if (depth == 0) return;
for (int local56 = 0; local56<=2; local56 += 1) {
this.field1=this.field2.method6(this.field2,depth-1);
}
for (int local57 = 0; local57<=1; local57 += 1) {
if (depth==2) {
this.field1=this.field2;
}
}
this.field1.method1(this.field2,depth-1);
for (int local58 = 0; local58<=1; local58 += 1) {
this.field4=this.field4;
}
}
public void method11(Test16Class2 arg0, Test16Class2 arg1, int depth) {
if (depth == 0) return;
for (int local59 = 0; local59<=0; local59 += 1) {
this.field4=arg1.field4.method8(this.field2,this.field2,depth-1);
}
arg1.field5.method2(arg0.field4,depth-1);
for (int local60 = 0; local60<=1; local60 += 1) {
arg1.field5=arg0.field5;
}
if (depth>=3) {
arg0.field2=arg1.field2;
}else {
for (int local61 = 0; local61<=0; local61 += 1) {
this.field3=arg0.field3;
}
}
if (depth>=1) {
arg1.field4=this.field4;
}
}
}
public class Test16{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test16Lib.local1 = new Test16Class1();
Benchmark.alloc(2);
Test16Lib.local2 = new Test16Class1();
Benchmark.alloc(3);
Test16Lib.local3 = new Test16Class2();
Benchmark.alloc(4);
Test16Lib.local4 = new Test16Class2();
Benchmark.alloc(5);
Test16Lib.local5 = new Test16Class2();
Benchmark.alloc(6);
Test16Lib.local6 = new Test16Class2();
Benchmark.alloc(7);
Test16Lib.local7 = new Test16Class2();
Benchmark.alloc(8);
Test16Lib.local8 = new Test16Class2();
Benchmark.alloc(9);
Test16Lib.local9 = new Test16Class2();
Benchmark.alloc(10);
Test16Lib.local10 = new Test16Class3();
Benchmark.alloc(11);
Test16Lib.local11 = new Test16Class3();
Benchmark.alloc(12);
Test16Lib.local12 = new Test16Class3();
Benchmark.alloc(13);
Test16Lib.local13 = new Test16Class3();
Benchmark.alloc(14);
Test16Lib.local14 = new Test16Class3();
Benchmark.alloc(15);
Test16Lib.local15 = new Test16Class4();
Benchmark.alloc(16);
Test16Lib.local16 = new Test16Class5();
Benchmark.alloc(17);
Test16Lib.local17 = new Test16Class5();
Benchmark.alloc(18);
Test16Lib.local18 = new Test16Class5();
Benchmark.alloc(19);
Test16Lib.local19 = new Test16Class5();
Benchmark.alloc(20);
Test16Lib.local20 = new Test16Class5();
Benchmark.alloc(21);
Test16Lib.local21 = new Test16Class5();
Benchmark.alloc(22);
Test16Lib.local22 = new Test16Class5();
Benchmark.alloc(23);
Test16Lib.local23 = new Test16Class5();
Benchmark.alloc(24);
Test16Lib.local24 = new Test16Class5();
Test16Lib.local1.field1 = Test16Lib.local2;
Test16Lib.local1.field2 = Test16Lib.local13;
Test16Lib.local1.field3 = Test16Lib.local22;
Test16Lib.local1.field4 = Test16Lib.local15;
Test16Lib.local2.field1 = Test16Lib.local17;
Test16Lib.local2.field2 = Test16Lib.local10;
Test16Lib.local2.field3 = Test16Lib.local19;
Test16Lib.local2.field4 = Test16Lib.local15;
Test16Lib.local3.field5 = Test16Lib.local14;
Test16Lib.local3.field1 = Test16Lib.local1;
Test16Lib.local3.field2 = Test16Lib.local10;
Test16Lib.local3.field3 = Test16Lib.local22;
Test16Lib.local3.field4 = Test16Lib.local15;
Test16Lib.local4.field5 = Test16Lib.local11;
Test16Lib.local4.field1 = Test16Lib.local24;
Test16Lib.local4.field2 = Test16Lib.local11;
Test16Lib.local4.field3 = Test16Lib.local21;
Test16Lib.local4.field4 = Test16Lib.local15;
Test16Lib.local5.field5 = Test16Lib.local14;
Test16Lib.local5.field1 = Test16Lib.local20;
Test16Lib.local5.field2 = Test16Lib.local10;
Test16Lib.local5.field3 = Test16Lib.local16;
Test16Lib.local5.field4 = Test16Lib.local15;
Test16Lib.local6.field5 = Test16Lib.local11;
Test16Lib.local6.field1 = Test16Lib.local16;
Test16Lib.local6.field2 = Test16Lib.local14;
Test16Lib.local6.field3 = Test16Lib.local20;
Test16Lib.local6.field4 = Test16Lib.local15;
Test16Lib.local7.field5 = Test16Lib.local13;
Test16Lib.local7.field1 = Test16Lib.local6;
Test16Lib.local7.field2 = Test16Lib.local13;
Test16Lib.local7.field3 = Test16Lib.local24;
Test16Lib.local7.field4 = Test16Lib.local15;
Test16Lib.local8.field5 = Test16Lib.local13;
Test16Lib.local8.field1 = Test16Lib.local16;
Test16Lib.local8.field2 = Test16Lib.local12;
Test16Lib.local8.field3 = Test16Lib.local17;
Test16Lib.local8.field4 = Test16Lib.local15;
Test16Lib.local9.field5 = Test16Lib.local11;
Test16Lib.local9.field1 = Test16Lib.local21;
Test16Lib.local9.field2 = Test16Lib.local13;
Test16Lib.local9.field3 = Test16Lib.local16;
Test16Lib.local9.field4 = Test16Lib.local15;
Test16Lib.local10.field6 = Test16Lib.local13;
Test16Lib.local10.field7 = Test16Lib.local9;
Test16Lib.local10.field8 = Test16Lib.local14;
Test16Lib.local10.field9 = Test16Lib.local10;
Test16Lib.local10.field5 = Test16Lib.local14;
Test16Lib.local10.field1 = Test16Lib.local3;
Test16Lib.local10.field2 = Test16Lib.local14;
Test16Lib.local10.field3 = Test16Lib.local21;
Test16Lib.local10.field4 = Test16Lib.local15;
Test16Lib.local11.field6 = Test16Lib.local10;
Test16Lib.local11.field7 = Test16Lib.local6;
Test16Lib.local11.field8 = Test16Lib.local13;
Test16Lib.local11.field9 = Test16Lib.local24;
Test16Lib.local11.field5 = Test16Lib.local10;
Test16Lib.local11.field1 = Test16Lib.local2;
Test16Lib.local11.field2 = Test16Lib.local14;
Test16Lib.local11.field3 = Test16Lib.local19;
Test16Lib.local11.field4 = Test16Lib.local15;
Test16Lib.local12.field6 = Test16Lib.local14;
Test16Lib.local12.field7 = Test16Lib.local12;
Test16Lib.local12.field8 = Test16Lib.local14;
Test16Lib.local12.field9 = Test16Lib.local11;
Test16Lib.local12.field5 = Test16Lib.local13;
Test16Lib.local12.field1 = Test16Lib.local11;
Test16Lib.local12.field2 = Test16Lib.local13;
Test16Lib.local12.field3 = Test16Lib.local23;
Test16Lib.local12.field4 = Test16Lib.local15;
Test16Lib.local13.field6 = Test16Lib.local14;
Test16Lib.local13.field7 = Test16Lib.local5;
Test16Lib.local13.field8 = Test16Lib.local12;
Test16Lib.local13.field9 = Test16Lib.local15;
Test16Lib.local13.field5 = Test16Lib.local12;
Test16Lib.local13.field1 = Test16Lib.local19;
Test16Lib.local13.field2 = Test16Lib.local13;
Test16Lib.local13.field3 = Test16Lib.local19;
Test16Lib.local13.field4 = Test16Lib.local15;
Test16Lib.local14.field6 = Test16Lib.local10;
Test16Lib.local14.field7 = Test16Lib.local6;
Test16Lib.local14.field8 = Test16Lib.local12;
Test16Lib.local14.field9 = Test16Lib.local16;
Test16Lib.local14.field5 = Test16Lib.local14;
Test16Lib.local14.field1 = Test16Lib.local7;
Test16Lib.local14.field2 = Test16Lib.local12;
Test16Lib.local14.field3 = Test16Lib.local16;
Test16Lib.local14.field4 = Test16Lib.local15;
Test16Lib.local15.field10 = Test16Lib.local12;
Test16Lib.local15.field11 = Test16Lib.local15;
Test16Lib.local15.field12 = Test16Lib.local17;
Test16Lib.local15.field1 = Test16Lib.local2;
Test16Lib.local15.field2 = Test16Lib.local11;
Test16Lib.local15.field3 = Test16Lib.local17;
Test16Lib.local15.field4 = Test16Lib.local15;
Test16Lib.local16.field13 = Test16Lib.local23;
Test16Lib.local16.field1 = Test16Lib.local22;
Test16Lib.local16.field2 = Test16Lib.local14;
Test16Lib.local16.field3 = Test16Lib.local24;
Test16Lib.local16.field4 = Test16Lib.local15;
Test16Lib.local17.field13 = Test16Lib.local22;
Test16Lib.local17.field1 = Test16Lib.local17;
Test16Lib.local17.field2 = Test16Lib.local12;
Test16Lib.local17.field3 = Test16Lib.local21;
Test16Lib.local17.field4 = Test16Lib.local15;
Test16Lib.local18.field13 = Test16Lib.local23;
Test16Lib.local18.field1 = Test16Lib.local7;
Test16Lib.local18.field2 = Test16Lib.local10;
Test16Lib.local18.field3 = Test16Lib.local18;
Test16Lib.local18.field4 = Test16Lib.local15;
Test16Lib.local19.field13 = Test16Lib.local17;
Test16Lib.local19.field1 = Test16Lib.local8;
Test16Lib.local19.field2 = Test16Lib.local11;
Test16Lib.local19.field3 = Test16Lib.local16;
Test16Lib.local19.field4 = Test16Lib.local15;
Test16Lib.local20.field13 = Test16Lib.local24;
Test16Lib.local20.field1 = Test16Lib.local1;
Test16Lib.local20.field2 = Test16Lib.local10;
Test16Lib.local20.field3 = Test16Lib.local18;
Test16Lib.local20.field4 = Test16Lib.local15;
Test16Lib.local21.field13 = Test16Lib.local18;
Test16Lib.local21.field1 = Test16Lib.local7;
Test16Lib.local21.field2 = Test16Lib.local14;
Test16Lib.local21.field3 = Test16Lib.local16;
Test16Lib.local21.field4 = Test16Lib.local15;
Test16Lib.local22.field13 = Test16Lib.local24;
Test16Lib.local22.field1 = Test16Lib.local2;
Test16Lib.local22.field2 = Test16Lib.local10;
Test16Lib.local22.field3 = Test16Lib.local17;
Test16Lib.local22.field4 = Test16Lib.local15;
Test16Lib.local23.field13 = Test16Lib.local18;
Test16Lib.local23.field1 = Test16Lib.local18;
Test16Lib.local23.field2 = Test16Lib.local10;
Test16Lib.local23.field3 = Test16Lib.local19;
Test16Lib.local23.field4 = Test16Lib.local15;
Test16Lib.local24.field13 = Test16Lib.local17;
Test16Lib.local24.field1 = Test16Lib.local2;
Test16Lib.local24.field2 = Test16Lib.local10;
Test16Lib.local24.field3 = Test16Lib.local16;
Test16Lib.local24.field4 = Test16Lib.local15;
for (int local62 = 0; local62<=0; local62 += 1) {
for (int local63 = 0; local63<=0; local63 += 1) {
Test16Lib.local15=Test16Lib.local1.field4.method8(Test16Lib.local8.field2,Test16Lib.local15.field2,3);
}
}
Test16Lib.local15.field12=Test16Lib.local18.field4.method9(3);
Test16Lib.local11.field7=Test16Lib.local11.field2;
Test16Lib.local13.field3=Test16Lib.local19.field3;
for (int local64 = 0; local64<=0; local64 += 1) {
Test16Lib.local24.field13.method11(Test16Lib.local9,Test16Lib.local5,3);
}
if (inputValue==1) {
for (int local65 = 0; local65<=0; local65 += 1) {
Test16Lib.local21.field2=Test16Lib.local10.field2.method7(Test16Lib.local4.field5,Test16Lib.local4.field5,3);
}
}
Test16Lib.local24.field13=Test16Lib.local17.field13;
Test16Lib.local12.field6.method2(Test16Lib.local21.field4,3);
if (inputValue<4) {
if (inputValue>=3) {
if (inputValue<2) {
Test16Lib.local18=Test16Lib.local16.field3;
}
}else {
for (int local66 = 0; local66<=2; local66 += 1) {
Test16Lib.local11.field7=Test16Lib.local17.field2;
}
}
}
Test16Lib.local15.field12=Test16Lib.local13.field3;
Benchmark.test(1,Test16Lib.local1);
Benchmark.test(2,Test16Lib.local2);
Benchmark.test(3,Test16Lib.local3);
Benchmark.test(4,Test16Lib.local4);
Benchmark.test(5,Test16Lib.local5);
Benchmark.test(6,Test16Lib.local6);
Benchmark.test(7,Test16Lib.local7);
Benchmark.test(8,Test16Lib.local8);
Benchmark.test(9,Test16Lib.local9);
Benchmark.test(10,Test16Lib.local10);
Benchmark.test(11,Test16Lib.local11);
Benchmark.test(12,Test16Lib.local12);
Benchmark.test(13,Test16Lib.local13);
Benchmark.test(14,Test16Lib.local14);
Benchmark.test(15,Test16Lib.local15);
Benchmark.test(16,Test16Lib.local16);
Benchmark.test(17,Test16Lib.local17);
Benchmark.test(18,Test16Lib.local18);
Benchmark.test(19,Test16Lib.local19);
Benchmark.test(20,Test16Lib.local20);
Benchmark.test(21,Test16Lib.local21);
Benchmark.test(22,Test16Lib.local22);
Benchmark.test(23,Test16Lib.local23);
Benchmark.test(24,Test16Lib.local24);
Benchmark.test(25,Test16Lib.local1.field1);
Benchmark.test(26,Test16Lib.local1.field2);
Benchmark.test(27,Test16Lib.local1.field3);
Benchmark.test(28,Test16Lib.local1.field4);
Benchmark.test(29,Test16Lib.local2.field1);
Benchmark.test(30,Test16Lib.local2.field2);
Benchmark.test(31,Test16Lib.local2.field3);
Benchmark.test(32,Test16Lib.local2.field4);
Benchmark.test(33,Test16Lib.local3.field5);
Benchmark.test(34,Test16Lib.local3.field1);
Benchmark.test(35,Test16Lib.local3.field2);
Benchmark.test(36,Test16Lib.local3.field3);
Benchmark.test(37,Test16Lib.local3.field4);
Benchmark.test(38,Test16Lib.local4.field5);
Benchmark.test(39,Test16Lib.local4.field1);
Benchmark.test(40,Test16Lib.local4.field2);
Benchmark.test(41,Test16Lib.local4.field3);
Benchmark.test(42,Test16Lib.local4.field4);
Benchmark.test(43,Test16Lib.local5.field5);
Benchmark.test(44,Test16Lib.local5.field1);
Benchmark.test(45,Test16Lib.local5.field2);
Benchmark.test(46,Test16Lib.local5.field3);
Benchmark.test(47,Test16Lib.local5.field4);
Benchmark.test(48,Test16Lib.local6.field5);
Benchmark.test(49,Test16Lib.local6.field1);
Benchmark.test(50,Test16Lib.local6.field2);
Benchmark.test(51,Test16Lib.local6.field3);
Benchmark.test(52,Test16Lib.local6.field4);
Benchmark.test(53,Test16Lib.local7.field5);
Benchmark.test(54,Test16Lib.local7.field1);
Benchmark.test(55,Test16Lib.local7.field2);
Benchmark.test(56,Test16Lib.local7.field3);
Benchmark.test(57,Test16Lib.local7.field4);
Benchmark.test(58,Test16Lib.local8.field5);
Benchmark.test(59,Test16Lib.local8.field1);
Benchmark.test(60,Test16Lib.local8.field2);
Benchmark.test(61,Test16Lib.local8.field3);
Benchmark.test(62,Test16Lib.local8.field4);
Benchmark.test(63,Test16Lib.local9.field5);
Benchmark.test(64,Test16Lib.local9.field1);
Benchmark.test(65,Test16Lib.local9.field2);
Benchmark.test(66,Test16Lib.local9.field3);
Benchmark.test(67,Test16Lib.local9.field4);
Benchmark.test(68,Test16Lib.local10.field6);
Benchmark.test(69,Test16Lib.local10.field7);
Benchmark.test(70,Test16Lib.local10.field8);
Benchmark.test(71,Test16Lib.local10.field9);
Benchmark.test(72,Test16Lib.local10.field5);
Benchmark.test(73,Test16Lib.local10.field1);
Benchmark.test(74,Test16Lib.local10.field2);
Benchmark.test(75,Test16Lib.local10.field3);
Benchmark.test(76,Test16Lib.local10.field4);
Benchmark.test(77,Test16Lib.local11.field6);
Benchmark.test(78,Test16Lib.local11.field7);
Benchmark.test(79,Test16Lib.local11.field8);
Benchmark.test(80,Test16Lib.local11.field9);
Benchmark.test(81,Test16Lib.local11.field5);
Benchmark.test(82,Test16Lib.local11.field1);
Benchmark.test(83,Test16Lib.local11.field2);
Benchmark.test(84,Test16Lib.local11.field3);
Benchmark.test(85,Test16Lib.local11.field4);
Benchmark.test(86,Test16Lib.local12.field6);
Benchmark.test(87,Test16Lib.local12.field7);
Benchmark.test(88,Test16Lib.local12.field8);
Benchmark.test(89,Test16Lib.local12.field9);
Benchmark.test(90,Test16Lib.local12.field5);
Benchmark.test(91,Test16Lib.local12.field1);
Benchmark.test(92,Test16Lib.local12.field2);
Benchmark.test(93,Test16Lib.local12.field3);
Benchmark.test(94,Test16Lib.local12.field4);
Benchmark.test(95,Test16Lib.local13.field6);
Benchmark.test(96,Test16Lib.local13.field7);
Benchmark.test(97,Test16Lib.local13.field8);
Benchmark.test(98,Test16Lib.local13.field9);
Benchmark.test(99,Test16Lib.local13.field5);
Benchmark.test(100,Test16Lib.local13.field1);
Benchmark.test(101,Test16Lib.local13.field2);
Benchmark.test(102,Test16Lib.local13.field3);
Benchmark.test(103,Test16Lib.local13.field4);
Benchmark.test(104,Test16Lib.local14.field6);
Benchmark.test(105,Test16Lib.local14.field7);
Benchmark.test(106,Test16Lib.local14.field8);
Benchmark.test(107,Test16Lib.local14.field9);
Benchmark.test(108,Test16Lib.local14.field5);
Benchmark.test(109,Test16Lib.local14.field1);
Benchmark.test(110,Test16Lib.local14.field2);
Benchmark.test(111,Test16Lib.local14.field3);
Benchmark.test(112,Test16Lib.local14.field4);
Benchmark.test(113,Test16Lib.local15.field10);
Benchmark.test(114,Test16Lib.local15.field11);
Benchmark.test(115,Test16Lib.local15.field12);
Benchmark.test(116,Test16Lib.local15.field1);
Benchmark.test(117,Test16Lib.local15.field2);
Benchmark.test(118,Test16Lib.local15.field3);
Benchmark.test(119,Test16Lib.local15.field4);
Benchmark.test(120,Test16Lib.local16.field13);
Benchmark.test(121,Test16Lib.local16.field1);
Benchmark.test(122,Test16Lib.local16.field2);
Benchmark.test(123,Test16Lib.local16.field3);
Benchmark.test(124,Test16Lib.local16.field4);
Benchmark.test(125,Test16Lib.local17.field13);
Benchmark.test(126,Test16Lib.local17.field1);
Benchmark.test(127,Test16Lib.local17.field2);
Benchmark.test(128,Test16Lib.local17.field3);
Benchmark.test(129,Test16Lib.local17.field4);
Benchmark.test(130,Test16Lib.local18.field13);
Benchmark.test(131,Test16Lib.local18.field1);
Benchmark.test(132,Test16Lib.local18.field2);
Benchmark.test(133,Test16Lib.local18.field3);
Benchmark.test(134,Test16Lib.local18.field4);
Benchmark.test(135,Test16Lib.local19.field13);
Benchmark.test(136,Test16Lib.local19.field1);
Benchmark.test(137,Test16Lib.local19.field2);
Benchmark.test(138,Test16Lib.local19.field3);
Benchmark.test(139,Test16Lib.local19.field4);
Benchmark.test(140,Test16Lib.local20.field13);
Benchmark.test(141,Test16Lib.local20.field1);
Benchmark.test(142,Test16Lib.local20.field2);
Benchmark.test(143,Test16Lib.local20.field3);
Benchmark.test(144,Test16Lib.local20.field4);
Benchmark.test(145,Test16Lib.local21.field13);
Benchmark.test(146,Test16Lib.local21.field1);
Benchmark.test(147,Test16Lib.local21.field2);
Benchmark.test(148,Test16Lib.local21.field3);
Benchmark.test(149,Test16Lib.local21.field4);
Benchmark.test(150,Test16Lib.local22.field13);
Benchmark.test(151,Test16Lib.local22.field1);
Benchmark.test(152,Test16Lib.local22.field2);
Benchmark.test(153,Test16Lib.local22.field3);
Benchmark.test(154,Test16Lib.local22.field4);
Benchmark.test(155,Test16Lib.local23.field13);
Benchmark.test(156,Test16Lib.local23.field1);
Benchmark.test(157,Test16Lib.local23.field2);
Benchmark.test(158,Test16Lib.local23.field3);
Benchmark.test(159,Test16Lib.local23.field4);
Benchmark.test(160,Test16Lib.local24.field13);
Benchmark.test(161,Test16Lib.local24.field1);
Benchmark.test(162,Test16Lib.local24.field2);
Benchmark.test(163,Test16Lib.local24.field3);
Benchmark.test(164,Test16Lib.local24.field4);
Benchmark.print();
}
}
