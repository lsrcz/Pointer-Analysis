package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test27Lib{
public static Test27Class1 local1;
public static Test27Class2 local2;
public static Test27Class2 local3;
public static Test27Class2 local4;
public static Test27Class2 local5;
public static Test27Class2 local6;
public static Test27Class2 local7;
public static Test27Class2 local8;
public static Test27Class2 local9;
public static Test27Class3 local10;
public static Test27Class3 local11;
public static Test27Class3 local12;
public static Test27Class3 local13;
public static Test27Class3 local14;
public static Test27Class3 local15;
public static Test27Class3 local16;
public static Test27Class3 local17;
public static Test27Class4 local18;
public static Test27Class4 local19;
public static Test27Class5 local20;
public static Test27Class5 local21;
public static Test27Class5 local22;
}
class Test27Class1 extends BasicClass {
public Test27Class4 field1;
public static Test27Class2 field2;
public static Test27Class5 field3;
public Test27Class1 field4;
public Test27Class5 method1(Test27Class5 arg0, Test27Class5 arg1, int depth) {
if (depth == 0) return Test27Lib.local21;
arg0.method11(arg1.field2,depth-1);
arg1.field2=this.field3.method10(arg0,depth-1);
this.field3=arg1.field3;
arg0.field2=arg0.field12;
return arg0;
}
}
class Test27Class2 extends Test27Class1 {
public static Test27Class5 field5;
public static Test27Class2 field6;
public static Test27Class3 field7;
public static void method2(int depth) {
if (depth == 0) return;
}
public static Test27Class3 method3(Test27Class3 arg0, int depth) {
if (depth == 0) return Test27Lib.local11;
arg0=field3.field1.method8(arg0.field1,field3.field12,depth-1);
arg0.field3=field2.field3;
field7.field1.method6(arg0.field3,field6.field2,depth-1);
if (depth>=4) {
field6=field7.field1.method9(field6.field5,depth-1);
}
return field7.field9;
}
public static void method4(int depth) {
if (depth == 0) return;
for (int local23 = 0; local23<=0; local23 += 1) {
field6.field6=field2.field2;
}
field6.field7=field7.field8;
field2.field1=field7.field1;
for (int local24 = 0; local24<=3; local24 += 1) {
if (depth>=2) {
for (int local25 = 0; local25<=2; local25 += 1) {
if (depth==1) {
field6=field3.field1.method9(field5,depth-1);
}
}
}else {
if (depth>1) {
for (int local26 = 0; local26<=1; local26 += 1) {
field5.field12.method4(depth-1);
}
}
}
}
for (int local27 = 0; local27<=1; local27 += 1) {
field3.field1=field2.field1;
}
if (depth>1) {
field7.field10.method4(depth-1);
}else {
for (int local28 = 0; local28<=3; local28 += 1) {
for (int local29 = 0; local29<=2; local29 += 1) {
if (depth<=4) {
field6.field7=field7.field1;
}else {
field5=field6.field6.method1(field6.field5,field5,depth-1);
}
}
}
}
if (depth>=2) {
if (depth>4) {
field3.field1.method6(field6.field3,field7.field10,depth-1);
}
}else {
if (depth>=3) {
if (depth>3) {
for (int local30 = 0; local30<=0; local30 += 1) {
field3.field12=field2.field3.method10(field2.field5,depth-1);
}
}
}else {
field2.field6=field2.field3.method10(field3.field3,depth-1);
}
}
field5.field12.method2(depth-1);
field2.field4=field6.field7.method8(field7.field1,field3.field2,depth-1);
}
public void method5(Test27Class2 arg0, Test27Class3 arg1, int depth) {
if (depth == 0) return;
this.field4=arg0.field4;
arg1.field8=arg0.field7;
this.field7=this.field6.method3(arg1.field8,depth-1);
if (depth==4) {
if (depth==2) {
arg0.field1.method9(arg0.field3,depth-1);
}
}else {
if (depth==3) {
arg1.field10.method4(depth-1);
}else {
if (depth<=4) {
if (depth<=2) {
if (depth==3) {
}else {
}
}else {
for (int local31 = 0; local31<=0; local31 += 1) {
}
}
}
}
}
arg1.field8=this.field6.method3(arg1.field8,depth-1);
for (int local32 = 0; local32<=2; local32 += 1) {
if (depth<=2) {
arg0.method5(arg0.field2,arg1.field9,depth-1);
}
}
for (int local33 = 0; local33<=2; local33 += 1) {
for (int local34 = 0; local34<=2; local34 += 1) {
if (depth==2) {
arg0.field3=this.field3;
}
}
}
for (int local35 = 0; local35<=0; local35 += 1) {
arg1.field10=arg1.field10;
}
for (int local36 = 0; local36<=2; local36 += 1) {
if (depth<=2) {
for (int local37 = 0; local37<=1; local37 += 1) {
arg1=this.field1;
}
}
}
}
}
class Test27Class3 extends Test27Class1 {
public static Test27Class3 field8;
public static Test27Class3 field9;
public Test27Class2 field10;
public static Test27Class4 method6(Test27Class5 arg0, Test27Class2 arg1, int depth) {
if (depth == 0) return Test27Lib.local19;
field2.field3=field8.method7(field9.field9,depth-1);
arg1.field3.method10(field9.field3,depth-1);
field8=field9.field9.method6(arg1.field5,arg1.field2,depth-1);
for (int local38 = 0; local38<=0; local38 += 1) {
for (int local39 = 0; local39<=2; local39 += 1) {
field2.field5.method11(arg1.field5,depth-1);
}
}
field2.field4=arg0.field3;
field3=field9.field3;
arg0.field1=field9.field9.method6(arg1.field3,arg1,depth-1);
return arg1.field1;
}
public Test27Class5 method7(Test27Class3 arg0, int depth) {
if (depth == 0) return Test27Lib.local21;
if (depth<=2) {
if (depth<=2) {
if (depth>3) {
for (int local40 = 0; local40<=0; local40 += 1) {
this.field1=this.field1.method8(arg0.field1,this.field10,depth-1);
}
}else {
if (depth<=1) {
arg0=this.field9;
}
}
}
}else {
arg0.field9=this;
}
this.field2.method2(depth-1);
return this.field3;
}
public Test27Class4 method8(Test27Class4 arg0, Test27Class2 arg1, int depth) {
if (depth == 0) return Test27Lib.local19;
this.field2.method3(this.field8,depth-1);
if (depth<1) {
arg1.field3=this.field3;
}else {
for (int local41 = 0; local41<=3; local41 += 1) {
arg0.field2=arg0.field2;
}
}
arg0.field1=arg1.field7.method8(arg1.field1,arg0.field2,depth-1);
for (int local42 = 0; local42<=2; local42 += 1) {
arg0.field2.method3(arg0.field9,depth-1);
}
this.field8=arg1.field1;
return arg0;
}
}
class Test27Class4 extends Test27Class3 {
public static Test27Class1 field11;
public Test27Class2 method9(Test27Class5 arg0, int depth) {
if (depth == 0) return Test27Lib.local2;
return arg0.field12;
}
}
class Test27Class5 extends Test27Class1 {
public static Test27Class2 field12;
public Test27Class2 method10(Test27Class5 arg0, int depth) {
if (depth == 0) return Test27Lib.local8;
arg0.field12=this.field2;
arg0.field2=arg0.field2;
for (int local43 = 0; local43<=0; local43 += 1) {
this.field2.method1(this.field3,this,depth-1);
}
return this.field12;
}
public static void method11(Test27Class1 arg0, int depth) {
if (depth == 0) return;
field12.field7=field12.field7;
for (int local44 = 0; local44<=2; local44 += 1) {
field2.field1=field12.field1;
}
}
}
public class Test27{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test27Lib.local1 = new Test27Class1();
Benchmark.alloc(2);
Test27Lib.local2 = new Test27Class2();
Benchmark.alloc(3);
Test27Lib.local3 = new Test27Class2();
Benchmark.alloc(4);
Test27Lib.local4 = new Test27Class2();
Benchmark.alloc(5);
Test27Lib.local5 = new Test27Class2();
Benchmark.alloc(6);
Test27Lib.local6 = new Test27Class2();
Benchmark.alloc(7);
Test27Lib.local7 = new Test27Class2();
Benchmark.alloc(8);
Test27Lib.local8 = new Test27Class2();
Benchmark.alloc(9);
Test27Lib.local9 = new Test27Class2();
Benchmark.alloc(10);
Test27Lib.local10 = new Test27Class3();
Benchmark.alloc(11);
Test27Lib.local11 = new Test27Class3();
Benchmark.alloc(12);
Test27Lib.local12 = new Test27Class3();
Benchmark.alloc(13);
Test27Lib.local13 = new Test27Class3();
Benchmark.alloc(14);
Test27Lib.local14 = new Test27Class3();
Benchmark.alloc(15);
Test27Lib.local15 = new Test27Class3();
Benchmark.alloc(16);
Test27Lib.local16 = new Test27Class3();
Benchmark.alloc(17);
Test27Lib.local17 = new Test27Class3();
Benchmark.alloc(18);
Test27Lib.local18 = new Test27Class4();
Benchmark.alloc(19);
Test27Lib.local19 = new Test27Class4();
Benchmark.alloc(20);
Test27Lib.local20 = new Test27Class5();
Benchmark.alloc(21);
Test27Lib.local21 = new Test27Class5();
Benchmark.alloc(22);
Test27Lib.local22 = new Test27Class5();
Test27Lib.local1.field1 = Test27Lib.local18;
Test27Lib.local1.field2 = Test27Lib.local4;
Test27Lib.local1.field3 = Test27Lib.local22;
Test27Lib.local1.field4 = Test27Lib.local5;
Test27Lib.local2.field5 = Test27Lib.local22;
Test27Lib.local2.field6 = Test27Lib.local5;
Test27Lib.local2.field7 = Test27Lib.local16;
Test27Lib.local2.field1 = Test27Lib.local19;
Test27Lib.local2.field2 = Test27Lib.local6;
Test27Lib.local2.field3 = Test27Lib.local21;
Test27Lib.local2.field4 = Test27Lib.local12;
Test27Lib.local3.field5 = Test27Lib.local22;
Test27Lib.local3.field6 = Test27Lib.local4;
Test27Lib.local3.field7 = Test27Lib.local15;
Test27Lib.local3.field1 = Test27Lib.local18;
Test27Lib.local3.field2 = Test27Lib.local7;
Test27Lib.local3.field3 = Test27Lib.local21;
Test27Lib.local3.field4 = Test27Lib.local18;
Test27Lib.local4.field5 = Test27Lib.local22;
Test27Lib.local4.field6 = Test27Lib.local4;
Test27Lib.local4.field7 = Test27Lib.local11;
Test27Lib.local4.field1 = Test27Lib.local19;
Test27Lib.local4.field2 = Test27Lib.local9;
Test27Lib.local4.field3 = Test27Lib.local21;
Test27Lib.local4.field4 = Test27Lib.local1;
Test27Lib.local5.field5 = Test27Lib.local20;
Test27Lib.local5.field6 = Test27Lib.local7;
Test27Lib.local5.field7 = Test27Lib.local16;
Test27Lib.local5.field1 = Test27Lib.local19;
Test27Lib.local5.field2 = Test27Lib.local9;
Test27Lib.local5.field3 = Test27Lib.local22;
Test27Lib.local5.field4 = Test27Lib.local14;
Test27Lib.local6.field5 = Test27Lib.local20;
Test27Lib.local6.field6 = Test27Lib.local3;
Test27Lib.local6.field7 = Test27Lib.local16;
Test27Lib.local6.field1 = Test27Lib.local19;
Test27Lib.local6.field2 = Test27Lib.local3;
Test27Lib.local6.field3 = Test27Lib.local21;
Test27Lib.local6.field4 = Test27Lib.local5;
Test27Lib.local7.field5 = Test27Lib.local21;
Test27Lib.local7.field6 = Test27Lib.local7;
Test27Lib.local7.field7 = Test27Lib.local10;
Test27Lib.local7.field1 = Test27Lib.local19;
Test27Lib.local7.field2 = Test27Lib.local5;
Test27Lib.local7.field3 = Test27Lib.local20;
Test27Lib.local7.field4 = Test27Lib.local11;
Test27Lib.local8.field5 = Test27Lib.local21;
Test27Lib.local8.field6 = Test27Lib.local2;
Test27Lib.local8.field7 = Test27Lib.local15;
Test27Lib.local8.field1 = Test27Lib.local18;
Test27Lib.local8.field2 = Test27Lib.local5;
Test27Lib.local8.field3 = Test27Lib.local20;
Test27Lib.local8.field4 = Test27Lib.local10;
Test27Lib.local9.field5 = Test27Lib.local22;
Test27Lib.local9.field6 = Test27Lib.local6;
Test27Lib.local9.field7 = Test27Lib.local13;
Test27Lib.local9.field1 = Test27Lib.local19;
Test27Lib.local9.field2 = Test27Lib.local6;
Test27Lib.local9.field3 = Test27Lib.local21;
Test27Lib.local9.field4 = Test27Lib.local16;
Test27Lib.local10.field8 = Test27Lib.local19;
Test27Lib.local10.field9 = Test27Lib.local18;
Test27Lib.local10.field10 = Test27Lib.local2;
Test27Lib.local10.field1 = Test27Lib.local18;
Test27Lib.local10.field2 = Test27Lib.local7;
Test27Lib.local10.field3 = Test27Lib.local22;
Test27Lib.local10.field4 = Test27Lib.local20;
Test27Lib.local11.field8 = Test27Lib.local18;
Test27Lib.local11.field9 = Test27Lib.local10;
Test27Lib.local11.field10 = Test27Lib.local7;
Test27Lib.local11.field1 = Test27Lib.local19;
Test27Lib.local11.field2 = Test27Lib.local8;
Test27Lib.local11.field3 = Test27Lib.local21;
Test27Lib.local11.field4 = Test27Lib.local1;
Test27Lib.local12.field8 = Test27Lib.local10;
Test27Lib.local12.field9 = Test27Lib.local11;
Test27Lib.local12.field10 = Test27Lib.local2;
Test27Lib.local12.field1 = Test27Lib.local19;
Test27Lib.local12.field2 = Test27Lib.local3;
Test27Lib.local12.field3 = Test27Lib.local21;
Test27Lib.local12.field4 = Test27Lib.local11;
Test27Lib.local13.field8 = Test27Lib.local13;
Test27Lib.local13.field9 = Test27Lib.local15;
Test27Lib.local13.field10 = Test27Lib.local8;
Test27Lib.local13.field1 = Test27Lib.local18;
Test27Lib.local13.field2 = Test27Lib.local8;
Test27Lib.local13.field3 = Test27Lib.local20;
Test27Lib.local13.field4 = Test27Lib.local17;
Test27Lib.local14.field8 = Test27Lib.local19;
Test27Lib.local14.field9 = Test27Lib.local10;
Test27Lib.local14.field10 = Test27Lib.local5;
Test27Lib.local14.field1 = Test27Lib.local19;
Test27Lib.local14.field2 = Test27Lib.local2;
Test27Lib.local14.field3 = Test27Lib.local21;
Test27Lib.local14.field4 = Test27Lib.local22;
Test27Lib.local15.field8 = Test27Lib.local15;
Test27Lib.local15.field9 = Test27Lib.local11;
Test27Lib.local15.field10 = Test27Lib.local3;
Test27Lib.local15.field1 = Test27Lib.local19;
Test27Lib.local15.field2 = Test27Lib.local7;
Test27Lib.local15.field3 = Test27Lib.local21;
Test27Lib.local15.field4 = Test27Lib.local16;
Test27Lib.local16.field8 = Test27Lib.local12;
Test27Lib.local16.field9 = Test27Lib.local10;
Test27Lib.local16.field10 = Test27Lib.local5;
Test27Lib.local16.field1 = Test27Lib.local19;
Test27Lib.local16.field2 = Test27Lib.local5;
Test27Lib.local16.field3 = Test27Lib.local20;
Test27Lib.local16.field4 = Test27Lib.local13;
Test27Lib.local17.field8 = Test27Lib.local17;
Test27Lib.local17.field9 = Test27Lib.local11;
Test27Lib.local17.field10 = Test27Lib.local3;
Test27Lib.local17.field1 = Test27Lib.local18;
Test27Lib.local17.field2 = Test27Lib.local8;
Test27Lib.local17.field3 = Test27Lib.local22;
Test27Lib.local17.field4 = Test27Lib.local15;
Test27Lib.local18.field11 = Test27Lib.local9;
Test27Lib.local18.field8 = Test27Lib.local18;
Test27Lib.local18.field9 = Test27Lib.local17;
Test27Lib.local18.field10 = Test27Lib.local3;
Test27Lib.local18.field1 = Test27Lib.local18;
Test27Lib.local18.field2 = Test27Lib.local2;
Test27Lib.local18.field3 = Test27Lib.local21;
Test27Lib.local18.field4 = Test27Lib.local3;
Test27Lib.local19.field11 = Test27Lib.local4;
Test27Lib.local19.field8 = Test27Lib.local16;
Test27Lib.local19.field9 = Test27Lib.local14;
Test27Lib.local19.field10 = Test27Lib.local7;
Test27Lib.local19.field1 = Test27Lib.local18;
Test27Lib.local19.field2 = Test27Lib.local5;
Test27Lib.local19.field3 = Test27Lib.local20;
Test27Lib.local19.field4 = Test27Lib.local15;
Test27Lib.local20.field12 = Test27Lib.local9;
Test27Lib.local20.field1 = Test27Lib.local18;
Test27Lib.local20.field2 = Test27Lib.local3;
Test27Lib.local20.field3 = Test27Lib.local22;
Test27Lib.local20.field4 = Test27Lib.local2;
Test27Lib.local21.field12 = Test27Lib.local2;
Test27Lib.local21.field1 = Test27Lib.local19;
Test27Lib.local21.field2 = Test27Lib.local9;
Test27Lib.local21.field3 = Test27Lib.local21;
Test27Lib.local21.field4 = Test27Lib.local5;
Test27Lib.local22.field12 = Test27Lib.local9;
Test27Lib.local22.field1 = Test27Lib.local19;
Test27Lib.local22.field2 = Test27Lib.local3;
Test27Lib.local22.field3 = Test27Lib.local20;
Test27Lib.local22.field4 = Test27Lib.local7;
for (int local45 = 0; local45<=0; local45 += 1) {
for (int local46 = 0; local46<=1; local46 += 1) {
for (int local47 = 0; local47<=0; local47 += 1) {
for (int local48 = 0; local48<=0; local48 += 1) {
if (inputValue==1) {
}else {
}
}
}
}
}
Test27Lib.local12.field1.method8(Test27Lib.local18.field1,Test27Lib.local6.field6,3);
for (int local49 = 0; local49<=1; local49 += 1) {
Test27Lib.local5.field4=Test27Lib.local2.field7.method8(Test27Lib.local4.field1,Test27Lib.local19.field10,3);
}
Test27Lib.local4.field7=Test27Lib.local8.field1;
for (int local50 = 0; local50<=0; local50 += 1) {
Test27Lib.local19.field10=Test27Lib.local21.field2;
}
for (int local51 = 0; local51<=0; local51 += 1) {
Test27Lib.local9.field7=Test27Lib.local22.field12.method3(Test27Lib.local10,3);
}
Test27Lib.local18.field8=Test27Lib.local11.field9;
for (int local52 = 0; local52<=2; local52 += 1) {
for (int local53 = 0; local53<=2; local53 += 1) {
for (int local54 = 0; local54<=0; local54 += 1) {
Test27Lib.local13.field10.method5(Test27Lib.local2.field2,Test27Lib.local12.field8,3);
}
}
}
Test27Lib.local6.field4=Test27Lib.local14.field1;
for (int local55 = 0; local55<=1; local55 += 1) {
Test27Lib.local15=Test27Lib.local11.method6(Test27Lib.local4.field3,Test27Lib.local11.field10,3);
}
Benchmark.test(1,Test27Lib.local1);
Benchmark.test(2,Test27Lib.local2);
Benchmark.test(3,Test27Lib.local3);
Benchmark.test(4,Test27Lib.local4);
Benchmark.test(5,Test27Lib.local5);
Benchmark.test(6,Test27Lib.local6);
Benchmark.test(7,Test27Lib.local7);
Benchmark.test(8,Test27Lib.local8);
Benchmark.test(9,Test27Lib.local9);
Benchmark.test(10,Test27Lib.local10);
Benchmark.test(11,Test27Lib.local11);
Benchmark.test(12,Test27Lib.local12);
Benchmark.test(13,Test27Lib.local13);
Benchmark.test(14,Test27Lib.local14);
Benchmark.test(15,Test27Lib.local15);
Benchmark.test(16,Test27Lib.local16);
Benchmark.test(17,Test27Lib.local17);
Benchmark.test(18,Test27Lib.local18);
Benchmark.test(19,Test27Lib.local19);
Benchmark.test(20,Test27Lib.local20);
Benchmark.test(21,Test27Lib.local21);
Benchmark.test(22,Test27Lib.local22);
Benchmark.test(23,Test27Lib.local1.field1);
Benchmark.test(24,Test27Lib.local1.field2);
Benchmark.test(25,Test27Lib.local1.field3);
Benchmark.test(26,Test27Lib.local1.field4);
Benchmark.test(27,Test27Lib.local2.field5);
Benchmark.test(28,Test27Lib.local2.field6);
Benchmark.test(29,Test27Lib.local2.field7);
Benchmark.test(30,Test27Lib.local2.field1);
Benchmark.test(31,Test27Lib.local2.field2);
Benchmark.test(32,Test27Lib.local2.field3);
Benchmark.test(33,Test27Lib.local2.field4);
Benchmark.test(34,Test27Lib.local3.field5);
Benchmark.test(35,Test27Lib.local3.field6);
Benchmark.test(36,Test27Lib.local3.field7);
Benchmark.test(37,Test27Lib.local3.field1);
Benchmark.test(38,Test27Lib.local3.field2);
Benchmark.test(39,Test27Lib.local3.field3);
Benchmark.test(40,Test27Lib.local3.field4);
Benchmark.test(41,Test27Lib.local4.field5);
Benchmark.test(42,Test27Lib.local4.field6);
Benchmark.test(43,Test27Lib.local4.field7);
Benchmark.test(44,Test27Lib.local4.field1);
Benchmark.test(45,Test27Lib.local4.field2);
Benchmark.test(46,Test27Lib.local4.field3);
Benchmark.test(47,Test27Lib.local4.field4);
Benchmark.test(48,Test27Lib.local5.field5);
Benchmark.test(49,Test27Lib.local5.field6);
Benchmark.test(50,Test27Lib.local5.field7);
Benchmark.test(51,Test27Lib.local5.field1);
Benchmark.test(52,Test27Lib.local5.field2);
Benchmark.test(53,Test27Lib.local5.field3);
Benchmark.test(54,Test27Lib.local5.field4);
Benchmark.test(55,Test27Lib.local6.field5);
Benchmark.test(56,Test27Lib.local6.field6);
Benchmark.test(57,Test27Lib.local6.field7);
Benchmark.test(58,Test27Lib.local6.field1);
Benchmark.test(59,Test27Lib.local6.field2);
Benchmark.test(60,Test27Lib.local6.field3);
Benchmark.test(61,Test27Lib.local6.field4);
Benchmark.test(62,Test27Lib.local7.field5);
Benchmark.test(63,Test27Lib.local7.field6);
Benchmark.test(64,Test27Lib.local7.field7);
Benchmark.test(65,Test27Lib.local7.field1);
Benchmark.test(66,Test27Lib.local7.field2);
Benchmark.test(67,Test27Lib.local7.field3);
Benchmark.test(68,Test27Lib.local7.field4);
Benchmark.test(69,Test27Lib.local8.field5);
Benchmark.test(70,Test27Lib.local8.field6);
Benchmark.test(71,Test27Lib.local8.field7);
Benchmark.test(72,Test27Lib.local8.field1);
Benchmark.test(73,Test27Lib.local8.field2);
Benchmark.test(74,Test27Lib.local8.field3);
Benchmark.test(75,Test27Lib.local8.field4);
Benchmark.test(76,Test27Lib.local9.field5);
Benchmark.test(77,Test27Lib.local9.field6);
Benchmark.test(78,Test27Lib.local9.field7);
Benchmark.test(79,Test27Lib.local9.field1);
Benchmark.test(80,Test27Lib.local9.field2);
Benchmark.test(81,Test27Lib.local9.field3);
Benchmark.test(82,Test27Lib.local9.field4);
Benchmark.test(83,Test27Lib.local10.field8);
Benchmark.test(84,Test27Lib.local10.field9);
Benchmark.test(85,Test27Lib.local10.field10);
Benchmark.test(86,Test27Lib.local10.field1);
Benchmark.test(87,Test27Lib.local10.field2);
Benchmark.test(88,Test27Lib.local10.field3);
Benchmark.test(89,Test27Lib.local10.field4);
Benchmark.test(90,Test27Lib.local11.field8);
Benchmark.test(91,Test27Lib.local11.field9);
Benchmark.test(92,Test27Lib.local11.field10);
Benchmark.test(93,Test27Lib.local11.field1);
Benchmark.test(94,Test27Lib.local11.field2);
Benchmark.test(95,Test27Lib.local11.field3);
Benchmark.test(96,Test27Lib.local11.field4);
Benchmark.test(97,Test27Lib.local12.field8);
Benchmark.test(98,Test27Lib.local12.field9);
Benchmark.test(99,Test27Lib.local12.field10);
Benchmark.test(100,Test27Lib.local12.field1);
Benchmark.test(101,Test27Lib.local12.field2);
Benchmark.test(102,Test27Lib.local12.field3);
Benchmark.test(103,Test27Lib.local12.field4);
Benchmark.test(104,Test27Lib.local13.field8);
Benchmark.test(105,Test27Lib.local13.field9);
Benchmark.test(106,Test27Lib.local13.field10);
Benchmark.test(107,Test27Lib.local13.field1);
Benchmark.test(108,Test27Lib.local13.field2);
Benchmark.test(109,Test27Lib.local13.field3);
Benchmark.test(110,Test27Lib.local13.field4);
Benchmark.test(111,Test27Lib.local14.field8);
Benchmark.test(112,Test27Lib.local14.field9);
Benchmark.test(113,Test27Lib.local14.field10);
Benchmark.test(114,Test27Lib.local14.field1);
Benchmark.test(115,Test27Lib.local14.field2);
Benchmark.test(116,Test27Lib.local14.field3);
Benchmark.test(117,Test27Lib.local14.field4);
Benchmark.test(118,Test27Lib.local15.field8);
Benchmark.test(119,Test27Lib.local15.field9);
Benchmark.test(120,Test27Lib.local15.field10);
Benchmark.test(121,Test27Lib.local15.field1);
Benchmark.test(122,Test27Lib.local15.field2);
Benchmark.test(123,Test27Lib.local15.field3);
Benchmark.test(124,Test27Lib.local15.field4);
Benchmark.test(125,Test27Lib.local16.field8);
Benchmark.test(126,Test27Lib.local16.field9);
Benchmark.test(127,Test27Lib.local16.field10);
Benchmark.test(128,Test27Lib.local16.field1);
Benchmark.test(129,Test27Lib.local16.field2);
Benchmark.test(130,Test27Lib.local16.field3);
Benchmark.test(131,Test27Lib.local16.field4);
Benchmark.test(132,Test27Lib.local17.field8);
Benchmark.test(133,Test27Lib.local17.field9);
Benchmark.test(134,Test27Lib.local17.field10);
Benchmark.test(135,Test27Lib.local17.field1);
Benchmark.test(136,Test27Lib.local17.field2);
Benchmark.test(137,Test27Lib.local17.field3);
Benchmark.test(138,Test27Lib.local17.field4);
Benchmark.test(139,Test27Lib.local18.field11);
Benchmark.test(140,Test27Lib.local18.field8);
Benchmark.test(141,Test27Lib.local18.field9);
Benchmark.test(142,Test27Lib.local18.field10);
Benchmark.test(143,Test27Lib.local18.field1);
Benchmark.test(144,Test27Lib.local18.field2);
Benchmark.test(145,Test27Lib.local18.field3);
Benchmark.test(146,Test27Lib.local18.field4);
Benchmark.test(147,Test27Lib.local19.field11);
Benchmark.test(148,Test27Lib.local19.field8);
Benchmark.test(149,Test27Lib.local19.field9);
Benchmark.test(150,Test27Lib.local19.field10);
Benchmark.test(151,Test27Lib.local19.field1);
Benchmark.test(152,Test27Lib.local19.field2);
Benchmark.test(153,Test27Lib.local19.field3);
Benchmark.test(154,Test27Lib.local19.field4);
Benchmark.test(155,Test27Lib.local20.field12);
Benchmark.test(156,Test27Lib.local20.field1);
Benchmark.test(157,Test27Lib.local20.field2);
Benchmark.test(158,Test27Lib.local20.field3);
Benchmark.test(159,Test27Lib.local20.field4);
Benchmark.test(160,Test27Lib.local21.field12);
Benchmark.test(161,Test27Lib.local21.field1);
Benchmark.test(162,Test27Lib.local21.field2);
Benchmark.test(163,Test27Lib.local21.field3);
Benchmark.test(164,Test27Lib.local21.field4);
Benchmark.test(165,Test27Lib.local22.field12);
Benchmark.test(166,Test27Lib.local22.field1);
Benchmark.test(167,Test27Lib.local22.field2);
Benchmark.test(168,Test27Lib.local22.field3);
Benchmark.test(169,Test27Lib.local22.field4);
Benchmark.print();
}
}
