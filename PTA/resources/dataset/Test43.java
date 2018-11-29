package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test43Lib{
public static Test43Class1 local1;
public static Test43Class1 local2;
public static Test43Class2 local3;
public static Test43Class2 local4;
public static Test43Class2 local5;
public static Test43Class2 local6;
public static Test43Class2 local7;
public static Test43Class2 local8;
public static Test43Class3 local9;
public static Test43Class3 local10;
public static Test43Class3 local11;
public static Test43Class3 local12;
public static Test43Class3 local13;
public static Test43Class3 local14;
public static Test43Class3 local15;
public static Test43Class3 local16;
public static Test43Class3 local17;
public static Test43Class3 local18;
public static Test43Class4 local19;
public static Test43Class4 local20;
public static Test43Class4 local21;
public static Test43Class4 local22;
public static Test43Class5 local23;
public static Test43Class5 local24;
public static Test43Class5 local25;
public static Test43Class5 local26;
public static Test43Class5 local27;
public static Test43Class5 local28;
public static Test43Class5 local29;
}
class Test43Class1 extends BasicClass {
public Test43Class4 field1;
public void method1(Test43Class5 arg0, int depth) {
if (depth == 0) return;
}
}
class Test43Class2 extends Test43Class1 {
public Test43Class5 field2;
public static Test43Class4 field3;
public Test43Class4 method2(Test43Class5 arg0, int depth) {
if (depth == 0) return Test43Lib.local27;
if (depth==3) {
if (depth==4) {
for (int local30 = 0; local30<=1; local30 += 1) {
for (int local31 = 0; local31<=1; local31 += 1) {
for (int local32 = 0; local32<=0; local32 += 1) {
}
}
}
}
}else {
if (depth<=4) {
for (int local33 = 0; local33<=3; local33 += 1) {
if (depth<1) {
for (int local34 = 0; local34<=3; local34 += 1) {
}
}else {
for (int local35 = 0; local35<=0; local35 += 1) {
}
}
}
}else {
arg0.field23=this.field2;
}
}
return this.field1;
}
public static Test43Class4 method3(int depth) {
if (depth == 0) return Test43Lib.local27;
field3.field16=field3.field3.method2(field3.field2,depth-1);
return field3.field1;
}
public static Test43Class3 method4(Test43Class3 arg0, int depth) {
if (depth == 0) return Test43Lib.local18;
for (int local36 = 0; local36<=3; local36 += 1) {
arg0.field12=arg0.field1;
}
return field3.field18;
}
public Test43Class5 method5(Test43Class1 arg0, Test43Class3 arg1, int depth) {
if (depth == 0) return Test43Lib.local25;
arg1=arg1;
return arg1.field9;
}
public static void method6(Test43Class3 arg0, Test43Class2 arg1, int depth) {
if (depth == 0) return;
field3.field16=arg0.field4;
}
public Test43Class1 method7(Test43Class1 arg0, Test43Class2 arg1, int depth) {
if (depth == 0) return Test43Lib.local2;
return arg0;
}
public static void method8(Test43Class1 arg0, int depth) {
if (depth == 0) return;
}
public Test43Class3 method9(Test43Class1 arg0, int depth) {
if (depth == 0) return Test43Lib.local15;
return Test43Lib.local14;
}
public Test43Class3 method10(int depth) {
if (depth == 0) return Test43Lib.local16;
return Test43Lib.local9;
}
public Test43Class1 method11(Test43Class5 arg0, int depth) {
if (depth == 0) return Test43Lib.local6;
if (depth<3) {
if (depth<=3) {
this.field2.method9(this.field2,depth-1);
}
}
if (depth>=1) {
if (depth<4) {
arg0.field2.method26(arg0.field17,depth-1);
}else {
arg0.field21=arg0.field2.method30(arg0.field13,arg0.field15,depth-1);
}
}else {
arg0.field1=arg0.field3.method3(depth-1);
}
return this.field3;
}
}
class Test43Class3 extends Test43Class1 {
public Test43Class5 field4;
public Test43Class1 field5;
public static Test43Class2 field6;
public Test43Class1 field7;
public static Test43Class1 field8;
public Test43Class5 field9;
public static Test43Class5 field10;
public static Test43Class5 field11;
public Test43Class2 field12;
public static Test43Class2 method12(int depth) {
if (depth == 0) return Test43Lib.local19;
field11.field14=field11.field13.method30(field11.field21,field10.field17,depth-1);
if (depth>=4) {
field10.field17=field11.field15;
}
return field11.field23;
}
public Test43Class5 method13(int depth) {
if (depth == 0) return Test43Lib.local29;
return this.field9;
}
public Test43Class3 method14(int depth) {
if (depth == 0) return Test43Lib.local12;
for (int local37 = 0; local37<=3; local37 += 1) {
for (int local38 = 0; local38<=1; local38 += 1) {
if (depth>1) {
this.field12=this.field12.method5(this,this,depth-1);
}else {
this.field1=this.field10;
}
}
}
return this;
}
}
class Test43Class4 extends Test43Class2 {
public Test43Class5 field13;
public static Test43Class1 field14;
public static Test43Class3 field15;
public static Test43Class1 field16;
public static Test43Class3 field17;
public static Test43Class3 field18;
public static Test43Class2 method15(int depth) {
if (depth == 0) return Test43Lib.local23;
return field17.field1;
}
public static void method16(Test43Class2 arg0, Test43Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<=3) {
if (depth<=1) {
arg1.field1=field18.field1;
}
}else {
if (depth<=2) {
for (int local39 = 0; local39<=1; local39 += 1) {
field18=field18;
}
}else {
field3.field3.method21(depth-1);
}
}
}
public static Test43Class5 method17(int depth) {
if (depth == 0) return Test43Lib.local29;
return field18.field9;
}
public Test43Class3 method18(Test43Class1 arg0, Test43Class5 arg1, int depth) {
if (depth == 0) return Test43Lib.local9;
for (int local40 = 0; local40<=3; local40 += 1) {
for (int local41 = 0; local41<=2; local41 += 1) {
if (depth>3) {
for (int local42 = 0; local42<=2; local42 += 1) {
for (int local43 = 0; local43<=0; local43 += 1) {
}
}
}else {
for (int local44 = 0; local44<=2; local44 += 1) {
arg1.field17=arg1.field18.method14(depth-1);
}
}
}
}
return arg1.field18;
}
public Test43Class2 method19(int depth) {
if (depth == 0) return Test43Lib.local6;
return this.field13;
}
public static void method20(int depth) {
if (depth == 0) return;
for (int local45 = 0; local45<=2; local45 += 1) {
if (depth<4) {
field3.field18=field3.field15;
}
}
}
public static void method21(int depth) {
if (depth == 0) return;
field3.field1=field15.field4.method3(depth-1);
for (int local46 = 0; local46<=3; local46 += 1) {
if (depth>3) {
field3.field3.method6(field15,field3.field3,depth-1);
}
}
}
public Test43Class1 method22(Test43Class3 arg0, Test43Class2 arg1, int depth) {
if (depth == 0) return Test43Lib.local29;
this.field1.method21(depth-1);
return arg1.field3;
}
public static Test43Class1 method23(Test43Class5 arg0, int depth) {
if (depth == 0) return Test43Lib.local26;
arg0.field3=field16.field1;
return field3.field3;
}
public Test43Class3 method24(Test43Class1 arg0, Test43Class5 arg1, int depth) {
if (depth == 0) return Test43Lib.local10;
if (depth==4) {
for (int local47 = 0; local47<=2; local47 += 1) {
for (int local48 = 0; local48<=0; local48 += 1) {
if (depth==4) {
for (int local49 = 0; local49<=1; local49 += 1) {
}
}
}
}
}else {
arg0=arg1.field13;
}
for (int local50 = 0; local50<=3; local50 += 1) {
for (int local51 = 0; local51<=1; local51 += 1) {
if (depth<=3) {
if (depth==1) {
this.field16=arg1.method11(arg1.field13,depth-1);
}
}
}
}
return this.field15;
}
}
class Test43Class5 extends Test43Class4 {
public Test43Class3 field19;
public static Test43Class3 field20;
public Test43Class1 field21;
public static Test43Class3 field22;
public Test43Class5 field23;
public static void method25(int depth) {
if (depth == 0) return;
if (depth>=3) {
field20.field11=field3.field13;
}
}
public void method26(Test43Class1 arg0, int depth) {
if (depth == 0) return;
this.field2.method11(this,depth-1);
}
public Test43Class5 method27(int depth) {
if (depth == 0) return Test43Lib.local26;
this.field17=this.field17;
this.field1=this.field2;
return this.field23;
}
public void method28(Test43Class1 arg0, int depth) {
if (depth == 0) return;
this.method16(this.field3,this.field18,depth-1);
if (depth>2) {
for (int local52 = 0; local52<=1; local52 += 1) {
for (int local53 = 0; local53<=2; local53 += 1) {
this.method26(this,depth-1);
}
}
}
}
public static Test43Class4 method29(int depth) {
if (depth == 0) return Test43Lib.local23;
field15.field1=field17.field10;
if (depth<3) {
field16.field1=field18.field1;
}else {
field16.field1.method21(depth-1);
}
return field18.field10;
}
public static Test43Class1 method30(Test43Class1 arg0, Test43Class3 arg1, int depth) {
if (depth == 0) return Test43Lib.local13;
for (int local54 = 0; local54<=0; local54 += 1) {
field15.field1=field20.field1;
}
return arg0;
}
public static void method31(Test43Class5 arg0, Test43Class4 arg1, int depth) {
if (depth == 0) return;
if (depth<=2) {
field22.field4.method28(arg0.field18,depth-1);
}
}
}
public class Test43{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test43Lib.local1 = new Test43Class1();
Benchmark.alloc(2);
Test43Lib.local2 = new Test43Class1();
Benchmark.alloc(3);
Test43Lib.local3 = new Test43Class2();
Benchmark.alloc(4);
Test43Lib.local4 = new Test43Class2();
Benchmark.alloc(5);
Test43Lib.local5 = new Test43Class2();
Benchmark.alloc(6);
Test43Lib.local6 = new Test43Class2();
Benchmark.alloc(7);
Test43Lib.local7 = new Test43Class2();
Benchmark.alloc(8);
Test43Lib.local8 = new Test43Class2();
Benchmark.alloc(9);
Test43Lib.local9 = new Test43Class3();
Benchmark.alloc(10);
Test43Lib.local10 = new Test43Class3();
Benchmark.alloc(11);
Test43Lib.local11 = new Test43Class3();
Benchmark.alloc(12);
Test43Lib.local12 = new Test43Class3();
Benchmark.alloc(13);
Test43Lib.local13 = new Test43Class3();
Benchmark.alloc(14);
Test43Lib.local14 = new Test43Class3();
Benchmark.alloc(15);
Test43Lib.local15 = new Test43Class3();
Benchmark.alloc(16);
Test43Lib.local16 = new Test43Class3();
Benchmark.alloc(17);
Test43Lib.local17 = new Test43Class3();
Benchmark.alloc(18);
Test43Lib.local18 = new Test43Class3();
Benchmark.alloc(19);
Test43Lib.local19 = new Test43Class4();
Benchmark.alloc(20);
Test43Lib.local20 = new Test43Class4();
Benchmark.alloc(21);
Test43Lib.local21 = new Test43Class4();
Benchmark.alloc(22);
Test43Lib.local22 = new Test43Class4();
Benchmark.alloc(23);
Test43Lib.local23 = new Test43Class5();
Benchmark.alloc(24);
Test43Lib.local24 = new Test43Class5();
Benchmark.alloc(25);
Test43Lib.local25 = new Test43Class5();
Benchmark.alloc(26);
Test43Lib.local26 = new Test43Class5();
Benchmark.alloc(27);
Test43Lib.local27 = new Test43Class5();
Benchmark.alloc(28);
Test43Lib.local28 = new Test43Class5();
Benchmark.alloc(29);
Test43Lib.local29 = new Test43Class5();
Test43Lib.local1.field1 = Test43Lib.local22;
Test43Lib.local2.field1 = Test43Lib.local25;
Test43Lib.local3.field2 = Test43Lib.local25;
Test43Lib.local3.field3 = Test43Lib.local20;
Test43Lib.local3.field1 = Test43Lib.local23;
Test43Lib.local4.field2 = Test43Lib.local26;
Test43Lib.local4.field3 = Test43Lib.local20;
Test43Lib.local4.field1 = Test43Lib.local26;
Test43Lib.local5.field2 = Test43Lib.local28;
Test43Lib.local5.field3 = Test43Lib.local20;
Test43Lib.local5.field1 = Test43Lib.local28;
Test43Lib.local6.field2 = Test43Lib.local28;
Test43Lib.local6.field3 = Test43Lib.local26;
Test43Lib.local6.field1 = Test43Lib.local20;
Test43Lib.local7.field2 = Test43Lib.local25;
Test43Lib.local7.field3 = Test43Lib.local28;
Test43Lib.local7.field1 = Test43Lib.local28;
Test43Lib.local8.field2 = Test43Lib.local26;
Test43Lib.local8.field3 = Test43Lib.local21;
Test43Lib.local8.field1 = Test43Lib.local28;
Test43Lib.local9.field4 = Test43Lib.local27;
Test43Lib.local9.field5 = Test43Lib.local3;
Test43Lib.local9.field6 = Test43Lib.local28;
Test43Lib.local9.field7 = Test43Lib.local29;
Test43Lib.local9.field8 = Test43Lib.local5;
Test43Lib.local9.field9 = Test43Lib.local29;
Test43Lib.local9.field10 = Test43Lib.local23;
Test43Lib.local9.field11 = Test43Lib.local26;
Test43Lib.local9.field12 = Test43Lib.local3;
Test43Lib.local9.field1 = Test43Lib.local23;
Test43Lib.local10.field4 = Test43Lib.local29;
Test43Lib.local10.field5 = Test43Lib.local11;
Test43Lib.local10.field6 = Test43Lib.local19;
Test43Lib.local10.field7 = Test43Lib.local27;
Test43Lib.local10.field8 = Test43Lib.local28;
Test43Lib.local10.field9 = Test43Lib.local27;
Test43Lib.local10.field10 = Test43Lib.local27;
Test43Lib.local10.field11 = Test43Lib.local27;
Test43Lib.local10.field12 = Test43Lib.local25;
Test43Lib.local10.field1 = Test43Lib.local28;
Test43Lib.local11.field4 = Test43Lib.local29;
Test43Lib.local11.field5 = Test43Lib.local29;
Test43Lib.local11.field6 = Test43Lib.local8;
Test43Lib.local11.field7 = Test43Lib.local10;
Test43Lib.local11.field8 = Test43Lib.local15;
Test43Lib.local11.field9 = Test43Lib.local27;
Test43Lib.local11.field10 = Test43Lib.local24;
Test43Lib.local11.field11 = Test43Lib.local28;
Test43Lib.local11.field12 = Test43Lib.local24;
Test43Lib.local11.field1 = Test43Lib.local22;
Test43Lib.local12.field4 = Test43Lib.local25;
Test43Lib.local12.field5 = Test43Lib.local15;
Test43Lib.local12.field6 = Test43Lib.local22;
Test43Lib.local12.field7 = Test43Lib.local1;
Test43Lib.local12.field8 = Test43Lib.local2;
Test43Lib.local12.field9 = Test43Lib.local29;
Test43Lib.local12.field10 = Test43Lib.local26;
Test43Lib.local12.field11 = Test43Lib.local26;
Test43Lib.local12.field12 = Test43Lib.local25;
Test43Lib.local12.field1 = Test43Lib.local20;
Test43Lib.local13.field4 = Test43Lib.local28;
Test43Lib.local13.field5 = Test43Lib.local7;
Test43Lib.local13.field6 = Test43Lib.local20;
Test43Lib.local13.field7 = Test43Lib.local7;
Test43Lib.local13.field8 = Test43Lib.local13;
Test43Lib.local13.field9 = Test43Lib.local23;
Test43Lib.local13.field10 = Test43Lib.local25;
Test43Lib.local13.field11 = Test43Lib.local27;
Test43Lib.local13.field12 = Test43Lib.local28;
Test43Lib.local13.field1 = Test43Lib.local28;
Test43Lib.local14.field4 = Test43Lib.local27;
Test43Lib.local14.field5 = Test43Lib.local20;
Test43Lib.local14.field6 = Test43Lib.local21;
Test43Lib.local14.field7 = Test43Lib.local19;
Test43Lib.local14.field8 = Test43Lib.local9;
Test43Lib.local14.field9 = Test43Lib.local25;
Test43Lib.local14.field10 = Test43Lib.local27;
Test43Lib.local14.field11 = Test43Lib.local29;
Test43Lib.local14.field12 = Test43Lib.local20;
Test43Lib.local14.field1 = Test43Lib.local23;
Test43Lib.local15.field4 = Test43Lib.local27;
Test43Lib.local15.field5 = Test43Lib.local1;
Test43Lib.local15.field6 = Test43Lib.local23;
Test43Lib.local15.field7 = Test43Lib.local8;
Test43Lib.local15.field8 = Test43Lib.local12;
Test43Lib.local15.field9 = Test43Lib.local26;
Test43Lib.local15.field10 = Test43Lib.local23;
Test43Lib.local15.field11 = Test43Lib.local27;
Test43Lib.local15.field12 = Test43Lib.local23;
Test43Lib.local15.field1 = Test43Lib.local19;
Test43Lib.local16.field4 = Test43Lib.local24;
Test43Lib.local16.field5 = Test43Lib.local29;
Test43Lib.local16.field6 = Test43Lib.local7;
Test43Lib.local16.field7 = Test43Lib.local24;
Test43Lib.local16.field8 = Test43Lib.local10;
Test43Lib.local16.field9 = Test43Lib.local27;
Test43Lib.local16.field10 = Test43Lib.local26;
Test43Lib.local16.field11 = Test43Lib.local23;
Test43Lib.local16.field12 = Test43Lib.local27;
Test43Lib.local16.field1 = Test43Lib.local25;
Test43Lib.local17.field4 = Test43Lib.local26;
Test43Lib.local17.field5 = Test43Lib.local4;
Test43Lib.local17.field6 = Test43Lib.local22;
Test43Lib.local17.field7 = Test43Lib.local12;
Test43Lib.local17.field8 = Test43Lib.local6;
Test43Lib.local17.field9 = Test43Lib.local28;
Test43Lib.local17.field10 = Test43Lib.local27;
Test43Lib.local17.field11 = Test43Lib.local27;
Test43Lib.local17.field12 = Test43Lib.local5;
Test43Lib.local17.field1 = Test43Lib.local25;
Test43Lib.local18.field4 = Test43Lib.local24;
Test43Lib.local18.field5 = Test43Lib.local4;
Test43Lib.local18.field6 = Test43Lib.local5;
Test43Lib.local18.field7 = Test43Lib.local3;
Test43Lib.local18.field8 = Test43Lib.local5;
Test43Lib.local18.field9 = Test43Lib.local29;
Test43Lib.local18.field10 = Test43Lib.local29;
Test43Lib.local18.field11 = Test43Lib.local28;
Test43Lib.local18.field12 = Test43Lib.local28;
Test43Lib.local18.field1 = Test43Lib.local29;
Test43Lib.local19.field13 = Test43Lib.local26;
Test43Lib.local19.field14 = Test43Lib.local3;
Test43Lib.local19.field15 = Test43Lib.local9;
Test43Lib.local19.field16 = Test43Lib.local1;
Test43Lib.local19.field17 = Test43Lib.local11;
Test43Lib.local19.field18 = Test43Lib.local9;
Test43Lib.local19.field2 = Test43Lib.local29;
Test43Lib.local19.field3 = Test43Lib.local21;
Test43Lib.local19.field1 = Test43Lib.local24;
Test43Lib.local20.field13 = Test43Lib.local23;
Test43Lib.local20.field14 = Test43Lib.local7;
Test43Lib.local20.field15 = Test43Lib.local16;
Test43Lib.local20.field16 = Test43Lib.local28;
Test43Lib.local20.field17 = Test43Lib.local15;
Test43Lib.local20.field18 = Test43Lib.local15;
Test43Lib.local20.field2 = Test43Lib.local24;
Test43Lib.local20.field3 = Test43Lib.local21;
Test43Lib.local20.field1 = Test43Lib.local23;
Test43Lib.local21.field13 = Test43Lib.local26;
Test43Lib.local21.field14 = Test43Lib.local7;
Test43Lib.local21.field15 = Test43Lib.local13;
Test43Lib.local21.field16 = Test43Lib.local24;
Test43Lib.local21.field17 = Test43Lib.local9;
Test43Lib.local21.field18 = Test43Lib.local14;
Test43Lib.local21.field2 = Test43Lib.local28;
Test43Lib.local21.field3 = Test43Lib.local28;
Test43Lib.local21.field1 = Test43Lib.local27;
Test43Lib.local22.field13 = Test43Lib.local29;
Test43Lib.local22.field14 = Test43Lib.local5;
Test43Lib.local22.field15 = Test43Lib.local15;
Test43Lib.local22.field16 = Test43Lib.local14;
Test43Lib.local22.field17 = Test43Lib.local16;
Test43Lib.local22.field18 = Test43Lib.local14;
Test43Lib.local22.field2 = Test43Lib.local25;
Test43Lib.local22.field3 = Test43Lib.local25;
Test43Lib.local22.field1 = Test43Lib.local20;
Test43Lib.local23.field19 = Test43Lib.local13;
Test43Lib.local23.field20 = Test43Lib.local10;
Test43Lib.local23.field21 = Test43Lib.local28;
Test43Lib.local23.field22 = Test43Lib.local9;
Test43Lib.local23.field23 = Test43Lib.local26;
Test43Lib.local23.field13 = Test43Lib.local24;
Test43Lib.local23.field14 = Test43Lib.local24;
Test43Lib.local23.field15 = Test43Lib.local17;
Test43Lib.local23.field16 = Test43Lib.local12;
Test43Lib.local23.field17 = Test43Lib.local18;
Test43Lib.local23.field18 = Test43Lib.local18;
Test43Lib.local23.field2 = Test43Lib.local28;
Test43Lib.local23.field3 = Test43Lib.local29;
Test43Lib.local23.field1 = Test43Lib.local27;
Test43Lib.local24.field19 = Test43Lib.local16;
Test43Lib.local24.field20 = Test43Lib.local16;
Test43Lib.local24.field21 = Test43Lib.local10;
Test43Lib.local24.field22 = Test43Lib.local14;
Test43Lib.local24.field23 = Test43Lib.local28;
Test43Lib.local24.field13 = Test43Lib.local26;
Test43Lib.local24.field14 = Test43Lib.local12;
Test43Lib.local24.field15 = Test43Lib.local15;
Test43Lib.local24.field16 = Test43Lib.local17;
Test43Lib.local24.field17 = Test43Lib.local15;
Test43Lib.local24.field18 = Test43Lib.local10;
Test43Lib.local24.field2 = Test43Lib.local29;
Test43Lib.local24.field3 = Test43Lib.local23;
Test43Lib.local24.field1 = Test43Lib.local26;
Test43Lib.local25.field19 = Test43Lib.local11;
Test43Lib.local25.field20 = Test43Lib.local11;
Test43Lib.local25.field21 = Test43Lib.local23;
Test43Lib.local25.field22 = Test43Lib.local16;
Test43Lib.local25.field23 = Test43Lib.local28;
Test43Lib.local25.field13 = Test43Lib.local25;
Test43Lib.local25.field14 = Test43Lib.local22;
Test43Lib.local25.field15 = Test43Lib.local18;
Test43Lib.local25.field16 = Test43Lib.local21;
Test43Lib.local25.field17 = Test43Lib.local14;
Test43Lib.local25.field18 = Test43Lib.local18;
Test43Lib.local25.field2 = Test43Lib.local27;
Test43Lib.local25.field3 = Test43Lib.local24;
Test43Lib.local25.field1 = Test43Lib.local22;
Test43Lib.local26.field19 = Test43Lib.local15;
Test43Lib.local26.field20 = Test43Lib.local10;
Test43Lib.local26.field21 = Test43Lib.local23;
Test43Lib.local26.field22 = Test43Lib.local9;
Test43Lib.local26.field23 = Test43Lib.local24;
Test43Lib.local26.field13 = Test43Lib.local29;
Test43Lib.local26.field14 = Test43Lib.local19;
Test43Lib.local26.field15 = Test43Lib.local11;
Test43Lib.local26.field16 = Test43Lib.local29;
Test43Lib.local26.field17 = Test43Lib.local17;
Test43Lib.local26.field18 = Test43Lib.local16;
Test43Lib.local26.field2 = Test43Lib.local23;
Test43Lib.local26.field3 = Test43Lib.local22;
Test43Lib.local26.field1 = Test43Lib.local24;
Test43Lib.local27.field19 = Test43Lib.local18;
Test43Lib.local27.field20 = Test43Lib.local10;
Test43Lib.local27.field21 = Test43Lib.local3;
Test43Lib.local27.field22 = Test43Lib.local11;
Test43Lib.local27.field23 = Test43Lib.local24;
Test43Lib.local27.field13 = Test43Lib.local28;
Test43Lib.local27.field14 = Test43Lib.local5;
Test43Lib.local27.field15 = Test43Lib.local15;
Test43Lib.local27.field16 = Test43Lib.local4;
Test43Lib.local27.field17 = Test43Lib.local11;
Test43Lib.local27.field18 = Test43Lib.local13;
Test43Lib.local27.field2 = Test43Lib.local27;
Test43Lib.local27.field3 = Test43Lib.local26;
Test43Lib.local27.field1 = Test43Lib.local24;
Test43Lib.local28.field19 = Test43Lib.local17;
Test43Lib.local28.field20 = Test43Lib.local11;
Test43Lib.local28.field21 = Test43Lib.local4;
Test43Lib.local28.field22 = Test43Lib.local16;
Test43Lib.local28.field23 = Test43Lib.local23;
Test43Lib.local28.field13 = Test43Lib.local23;
Test43Lib.local28.field14 = Test43Lib.local23;
Test43Lib.local28.field15 = Test43Lib.local18;
Test43Lib.local28.field16 = Test43Lib.local9;
Test43Lib.local28.field17 = Test43Lib.local11;
Test43Lib.local28.field18 = Test43Lib.local15;
Test43Lib.local28.field2 = Test43Lib.local24;
Test43Lib.local28.field3 = Test43Lib.local27;
Test43Lib.local28.field1 = Test43Lib.local23;
Test43Lib.local29.field19 = Test43Lib.local11;
Test43Lib.local29.field20 = Test43Lib.local12;
Test43Lib.local29.field21 = Test43Lib.local5;
Test43Lib.local29.field22 = Test43Lib.local9;
Test43Lib.local29.field23 = Test43Lib.local25;
Test43Lib.local29.field13 = Test43Lib.local23;
Test43Lib.local29.field14 = Test43Lib.local11;
Test43Lib.local29.field15 = Test43Lib.local14;
Test43Lib.local29.field16 = Test43Lib.local6;
Test43Lib.local29.field17 = Test43Lib.local17;
Test43Lib.local29.field18 = Test43Lib.local12;
Test43Lib.local29.field2 = Test43Lib.local23;
Test43Lib.local29.field3 = Test43Lib.local25;
Test43Lib.local29.field1 = Test43Lib.local26;
if (inputValue<1) {
if (inputValue>3) {
if (inputValue>=1) {
for (int local55 = 0; local55<=3; local55 += 1) {
Test43Lib.local29.field14=Test43Lib.local22.field14;
}
}else {
for (int local56 = 0; local56<=1; local56 += 1) {
if (inputValue<=1) {
}else {
}
}
}
}
}
Test43Lib.local17.field4.method20(3);
if (inputValue>2) {
Test43Lib.local5=Test43Lib.local4.field2;
}else {
Test43Lib.local13.field11.method19(3);
}
for (int local57 = 0; local57<=1; local57 += 1) {
Test43Lib.local29.field3.method24(Test43Lib.local18.field10,Test43Lib.local4.field2,3);
}
Test43Lib.local26=Test43Lib.local9.field9;
if (inputValue>4) {
if (inputValue<3) {
for (int local58 = 0; local58<=3; local58 += 1) {
for (int local59 = 0; local59<=3; local59 += 1) {
Test43Lib.local11.field10.method21(3);
}
}
}else {
if (inputValue>2) {
if (inputValue==1) {
Test43Lib.local22.method21(3);
}else {
Test43Lib.local16.field6=Test43Lib.local26.field23;
}
}else {
Test43Lib.local15.field7=Test43Lib.local27.field23.method19(3);
}
}
}
Test43Lib.local19=Test43Lib.local29.field3;
for (int local60 = 0; local60<=1; local60 += 1) {
Test43Lib.local25.field23.method30(Test43Lib.local16.field8,Test43Lib.local15,3);
}
Test43Lib.local14.field8=Test43Lib.local11.field6;
Test43Lib.local9.field5=Test43Lib.local3.field2.method11(Test43Lib.local8.field2,3);
Benchmark.test(1,Test43Lib.local1);
Benchmark.test(2,Test43Lib.local2);
Benchmark.test(3,Test43Lib.local3);
Benchmark.test(4,Test43Lib.local4);
Benchmark.test(5,Test43Lib.local5);
Benchmark.test(6,Test43Lib.local6);
Benchmark.test(7,Test43Lib.local7);
Benchmark.test(8,Test43Lib.local8);
Benchmark.test(9,Test43Lib.local9);
Benchmark.test(10,Test43Lib.local10);
Benchmark.test(11,Test43Lib.local11);
Benchmark.test(12,Test43Lib.local12);
Benchmark.test(13,Test43Lib.local13);
Benchmark.test(14,Test43Lib.local14);
Benchmark.test(15,Test43Lib.local15);
Benchmark.test(16,Test43Lib.local16);
Benchmark.test(17,Test43Lib.local17);
Benchmark.test(18,Test43Lib.local18);
Benchmark.test(19,Test43Lib.local19);
Benchmark.test(20,Test43Lib.local20);
Benchmark.test(21,Test43Lib.local21);
Benchmark.test(22,Test43Lib.local22);
Benchmark.test(23,Test43Lib.local23);
Benchmark.test(24,Test43Lib.local24);
Benchmark.test(25,Test43Lib.local25);
Benchmark.test(26,Test43Lib.local26);
Benchmark.test(27,Test43Lib.local27);
Benchmark.test(28,Test43Lib.local28);
Benchmark.test(29,Test43Lib.local29);
Benchmark.test(30,Test43Lib.local1.field1);
Benchmark.test(31,Test43Lib.local2.field1);
Benchmark.test(32,Test43Lib.local3.field2);
Benchmark.test(33,Test43Lib.local3.field3);
Benchmark.test(34,Test43Lib.local3.field1);
Benchmark.test(35,Test43Lib.local4.field2);
Benchmark.test(36,Test43Lib.local4.field3);
Benchmark.test(37,Test43Lib.local4.field1);
Benchmark.test(38,Test43Lib.local5.field2);
Benchmark.test(39,Test43Lib.local5.field3);
Benchmark.test(40,Test43Lib.local5.field1);
Benchmark.test(41,Test43Lib.local6.field2);
Benchmark.test(42,Test43Lib.local6.field3);
Benchmark.test(43,Test43Lib.local6.field1);
Benchmark.test(44,Test43Lib.local7.field2);
Benchmark.test(45,Test43Lib.local7.field3);
Benchmark.test(46,Test43Lib.local7.field1);
Benchmark.test(47,Test43Lib.local8.field2);
Benchmark.test(48,Test43Lib.local8.field3);
Benchmark.test(49,Test43Lib.local8.field1);
Benchmark.test(50,Test43Lib.local9.field4);
Benchmark.test(51,Test43Lib.local9.field5);
Benchmark.test(52,Test43Lib.local9.field6);
Benchmark.test(53,Test43Lib.local9.field7);
Benchmark.test(54,Test43Lib.local9.field8);
Benchmark.test(55,Test43Lib.local9.field9);
Benchmark.test(56,Test43Lib.local9.field10);
Benchmark.test(57,Test43Lib.local9.field11);
Benchmark.test(58,Test43Lib.local9.field12);
Benchmark.test(59,Test43Lib.local9.field1);
Benchmark.test(60,Test43Lib.local10.field4);
Benchmark.test(61,Test43Lib.local10.field5);
Benchmark.test(62,Test43Lib.local10.field6);
Benchmark.test(63,Test43Lib.local10.field7);
Benchmark.test(64,Test43Lib.local10.field8);
Benchmark.test(65,Test43Lib.local10.field9);
Benchmark.test(66,Test43Lib.local10.field10);
Benchmark.test(67,Test43Lib.local10.field11);
Benchmark.test(68,Test43Lib.local10.field12);
Benchmark.test(69,Test43Lib.local10.field1);
Benchmark.test(70,Test43Lib.local11.field4);
Benchmark.test(71,Test43Lib.local11.field5);
Benchmark.test(72,Test43Lib.local11.field6);
Benchmark.test(73,Test43Lib.local11.field7);
Benchmark.test(74,Test43Lib.local11.field8);
Benchmark.test(75,Test43Lib.local11.field9);
Benchmark.test(76,Test43Lib.local11.field10);
Benchmark.test(77,Test43Lib.local11.field11);
Benchmark.test(78,Test43Lib.local11.field12);
Benchmark.test(79,Test43Lib.local11.field1);
Benchmark.test(80,Test43Lib.local12.field4);
Benchmark.test(81,Test43Lib.local12.field5);
Benchmark.test(82,Test43Lib.local12.field6);
Benchmark.test(83,Test43Lib.local12.field7);
Benchmark.test(84,Test43Lib.local12.field8);
Benchmark.test(85,Test43Lib.local12.field9);
Benchmark.test(86,Test43Lib.local12.field10);
Benchmark.test(87,Test43Lib.local12.field11);
Benchmark.test(88,Test43Lib.local12.field12);
Benchmark.test(89,Test43Lib.local12.field1);
Benchmark.test(90,Test43Lib.local13.field4);
Benchmark.test(91,Test43Lib.local13.field5);
Benchmark.test(92,Test43Lib.local13.field6);
Benchmark.test(93,Test43Lib.local13.field7);
Benchmark.test(94,Test43Lib.local13.field8);
Benchmark.test(95,Test43Lib.local13.field9);
Benchmark.test(96,Test43Lib.local13.field10);
Benchmark.test(97,Test43Lib.local13.field11);
Benchmark.test(98,Test43Lib.local13.field12);
Benchmark.test(99,Test43Lib.local13.field1);
Benchmark.test(100,Test43Lib.local14.field4);
Benchmark.test(101,Test43Lib.local14.field5);
Benchmark.test(102,Test43Lib.local14.field6);
Benchmark.test(103,Test43Lib.local14.field7);
Benchmark.test(104,Test43Lib.local14.field8);
Benchmark.test(105,Test43Lib.local14.field9);
Benchmark.test(106,Test43Lib.local14.field10);
Benchmark.test(107,Test43Lib.local14.field11);
Benchmark.test(108,Test43Lib.local14.field12);
Benchmark.test(109,Test43Lib.local14.field1);
Benchmark.test(110,Test43Lib.local15.field4);
Benchmark.test(111,Test43Lib.local15.field5);
Benchmark.test(112,Test43Lib.local15.field6);
Benchmark.test(113,Test43Lib.local15.field7);
Benchmark.test(114,Test43Lib.local15.field8);
Benchmark.test(115,Test43Lib.local15.field9);
Benchmark.test(116,Test43Lib.local15.field10);
Benchmark.test(117,Test43Lib.local15.field11);
Benchmark.test(118,Test43Lib.local15.field12);
Benchmark.test(119,Test43Lib.local15.field1);
Benchmark.test(120,Test43Lib.local16.field4);
Benchmark.test(121,Test43Lib.local16.field5);
Benchmark.test(122,Test43Lib.local16.field6);
Benchmark.test(123,Test43Lib.local16.field7);
Benchmark.test(124,Test43Lib.local16.field8);
Benchmark.test(125,Test43Lib.local16.field9);
Benchmark.test(126,Test43Lib.local16.field10);
Benchmark.test(127,Test43Lib.local16.field11);
Benchmark.test(128,Test43Lib.local16.field12);
Benchmark.test(129,Test43Lib.local16.field1);
Benchmark.test(130,Test43Lib.local17.field4);
Benchmark.test(131,Test43Lib.local17.field5);
Benchmark.test(132,Test43Lib.local17.field6);
Benchmark.test(133,Test43Lib.local17.field7);
Benchmark.test(134,Test43Lib.local17.field8);
Benchmark.test(135,Test43Lib.local17.field9);
Benchmark.test(136,Test43Lib.local17.field10);
Benchmark.test(137,Test43Lib.local17.field11);
Benchmark.test(138,Test43Lib.local17.field12);
Benchmark.test(139,Test43Lib.local17.field1);
Benchmark.test(140,Test43Lib.local18.field4);
Benchmark.test(141,Test43Lib.local18.field5);
Benchmark.test(142,Test43Lib.local18.field6);
Benchmark.test(143,Test43Lib.local18.field7);
Benchmark.test(144,Test43Lib.local18.field8);
Benchmark.test(145,Test43Lib.local18.field9);
Benchmark.test(146,Test43Lib.local18.field10);
Benchmark.test(147,Test43Lib.local18.field11);
Benchmark.test(148,Test43Lib.local18.field12);
Benchmark.test(149,Test43Lib.local18.field1);
Benchmark.test(150,Test43Lib.local19.field13);
Benchmark.test(151,Test43Lib.local19.field14);
Benchmark.test(152,Test43Lib.local19.field15);
Benchmark.test(153,Test43Lib.local19.field16);
Benchmark.test(154,Test43Lib.local19.field17);
Benchmark.test(155,Test43Lib.local19.field18);
Benchmark.test(156,Test43Lib.local19.field2);
Benchmark.test(157,Test43Lib.local19.field3);
Benchmark.test(158,Test43Lib.local19.field1);
Benchmark.test(159,Test43Lib.local20.field13);
Benchmark.test(160,Test43Lib.local20.field14);
Benchmark.test(161,Test43Lib.local20.field15);
Benchmark.test(162,Test43Lib.local20.field16);
Benchmark.test(163,Test43Lib.local20.field17);
Benchmark.test(164,Test43Lib.local20.field18);
Benchmark.test(165,Test43Lib.local20.field2);
Benchmark.test(166,Test43Lib.local20.field3);
Benchmark.test(167,Test43Lib.local20.field1);
Benchmark.test(168,Test43Lib.local21.field13);
Benchmark.test(169,Test43Lib.local21.field14);
Benchmark.test(170,Test43Lib.local21.field15);
Benchmark.test(171,Test43Lib.local21.field16);
Benchmark.test(172,Test43Lib.local21.field17);
Benchmark.test(173,Test43Lib.local21.field18);
Benchmark.test(174,Test43Lib.local21.field2);
Benchmark.test(175,Test43Lib.local21.field3);
Benchmark.test(176,Test43Lib.local21.field1);
Benchmark.test(177,Test43Lib.local22.field13);
Benchmark.test(178,Test43Lib.local22.field14);
Benchmark.test(179,Test43Lib.local22.field15);
Benchmark.test(180,Test43Lib.local22.field16);
Benchmark.test(181,Test43Lib.local22.field17);
Benchmark.test(182,Test43Lib.local22.field18);
Benchmark.test(183,Test43Lib.local22.field2);
Benchmark.test(184,Test43Lib.local22.field3);
Benchmark.test(185,Test43Lib.local22.field1);
Benchmark.test(186,Test43Lib.local23.field19);
Benchmark.test(187,Test43Lib.local23.field20);
Benchmark.test(188,Test43Lib.local23.field21);
Benchmark.test(189,Test43Lib.local23.field22);
Benchmark.test(190,Test43Lib.local23.field23);
Benchmark.test(191,Test43Lib.local23.field13);
Benchmark.test(192,Test43Lib.local23.field14);
Benchmark.test(193,Test43Lib.local23.field15);
Benchmark.test(194,Test43Lib.local23.field16);
Benchmark.test(195,Test43Lib.local23.field17);
Benchmark.test(196,Test43Lib.local23.field18);
Benchmark.test(197,Test43Lib.local23.field2);
Benchmark.test(198,Test43Lib.local23.field3);
Benchmark.test(199,Test43Lib.local23.field1);
Benchmark.test(200,Test43Lib.local24.field19);
Benchmark.test(201,Test43Lib.local24.field20);
Benchmark.test(202,Test43Lib.local24.field21);
Benchmark.test(203,Test43Lib.local24.field22);
Benchmark.test(204,Test43Lib.local24.field23);
Benchmark.test(205,Test43Lib.local24.field13);
Benchmark.test(206,Test43Lib.local24.field14);
Benchmark.test(207,Test43Lib.local24.field15);
Benchmark.test(208,Test43Lib.local24.field16);
Benchmark.test(209,Test43Lib.local24.field17);
Benchmark.test(210,Test43Lib.local24.field18);
Benchmark.test(211,Test43Lib.local24.field2);
Benchmark.test(212,Test43Lib.local24.field3);
Benchmark.test(213,Test43Lib.local24.field1);
Benchmark.test(214,Test43Lib.local25.field19);
Benchmark.test(215,Test43Lib.local25.field20);
Benchmark.test(216,Test43Lib.local25.field21);
Benchmark.test(217,Test43Lib.local25.field22);
Benchmark.test(218,Test43Lib.local25.field23);
Benchmark.test(219,Test43Lib.local25.field13);
Benchmark.test(220,Test43Lib.local25.field14);
Benchmark.test(221,Test43Lib.local25.field15);
Benchmark.test(222,Test43Lib.local25.field16);
Benchmark.test(223,Test43Lib.local25.field17);
Benchmark.test(224,Test43Lib.local25.field18);
Benchmark.test(225,Test43Lib.local25.field2);
Benchmark.test(226,Test43Lib.local25.field3);
Benchmark.test(227,Test43Lib.local25.field1);
Benchmark.test(228,Test43Lib.local26.field19);
Benchmark.test(229,Test43Lib.local26.field20);
Benchmark.test(230,Test43Lib.local26.field21);
Benchmark.test(231,Test43Lib.local26.field22);
Benchmark.test(232,Test43Lib.local26.field23);
Benchmark.test(233,Test43Lib.local26.field13);
Benchmark.test(234,Test43Lib.local26.field14);
Benchmark.test(235,Test43Lib.local26.field15);
Benchmark.test(236,Test43Lib.local26.field16);
Benchmark.test(237,Test43Lib.local26.field17);
Benchmark.test(238,Test43Lib.local26.field18);
Benchmark.test(239,Test43Lib.local26.field2);
Benchmark.test(240,Test43Lib.local26.field3);
Benchmark.test(241,Test43Lib.local26.field1);
Benchmark.test(242,Test43Lib.local27.field19);
Benchmark.test(243,Test43Lib.local27.field20);
Benchmark.test(244,Test43Lib.local27.field21);
Benchmark.test(245,Test43Lib.local27.field22);
Benchmark.test(246,Test43Lib.local27.field23);
Benchmark.test(247,Test43Lib.local27.field13);
Benchmark.test(248,Test43Lib.local27.field14);
Benchmark.test(249,Test43Lib.local27.field15);
Benchmark.test(250,Test43Lib.local27.field16);
Benchmark.test(251,Test43Lib.local27.field17);
Benchmark.test(252,Test43Lib.local27.field18);
Benchmark.test(253,Test43Lib.local27.field2);
Benchmark.test(254,Test43Lib.local27.field3);
Benchmark.test(255,Test43Lib.local27.field1);
Benchmark.test(256,Test43Lib.local28.field19);
Benchmark.test(257,Test43Lib.local28.field20);
Benchmark.test(258,Test43Lib.local28.field21);
Benchmark.test(259,Test43Lib.local28.field22);
Benchmark.test(260,Test43Lib.local28.field23);
Benchmark.test(261,Test43Lib.local28.field13);
Benchmark.test(262,Test43Lib.local28.field14);
Benchmark.test(263,Test43Lib.local28.field15);
Benchmark.test(264,Test43Lib.local28.field16);
Benchmark.test(265,Test43Lib.local28.field17);
Benchmark.test(266,Test43Lib.local28.field18);
Benchmark.test(267,Test43Lib.local28.field2);
Benchmark.test(268,Test43Lib.local28.field3);
Benchmark.test(269,Test43Lib.local28.field1);
Benchmark.test(270,Test43Lib.local29.field19);
Benchmark.test(271,Test43Lib.local29.field20);
Benchmark.test(272,Test43Lib.local29.field21);
Benchmark.test(273,Test43Lib.local29.field22);
Benchmark.test(274,Test43Lib.local29.field23);
Benchmark.test(275,Test43Lib.local29.field13);
Benchmark.test(276,Test43Lib.local29.field14);
Benchmark.test(277,Test43Lib.local29.field15);
Benchmark.test(278,Test43Lib.local29.field16);
Benchmark.test(279,Test43Lib.local29.field17);
Benchmark.test(280,Test43Lib.local29.field18);
Benchmark.test(281,Test43Lib.local29.field2);
Benchmark.test(282,Test43Lib.local29.field3);
Benchmark.test(283,Test43Lib.local29.field1);
Benchmark.print();
}
}
