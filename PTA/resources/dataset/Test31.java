package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test31Lib{
public static Test31Class1 local1;
public static Test31Class1 local2;
public static Test31Class1 local3;
public static Test31Class1 local4;
public static Test31Class1 local5;
public static Test31Class1 local6;
public static Test31Class1 local7;
public static Test31Class1 local8;
public static Test31Class1 local9;
public static Test31Class1 local10;
public static Test31Class2 local11;
public static Test31Class2 local12;
public static Test31Class2 local13;
public static Test31Class2 local14;
public static Test31Class3 local15;
public static Test31Class3 local16;
public static Test31Class3 local17;
public static Test31Class3 local18;
public static Test31Class3 local19;
public static Test31Class3 local20;
public static Test31Class4 local21;
public static Test31Class4 local22;
public static Test31Class4 local23;
public static Test31Class4 local24;
public static Test31Class4 local25;
public static Test31Class4 local26;
public static Test31Class4 local27;
public static Test31Class4 local28;
public static Test31Class5 local29;
public static Test31Class5 local30;
public static Test31Class5 local31;
public static Test31Class5 local32;
public static Test31Class5 local33;
public static Test31Class5 local34;
public static Test31Class5 local35;
public static Test31Class5 local36;
}
class Test31Class1 extends BasicClass {
public static Test31Class2 field1;
public Test31Class4 field2;
public static Test31Class2 field3;
public static Test31Class3 field4;
public static Test31Class1 method1(int depth) {
if (depth == 0) return Test31Lib.local16;
return field1.field3;
}
}
class Test31Class2 extends Test31Class1 {
public Test31Class1 field5;
public static Test31Class5 field6;
public Test31Class5 field7;
public Test31Class3 field8;
public static Test31Class1 field9;
public static void method2(Test31Class3 arg0, int depth) {
if (depth == 0) return;
}
public static void method3(Test31Class2 arg0, Test31Class4 arg1, int depth) {
if (depth == 0) return;
}
public void method4(Test31Class3 arg0, Test31Class2 arg1, int depth) {
if (depth == 0) return;
this.field7=arg0.field11;
}
public void method5(Test31Class5 arg0, Test31Class5 arg1, int depth) {
if (depth == 0) return;
arg0.field3=arg1.field3;
arg1.field2.method3(arg0.field1,this.field2,depth-1);
}
public static Test31Class3 method6(Test31Class1 arg0, int depth) {
if (depth == 0) return Test31Lib.local20;
if (depth<3) {
field9.field2=arg0.field2;
}
return field4;
}
public static void method7(Test31Class2 arg0, Test31Class1 arg1, int depth) {
if (depth == 0) return;
}
public static Test31Class5 method8(Test31Class1 arg0, Test31Class1 arg1, int depth) {
if (depth == 0) return Test31Lib.local33;
arg1.field3=field1.field8.method16(field9.field2,depth-1);
if (depth<4) {
for (int local37 = 0; local37<=2; local37 += 1) {
for (int local38 = 0; local38<=2; local38 += 1) {
for (int local39 = 0; local39<=3; local39 += 1) {
field1.field6=field1.field7;
}
}
}
}
return field4.field11;
}
public void method9(Test31Class4 arg0, int depth) {
if (depth == 0) return;
this.method5(arg0.field7,arg0.field7,depth-1);
if (depth>3) {
if (depth>=2) {
for (int local40 = 0; local40<=0; local40 += 1) {
arg0.field9=this.field2.method18(this.field4,depth-1);
}
}
}else {
this.field4=this.field8;
}
}
public void method10(int depth) {
if (depth == 0) return;
}
}
class Test31Class3 extends Test31Class1 {
public Test31Class2 field10;
public static Test31Class5 field11;
public Test31Class2 field12;
public Test31Class1 field13;
public Test31Class3 field14;
public static Test31Class3 field15;
public Test31Class2 field16;
public static Test31Class5 field17;
public static Test31Class4 field18;
public static Test31Class5 method11(Test31Class5 arg0, Test31Class1 arg1, int depth) {
if (depth == 0) return Test31Lib.local31;
for (int local41 = 0; local41<=2; local41 += 1) {
field17.field29=field15.field17;
}
if (depth==3) {
field17.field1=field4.field10;
}else {
for (int local42 = 0; local42<=1; local42 += 1) {
arg0.field33=field15.field17.method20(depth-1);
}
}
return field1.field7;
}
public Test31Class5 method12(Test31Class1 arg0, int depth) {
if (depth == 0) return Test31Lib.local35;
return this.field11;
}
public static Test31Class5 method13(int depth) {
if (depth == 0) return Test31Lib.local29;
for (int local43 = 0; local43<=0; local43 += 1) {
field15.field18.method19(field4.field2,field17.field31,depth-1);
}
return field1.field7;
}
public static Test31Class3 method14(Test31Class1 arg0, Test31Class5 arg1, int depth) {
if (depth == 0) return Test31Lib.local17;
for (int local44 = 0; local44<=1; local44 += 1) {
if (depth<=2) {
field11.field3=field17.field28;
}
}
field4.method15(field15.field18,depth-1);
return field3.field8;
}
public Test31Class4 method15(Test31Class2 arg0, int depth) {
if (depth == 0) return Test31Lib.local28;
for (int local45 = 0; local45<=0; local45 += 1) {
if (depth<=1) {
if (depth>1) {
this.field12.method4(this.field14,arg0,depth-1);
}else {
for (int local46 = 0; local46<=2; local46 += 1) {
for (int local47 = 0; local47<=3; local47 += 1) {
}
}
}
}else {
if (depth==3) {
if (depth<4) {
if (depth>4) {
}
}else {
if (depth<4) {
}else {
}
}
}else {
arg0=this.field12;
}
}
}
return arg0.field2;
}
public Test31Class4 method16(Test31Class2 arg0, int depth) {
if (depth == 0) return Test31Lib.local27;
this.field2=arg0.field2;
if (depth<=3) {
for (int local48 = 0; local48<=1; local48 += 1) {
arg0.field5=arg0.field4.method17(depth-1);
}
}
return this.field2;
}
public static Test31Class3 method17(int depth) {
if (depth == 0) return Test31Lib.local20;
for (int local49 = 0; local49<=2; local49 += 1) {
field11.field1=field1.field2;
}
return field4;
}
}
class Test31Class4 extends Test31Class2 {
public static Test31Class1 field19;
public Test31Class5 field20;
public static Test31Class1 field21;
public Test31Class5 field22;
public static Test31Class5 field23;
public static Test31Class4 field24;
public static Test31Class1 field25;
public Test31Class2 field26;
public static Test31Class2 field27;
public static Test31Class2 method18(Test31Class3 arg0, int depth) {
if (depth == 0) return Test31Lib.local25;
return field24.field2;
}
public void method19(Test31Class2 arg0, Test31Class5 arg1, int depth) {
if (depth == 0) return;
}
}
class Test31Class5 extends Test31Class1 {
public Test31Class4 field28;
public Test31Class5 field29;
public Test31Class5 field30;
public Test31Class5 field31;
public static Test31Class5 field32;
public static Test31Class1 field33;
public Test31Class5 field34;
public Test31Class2 field35;
public Test31Class1 method20(int depth) {
if (depth == 0) return Test31Lib.local5;
this.field35=this.field35;
return this.field2;
}
public Test31Class2 method21(Test31Class5 arg0, Test31Class4 arg1, int depth) {
if (depth == 0) return Test31Lib.local13;
this.field4=arg1.field8;
arg1.field25=arg0.field4.method16(this.field2,depth-1);
return arg0.field3;
}
public Test31Class2 method22(Test31Class5 arg0, Test31Class2 arg1, int depth) {
if (depth == 0) return Test31Lib.local24;
for (int local50 = 0; local50<=0; local50 += 1) {
arg0.field28=arg1.field2;
}
if (depth>=1) {
this.field35=this.field30.method22(arg0.field31,arg1.field1,depth-1);
}
return this.field3;
}
public static Test31Class3 method23(Test31Class1 arg0, Test31Class5 arg1, int depth) {
if (depth == 0) return Test31Lib.local20;
return field4.field14;
}
public Test31Class4 method24(Test31Class5 arg0, int depth) {
if (depth == 0) return Test31Lib.local22;
return this.field28;
}
}
public class Test31{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test31Lib.local1 = new Test31Class1();
Benchmark.alloc(2);
Test31Lib.local2 = new Test31Class1();
Benchmark.alloc(3);
Test31Lib.local3 = new Test31Class1();
Benchmark.alloc(4);
Test31Lib.local4 = new Test31Class1();
Benchmark.alloc(5);
Test31Lib.local5 = new Test31Class1();
Benchmark.alloc(6);
Test31Lib.local6 = new Test31Class1();
Benchmark.alloc(7);
Test31Lib.local7 = new Test31Class1();
Benchmark.alloc(8);
Test31Lib.local8 = new Test31Class1();
Benchmark.alloc(9);
Test31Lib.local9 = new Test31Class1();
Benchmark.alloc(10);
Test31Lib.local10 = new Test31Class1();
Benchmark.alloc(11);
Test31Lib.local11 = new Test31Class2();
Benchmark.alloc(12);
Test31Lib.local12 = new Test31Class2();
Benchmark.alloc(13);
Test31Lib.local13 = new Test31Class2();
Benchmark.alloc(14);
Test31Lib.local14 = new Test31Class2();
Benchmark.alloc(15);
Test31Lib.local15 = new Test31Class3();
Benchmark.alloc(16);
Test31Lib.local16 = new Test31Class3();
Benchmark.alloc(17);
Test31Lib.local17 = new Test31Class3();
Benchmark.alloc(18);
Test31Lib.local18 = new Test31Class3();
Benchmark.alloc(19);
Test31Lib.local19 = new Test31Class3();
Benchmark.alloc(20);
Test31Lib.local20 = new Test31Class3();
Benchmark.alloc(21);
Test31Lib.local21 = new Test31Class4();
Benchmark.alloc(22);
Test31Lib.local22 = new Test31Class4();
Benchmark.alloc(23);
Test31Lib.local23 = new Test31Class4();
Benchmark.alloc(24);
Test31Lib.local24 = new Test31Class4();
Benchmark.alloc(25);
Test31Lib.local25 = new Test31Class4();
Benchmark.alloc(26);
Test31Lib.local26 = new Test31Class4();
Benchmark.alloc(27);
Test31Lib.local27 = new Test31Class4();
Benchmark.alloc(28);
Test31Lib.local28 = new Test31Class4();
Benchmark.alloc(29);
Test31Lib.local29 = new Test31Class5();
Benchmark.alloc(30);
Test31Lib.local30 = new Test31Class5();
Benchmark.alloc(31);
Test31Lib.local31 = new Test31Class5();
Benchmark.alloc(32);
Test31Lib.local32 = new Test31Class5();
Benchmark.alloc(33);
Test31Lib.local33 = new Test31Class5();
Benchmark.alloc(34);
Test31Lib.local34 = new Test31Class5();
Benchmark.alloc(35);
Test31Lib.local35 = new Test31Class5();
Benchmark.alloc(36);
Test31Lib.local36 = new Test31Class5();
Test31Lib.local1.field1 = Test31Lib.local28;
Test31Lib.local1.field2 = Test31Lib.local27;
Test31Lib.local1.field3 = Test31Lib.local21;
Test31Lib.local1.field4 = Test31Lib.local20;
Test31Lib.local2.field1 = Test31Lib.local14;
Test31Lib.local2.field2 = Test31Lib.local26;
Test31Lib.local2.field3 = Test31Lib.local21;
Test31Lib.local2.field4 = Test31Lib.local16;
Test31Lib.local3.field1 = Test31Lib.local14;
Test31Lib.local3.field2 = Test31Lib.local27;
Test31Lib.local3.field3 = Test31Lib.local12;
Test31Lib.local3.field4 = Test31Lib.local17;
Test31Lib.local4.field1 = Test31Lib.local26;
Test31Lib.local4.field2 = Test31Lib.local27;
Test31Lib.local4.field3 = Test31Lib.local27;
Test31Lib.local4.field4 = Test31Lib.local17;
Test31Lib.local5.field1 = Test31Lib.local22;
Test31Lib.local5.field2 = Test31Lib.local25;
Test31Lib.local5.field3 = Test31Lib.local12;
Test31Lib.local5.field4 = Test31Lib.local16;
Test31Lib.local6.field1 = Test31Lib.local23;
Test31Lib.local6.field2 = Test31Lib.local22;
Test31Lib.local6.field3 = Test31Lib.local12;
Test31Lib.local6.field4 = Test31Lib.local17;
Test31Lib.local7.field1 = Test31Lib.local12;
Test31Lib.local7.field2 = Test31Lib.local21;
Test31Lib.local7.field3 = Test31Lib.local26;
Test31Lib.local7.field4 = Test31Lib.local19;
Test31Lib.local8.field1 = Test31Lib.local14;
Test31Lib.local8.field2 = Test31Lib.local28;
Test31Lib.local8.field3 = Test31Lib.local13;
Test31Lib.local8.field4 = Test31Lib.local18;
Test31Lib.local9.field1 = Test31Lib.local14;
Test31Lib.local9.field2 = Test31Lib.local25;
Test31Lib.local9.field3 = Test31Lib.local26;
Test31Lib.local9.field4 = Test31Lib.local18;
Test31Lib.local10.field1 = Test31Lib.local28;
Test31Lib.local10.field2 = Test31Lib.local22;
Test31Lib.local10.field3 = Test31Lib.local14;
Test31Lib.local10.field4 = Test31Lib.local15;
Test31Lib.local11.field5 = Test31Lib.local21;
Test31Lib.local11.field6 = Test31Lib.local36;
Test31Lib.local11.field7 = Test31Lib.local30;
Test31Lib.local11.field8 = Test31Lib.local16;
Test31Lib.local11.field9 = Test31Lib.local15;
Test31Lib.local11.field1 = Test31Lib.local14;
Test31Lib.local11.field2 = Test31Lib.local26;
Test31Lib.local11.field3 = Test31Lib.local25;
Test31Lib.local11.field4 = Test31Lib.local15;
Test31Lib.local12.field5 = Test31Lib.local24;
Test31Lib.local12.field6 = Test31Lib.local31;
Test31Lib.local12.field7 = Test31Lib.local36;
Test31Lib.local12.field8 = Test31Lib.local20;
Test31Lib.local12.field9 = Test31Lib.local15;
Test31Lib.local12.field1 = Test31Lib.local23;
Test31Lib.local12.field2 = Test31Lib.local28;
Test31Lib.local12.field3 = Test31Lib.local28;
Test31Lib.local12.field4 = Test31Lib.local15;
Test31Lib.local13.field5 = Test31Lib.local26;
Test31Lib.local13.field6 = Test31Lib.local35;
Test31Lib.local13.field7 = Test31Lib.local33;
Test31Lib.local13.field8 = Test31Lib.local16;
Test31Lib.local13.field9 = Test31Lib.local32;
Test31Lib.local13.field1 = Test31Lib.local21;
Test31Lib.local13.field2 = Test31Lib.local27;
Test31Lib.local13.field3 = Test31Lib.local13;
Test31Lib.local13.field4 = Test31Lib.local19;
Test31Lib.local14.field5 = Test31Lib.local36;
Test31Lib.local14.field6 = Test31Lib.local29;
Test31Lib.local14.field7 = Test31Lib.local33;
Test31Lib.local14.field8 = Test31Lib.local16;
Test31Lib.local14.field9 = Test31Lib.local26;
Test31Lib.local14.field1 = Test31Lib.local26;
Test31Lib.local14.field2 = Test31Lib.local23;
Test31Lib.local14.field3 = Test31Lib.local26;
Test31Lib.local14.field4 = Test31Lib.local19;
Test31Lib.local15.field10 = Test31Lib.local25;
Test31Lib.local15.field11 = Test31Lib.local30;
Test31Lib.local15.field12 = Test31Lib.local13;
Test31Lib.local15.field13 = Test31Lib.local16;
Test31Lib.local15.field14 = Test31Lib.local20;
Test31Lib.local15.field15 = Test31Lib.local19;
Test31Lib.local15.field16 = Test31Lib.local28;
Test31Lib.local15.field17 = Test31Lib.local34;
Test31Lib.local15.field18 = Test31Lib.local21;
Test31Lib.local15.field1 = Test31Lib.local23;
Test31Lib.local15.field2 = Test31Lib.local23;
Test31Lib.local15.field3 = Test31Lib.local26;
Test31Lib.local15.field4 = Test31Lib.local16;
Test31Lib.local16.field10 = Test31Lib.local22;
Test31Lib.local16.field11 = Test31Lib.local34;
Test31Lib.local16.field12 = Test31Lib.local11;
Test31Lib.local16.field13 = Test31Lib.local24;
Test31Lib.local16.field14 = Test31Lib.local17;
Test31Lib.local16.field15 = Test31Lib.local16;
Test31Lib.local16.field16 = Test31Lib.local28;
Test31Lib.local16.field17 = Test31Lib.local34;
Test31Lib.local16.field18 = Test31Lib.local28;
Test31Lib.local16.field1 = Test31Lib.local28;
Test31Lib.local16.field2 = Test31Lib.local25;
Test31Lib.local16.field3 = Test31Lib.local27;
Test31Lib.local16.field4 = Test31Lib.local18;
Test31Lib.local17.field10 = Test31Lib.local21;
Test31Lib.local17.field11 = Test31Lib.local33;
Test31Lib.local17.field12 = Test31Lib.local24;
Test31Lib.local17.field13 = Test31Lib.local11;
Test31Lib.local17.field14 = Test31Lib.local18;
Test31Lib.local17.field15 = Test31Lib.local15;
Test31Lib.local17.field16 = Test31Lib.local14;
Test31Lib.local17.field17 = Test31Lib.local31;
Test31Lib.local17.field18 = Test31Lib.local23;
Test31Lib.local17.field1 = Test31Lib.local13;
Test31Lib.local17.field2 = Test31Lib.local28;
Test31Lib.local17.field3 = Test31Lib.local28;
Test31Lib.local17.field4 = Test31Lib.local18;
Test31Lib.local18.field10 = Test31Lib.local25;
Test31Lib.local18.field11 = Test31Lib.local32;
Test31Lib.local18.field12 = Test31Lib.local25;
Test31Lib.local18.field13 = Test31Lib.local23;
Test31Lib.local18.field14 = Test31Lib.local19;
Test31Lib.local18.field15 = Test31Lib.local18;
Test31Lib.local18.field16 = Test31Lib.local24;
Test31Lib.local18.field17 = Test31Lib.local30;
Test31Lib.local18.field18 = Test31Lib.local28;
Test31Lib.local18.field1 = Test31Lib.local13;
Test31Lib.local18.field2 = Test31Lib.local28;
Test31Lib.local18.field3 = Test31Lib.local24;
Test31Lib.local18.field4 = Test31Lib.local15;
Test31Lib.local19.field10 = Test31Lib.local12;
Test31Lib.local19.field11 = Test31Lib.local34;
Test31Lib.local19.field12 = Test31Lib.local21;
Test31Lib.local19.field13 = Test31Lib.local15;
Test31Lib.local19.field14 = Test31Lib.local16;
Test31Lib.local19.field15 = Test31Lib.local16;
Test31Lib.local19.field16 = Test31Lib.local25;
Test31Lib.local19.field17 = Test31Lib.local33;
Test31Lib.local19.field18 = Test31Lib.local21;
Test31Lib.local19.field1 = Test31Lib.local23;
Test31Lib.local19.field2 = Test31Lib.local25;
Test31Lib.local19.field3 = Test31Lib.local23;
Test31Lib.local19.field4 = Test31Lib.local16;
Test31Lib.local20.field10 = Test31Lib.local21;
Test31Lib.local20.field11 = Test31Lib.local33;
Test31Lib.local20.field12 = Test31Lib.local27;
Test31Lib.local20.field13 = Test31Lib.local14;
Test31Lib.local20.field14 = Test31Lib.local16;
Test31Lib.local20.field15 = Test31Lib.local18;
Test31Lib.local20.field16 = Test31Lib.local12;
Test31Lib.local20.field17 = Test31Lib.local29;
Test31Lib.local20.field18 = Test31Lib.local23;
Test31Lib.local20.field1 = Test31Lib.local23;
Test31Lib.local20.field2 = Test31Lib.local23;
Test31Lib.local20.field3 = Test31Lib.local28;
Test31Lib.local20.field4 = Test31Lib.local20;
Test31Lib.local21.field19 = Test31Lib.local25;
Test31Lib.local21.field20 = Test31Lib.local36;
Test31Lib.local21.field21 = Test31Lib.local6;
Test31Lib.local21.field22 = Test31Lib.local32;
Test31Lib.local21.field23 = Test31Lib.local30;
Test31Lib.local21.field24 = Test31Lib.local26;
Test31Lib.local21.field25 = Test31Lib.local22;
Test31Lib.local21.field26 = Test31Lib.local12;
Test31Lib.local21.field27 = Test31Lib.local22;
Test31Lib.local21.field5 = Test31Lib.local31;
Test31Lib.local21.field6 = Test31Lib.local32;
Test31Lib.local21.field7 = Test31Lib.local36;
Test31Lib.local21.field8 = Test31Lib.local17;
Test31Lib.local21.field9 = Test31Lib.local12;
Test31Lib.local21.field1 = Test31Lib.local23;
Test31Lib.local21.field2 = Test31Lib.local22;
Test31Lib.local21.field3 = Test31Lib.local11;
Test31Lib.local21.field4 = Test31Lib.local18;
Test31Lib.local22.field19 = Test31Lib.local29;
Test31Lib.local22.field20 = Test31Lib.local30;
Test31Lib.local22.field21 = Test31Lib.local25;
Test31Lib.local22.field22 = Test31Lib.local34;
Test31Lib.local22.field23 = Test31Lib.local35;
Test31Lib.local22.field24 = Test31Lib.local21;
Test31Lib.local22.field25 = Test31Lib.local34;
Test31Lib.local22.field26 = Test31Lib.local22;
Test31Lib.local22.field27 = Test31Lib.local14;
Test31Lib.local22.field5 = Test31Lib.local22;
Test31Lib.local22.field6 = Test31Lib.local35;
Test31Lib.local22.field7 = Test31Lib.local32;
Test31Lib.local22.field8 = Test31Lib.local18;
Test31Lib.local22.field9 = Test31Lib.local20;
Test31Lib.local22.field1 = Test31Lib.local21;
Test31Lib.local22.field2 = Test31Lib.local27;
Test31Lib.local22.field3 = Test31Lib.local13;
Test31Lib.local22.field4 = Test31Lib.local16;
Test31Lib.local23.field19 = Test31Lib.local3;
Test31Lib.local23.field20 = Test31Lib.local32;
Test31Lib.local23.field21 = Test31Lib.local20;
Test31Lib.local23.field22 = Test31Lib.local36;
Test31Lib.local23.field23 = Test31Lib.local29;
Test31Lib.local23.field24 = Test31Lib.local27;
Test31Lib.local23.field25 = Test31Lib.local16;
Test31Lib.local23.field26 = Test31Lib.local28;
Test31Lib.local23.field27 = Test31Lib.local28;
Test31Lib.local23.field5 = Test31Lib.local10;
Test31Lib.local23.field6 = Test31Lib.local36;
Test31Lib.local23.field7 = Test31Lib.local29;
Test31Lib.local23.field8 = Test31Lib.local20;
Test31Lib.local23.field9 = Test31Lib.local18;
Test31Lib.local23.field1 = Test31Lib.local28;
Test31Lib.local23.field2 = Test31Lib.local26;
Test31Lib.local23.field3 = Test31Lib.local14;
Test31Lib.local23.field4 = Test31Lib.local15;
Test31Lib.local24.field19 = Test31Lib.local25;
Test31Lib.local24.field20 = Test31Lib.local30;
Test31Lib.local24.field21 = Test31Lib.local4;
Test31Lib.local24.field22 = Test31Lib.local29;
Test31Lib.local24.field23 = Test31Lib.local34;
Test31Lib.local24.field24 = Test31Lib.local28;
Test31Lib.local24.field25 = Test31Lib.local24;
Test31Lib.local24.field26 = Test31Lib.local21;
Test31Lib.local24.field27 = Test31Lib.local22;
Test31Lib.local24.field5 = Test31Lib.local8;
Test31Lib.local24.field6 = Test31Lib.local36;
Test31Lib.local24.field7 = Test31Lib.local32;
Test31Lib.local24.field8 = Test31Lib.local16;
Test31Lib.local24.field9 = Test31Lib.local7;
Test31Lib.local24.field1 = Test31Lib.local27;
Test31Lib.local24.field2 = Test31Lib.local26;
Test31Lib.local24.field3 = Test31Lib.local23;
Test31Lib.local24.field4 = Test31Lib.local18;
Test31Lib.local25.field19 = Test31Lib.local13;
Test31Lib.local25.field20 = Test31Lib.local32;
Test31Lib.local25.field21 = Test31Lib.local31;
Test31Lib.local25.field22 = Test31Lib.local31;
Test31Lib.local25.field23 = Test31Lib.local35;
Test31Lib.local25.field24 = Test31Lib.local28;
Test31Lib.local25.field25 = Test31Lib.local36;
Test31Lib.local25.field26 = Test31Lib.local11;
Test31Lib.local25.field27 = Test31Lib.local12;
Test31Lib.local25.field5 = Test31Lib.local28;
Test31Lib.local25.field6 = Test31Lib.local35;
Test31Lib.local25.field7 = Test31Lib.local33;
Test31Lib.local25.field8 = Test31Lib.local18;
Test31Lib.local25.field9 = Test31Lib.local16;
Test31Lib.local25.field1 = Test31Lib.local11;
Test31Lib.local25.field2 = Test31Lib.local23;
Test31Lib.local25.field3 = Test31Lib.local12;
Test31Lib.local25.field4 = Test31Lib.local18;
Test31Lib.local26.field19 = Test31Lib.local34;
Test31Lib.local26.field20 = Test31Lib.local34;
Test31Lib.local26.field21 = Test31Lib.local34;
Test31Lib.local26.field22 = Test31Lib.local35;
Test31Lib.local26.field23 = Test31Lib.local32;
Test31Lib.local26.field24 = Test31Lib.local21;
Test31Lib.local26.field25 = Test31Lib.local13;
Test31Lib.local26.field26 = Test31Lib.local27;
Test31Lib.local26.field27 = Test31Lib.local11;
Test31Lib.local26.field5 = Test31Lib.local7;
Test31Lib.local26.field6 = Test31Lib.local36;
Test31Lib.local26.field7 = Test31Lib.local30;
Test31Lib.local26.field8 = Test31Lib.local20;
Test31Lib.local26.field9 = Test31Lib.local22;
Test31Lib.local26.field1 = Test31Lib.local25;
Test31Lib.local26.field2 = Test31Lib.local27;
Test31Lib.local26.field3 = Test31Lib.local25;
Test31Lib.local26.field4 = Test31Lib.local15;
Test31Lib.local27.field19 = Test31Lib.local17;
Test31Lib.local27.field20 = Test31Lib.local29;
Test31Lib.local27.field21 = Test31Lib.local2;
Test31Lib.local27.field22 = Test31Lib.local29;
Test31Lib.local27.field23 = Test31Lib.local30;
Test31Lib.local27.field24 = Test31Lib.local28;
Test31Lib.local27.field25 = Test31Lib.local18;
Test31Lib.local27.field26 = Test31Lib.local11;
Test31Lib.local27.field27 = Test31Lib.local13;
Test31Lib.local27.field5 = Test31Lib.local2;
Test31Lib.local27.field6 = Test31Lib.local29;
Test31Lib.local27.field7 = Test31Lib.local32;
Test31Lib.local27.field8 = Test31Lib.local15;
Test31Lib.local27.field9 = Test31Lib.local19;
Test31Lib.local27.field1 = Test31Lib.local22;
Test31Lib.local27.field2 = Test31Lib.local22;
Test31Lib.local27.field3 = Test31Lib.local24;
Test31Lib.local27.field4 = Test31Lib.local17;
Test31Lib.local28.field19 = Test31Lib.local7;
Test31Lib.local28.field20 = Test31Lib.local29;
Test31Lib.local28.field21 = Test31Lib.local17;
Test31Lib.local28.field22 = Test31Lib.local32;
Test31Lib.local28.field23 = Test31Lib.local31;
Test31Lib.local28.field24 = Test31Lib.local25;
Test31Lib.local28.field25 = Test31Lib.local28;
Test31Lib.local28.field26 = Test31Lib.local25;
Test31Lib.local28.field27 = Test31Lib.local14;
Test31Lib.local28.field5 = Test31Lib.local10;
Test31Lib.local28.field6 = Test31Lib.local30;
Test31Lib.local28.field7 = Test31Lib.local31;
Test31Lib.local28.field8 = Test31Lib.local16;
Test31Lib.local28.field9 = Test31Lib.local6;
Test31Lib.local28.field1 = Test31Lib.local13;
Test31Lib.local28.field2 = Test31Lib.local28;
Test31Lib.local28.field3 = Test31Lib.local11;
Test31Lib.local28.field4 = Test31Lib.local20;
Test31Lib.local29.field28 = Test31Lib.local27;
Test31Lib.local29.field29 = Test31Lib.local35;
Test31Lib.local29.field30 = Test31Lib.local30;
Test31Lib.local29.field31 = Test31Lib.local35;
Test31Lib.local29.field32 = Test31Lib.local29;
Test31Lib.local29.field33 = Test31Lib.local21;
Test31Lib.local29.field34 = Test31Lib.local32;
Test31Lib.local29.field35 = Test31Lib.local14;
Test31Lib.local29.field1 = Test31Lib.local22;
Test31Lib.local29.field2 = Test31Lib.local22;
Test31Lib.local29.field3 = Test31Lib.local25;
Test31Lib.local29.field4 = Test31Lib.local19;
Test31Lib.local30.field28 = Test31Lib.local22;
Test31Lib.local30.field29 = Test31Lib.local33;
Test31Lib.local30.field30 = Test31Lib.local34;
Test31Lib.local30.field31 = Test31Lib.local33;
Test31Lib.local30.field32 = Test31Lib.local32;
Test31Lib.local30.field33 = Test31Lib.local34;
Test31Lib.local30.field34 = Test31Lib.local30;
Test31Lib.local30.field35 = Test31Lib.local23;
Test31Lib.local30.field1 = Test31Lib.local26;
Test31Lib.local30.field2 = Test31Lib.local24;
Test31Lib.local30.field3 = Test31Lib.local26;
Test31Lib.local30.field4 = Test31Lib.local19;
Test31Lib.local31.field28 = Test31Lib.local27;
Test31Lib.local31.field29 = Test31Lib.local30;
Test31Lib.local31.field30 = Test31Lib.local30;
Test31Lib.local31.field31 = Test31Lib.local30;
Test31Lib.local31.field32 = Test31Lib.local31;
Test31Lib.local31.field33 = Test31Lib.local31;
Test31Lib.local31.field34 = Test31Lib.local29;
Test31Lib.local31.field35 = Test31Lib.local24;
Test31Lib.local31.field1 = Test31Lib.local12;
Test31Lib.local31.field2 = Test31Lib.local26;
Test31Lib.local31.field3 = Test31Lib.local28;
Test31Lib.local31.field4 = Test31Lib.local18;
Test31Lib.local32.field28 = Test31Lib.local24;
Test31Lib.local32.field29 = Test31Lib.local34;
Test31Lib.local32.field30 = Test31Lib.local31;
Test31Lib.local32.field31 = Test31Lib.local35;
Test31Lib.local32.field32 = Test31Lib.local32;
Test31Lib.local32.field33 = Test31Lib.local27;
Test31Lib.local32.field34 = Test31Lib.local31;
Test31Lib.local32.field35 = Test31Lib.local11;
Test31Lib.local32.field1 = Test31Lib.local21;
Test31Lib.local32.field2 = Test31Lib.local25;
Test31Lib.local32.field3 = Test31Lib.local24;
Test31Lib.local32.field4 = Test31Lib.local20;
Test31Lib.local33.field28 = Test31Lib.local26;
Test31Lib.local33.field29 = Test31Lib.local33;
Test31Lib.local33.field30 = Test31Lib.local31;
Test31Lib.local33.field31 = Test31Lib.local34;
Test31Lib.local33.field32 = Test31Lib.local36;
Test31Lib.local33.field33 = Test31Lib.local19;
Test31Lib.local33.field34 = Test31Lib.local29;
Test31Lib.local33.field35 = Test31Lib.local27;
Test31Lib.local33.field1 = Test31Lib.local11;
Test31Lib.local33.field2 = Test31Lib.local21;
Test31Lib.local33.field3 = Test31Lib.local13;
Test31Lib.local33.field4 = Test31Lib.local15;
Test31Lib.local34.field28 = Test31Lib.local26;
Test31Lib.local34.field29 = Test31Lib.local34;
Test31Lib.local34.field30 = Test31Lib.local29;
Test31Lib.local34.field31 = Test31Lib.local29;
Test31Lib.local34.field32 = Test31Lib.local29;
Test31Lib.local34.field33 = Test31Lib.local30;
Test31Lib.local34.field34 = Test31Lib.local30;
Test31Lib.local34.field35 = Test31Lib.local22;
Test31Lib.local34.field1 = Test31Lib.local13;
Test31Lib.local34.field2 = Test31Lib.local25;
Test31Lib.local34.field3 = Test31Lib.local13;
Test31Lib.local34.field4 = Test31Lib.local16;
Test31Lib.local35.field28 = Test31Lib.local28;
Test31Lib.local35.field29 = Test31Lib.local35;
Test31Lib.local35.field30 = Test31Lib.local32;
Test31Lib.local35.field31 = Test31Lib.local33;
Test31Lib.local35.field32 = Test31Lib.local30;
Test31Lib.local35.field33 = Test31Lib.local25;
Test31Lib.local35.field34 = Test31Lib.local33;
Test31Lib.local35.field35 = Test31Lib.local27;
Test31Lib.local35.field1 = Test31Lib.local26;
Test31Lib.local35.field2 = Test31Lib.local23;
Test31Lib.local35.field3 = Test31Lib.local23;
Test31Lib.local35.field4 = Test31Lib.local15;
Test31Lib.local36.field28 = Test31Lib.local22;
Test31Lib.local36.field29 = Test31Lib.local31;
Test31Lib.local36.field30 = Test31Lib.local29;
Test31Lib.local36.field31 = Test31Lib.local32;
Test31Lib.local36.field32 = Test31Lib.local32;
Test31Lib.local36.field33 = Test31Lib.local9;
Test31Lib.local36.field34 = Test31Lib.local34;
Test31Lib.local36.field35 = Test31Lib.local27;
Test31Lib.local36.field1 = Test31Lib.local21;
Test31Lib.local36.field2 = Test31Lib.local26;
Test31Lib.local36.field3 = Test31Lib.local26;
Test31Lib.local36.field4 = Test31Lib.local19;
if (inputValue<=4) {
for (int local51 = 0; local51<=1; local51 += 1) {
Test31Lib.local27.field26=Test31Lib.local12.field3;
}
}
for (int local52 = 0; local52<=1; local52 += 1) {
if (inputValue==2) {
Test31Lib.local11.field2=Test31Lib.local24.field24;
}
}
for (int local53 = 0; local53<=0; local53 += 1) {
Test31Lib.local22.field21=Test31Lib.local14.field2.method1(3);
}
for (int local54 = 0; local54<=0; local54 += 1) {
for (int local55 = 0; local55<=0; local55 += 1) {
Test31Lib.local13.field7.method1(3);
}
}
Test31Lib.local27.field19=Test31Lib.local28.field4;
for (int local56 = 0; local56<=2; local56 += 1) {
Test31Lib.local19.field1.method2(Test31Lib.local34.field4,3);
}
if (inputValue<3) {
Test31Lib.local20.field17=Test31Lib.local15.method11(Test31Lib.local13.field7,Test31Lib.local15.field15,3);
}
Test31Lib.local28.field4=Test31Lib.local24.field4;
for (int local57 = 0; local57<=0; local57 += 1) {
Test31Lib.local11.field2=Test31Lib.local23.field2;
}
if (inputValue<2) {
for (int local58 = 0; local58<=2; local58 += 1) {
Test31Lib.local10=Test31Lib.local11.field3;
}
}else {
for (int local59 = 0; local59<=0; local59 += 1) {
for (int local60 = 0; local60<=1; local60 += 1) {
Test31Lib.local26.field9=Test31Lib.local20.method15(Test31Lib.local15.field3,3);
}
}
}
Benchmark.test(1,Test31Lib.local1);
Benchmark.test(2,Test31Lib.local2);
Benchmark.test(3,Test31Lib.local3);
Benchmark.test(4,Test31Lib.local4);
Benchmark.test(5,Test31Lib.local5);
Benchmark.test(6,Test31Lib.local6);
Benchmark.test(7,Test31Lib.local7);
Benchmark.test(8,Test31Lib.local8);
Benchmark.test(9,Test31Lib.local9);
Benchmark.test(10,Test31Lib.local10);
Benchmark.test(11,Test31Lib.local11);
Benchmark.test(12,Test31Lib.local12);
Benchmark.test(13,Test31Lib.local13);
Benchmark.test(14,Test31Lib.local14);
Benchmark.test(15,Test31Lib.local15);
Benchmark.test(16,Test31Lib.local16);
Benchmark.test(17,Test31Lib.local17);
Benchmark.test(18,Test31Lib.local18);
Benchmark.test(19,Test31Lib.local19);
Benchmark.test(20,Test31Lib.local20);
Benchmark.test(21,Test31Lib.local21);
Benchmark.test(22,Test31Lib.local22);
Benchmark.test(23,Test31Lib.local23);
Benchmark.test(24,Test31Lib.local24);
Benchmark.test(25,Test31Lib.local25);
Benchmark.test(26,Test31Lib.local26);
Benchmark.test(27,Test31Lib.local27);
Benchmark.test(28,Test31Lib.local28);
Benchmark.test(29,Test31Lib.local29);
Benchmark.test(30,Test31Lib.local30);
Benchmark.test(31,Test31Lib.local31);
Benchmark.test(32,Test31Lib.local32);
Benchmark.test(33,Test31Lib.local33);
Benchmark.test(34,Test31Lib.local34);
Benchmark.test(35,Test31Lib.local35);
Benchmark.test(36,Test31Lib.local36);
Benchmark.test(37,Test31Lib.local1.field1);
Benchmark.test(38,Test31Lib.local1.field2);
Benchmark.test(39,Test31Lib.local1.field3);
Benchmark.test(40,Test31Lib.local1.field4);
Benchmark.test(41,Test31Lib.local2.field1);
Benchmark.test(42,Test31Lib.local2.field2);
Benchmark.test(43,Test31Lib.local2.field3);
Benchmark.test(44,Test31Lib.local2.field4);
Benchmark.test(45,Test31Lib.local3.field1);
Benchmark.test(46,Test31Lib.local3.field2);
Benchmark.test(47,Test31Lib.local3.field3);
Benchmark.test(48,Test31Lib.local3.field4);
Benchmark.test(49,Test31Lib.local4.field1);
Benchmark.test(50,Test31Lib.local4.field2);
Benchmark.test(51,Test31Lib.local4.field3);
Benchmark.test(52,Test31Lib.local4.field4);
Benchmark.test(53,Test31Lib.local5.field1);
Benchmark.test(54,Test31Lib.local5.field2);
Benchmark.test(55,Test31Lib.local5.field3);
Benchmark.test(56,Test31Lib.local5.field4);
Benchmark.test(57,Test31Lib.local6.field1);
Benchmark.test(58,Test31Lib.local6.field2);
Benchmark.test(59,Test31Lib.local6.field3);
Benchmark.test(60,Test31Lib.local6.field4);
Benchmark.test(61,Test31Lib.local7.field1);
Benchmark.test(62,Test31Lib.local7.field2);
Benchmark.test(63,Test31Lib.local7.field3);
Benchmark.test(64,Test31Lib.local7.field4);
Benchmark.test(65,Test31Lib.local8.field1);
Benchmark.test(66,Test31Lib.local8.field2);
Benchmark.test(67,Test31Lib.local8.field3);
Benchmark.test(68,Test31Lib.local8.field4);
Benchmark.test(69,Test31Lib.local9.field1);
Benchmark.test(70,Test31Lib.local9.field2);
Benchmark.test(71,Test31Lib.local9.field3);
Benchmark.test(72,Test31Lib.local9.field4);
Benchmark.test(73,Test31Lib.local10.field1);
Benchmark.test(74,Test31Lib.local10.field2);
Benchmark.test(75,Test31Lib.local10.field3);
Benchmark.test(76,Test31Lib.local10.field4);
Benchmark.test(77,Test31Lib.local11.field5);
Benchmark.test(78,Test31Lib.local11.field6);
Benchmark.test(79,Test31Lib.local11.field7);
Benchmark.test(80,Test31Lib.local11.field8);
Benchmark.test(81,Test31Lib.local11.field9);
Benchmark.test(82,Test31Lib.local11.field1);
Benchmark.test(83,Test31Lib.local11.field2);
Benchmark.test(84,Test31Lib.local11.field3);
Benchmark.test(85,Test31Lib.local11.field4);
Benchmark.test(86,Test31Lib.local12.field5);
Benchmark.test(87,Test31Lib.local12.field6);
Benchmark.test(88,Test31Lib.local12.field7);
Benchmark.test(89,Test31Lib.local12.field8);
Benchmark.test(90,Test31Lib.local12.field9);
Benchmark.test(91,Test31Lib.local12.field1);
Benchmark.test(92,Test31Lib.local12.field2);
Benchmark.test(93,Test31Lib.local12.field3);
Benchmark.test(94,Test31Lib.local12.field4);
Benchmark.test(95,Test31Lib.local13.field5);
Benchmark.test(96,Test31Lib.local13.field6);
Benchmark.test(97,Test31Lib.local13.field7);
Benchmark.test(98,Test31Lib.local13.field8);
Benchmark.test(99,Test31Lib.local13.field9);
Benchmark.test(100,Test31Lib.local13.field1);
Benchmark.test(101,Test31Lib.local13.field2);
Benchmark.test(102,Test31Lib.local13.field3);
Benchmark.test(103,Test31Lib.local13.field4);
Benchmark.test(104,Test31Lib.local14.field5);
Benchmark.test(105,Test31Lib.local14.field6);
Benchmark.test(106,Test31Lib.local14.field7);
Benchmark.test(107,Test31Lib.local14.field8);
Benchmark.test(108,Test31Lib.local14.field9);
Benchmark.test(109,Test31Lib.local14.field1);
Benchmark.test(110,Test31Lib.local14.field2);
Benchmark.test(111,Test31Lib.local14.field3);
Benchmark.test(112,Test31Lib.local14.field4);
Benchmark.test(113,Test31Lib.local15.field10);
Benchmark.test(114,Test31Lib.local15.field11);
Benchmark.test(115,Test31Lib.local15.field12);
Benchmark.test(116,Test31Lib.local15.field13);
Benchmark.test(117,Test31Lib.local15.field14);
Benchmark.test(118,Test31Lib.local15.field15);
Benchmark.test(119,Test31Lib.local15.field16);
Benchmark.test(120,Test31Lib.local15.field17);
Benchmark.test(121,Test31Lib.local15.field18);
Benchmark.test(122,Test31Lib.local15.field1);
Benchmark.test(123,Test31Lib.local15.field2);
Benchmark.test(124,Test31Lib.local15.field3);
Benchmark.test(125,Test31Lib.local15.field4);
Benchmark.test(126,Test31Lib.local16.field10);
Benchmark.test(127,Test31Lib.local16.field11);
Benchmark.test(128,Test31Lib.local16.field12);
Benchmark.test(129,Test31Lib.local16.field13);
Benchmark.test(130,Test31Lib.local16.field14);
Benchmark.test(131,Test31Lib.local16.field15);
Benchmark.test(132,Test31Lib.local16.field16);
Benchmark.test(133,Test31Lib.local16.field17);
Benchmark.test(134,Test31Lib.local16.field18);
Benchmark.test(135,Test31Lib.local16.field1);
Benchmark.test(136,Test31Lib.local16.field2);
Benchmark.test(137,Test31Lib.local16.field3);
Benchmark.test(138,Test31Lib.local16.field4);
Benchmark.test(139,Test31Lib.local17.field10);
Benchmark.test(140,Test31Lib.local17.field11);
Benchmark.test(141,Test31Lib.local17.field12);
Benchmark.test(142,Test31Lib.local17.field13);
Benchmark.test(143,Test31Lib.local17.field14);
Benchmark.test(144,Test31Lib.local17.field15);
Benchmark.test(145,Test31Lib.local17.field16);
Benchmark.test(146,Test31Lib.local17.field17);
Benchmark.test(147,Test31Lib.local17.field18);
Benchmark.test(148,Test31Lib.local17.field1);
Benchmark.test(149,Test31Lib.local17.field2);
Benchmark.test(150,Test31Lib.local17.field3);
Benchmark.test(151,Test31Lib.local17.field4);
Benchmark.test(152,Test31Lib.local18.field10);
Benchmark.test(153,Test31Lib.local18.field11);
Benchmark.test(154,Test31Lib.local18.field12);
Benchmark.test(155,Test31Lib.local18.field13);
Benchmark.test(156,Test31Lib.local18.field14);
Benchmark.test(157,Test31Lib.local18.field15);
Benchmark.test(158,Test31Lib.local18.field16);
Benchmark.test(159,Test31Lib.local18.field17);
Benchmark.test(160,Test31Lib.local18.field18);
Benchmark.test(161,Test31Lib.local18.field1);
Benchmark.test(162,Test31Lib.local18.field2);
Benchmark.test(163,Test31Lib.local18.field3);
Benchmark.test(164,Test31Lib.local18.field4);
Benchmark.test(165,Test31Lib.local19.field10);
Benchmark.test(166,Test31Lib.local19.field11);
Benchmark.test(167,Test31Lib.local19.field12);
Benchmark.test(168,Test31Lib.local19.field13);
Benchmark.test(169,Test31Lib.local19.field14);
Benchmark.test(170,Test31Lib.local19.field15);
Benchmark.test(171,Test31Lib.local19.field16);
Benchmark.test(172,Test31Lib.local19.field17);
Benchmark.test(173,Test31Lib.local19.field18);
Benchmark.test(174,Test31Lib.local19.field1);
Benchmark.test(175,Test31Lib.local19.field2);
Benchmark.test(176,Test31Lib.local19.field3);
Benchmark.test(177,Test31Lib.local19.field4);
Benchmark.test(178,Test31Lib.local20.field10);
Benchmark.test(179,Test31Lib.local20.field11);
Benchmark.test(180,Test31Lib.local20.field12);
Benchmark.test(181,Test31Lib.local20.field13);
Benchmark.test(182,Test31Lib.local20.field14);
Benchmark.test(183,Test31Lib.local20.field15);
Benchmark.test(184,Test31Lib.local20.field16);
Benchmark.test(185,Test31Lib.local20.field17);
Benchmark.test(186,Test31Lib.local20.field18);
Benchmark.test(187,Test31Lib.local20.field1);
Benchmark.test(188,Test31Lib.local20.field2);
Benchmark.test(189,Test31Lib.local20.field3);
Benchmark.test(190,Test31Lib.local20.field4);
Benchmark.test(191,Test31Lib.local21.field19);
Benchmark.test(192,Test31Lib.local21.field20);
Benchmark.test(193,Test31Lib.local21.field21);
Benchmark.test(194,Test31Lib.local21.field22);
Benchmark.test(195,Test31Lib.local21.field23);
Benchmark.test(196,Test31Lib.local21.field24);
Benchmark.test(197,Test31Lib.local21.field25);
Benchmark.test(198,Test31Lib.local21.field26);
Benchmark.test(199,Test31Lib.local21.field27);
Benchmark.test(200,Test31Lib.local21.field5);
Benchmark.test(201,Test31Lib.local21.field6);
Benchmark.test(202,Test31Lib.local21.field7);
Benchmark.test(203,Test31Lib.local21.field8);
Benchmark.test(204,Test31Lib.local21.field9);
Benchmark.test(205,Test31Lib.local21.field1);
Benchmark.test(206,Test31Lib.local21.field2);
Benchmark.test(207,Test31Lib.local21.field3);
Benchmark.test(208,Test31Lib.local21.field4);
Benchmark.test(209,Test31Lib.local22.field19);
Benchmark.test(210,Test31Lib.local22.field20);
Benchmark.test(211,Test31Lib.local22.field21);
Benchmark.test(212,Test31Lib.local22.field22);
Benchmark.test(213,Test31Lib.local22.field23);
Benchmark.test(214,Test31Lib.local22.field24);
Benchmark.test(215,Test31Lib.local22.field25);
Benchmark.test(216,Test31Lib.local22.field26);
Benchmark.test(217,Test31Lib.local22.field27);
Benchmark.test(218,Test31Lib.local22.field5);
Benchmark.test(219,Test31Lib.local22.field6);
Benchmark.test(220,Test31Lib.local22.field7);
Benchmark.test(221,Test31Lib.local22.field8);
Benchmark.test(222,Test31Lib.local22.field9);
Benchmark.test(223,Test31Lib.local22.field1);
Benchmark.test(224,Test31Lib.local22.field2);
Benchmark.test(225,Test31Lib.local22.field3);
Benchmark.test(226,Test31Lib.local22.field4);
Benchmark.test(227,Test31Lib.local23.field19);
Benchmark.test(228,Test31Lib.local23.field20);
Benchmark.test(229,Test31Lib.local23.field21);
Benchmark.test(230,Test31Lib.local23.field22);
Benchmark.test(231,Test31Lib.local23.field23);
Benchmark.test(232,Test31Lib.local23.field24);
Benchmark.test(233,Test31Lib.local23.field25);
Benchmark.test(234,Test31Lib.local23.field26);
Benchmark.test(235,Test31Lib.local23.field27);
Benchmark.test(236,Test31Lib.local23.field5);
Benchmark.test(237,Test31Lib.local23.field6);
Benchmark.test(238,Test31Lib.local23.field7);
Benchmark.test(239,Test31Lib.local23.field8);
Benchmark.test(240,Test31Lib.local23.field9);
Benchmark.test(241,Test31Lib.local23.field1);
Benchmark.test(242,Test31Lib.local23.field2);
Benchmark.test(243,Test31Lib.local23.field3);
Benchmark.test(244,Test31Lib.local23.field4);
Benchmark.test(245,Test31Lib.local24.field19);
Benchmark.test(246,Test31Lib.local24.field20);
Benchmark.test(247,Test31Lib.local24.field21);
Benchmark.test(248,Test31Lib.local24.field22);
Benchmark.test(249,Test31Lib.local24.field23);
Benchmark.test(250,Test31Lib.local24.field24);
Benchmark.test(251,Test31Lib.local24.field25);
Benchmark.test(252,Test31Lib.local24.field26);
Benchmark.test(253,Test31Lib.local24.field27);
Benchmark.test(254,Test31Lib.local24.field5);
Benchmark.test(255,Test31Lib.local24.field6);
Benchmark.test(256,Test31Lib.local24.field7);
Benchmark.test(257,Test31Lib.local24.field8);
Benchmark.test(258,Test31Lib.local24.field9);
Benchmark.test(259,Test31Lib.local24.field1);
Benchmark.test(260,Test31Lib.local24.field2);
Benchmark.test(261,Test31Lib.local24.field3);
Benchmark.test(262,Test31Lib.local24.field4);
Benchmark.test(263,Test31Lib.local25.field19);
Benchmark.test(264,Test31Lib.local25.field20);
Benchmark.test(265,Test31Lib.local25.field21);
Benchmark.test(266,Test31Lib.local25.field22);
Benchmark.test(267,Test31Lib.local25.field23);
Benchmark.test(268,Test31Lib.local25.field24);
Benchmark.test(269,Test31Lib.local25.field25);
Benchmark.test(270,Test31Lib.local25.field26);
Benchmark.test(271,Test31Lib.local25.field27);
Benchmark.test(272,Test31Lib.local25.field5);
Benchmark.test(273,Test31Lib.local25.field6);
Benchmark.test(274,Test31Lib.local25.field7);
Benchmark.test(275,Test31Lib.local25.field8);
Benchmark.test(276,Test31Lib.local25.field9);
Benchmark.test(277,Test31Lib.local25.field1);
Benchmark.test(278,Test31Lib.local25.field2);
Benchmark.test(279,Test31Lib.local25.field3);
Benchmark.test(280,Test31Lib.local25.field4);
Benchmark.test(281,Test31Lib.local26.field19);
Benchmark.test(282,Test31Lib.local26.field20);
Benchmark.test(283,Test31Lib.local26.field21);
Benchmark.test(284,Test31Lib.local26.field22);
Benchmark.test(285,Test31Lib.local26.field23);
Benchmark.test(286,Test31Lib.local26.field24);
Benchmark.test(287,Test31Lib.local26.field25);
Benchmark.test(288,Test31Lib.local26.field26);
Benchmark.test(289,Test31Lib.local26.field27);
Benchmark.test(290,Test31Lib.local26.field5);
Benchmark.test(291,Test31Lib.local26.field6);
Benchmark.test(292,Test31Lib.local26.field7);
Benchmark.test(293,Test31Lib.local26.field8);
Benchmark.test(294,Test31Lib.local26.field9);
Benchmark.test(295,Test31Lib.local26.field1);
Benchmark.test(296,Test31Lib.local26.field2);
Benchmark.test(297,Test31Lib.local26.field3);
Benchmark.test(298,Test31Lib.local26.field4);
Benchmark.test(299,Test31Lib.local27.field19);
Benchmark.test(300,Test31Lib.local27.field20);
Benchmark.test(301,Test31Lib.local27.field21);
Benchmark.test(302,Test31Lib.local27.field22);
Benchmark.test(303,Test31Lib.local27.field23);
Benchmark.test(304,Test31Lib.local27.field24);
Benchmark.test(305,Test31Lib.local27.field25);
Benchmark.test(306,Test31Lib.local27.field26);
Benchmark.test(307,Test31Lib.local27.field27);
Benchmark.test(308,Test31Lib.local27.field5);
Benchmark.test(309,Test31Lib.local27.field6);
Benchmark.test(310,Test31Lib.local27.field7);
Benchmark.test(311,Test31Lib.local27.field8);
Benchmark.test(312,Test31Lib.local27.field9);
Benchmark.test(313,Test31Lib.local27.field1);
Benchmark.test(314,Test31Lib.local27.field2);
Benchmark.test(315,Test31Lib.local27.field3);
Benchmark.test(316,Test31Lib.local27.field4);
Benchmark.test(317,Test31Lib.local28.field19);
Benchmark.test(318,Test31Lib.local28.field20);
Benchmark.test(319,Test31Lib.local28.field21);
Benchmark.test(320,Test31Lib.local28.field22);
Benchmark.test(321,Test31Lib.local28.field23);
Benchmark.test(322,Test31Lib.local28.field24);
Benchmark.test(323,Test31Lib.local28.field25);
Benchmark.test(324,Test31Lib.local28.field26);
Benchmark.test(325,Test31Lib.local28.field27);
Benchmark.test(326,Test31Lib.local28.field5);
Benchmark.test(327,Test31Lib.local28.field6);
Benchmark.test(328,Test31Lib.local28.field7);
Benchmark.test(329,Test31Lib.local28.field8);
Benchmark.test(330,Test31Lib.local28.field9);
Benchmark.test(331,Test31Lib.local28.field1);
Benchmark.test(332,Test31Lib.local28.field2);
Benchmark.test(333,Test31Lib.local28.field3);
Benchmark.test(334,Test31Lib.local28.field4);
Benchmark.test(335,Test31Lib.local29.field28);
Benchmark.test(336,Test31Lib.local29.field29);
Benchmark.test(337,Test31Lib.local29.field30);
Benchmark.test(338,Test31Lib.local29.field31);
Benchmark.test(339,Test31Lib.local29.field32);
Benchmark.test(340,Test31Lib.local29.field33);
Benchmark.test(341,Test31Lib.local29.field34);
Benchmark.test(342,Test31Lib.local29.field35);
Benchmark.test(343,Test31Lib.local29.field1);
Benchmark.test(344,Test31Lib.local29.field2);
Benchmark.test(345,Test31Lib.local29.field3);
Benchmark.test(346,Test31Lib.local29.field4);
Benchmark.test(347,Test31Lib.local30.field28);
Benchmark.test(348,Test31Lib.local30.field29);
Benchmark.test(349,Test31Lib.local30.field30);
Benchmark.test(350,Test31Lib.local30.field31);
Benchmark.test(351,Test31Lib.local30.field32);
Benchmark.test(352,Test31Lib.local30.field33);
Benchmark.test(353,Test31Lib.local30.field34);
Benchmark.test(354,Test31Lib.local30.field35);
Benchmark.test(355,Test31Lib.local30.field1);
Benchmark.test(356,Test31Lib.local30.field2);
Benchmark.test(357,Test31Lib.local30.field3);
Benchmark.test(358,Test31Lib.local30.field4);
Benchmark.test(359,Test31Lib.local31.field28);
Benchmark.test(360,Test31Lib.local31.field29);
Benchmark.test(361,Test31Lib.local31.field30);
Benchmark.test(362,Test31Lib.local31.field31);
Benchmark.test(363,Test31Lib.local31.field32);
Benchmark.test(364,Test31Lib.local31.field33);
Benchmark.test(365,Test31Lib.local31.field34);
Benchmark.test(366,Test31Lib.local31.field35);
Benchmark.test(367,Test31Lib.local31.field1);
Benchmark.test(368,Test31Lib.local31.field2);
Benchmark.test(369,Test31Lib.local31.field3);
Benchmark.test(370,Test31Lib.local31.field4);
Benchmark.test(371,Test31Lib.local32.field28);
Benchmark.test(372,Test31Lib.local32.field29);
Benchmark.test(373,Test31Lib.local32.field30);
Benchmark.test(374,Test31Lib.local32.field31);
Benchmark.test(375,Test31Lib.local32.field32);
Benchmark.test(376,Test31Lib.local32.field33);
Benchmark.test(377,Test31Lib.local32.field34);
Benchmark.test(378,Test31Lib.local32.field35);
Benchmark.test(379,Test31Lib.local32.field1);
Benchmark.test(380,Test31Lib.local32.field2);
Benchmark.test(381,Test31Lib.local32.field3);
Benchmark.test(382,Test31Lib.local32.field4);
Benchmark.test(383,Test31Lib.local33.field28);
Benchmark.test(384,Test31Lib.local33.field29);
Benchmark.test(385,Test31Lib.local33.field30);
Benchmark.test(386,Test31Lib.local33.field31);
Benchmark.test(387,Test31Lib.local33.field32);
Benchmark.test(388,Test31Lib.local33.field33);
Benchmark.test(389,Test31Lib.local33.field34);
Benchmark.test(390,Test31Lib.local33.field35);
Benchmark.test(391,Test31Lib.local33.field1);
Benchmark.test(392,Test31Lib.local33.field2);
Benchmark.test(393,Test31Lib.local33.field3);
Benchmark.test(394,Test31Lib.local33.field4);
Benchmark.test(395,Test31Lib.local34.field28);
Benchmark.test(396,Test31Lib.local34.field29);
Benchmark.test(397,Test31Lib.local34.field30);
Benchmark.test(398,Test31Lib.local34.field31);
Benchmark.test(399,Test31Lib.local34.field32);
Benchmark.test(400,Test31Lib.local34.field33);
Benchmark.test(401,Test31Lib.local34.field34);
Benchmark.test(402,Test31Lib.local34.field35);
Benchmark.test(403,Test31Lib.local34.field1);
Benchmark.test(404,Test31Lib.local34.field2);
Benchmark.test(405,Test31Lib.local34.field3);
Benchmark.test(406,Test31Lib.local34.field4);
Benchmark.test(407,Test31Lib.local35.field28);
Benchmark.test(408,Test31Lib.local35.field29);
Benchmark.test(409,Test31Lib.local35.field30);
Benchmark.test(410,Test31Lib.local35.field31);
Benchmark.test(411,Test31Lib.local35.field32);
Benchmark.test(412,Test31Lib.local35.field33);
Benchmark.test(413,Test31Lib.local35.field34);
Benchmark.test(414,Test31Lib.local35.field35);
Benchmark.test(415,Test31Lib.local35.field1);
Benchmark.test(416,Test31Lib.local35.field2);
Benchmark.test(417,Test31Lib.local35.field3);
Benchmark.test(418,Test31Lib.local35.field4);
Benchmark.test(419,Test31Lib.local36.field28);
Benchmark.test(420,Test31Lib.local36.field29);
Benchmark.test(421,Test31Lib.local36.field30);
Benchmark.test(422,Test31Lib.local36.field31);
Benchmark.test(423,Test31Lib.local36.field32);
Benchmark.test(424,Test31Lib.local36.field33);
Benchmark.test(425,Test31Lib.local36.field34);
Benchmark.test(426,Test31Lib.local36.field35);
Benchmark.test(427,Test31Lib.local36.field1);
Benchmark.test(428,Test31Lib.local36.field2);
Benchmark.test(429,Test31Lib.local36.field3);
Benchmark.test(430,Test31Lib.local36.field4);
Benchmark.print();
}
}
