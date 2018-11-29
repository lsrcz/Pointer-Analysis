package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test42Lib{
public static Test42Class1 local1;
public static Test42Class1 local2;
public static Test42Class1 local3;
public static Test42Class1 local4;
public static Test42Class1 local5;
public static Test42Class2 local6;
public static Test42Class2 local7;
public static Test42Class2 local8;
public static Test42Class2 local9;
public static Test42Class2 local10;
public static Test42Class2 local11;
public static Test42Class2 local12;
public static Test42Class2 local13;
public static Test42Class2 local14;
public static Test42Class2 local15;
public static Test42Class3 local16;
public static Test42Class3 local17;
public static Test42Class3 local18;
public static Test42Class3 local19;
public static Test42Class3 local20;
public static Test42Class3 local21;
public static Test42Class4 local22;
public static Test42Class4 local23;
public static Test42Class4 local24;
public static Test42Class4 local25;
public static Test42Class4 local26;
public static Test42Class4 local27;
public static Test42Class4 local28;
public static Test42Class5 local29;
public static Test42Class5 local30;
}
class Test42Class1 extends BasicClass {
public static Test42Class2 field1;
public static Test42Class4 field2;
public static Test42Class3 field3;
public static Test42Class5 method1(Test42Class1 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return Test42Lib.local29;
field2.field4=arg1.field12;
return field2.field21;
}
public static Test42Class5 method2(Test42Class1 arg0, Test42Class2 arg1, int depth) {
if (depth == 0) return Test42Lib.local29;
if (depth<3) {
for (int local31 = 0; local31<=0; local31 += 1) {
field2.field21=field1.field8.method2(field2.field1,field3.field14,depth-1);
}
}else {
if (depth>2) {
if (depth==3) {
for (int local32 = 0; local32<=1; local32 += 1) {
field3.field5=field3.field5;
}
}
}else {
field2.field3.method17(depth-1);
}
}
return field2.field25;
}
}
class Test42Class2 extends Test42Class1 {
public Test42Class1 field4;
public static Test42Class5 field5;
public static Test42Class1 field6;
public Test42Class5 field7;
public Test42Class2 field8;
public static void method3(Test42Class2 arg0, int depth) {
if (depth == 0) return;
}
public void method4(Test42Class4 arg0, int depth) {
if (depth == 0) return;
arg0.field7.method10(this.field2,arg0.field18,depth-1);
}
public static void method5(Test42Class1 arg0, Test42Class5 arg1, int depth) {
if (depth == 0) return;
arg1.field3=field5.field34;
field5.field3=field1.field7;
}
public void method6(Test42Class5 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return;
}
public static Test42Class4 method7(Test42Class5 arg0, int depth) {
if (depth == 0) return Test42Lib.local23;
for (int local33 = 0; local33<=1; local33 += 1) {
if (depth>=2) {
if (depth==3) {
field2.method23(depth-1);
}
}else {
if (depth==1) {
if (depth>=2) {
field2.field22=field5.field9;
}else {
field1.field4=arg0.field35;
}
}
}
}
if (depth<4) {
field5.field13=field5.field7.method30(depth-1);
}
return arg0.field2;
}
public void method8(int depth) {
if (depth == 0) return;
for (int local34 = 0; local34<=0; local34 += 1) {
this.field1=this.field8;
}
this.field7=this.field3.method2(this.field3,this.field1,depth-1);
}
public static Test42Class2 method9(Test42Class4 arg0, int depth) {
if (depth == 0) return Test42Lib.local23;
return field5.field1;
}
public static void method10(Test42Class4 arg0, Test42Class2 arg1, int depth) {
if (depth == 0) return;
field1.field4=arg0.field2.method22(field2,depth-1);
}
}
class Test42Class3 extends Test42Class2 {
public Test42Class5 field9;
public Test42Class2 field10;
public static Test42Class2 field11;
public Test42Class5 field12;
public Test42Class1 field13;
public Test42Class4 field14;
public Test42Class2 field15;
public static Test42Class5 field16;
public static Test42Class1 field17;
public Test42Class1 method11(Test42Class5 arg0, int depth) {
if (depth == 0) return Test42Lib.local3;
return arg0.field14;
}
public Test42Class4 method12(Test42Class5 arg0, int depth) {
if (depth == 0) return Test42Lib.local22;
arg0.field7=arg0.field5;
return arg0.field28;
}
public void method13(Test42Class3 arg0, int depth) {
if (depth == 0) return;
arg0.field13=this.field2;
if (depth==2) {
for (int local35 = 0; local35<=3; local35 += 1) {
arg0.field7.method5(this.field9,this.field12,depth-1);
}
}else {
for (int local36 = 0; local36<=2; local36 += 1) {
this.field3=this.field12;
}
}
}
public void method14(Test42Class3 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return;
arg0.field12.method13(arg1.field7,depth-1);
}
public Test42Class2 method15(Test42Class3 arg0, int depth) {
if (depth == 0) return Test42Lib.local17;
return this.field3;
}
public static Test42Class5 method16(Test42Class2 arg0, int depth) {
if (depth == 0) return Test42Lib.local30;
for (int local37 = 0; local37<=3; local37 += 1) {
for (int local38 = 0; local38<=3; local38 += 1) {
for (int local39 = 0; local39<=1; local39 += 1) {
if (depth>=4) {
for (int local40 = 0; local40<=2; local40 += 1) {
}
}
}
}
}
return arg0.field5;
}
public static Test42Class4 method17(int depth) {
if (depth == 0) return Test42Lib.local25;
if (depth==3) {
for (int local41 = 0; local41<=1; local41 += 1) {
if (depth>=2) {
field5.field5.method13(field5.field7,depth-1);
}
}
}else {
field2.field6=field16.field10;
}
return field5.field14;
}
public static Test42Class1 method18(Test42Class1 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return Test42Lib.local30;
return field16.field32;
}
public Test42Class3 method19(Test42Class1 arg0, int depth) {
if (depth == 0) return Test42Lib.local29;
return arg0.field3;
}
}
class Test42Class4 extends Test42Class2 {
public static Test42Class4 field18;
public Test42Class1 field19;
public Test42Class2 field20;
public static Test42Class5 field21;
public Test42Class3 field22;
public Test42Class2 field23;
public Test42Class1 field24;
public Test42Class5 field25;
public static Test42Class3 field26;
public Test42Class1 field27;
public void method20(int depth) {
if (depth == 0) return;
this.field1=this.field2;
this.field4=this.field21.method18(this.field4,this.field5,depth-1);
}
public void method21(Test42Class2 arg0, Test42Class4 arg1, int depth) {
if (depth == 0) return;
for (int local42 = 0; local42<=0; local42 += 1) {
if (depth<4) {
for (int local43 = 0; local43<=2; local43 += 1) {
for (int local44 = 0; local44<=3; local44 += 1) {
this.field21.method4(this.field2,depth-1);
}
}
}else {
for (int local45 = 0; local45<=1; local45 += 1) {
arg1.field18.method26(arg1.field8,arg0.field5,depth-1);
}
}
}
}
public static Test42Class4 method22(Test42Class4 arg0, int depth) {
if (depth == 0) return Test42Lib.local28;
arg0.field5.method32(field18.field25,field21,depth-1);
return field1.field2;
}
public static void method23(int depth) {
if (depth == 0) return;
}
public static Test42Class1 method24(Test42Class4 arg0, int depth) {
if (depth == 0) return Test42Lib.local27;
if (depth<=2) {
field2.method26(field2.field21,arg0.field26,depth-1);
}
return field26;
}
public static void method25(int depth) {
if (depth == 0) return;
field5.field12.method27(field21.field7,field2.field2,depth-1);
}
public static void method26(Test42Class1 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return;
field3.field1=field5.field3;
}
}
class Test42Class5 extends Test42Class3 {
public Test42Class4 field28;
public Test42Class2 field29;
public static Test42Class2 field30;
public static Test42Class5 field31;
public static Test42Class1 field32;
public Test42Class3 field33;
public Test42Class5 field34;
public Test42Class2 field35;
public static Test42Class4 field36;
public void method27(Test42Class1 arg0, Test42Class4 arg1, int depth) {
if (depth == 0) return;
arg1.field19=this.field4;
}
public Test42Class5 method28(Test42Class4 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return Test42Lib.local29;
if (depth<3) {
if (depth<=4) {
for (int local46 = 0; local46<=2; local46 += 1) {
for (int local47 = 0; local47<=1; local47 += 1) {
if (depth<=1) {
}
}
}
}else {
arg1.field11=arg1.field9;
}
}else {
arg0.field3=this.field33.method19(arg0.field8,depth-1);
}
return this.field7;
}
public void method29(Test42Class4 arg0, int depth) {
if (depth == 0) return;
}
public static Test42Class1 method30(int depth) {
if (depth == 0) return Test42Lib.local20;
field36.field4=field11.field3.method19(field5.field3,depth-1);
return field1.field6;
}
public static void method31(Test42Class1 arg0, int depth) {
if (depth == 0) return;
field31.field35=field16.method12(field36.field25,depth-1);
}
public Test42Class5 method32(Test42Class3 arg0, Test42Class5 arg1, int depth) {
if (depth == 0) return Test42Lib.local30;
this.field28=this.field14;
arg1.field36.method10(arg1.field28,arg1.field28,depth-1);
return arg0.field7;
}
}
public class Test42{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test42Lib.local1 = new Test42Class1();
Benchmark.alloc(2);
Test42Lib.local2 = new Test42Class1();
Benchmark.alloc(3);
Test42Lib.local3 = new Test42Class1();
Benchmark.alloc(4);
Test42Lib.local4 = new Test42Class1();
Benchmark.alloc(5);
Test42Lib.local5 = new Test42Class1();
Benchmark.alloc(6);
Test42Lib.local6 = new Test42Class2();
Benchmark.alloc(7);
Test42Lib.local7 = new Test42Class2();
Benchmark.alloc(8);
Test42Lib.local8 = new Test42Class2();
Benchmark.alloc(9);
Test42Lib.local9 = new Test42Class2();
Benchmark.alloc(10);
Test42Lib.local10 = new Test42Class2();
Benchmark.alloc(11);
Test42Lib.local11 = new Test42Class2();
Benchmark.alloc(12);
Test42Lib.local12 = new Test42Class2();
Benchmark.alloc(13);
Test42Lib.local13 = new Test42Class2();
Benchmark.alloc(14);
Test42Lib.local14 = new Test42Class2();
Benchmark.alloc(15);
Test42Lib.local15 = new Test42Class2();
Benchmark.alloc(16);
Test42Lib.local16 = new Test42Class3();
Benchmark.alloc(17);
Test42Lib.local17 = new Test42Class3();
Benchmark.alloc(18);
Test42Lib.local18 = new Test42Class3();
Benchmark.alloc(19);
Test42Lib.local19 = new Test42Class3();
Benchmark.alloc(20);
Test42Lib.local20 = new Test42Class3();
Benchmark.alloc(21);
Test42Lib.local21 = new Test42Class3();
Benchmark.alloc(22);
Test42Lib.local22 = new Test42Class4();
Benchmark.alloc(23);
Test42Lib.local23 = new Test42Class4();
Benchmark.alloc(24);
Test42Lib.local24 = new Test42Class4();
Benchmark.alloc(25);
Test42Lib.local25 = new Test42Class4();
Benchmark.alloc(26);
Test42Lib.local26 = new Test42Class4();
Benchmark.alloc(27);
Test42Lib.local27 = new Test42Class4();
Benchmark.alloc(28);
Test42Lib.local28 = new Test42Class4();
Benchmark.alloc(29);
Test42Lib.local29 = new Test42Class5();
Benchmark.alloc(30);
Test42Lib.local30 = new Test42Class5();
Test42Lib.local1.field1 = Test42Lib.local22;
Test42Lib.local1.field2 = Test42Lib.local24;
Test42Lib.local1.field3 = Test42Lib.local21;
Test42Lib.local2.field1 = Test42Lib.local21;
Test42Lib.local2.field2 = Test42Lib.local26;
Test42Lib.local2.field3 = Test42Lib.local30;
Test42Lib.local3.field1 = Test42Lib.local30;
Test42Lib.local3.field2 = Test42Lib.local24;
Test42Lib.local3.field3 = Test42Lib.local16;
Test42Lib.local4.field1 = Test42Lib.local19;
Test42Lib.local4.field2 = Test42Lib.local27;
Test42Lib.local4.field3 = Test42Lib.local18;
Test42Lib.local5.field1 = Test42Lib.local8;
Test42Lib.local5.field2 = Test42Lib.local23;
Test42Lib.local5.field3 = Test42Lib.local16;
Test42Lib.local6.field4 = Test42Lib.local14;
Test42Lib.local6.field5 = Test42Lib.local29;
Test42Lib.local6.field6 = Test42Lib.local19;
Test42Lib.local6.field7 = Test42Lib.local29;
Test42Lib.local6.field8 = Test42Lib.local14;
Test42Lib.local6.field1 = Test42Lib.local13;
Test42Lib.local6.field2 = Test42Lib.local24;
Test42Lib.local6.field3 = Test42Lib.local20;
Test42Lib.local7.field4 = Test42Lib.local6;
Test42Lib.local7.field5 = Test42Lib.local29;
Test42Lib.local7.field6 = Test42Lib.local18;
Test42Lib.local7.field7 = Test42Lib.local30;
Test42Lib.local7.field8 = Test42Lib.local6;
Test42Lib.local7.field1 = Test42Lib.local30;
Test42Lib.local7.field2 = Test42Lib.local23;
Test42Lib.local7.field3 = Test42Lib.local21;
Test42Lib.local8.field4 = Test42Lib.local24;
Test42Lib.local8.field5 = Test42Lib.local30;
Test42Lib.local8.field6 = Test42Lib.local20;
Test42Lib.local8.field7 = Test42Lib.local29;
Test42Lib.local8.field8 = Test42Lib.local21;
Test42Lib.local8.field1 = Test42Lib.local11;
Test42Lib.local8.field2 = Test42Lib.local23;
Test42Lib.local8.field3 = Test42Lib.local21;
Test42Lib.local9.field4 = Test42Lib.local6;
Test42Lib.local9.field5 = Test42Lib.local30;
Test42Lib.local9.field6 = Test42Lib.local3;
Test42Lib.local9.field7 = Test42Lib.local29;
Test42Lib.local9.field8 = Test42Lib.local29;
Test42Lib.local9.field1 = Test42Lib.local27;
Test42Lib.local9.field2 = Test42Lib.local25;
Test42Lib.local9.field3 = Test42Lib.local18;
Test42Lib.local10.field4 = Test42Lib.local19;
Test42Lib.local10.field5 = Test42Lib.local30;
Test42Lib.local10.field6 = Test42Lib.local2;
Test42Lib.local10.field7 = Test42Lib.local30;
Test42Lib.local10.field8 = Test42Lib.local24;
Test42Lib.local10.field1 = Test42Lib.local6;
Test42Lib.local10.field2 = Test42Lib.local26;
Test42Lib.local10.field3 = Test42Lib.local21;
Test42Lib.local11.field4 = Test42Lib.local11;
Test42Lib.local11.field5 = Test42Lib.local29;
Test42Lib.local11.field6 = Test42Lib.local27;
Test42Lib.local11.field7 = Test42Lib.local29;
Test42Lib.local11.field8 = Test42Lib.local22;
Test42Lib.local11.field1 = Test42Lib.local9;
Test42Lib.local11.field2 = Test42Lib.local25;
Test42Lib.local11.field3 = Test42Lib.local30;
Test42Lib.local12.field4 = Test42Lib.local11;
Test42Lib.local12.field5 = Test42Lib.local29;
Test42Lib.local12.field6 = Test42Lib.local1;
Test42Lib.local12.field7 = Test42Lib.local29;
Test42Lib.local12.field8 = Test42Lib.local6;
Test42Lib.local12.field1 = Test42Lib.local28;
Test42Lib.local12.field2 = Test42Lib.local24;
Test42Lib.local12.field3 = Test42Lib.local21;
Test42Lib.local13.field4 = Test42Lib.local23;
Test42Lib.local13.field5 = Test42Lib.local30;
Test42Lib.local13.field6 = Test42Lib.local22;
Test42Lib.local13.field7 = Test42Lib.local29;
Test42Lib.local13.field8 = Test42Lib.local10;
Test42Lib.local13.field1 = Test42Lib.local6;
Test42Lib.local13.field2 = Test42Lib.local27;
Test42Lib.local13.field3 = Test42Lib.local30;
Test42Lib.local14.field4 = Test42Lib.local17;
Test42Lib.local14.field5 = Test42Lib.local30;
Test42Lib.local14.field6 = Test42Lib.local8;
Test42Lib.local14.field7 = Test42Lib.local30;
Test42Lib.local14.field8 = Test42Lib.local30;
Test42Lib.local14.field1 = Test42Lib.local11;
Test42Lib.local14.field2 = Test42Lib.local23;
Test42Lib.local14.field3 = Test42Lib.local19;
Test42Lib.local15.field4 = Test42Lib.local2;
Test42Lib.local15.field5 = Test42Lib.local29;
Test42Lib.local15.field6 = Test42Lib.local19;
Test42Lib.local15.field7 = Test42Lib.local29;
Test42Lib.local15.field8 = Test42Lib.local25;
Test42Lib.local15.field1 = Test42Lib.local27;
Test42Lib.local15.field2 = Test42Lib.local22;
Test42Lib.local15.field3 = Test42Lib.local29;
Test42Lib.local16.field9 = Test42Lib.local30;
Test42Lib.local16.field10 = Test42Lib.local24;
Test42Lib.local16.field11 = Test42Lib.local16;
Test42Lib.local16.field12 = Test42Lib.local29;
Test42Lib.local16.field13 = Test42Lib.local12;
Test42Lib.local16.field14 = Test42Lib.local26;
Test42Lib.local16.field15 = Test42Lib.local10;
Test42Lib.local16.field16 = Test42Lib.local30;
Test42Lib.local16.field17 = Test42Lib.local10;
Test42Lib.local16.field4 = Test42Lib.local23;
Test42Lib.local16.field5 = Test42Lib.local30;
Test42Lib.local16.field6 = Test42Lib.local29;
Test42Lib.local16.field7 = Test42Lib.local29;
Test42Lib.local16.field8 = Test42Lib.local24;
Test42Lib.local16.field1 = Test42Lib.local13;
Test42Lib.local16.field2 = Test42Lib.local27;
Test42Lib.local16.field3 = Test42Lib.local30;
Test42Lib.local17.field9 = Test42Lib.local29;
Test42Lib.local17.field10 = Test42Lib.local16;
Test42Lib.local17.field11 = Test42Lib.local19;
Test42Lib.local17.field12 = Test42Lib.local30;
Test42Lib.local17.field13 = Test42Lib.local10;
Test42Lib.local17.field14 = Test42Lib.local25;
Test42Lib.local17.field15 = Test42Lib.local21;
Test42Lib.local17.field16 = Test42Lib.local29;
Test42Lib.local17.field17 = Test42Lib.local1;
Test42Lib.local17.field4 = Test42Lib.local21;
Test42Lib.local17.field5 = Test42Lib.local30;
Test42Lib.local17.field6 = Test42Lib.local14;
Test42Lib.local17.field7 = Test42Lib.local30;
Test42Lib.local17.field8 = Test42Lib.local10;
Test42Lib.local17.field1 = Test42Lib.local20;
Test42Lib.local17.field2 = Test42Lib.local27;
Test42Lib.local17.field3 = Test42Lib.local17;
Test42Lib.local18.field9 = Test42Lib.local29;
Test42Lib.local18.field10 = Test42Lib.local13;
Test42Lib.local18.field11 = Test42Lib.local8;
Test42Lib.local18.field12 = Test42Lib.local29;
Test42Lib.local18.field13 = Test42Lib.local16;
Test42Lib.local18.field14 = Test42Lib.local27;
Test42Lib.local18.field15 = Test42Lib.local18;
Test42Lib.local18.field16 = Test42Lib.local29;
Test42Lib.local18.field17 = Test42Lib.local28;
Test42Lib.local18.field4 = Test42Lib.local7;
Test42Lib.local18.field5 = Test42Lib.local30;
Test42Lib.local18.field6 = Test42Lib.local6;
Test42Lib.local18.field7 = Test42Lib.local29;
Test42Lib.local18.field8 = Test42Lib.local14;
Test42Lib.local18.field1 = Test42Lib.local22;
Test42Lib.local18.field2 = Test42Lib.local23;
Test42Lib.local18.field3 = Test42Lib.local18;
Test42Lib.local19.field9 = Test42Lib.local29;
Test42Lib.local19.field10 = Test42Lib.local13;
Test42Lib.local19.field11 = Test42Lib.local6;
Test42Lib.local19.field12 = Test42Lib.local29;
Test42Lib.local19.field13 = Test42Lib.local4;
Test42Lib.local19.field14 = Test42Lib.local27;
Test42Lib.local19.field15 = Test42Lib.local24;
Test42Lib.local19.field16 = Test42Lib.local30;
Test42Lib.local19.field17 = Test42Lib.local23;
Test42Lib.local19.field4 = Test42Lib.local30;
Test42Lib.local19.field5 = Test42Lib.local30;
Test42Lib.local19.field6 = Test42Lib.local12;
Test42Lib.local19.field7 = Test42Lib.local29;
Test42Lib.local19.field8 = Test42Lib.local30;
Test42Lib.local19.field1 = Test42Lib.local18;
Test42Lib.local19.field2 = Test42Lib.local27;
Test42Lib.local19.field3 = Test42Lib.local29;
Test42Lib.local20.field9 = Test42Lib.local29;
Test42Lib.local20.field10 = Test42Lib.local27;
Test42Lib.local20.field11 = Test42Lib.local12;
Test42Lib.local20.field12 = Test42Lib.local30;
Test42Lib.local20.field13 = Test42Lib.local22;
Test42Lib.local20.field14 = Test42Lib.local23;
Test42Lib.local20.field15 = Test42Lib.local8;
Test42Lib.local20.field16 = Test42Lib.local29;
Test42Lib.local20.field17 = Test42Lib.local5;
Test42Lib.local20.field4 = Test42Lib.local16;
Test42Lib.local20.field5 = Test42Lib.local30;
Test42Lib.local20.field6 = Test42Lib.local26;
Test42Lib.local20.field7 = Test42Lib.local29;
Test42Lib.local20.field8 = Test42Lib.local14;
Test42Lib.local20.field1 = Test42Lib.local16;
Test42Lib.local20.field2 = Test42Lib.local25;
Test42Lib.local20.field3 = Test42Lib.local16;
Test42Lib.local21.field9 = Test42Lib.local30;
Test42Lib.local21.field10 = Test42Lib.local25;
Test42Lib.local21.field11 = Test42Lib.local27;
Test42Lib.local21.field12 = Test42Lib.local30;
Test42Lib.local21.field13 = Test42Lib.local23;
Test42Lib.local21.field14 = Test42Lib.local26;
Test42Lib.local21.field15 = Test42Lib.local19;
Test42Lib.local21.field16 = Test42Lib.local30;
Test42Lib.local21.field17 = Test42Lib.local18;
Test42Lib.local21.field4 = Test42Lib.local13;
Test42Lib.local21.field5 = Test42Lib.local29;
Test42Lib.local21.field6 = Test42Lib.local14;
Test42Lib.local21.field7 = Test42Lib.local30;
Test42Lib.local21.field8 = Test42Lib.local19;
Test42Lib.local21.field1 = Test42Lib.local26;
Test42Lib.local21.field2 = Test42Lib.local25;
Test42Lib.local21.field3 = Test42Lib.local30;
Test42Lib.local22.field18 = Test42Lib.local28;
Test42Lib.local22.field19 = Test42Lib.local26;
Test42Lib.local22.field20 = Test42Lib.local29;
Test42Lib.local22.field21 = Test42Lib.local29;
Test42Lib.local22.field22 = Test42Lib.local29;
Test42Lib.local22.field23 = Test42Lib.local16;
Test42Lib.local22.field24 = Test42Lib.local19;
Test42Lib.local22.field25 = Test42Lib.local29;
Test42Lib.local22.field26 = Test42Lib.local29;
Test42Lib.local22.field27 = Test42Lib.local15;
Test42Lib.local22.field4 = Test42Lib.local1;
Test42Lib.local22.field5 = Test42Lib.local30;
Test42Lib.local22.field6 = Test42Lib.local27;
Test42Lib.local22.field7 = Test42Lib.local29;
Test42Lib.local22.field8 = Test42Lib.local30;
Test42Lib.local22.field1 = Test42Lib.local21;
Test42Lib.local22.field2 = Test42Lib.local24;
Test42Lib.local22.field3 = Test42Lib.local17;
Test42Lib.local23.field18 = Test42Lib.local22;
Test42Lib.local23.field19 = Test42Lib.local26;
Test42Lib.local23.field20 = Test42Lib.local25;
Test42Lib.local23.field21 = Test42Lib.local29;
Test42Lib.local23.field22 = Test42Lib.local16;
Test42Lib.local23.field23 = Test42Lib.local7;
Test42Lib.local23.field24 = Test42Lib.local7;
Test42Lib.local23.field25 = Test42Lib.local29;
Test42Lib.local23.field26 = Test42Lib.local19;
Test42Lib.local23.field27 = Test42Lib.local14;
Test42Lib.local23.field4 = Test42Lib.local27;
Test42Lib.local23.field5 = Test42Lib.local29;
Test42Lib.local23.field6 = Test42Lib.local16;
Test42Lib.local23.field7 = Test42Lib.local30;
Test42Lib.local23.field8 = Test42Lib.local20;
Test42Lib.local23.field1 = Test42Lib.local23;
Test42Lib.local23.field2 = Test42Lib.local27;
Test42Lib.local23.field3 = Test42Lib.local21;
Test42Lib.local24.field18 = Test42Lib.local24;
Test42Lib.local24.field19 = Test42Lib.local21;
Test42Lib.local24.field20 = Test42Lib.local6;
Test42Lib.local24.field21 = Test42Lib.local29;
Test42Lib.local24.field22 = Test42Lib.local18;
Test42Lib.local24.field23 = Test42Lib.local7;
Test42Lib.local24.field24 = Test42Lib.local5;
Test42Lib.local24.field25 = Test42Lib.local30;
Test42Lib.local24.field26 = Test42Lib.local30;
Test42Lib.local24.field27 = Test42Lib.local18;
Test42Lib.local24.field4 = Test42Lib.local11;
Test42Lib.local24.field5 = Test42Lib.local30;
Test42Lib.local24.field6 = Test42Lib.local14;
Test42Lib.local24.field7 = Test42Lib.local29;
Test42Lib.local24.field8 = Test42Lib.local25;
Test42Lib.local24.field1 = Test42Lib.local26;
Test42Lib.local24.field2 = Test42Lib.local22;
Test42Lib.local24.field3 = Test42Lib.local29;
Test42Lib.local25.field18 = Test42Lib.local22;
Test42Lib.local25.field19 = Test42Lib.local9;
Test42Lib.local25.field20 = Test42Lib.local15;
Test42Lib.local25.field21 = Test42Lib.local30;
Test42Lib.local25.field22 = Test42Lib.local21;
Test42Lib.local25.field23 = Test42Lib.local26;
Test42Lib.local25.field24 = Test42Lib.local30;
Test42Lib.local25.field25 = Test42Lib.local30;
Test42Lib.local25.field26 = Test42Lib.local17;
Test42Lib.local25.field27 = Test42Lib.local27;
Test42Lib.local25.field4 = Test42Lib.local13;
Test42Lib.local25.field5 = Test42Lib.local30;
Test42Lib.local25.field6 = Test42Lib.local7;
Test42Lib.local25.field7 = Test42Lib.local29;
Test42Lib.local25.field8 = Test42Lib.local12;
Test42Lib.local25.field1 = Test42Lib.local21;
Test42Lib.local25.field2 = Test42Lib.local28;
Test42Lib.local25.field3 = Test42Lib.local19;
Test42Lib.local26.field18 = Test42Lib.local23;
Test42Lib.local26.field19 = Test42Lib.local21;
Test42Lib.local26.field20 = Test42Lib.local27;
Test42Lib.local26.field21 = Test42Lib.local29;
Test42Lib.local26.field22 = Test42Lib.local16;
Test42Lib.local26.field23 = Test42Lib.local14;
Test42Lib.local26.field24 = Test42Lib.local19;
Test42Lib.local26.field25 = Test42Lib.local30;
Test42Lib.local26.field26 = Test42Lib.local29;
Test42Lib.local26.field27 = Test42Lib.local13;
Test42Lib.local26.field4 = Test42Lib.local26;
Test42Lib.local26.field5 = Test42Lib.local30;
Test42Lib.local26.field6 = Test42Lib.local20;
Test42Lib.local26.field7 = Test42Lib.local30;
Test42Lib.local26.field8 = Test42Lib.local22;
Test42Lib.local26.field1 = Test42Lib.local10;
Test42Lib.local26.field2 = Test42Lib.local27;
Test42Lib.local26.field3 = Test42Lib.local18;
Test42Lib.local27.field18 = Test42Lib.local26;
Test42Lib.local27.field19 = Test42Lib.local17;
Test42Lib.local27.field20 = Test42Lib.local7;
Test42Lib.local27.field21 = Test42Lib.local30;
Test42Lib.local27.field22 = Test42Lib.local20;
Test42Lib.local27.field23 = Test42Lib.local21;
Test42Lib.local27.field24 = Test42Lib.local23;
Test42Lib.local27.field25 = Test42Lib.local29;
Test42Lib.local27.field26 = Test42Lib.local16;
Test42Lib.local27.field27 = Test42Lib.local12;
Test42Lib.local27.field4 = Test42Lib.local26;
Test42Lib.local27.field5 = Test42Lib.local30;
Test42Lib.local27.field6 = Test42Lib.local18;
Test42Lib.local27.field7 = Test42Lib.local29;
Test42Lib.local27.field8 = Test42Lib.local28;
Test42Lib.local27.field1 = Test42Lib.local25;
Test42Lib.local27.field2 = Test42Lib.local22;
Test42Lib.local27.field3 = Test42Lib.local17;
Test42Lib.local28.field18 = Test42Lib.local27;
Test42Lib.local28.field19 = Test42Lib.local4;
Test42Lib.local28.field20 = Test42Lib.local11;
Test42Lib.local28.field21 = Test42Lib.local30;
Test42Lib.local28.field22 = Test42Lib.local30;
Test42Lib.local28.field23 = Test42Lib.local7;
Test42Lib.local28.field24 = Test42Lib.local8;
Test42Lib.local28.field25 = Test42Lib.local29;
Test42Lib.local28.field26 = Test42Lib.local19;
Test42Lib.local28.field27 = Test42Lib.local8;
Test42Lib.local28.field4 = Test42Lib.local10;
Test42Lib.local28.field5 = Test42Lib.local30;
Test42Lib.local28.field6 = Test42Lib.local8;
Test42Lib.local28.field7 = Test42Lib.local30;
Test42Lib.local28.field8 = Test42Lib.local28;
Test42Lib.local28.field1 = Test42Lib.local25;
Test42Lib.local28.field2 = Test42Lib.local28;
Test42Lib.local28.field3 = Test42Lib.local30;
Test42Lib.local29.field28 = Test42Lib.local23;
Test42Lib.local29.field29 = Test42Lib.local23;
Test42Lib.local29.field30 = Test42Lib.local14;
Test42Lib.local29.field31 = Test42Lib.local29;
Test42Lib.local29.field32 = Test42Lib.local18;
Test42Lib.local29.field33 = Test42Lib.local16;
Test42Lib.local29.field34 = Test42Lib.local30;
Test42Lib.local29.field35 = Test42Lib.local15;
Test42Lib.local29.field36 = Test42Lib.local28;
Test42Lib.local29.field9 = Test42Lib.local30;
Test42Lib.local29.field10 = Test42Lib.local18;
Test42Lib.local29.field11 = Test42Lib.local29;
Test42Lib.local29.field12 = Test42Lib.local29;
Test42Lib.local29.field13 = Test42Lib.local8;
Test42Lib.local29.field14 = Test42Lib.local23;
Test42Lib.local29.field15 = Test42Lib.local29;
Test42Lib.local29.field16 = Test42Lib.local30;
Test42Lib.local29.field17 = Test42Lib.local25;
Test42Lib.local29.field4 = Test42Lib.local1;
Test42Lib.local29.field5 = Test42Lib.local29;
Test42Lib.local29.field6 = Test42Lib.local21;
Test42Lib.local29.field7 = Test42Lib.local29;
Test42Lib.local29.field8 = Test42Lib.local20;
Test42Lib.local29.field1 = Test42Lib.local29;
Test42Lib.local29.field2 = Test42Lib.local23;
Test42Lib.local29.field3 = Test42Lib.local30;
Test42Lib.local30.field28 = Test42Lib.local22;
Test42Lib.local30.field29 = Test42Lib.local9;
Test42Lib.local30.field30 = Test42Lib.local20;
Test42Lib.local30.field31 = Test42Lib.local29;
Test42Lib.local30.field32 = Test42Lib.local4;
Test42Lib.local30.field33 = Test42Lib.local16;
Test42Lib.local30.field34 = Test42Lib.local30;
Test42Lib.local30.field35 = Test42Lib.local27;
Test42Lib.local30.field36 = Test42Lib.local27;
Test42Lib.local30.field9 = Test42Lib.local29;
Test42Lib.local30.field10 = Test42Lib.local25;
Test42Lib.local30.field11 = Test42Lib.local27;
Test42Lib.local30.field12 = Test42Lib.local30;
Test42Lib.local30.field13 = Test42Lib.local16;
Test42Lib.local30.field14 = Test42Lib.local27;
Test42Lib.local30.field15 = Test42Lib.local22;
Test42Lib.local30.field16 = Test42Lib.local29;
Test42Lib.local30.field17 = Test42Lib.local12;
Test42Lib.local30.field4 = Test42Lib.local10;
Test42Lib.local30.field5 = Test42Lib.local29;
Test42Lib.local30.field6 = Test42Lib.local1;
Test42Lib.local30.field7 = Test42Lib.local29;
Test42Lib.local30.field8 = Test42Lib.local12;
Test42Lib.local30.field1 = Test42Lib.local15;
Test42Lib.local30.field2 = Test42Lib.local27;
Test42Lib.local30.field3 = Test42Lib.local16;
Test42Lib.local16.field2.method21(Test42Lib.local11.field1,Test42Lib.local23,3);
Test42Lib.local25.field2.method20(3);
Test42Lib.local22.field4=Test42Lib.local13.field2.method7(Test42Lib.local29.field5,3);
for (int local48 = 0; local48<=1; local48 += 1) {
Test42Lib.local7.field2.method20(3);
}
Test42Lib.local25.field1=Test42Lib.local29.field29;
Test42Lib.local21.field2=Test42Lib.local29.field28;
Test42Lib.local7.field4=Test42Lib.local19.method2(Test42Lib.local5.field3,Test42Lib.local17,3);
Test42Lib.local6.field6=Test42Lib.local28.field27;
if (inputValue<2) {
Test42Lib.local17.field11=Test42Lib.local7.field1;
}else {
Test42Lib.local9.field2.method24(Test42Lib.local30.field28,3);
}
Test42Lib.local15.field2.method1(Test42Lib.local28.field25,Test42Lib.local12.field5,3);
Benchmark.test(1,Test42Lib.local1);
Benchmark.test(2,Test42Lib.local2);
Benchmark.test(3,Test42Lib.local3);
Benchmark.test(4,Test42Lib.local4);
Benchmark.test(5,Test42Lib.local5);
Benchmark.test(6,Test42Lib.local6);
Benchmark.test(7,Test42Lib.local7);
Benchmark.test(8,Test42Lib.local8);
Benchmark.test(9,Test42Lib.local9);
Benchmark.test(10,Test42Lib.local10);
Benchmark.test(11,Test42Lib.local11);
Benchmark.test(12,Test42Lib.local12);
Benchmark.test(13,Test42Lib.local13);
Benchmark.test(14,Test42Lib.local14);
Benchmark.test(15,Test42Lib.local15);
Benchmark.test(16,Test42Lib.local16);
Benchmark.test(17,Test42Lib.local17);
Benchmark.test(18,Test42Lib.local18);
Benchmark.test(19,Test42Lib.local19);
Benchmark.test(20,Test42Lib.local20);
Benchmark.test(21,Test42Lib.local21);
Benchmark.test(22,Test42Lib.local22);
Benchmark.test(23,Test42Lib.local23);
Benchmark.test(24,Test42Lib.local24);
Benchmark.test(25,Test42Lib.local25);
Benchmark.test(26,Test42Lib.local26);
Benchmark.test(27,Test42Lib.local27);
Benchmark.test(28,Test42Lib.local28);
Benchmark.test(29,Test42Lib.local29);
Benchmark.test(30,Test42Lib.local30);
Benchmark.test(31,Test42Lib.local1.field1);
Benchmark.test(32,Test42Lib.local1.field2);
Benchmark.test(33,Test42Lib.local1.field3);
Benchmark.test(34,Test42Lib.local2.field1);
Benchmark.test(35,Test42Lib.local2.field2);
Benchmark.test(36,Test42Lib.local2.field3);
Benchmark.test(37,Test42Lib.local3.field1);
Benchmark.test(38,Test42Lib.local3.field2);
Benchmark.test(39,Test42Lib.local3.field3);
Benchmark.test(40,Test42Lib.local4.field1);
Benchmark.test(41,Test42Lib.local4.field2);
Benchmark.test(42,Test42Lib.local4.field3);
Benchmark.test(43,Test42Lib.local5.field1);
Benchmark.test(44,Test42Lib.local5.field2);
Benchmark.test(45,Test42Lib.local5.field3);
Benchmark.test(46,Test42Lib.local6.field4);
Benchmark.test(47,Test42Lib.local6.field5);
Benchmark.test(48,Test42Lib.local6.field6);
Benchmark.test(49,Test42Lib.local6.field7);
Benchmark.test(50,Test42Lib.local6.field8);
Benchmark.test(51,Test42Lib.local6.field1);
Benchmark.test(52,Test42Lib.local6.field2);
Benchmark.test(53,Test42Lib.local6.field3);
Benchmark.test(54,Test42Lib.local7.field4);
Benchmark.test(55,Test42Lib.local7.field5);
Benchmark.test(56,Test42Lib.local7.field6);
Benchmark.test(57,Test42Lib.local7.field7);
Benchmark.test(58,Test42Lib.local7.field8);
Benchmark.test(59,Test42Lib.local7.field1);
Benchmark.test(60,Test42Lib.local7.field2);
Benchmark.test(61,Test42Lib.local7.field3);
Benchmark.test(62,Test42Lib.local8.field4);
Benchmark.test(63,Test42Lib.local8.field5);
Benchmark.test(64,Test42Lib.local8.field6);
Benchmark.test(65,Test42Lib.local8.field7);
Benchmark.test(66,Test42Lib.local8.field8);
Benchmark.test(67,Test42Lib.local8.field1);
Benchmark.test(68,Test42Lib.local8.field2);
Benchmark.test(69,Test42Lib.local8.field3);
Benchmark.test(70,Test42Lib.local9.field4);
Benchmark.test(71,Test42Lib.local9.field5);
Benchmark.test(72,Test42Lib.local9.field6);
Benchmark.test(73,Test42Lib.local9.field7);
Benchmark.test(74,Test42Lib.local9.field8);
Benchmark.test(75,Test42Lib.local9.field1);
Benchmark.test(76,Test42Lib.local9.field2);
Benchmark.test(77,Test42Lib.local9.field3);
Benchmark.test(78,Test42Lib.local10.field4);
Benchmark.test(79,Test42Lib.local10.field5);
Benchmark.test(80,Test42Lib.local10.field6);
Benchmark.test(81,Test42Lib.local10.field7);
Benchmark.test(82,Test42Lib.local10.field8);
Benchmark.test(83,Test42Lib.local10.field1);
Benchmark.test(84,Test42Lib.local10.field2);
Benchmark.test(85,Test42Lib.local10.field3);
Benchmark.test(86,Test42Lib.local11.field4);
Benchmark.test(87,Test42Lib.local11.field5);
Benchmark.test(88,Test42Lib.local11.field6);
Benchmark.test(89,Test42Lib.local11.field7);
Benchmark.test(90,Test42Lib.local11.field8);
Benchmark.test(91,Test42Lib.local11.field1);
Benchmark.test(92,Test42Lib.local11.field2);
Benchmark.test(93,Test42Lib.local11.field3);
Benchmark.test(94,Test42Lib.local12.field4);
Benchmark.test(95,Test42Lib.local12.field5);
Benchmark.test(96,Test42Lib.local12.field6);
Benchmark.test(97,Test42Lib.local12.field7);
Benchmark.test(98,Test42Lib.local12.field8);
Benchmark.test(99,Test42Lib.local12.field1);
Benchmark.test(100,Test42Lib.local12.field2);
Benchmark.test(101,Test42Lib.local12.field3);
Benchmark.test(102,Test42Lib.local13.field4);
Benchmark.test(103,Test42Lib.local13.field5);
Benchmark.test(104,Test42Lib.local13.field6);
Benchmark.test(105,Test42Lib.local13.field7);
Benchmark.test(106,Test42Lib.local13.field8);
Benchmark.test(107,Test42Lib.local13.field1);
Benchmark.test(108,Test42Lib.local13.field2);
Benchmark.test(109,Test42Lib.local13.field3);
Benchmark.test(110,Test42Lib.local14.field4);
Benchmark.test(111,Test42Lib.local14.field5);
Benchmark.test(112,Test42Lib.local14.field6);
Benchmark.test(113,Test42Lib.local14.field7);
Benchmark.test(114,Test42Lib.local14.field8);
Benchmark.test(115,Test42Lib.local14.field1);
Benchmark.test(116,Test42Lib.local14.field2);
Benchmark.test(117,Test42Lib.local14.field3);
Benchmark.test(118,Test42Lib.local15.field4);
Benchmark.test(119,Test42Lib.local15.field5);
Benchmark.test(120,Test42Lib.local15.field6);
Benchmark.test(121,Test42Lib.local15.field7);
Benchmark.test(122,Test42Lib.local15.field8);
Benchmark.test(123,Test42Lib.local15.field1);
Benchmark.test(124,Test42Lib.local15.field2);
Benchmark.test(125,Test42Lib.local15.field3);
Benchmark.test(126,Test42Lib.local16.field9);
Benchmark.test(127,Test42Lib.local16.field10);
Benchmark.test(128,Test42Lib.local16.field11);
Benchmark.test(129,Test42Lib.local16.field12);
Benchmark.test(130,Test42Lib.local16.field13);
Benchmark.test(131,Test42Lib.local16.field14);
Benchmark.test(132,Test42Lib.local16.field15);
Benchmark.test(133,Test42Lib.local16.field16);
Benchmark.test(134,Test42Lib.local16.field17);
Benchmark.test(135,Test42Lib.local16.field4);
Benchmark.test(136,Test42Lib.local16.field5);
Benchmark.test(137,Test42Lib.local16.field6);
Benchmark.test(138,Test42Lib.local16.field7);
Benchmark.test(139,Test42Lib.local16.field8);
Benchmark.test(140,Test42Lib.local16.field1);
Benchmark.test(141,Test42Lib.local16.field2);
Benchmark.test(142,Test42Lib.local16.field3);
Benchmark.test(143,Test42Lib.local17.field9);
Benchmark.test(144,Test42Lib.local17.field10);
Benchmark.test(145,Test42Lib.local17.field11);
Benchmark.test(146,Test42Lib.local17.field12);
Benchmark.test(147,Test42Lib.local17.field13);
Benchmark.test(148,Test42Lib.local17.field14);
Benchmark.test(149,Test42Lib.local17.field15);
Benchmark.test(150,Test42Lib.local17.field16);
Benchmark.test(151,Test42Lib.local17.field17);
Benchmark.test(152,Test42Lib.local17.field4);
Benchmark.test(153,Test42Lib.local17.field5);
Benchmark.test(154,Test42Lib.local17.field6);
Benchmark.test(155,Test42Lib.local17.field7);
Benchmark.test(156,Test42Lib.local17.field8);
Benchmark.test(157,Test42Lib.local17.field1);
Benchmark.test(158,Test42Lib.local17.field2);
Benchmark.test(159,Test42Lib.local17.field3);
Benchmark.test(160,Test42Lib.local18.field9);
Benchmark.test(161,Test42Lib.local18.field10);
Benchmark.test(162,Test42Lib.local18.field11);
Benchmark.test(163,Test42Lib.local18.field12);
Benchmark.test(164,Test42Lib.local18.field13);
Benchmark.test(165,Test42Lib.local18.field14);
Benchmark.test(166,Test42Lib.local18.field15);
Benchmark.test(167,Test42Lib.local18.field16);
Benchmark.test(168,Test42Lib.local18.field17);
Benchmark.test(169,Test42Lib.local18.field4);
Benchmark.test(170,Test42Lib.local18.field5);
Benchmark.test(171,Test42Lib.local18.field6);
Benchmark.test(172,Test42Lib.local18.field7);
Benchmark.test(173,Test42Lib.local18.field8);
Benchmark.test(174,Test42Lib.local18.field1);
Benchmark.test(175,Test42Lib.local18.field2);
Benchmark.test(176,Test42Lib.local18.field3);
Benchmark.test(177,Test42Lib.local19.field9);
Benchmark.test(178,Test42Lib.local19.field10);
Benchmark.test(179,Test42Lib.local19.field11);
Benchmark.test(180,Test42Lib.local19.field12);
Benchmark.test(181,Test42Lib.local19.field13);
Benchmark.test(182,Test42Lib.local19.field14);
Benchmark.test(183,Test42Lib.local19.field15);
Benchmark.test(184,Test42Lib.local19.field16);
Benchmark.test(185,Test42Lib.local19.field17);
Benchmark.test(186,Test42Lib.local19.field4);
Benchmark.test(187,Test42Lib.local19.field5);
Benchmark.test(188,Test42Lib.local19.field6);
Benchmark.test(189,Test42Lib.local19.field7);
Benchmark.test(190,Test42Lib.local19.field8);
Benchmark.test(191,Test42Lib.local19.field1);
Benchmark.test(192,Test42Lib.local19.field2);
Benchmark.test(193,Test42Lib.local19.field3);
Benchmark.test(194,Test42Lib.local20.field9);
Benchmark.test(195,Test42Lib.local20.field10);
Benchmark.test(196,Test42Lib.local20.field11);
Benchmark.test(197,Test42Lib.local20.field12);
Benchmark.test(198,Test42Lib.local20.field13);
Benchmark.test(199,Test42Lib.local20.field14);
Benchmark.test(200,Test42Lib.local20.field15);
Benchmark.test(201,Test42Lib.local20.field16);
Benchmark.test(202,Test42Lib.local20.field17);
Benchmark.test(203,Test42Lib.local20.field4);
Benchmark.test(204,Test42Lib.local20.field5);
Benchmark.test(205,Test42Lib.local20.field6);
Benchmark.test(206,Test42Lib.local20.field7);
Benchmark.test(207,Test42Lib.local20.field8);
Benchmark.test(208,Test42Lib.local20.field1);
Benchmark.test(209,Test42Lib.local20.field2);
Benchmark.test(210,Test42Lib.local20.field3);
Benchmark.test(211,Test42Lib.local21.field9);
Benchmark.test(212,Test42Lib.local21.field10);
Benchmark.test(213,Test42Lib.local21.field11);
Benchmark.test(214,Test42Lib.local21.field12);
Benchmark.test(215,Test42Lib.local21.field13);
Benchmark.test(216,Test42Lib.local21.field14);
Benchmark.test(217,Test42Lib.local21.field15);
Benchmark.test(218,Test42Lib.local21.field16);
Benchmark.test(219,Test42Lib.local21.field17);
Benchmark.test(220,Test42Lib.local21.field4);
Benchmark.test(221,Test42Lib.local21.field5);
Benchmark.test(222,Test42Lib.local21.field6);
Benchmark.test(223,Test42Lib.local21.field7);
Benchmark.test(224,Test42Lib.local21.field8);
Benchmark.test(225,Test42Lib.local21.field1);
Benchmark.test(226,Test42Lib.local21.field2);
Benchmark.test(227,Test42Lib.local21.field3);
Benchmark.test(228,Test42Lib.local22.field18);
Benchmark.test(229,Test42Lib.local22.field19);
Benchmark.test(230,Test42Lib.local22.field20);
Benchmark.test(231,Test42Lib.local22.field21);
Benchmark.test(232,Test42Lib.local22.field22);
Benchmark.test(233,Test42Lib.local22.field23);
Benchmark.test(234,Test42Lib.local22.field24);
Benchmark.test(235,Test42Lib.local22.field25);
Benchmark.test(236,Test42Lib.local22.field26);
Benchmark.test(237,Test42Lib.local22.field27);
Benchmark.test(238,Test42Lib.local22.field4);
Benchmark.test(239,Test42Lib.local22.field5);
Benchmark.test(240,Test42Lib.local22.field6);
Benchmark.test(241,Test42Lib.local22.field7);
Benchmark.test(242,Test42Lib.local22.field8);
Benchmark.test(243,Test42Lib.local22.field1);
Benchmark.test(244,Test42Lib.local22.field2);
Benchmark.test(245,Test42Lib.local22.field3);
Benchmark.test(246,Test42Lib.local23.field18);
Benchmark.test(247,Test42Lib.local23.field19);
Benchmark.test(248,Test42Lib.local23.field20);
Benchmark.test(249,Test42Lib.local23.field21);
Benchmark.test(250,Test42Lib.local23.field22);
Benchmark.test(251,Test42Lib.local23.field23);
Benchmark.test(252,Test42Lib.local23.field24);
Benchmark.test(253,Test42Lib.local23.field25);
Benchmark.test(254,Test42Lib.local23.field26);
Benchmark.test(255,Test42Lib.local23.field27);
Benchmark.test(256,Test42Lib.local23.field4);
Benchmark.test(257,Test42Lib.local23.field5);
Benchmark.test(258,Test42Lib.local23.field6);
Benchmark.test(259,Test42Lib.local23.field7);
Benchmark.test(260,Test42Lib.local23.field8);
Benchmark.test(261,Test42Lib.local23.field1);
Benchmark.test(262,Test42Lib.local23.field2);
Benchmark.test(263,Test42Lib.local23.field3);
Benchmark.test(264,Test42Lib.local24.field18);
Benchmark.test(265,Test42Lib.local24.field19);
Benchmark.test(266,Test42Lib.local24.field20);
Benchmark.test(267,Test42Lib.local24.field21);
Benchmark.test(268,Test42Lib.local24.field22);
Benchmark.test(269,Test42Lib.local24.field23);
Benchmark.test(270,Test42Lib.local24.field24);
Benchmark.test(271,Test42Lib.local24.field25);
Benchmark.test(272,Test42Lib.local24.field26);
Benchmark.test(273,Test42Lib.local24.field27);
Benchmark.test(274,Test42Lib.local24.field4);
Benchmark.test(275,Test42Lib.local24.field5);
Benchmark.test(276,Test42Lib.local24.field6);
Benchmark.test(277,Test42Lib.local24.field7);
Benchmark.test(278,Test42Lib.local24.field8);
Benchmark.test(279,Test42Lib.local24.field1);
Benchmark.test(280,Test42Lib.local24.field2);
Benchmark.test(281,Test42Lib.local24.field3);
Benchmark.test(282,Test42Lib.local25.field18);
Benchmark.test(283,Test42Lib.local25.field19);
Benchmark.test(284,Test42Lib.local25.field20);
Benchmark.test(285,Test42Lib.local25.field21);
Benchmark.test(286,Test42Lib.local25.field22);
Benchmark.test(287,Test42Lib.local25.field23);
Benchmark.test(288,Test42Lib.local25.field24);
Benchmark.test(289,Test42Lib.local25.field25);
Benchmark.test(290,Test42Lib.local25.field26);
Benchmark.test(291,Test42Lib.local25.field27);
Benchmark.test(292,Test42Lib.local25.field4);
Benchmark.test(293,Test42Lib.local25.field5);
Benchmark.test(294,Test42Lib.local25.field6);
Benchmark.test(295,Test42Lib.local25.field7);
Benchmark.test(296,Test42Lib.local25.field8);
Benchmark.test(297,Test42Lib.local25.field1);
Benchmark.test(298,Test42Lib.local25.field2);
Benchmark.test(299,Test42Lib.local25.field3);
Benchmark.test(300,Test42Lib.local26.field18);
Benchmark.test(301,Test42Lib.local26.field19);
Benchmark.test(302,Test42Lib.local26.field20);
Benchmark.test(303,Test42Lib.local26.field21);
Benchmark.test(304,Test42Lib.local26.field22);
Benchmark.test(305,Test42Lib.local26.field23);
Benchmark.test(306,Test42Lib.local26.field24);
Benchmark.test(307,Test42Lib.local26.field25);
Benchmark.test(308,Test42Lib.local26.field26);
Benchmark.test(309,Test42Lib.local26.field27);
Benchmark.test(310,Test42Lib.local26.field4);
Benchmark.test(311,Test42Lib.local26.field5);
Benchmark.test(312,Test42Lib.local26.field6);
Benchmark.test(313,Test42Lib.local26.field7);
Benchmark.test(314,Test42Lib.local26.field8);
Benchmark.test(315,Test42Lib.local26.field1);
Benchmark.test(316,Test42Lib.local26.field2);
Benchmark.test(317,Test42Lib.local26.field3);
Benchmark.test(318,Test42Lib.local27.field18);
Benchmark.test(319,Test42Lib.local27.field19);
Benchmark.test(320,Test42Lib.local27.field20);
Benchmark.test(321,Test42Lib.local27.field21);
Benchmark.test(322,Test42Lib.local27.field22);
Benchmark.test(323,Test42Lib.local27.field23);
Benchmark.test(324,Test42Lib.local27.field24);
Benchmark.test(325,Test42Lib.local27.field25);
Benchmark.test(326,Test42Lib.local27.field26);
Benchmark.test(327,Test42Lib.local27.field27);
Benchmark.test(328,Test42Lib.local27.field4);
Benchmark.test(329,Test42Lib.local27.field5);
Benchmark.test(330,Test42Lib.local27.field6);
Benchmark.test(331,Test42Lib.local27.field7);
Benchmark.test(332,Test42Lib.local27.field8);
Benchmark.test(333,Test42Lib.local27.field1);
Benchmark.test(334,Test42Lib.local27.field2);
Benchmark.test(335,Test42Lib.local27.field3);
Benchmark.test(336,Test42Lib.local28.field18);
Benchmark.test(337,Test42Lib.local28.field19);
Benchmark.test(338,Test42Lib.local28.field20);
Benchmark.test(339,Test42Lib.local28.field21);
Benchmark.test(340,Test42Lib.local28.field22);
Benchmark.test(341,Test42Lib.local28.field23);
Benchmark.test(342,Test42Lib.local28.field24);
Benchmark.test(343,Test42Lib.local28.field25);
Benchmark.test(344,Test42Lib.local28.field26);
Benchmark.test(345,Test42Lib.local28.field27);
Benchmark.test(346,Test42Lib.local28.field4);
Benchmark.test(347,Test42Lib.local28.field5);
Benchmark.test(348,Test42Lib.local28.field6);
Benchmark.test(349,Test42Lib.local28.field7);
Benchmark.test(350,Test42Lib.local28.field8);
Benchmark.test(351,Test42Lib.local28.field1);
Benchmark.test(352,Test42Lib.local28.field2);
Benchmark.test(353,Test42Lib.local28.field3);
Benchmark.test(354,Test42Lib.local29.field28);
Benchmark.test(355,Test42Lib.local29.field29);
Benchmark.test(356,Test42Lib.local29.field30);
Benchmark.test(357,Test42Lib.local29.field31);
Benchmark.test(358,Test42Lib.local29.field32);
Benchmark.test(359,Test42Lib.local29.field33);
Benchmark.test(360,Test42Lib.local29.field34);
Benchmark.test(361,Test42Lib.local29.field35);
Benchmark.test(362,Test42Lib.local29.field36);
Benchmark.test(363,Test42Lib.local29.field9);
Benchmark.test(364,Test42Lib.local29.field10);
Benchmark.test(365,Test42Lib.local29.field11);
Benchmark.test(366,Test42Lib.local29.field12);
Benchmark.test(367,Test42Lib.local29.field13);
Benchmark.test(368,Test42Lib.local29.field14);
Benchmark.test(369,Test42Lib.local29.field15);
Benchmark.test(370,Test42Lib.local29.field16);
Benchmark.test(371,Test42Lib.local29.field17);
Benchmark.test(372,Test42Lib.local29.field4);
Benchmark.test(373,Test42Lib.local29.field5);
Benchmark.test(374,Test42Lib.local29.field6);
Benchmark.test(375,Test42Lib.local29.field7);
Benchmark.test(376,Test42Lib.local29.field8);
Benchmark.test(377,Test42Lib.local29.field1);
Benchmark.test(378,Test42Lib.local29.field2);
Benchmark.test(379,Test42Lib.local29.field3);
Benchmark.test(380,Test42Lib.local30.field28);
Benchmark.test(381,Test42Lib.local30.field29);
Benchmark.test(382,Test42Lib.local30.field30);
Benchmark.test(383,Test42Lib.local30.field31);
Benchmark.test(384,Test42Lib.local30.field32);
Benchmark.test(385,Test42Lib.local30.field33);
Benchmark.test(386,Test42Lib.local30.field34);
Benchmark.test(387,Test42Lib.local30.field35);
Benchmark.test(388,Test42Lib.local30.field36);
Benchmark.test(389,Test42Lib.local30.field9);
Benchmark.test(390,Test42Lib.local30.field10);
Benchmark.test(391,Test42Lib.local30.field11);
Benchmark.test(392,Test42Lib.local30.field12);
Benchmark.test(393,Test42Lib.local30.field13);
Benchmark.test(394,Test42Lib.local30.field14);
Benchmark.test(395,Test42Lib.local30.field15);
Benchmark.test(396,Test42Lib.local30.field16);
Benchmark.test(397,Test42Lib.local30.field17);
Benchmark.test(398,Test42Lib.local30.field4);
Benchmark.test(399,Test42Lib.local30.field5);
Benchmark.test(400,Test42Lib.local30.field6);
Benchmark.test(401,Test42Lib.local30.field7);
Benchmark.test(402,Test42Lib.local30.field8);
Benchmark.test(403,Test42Lib.local30.field1);
Benchmark.test(404,Test42Lib.local30.field2);
Benchmark.test(405,Test42Lib.local30.field3);
Benchmark.print();
}
}
