package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test32Lib{
public static Test32Class1 local1;
public static Test32Class1 local2;
public static Test32Class1 local3;
public static Test32Class1 local4;
public static Test32Class1 local5;
public static Test32Class1 local6;
public static Test32Class1 local7;
public static Test32Class1 local8;
public static Test32Class1 local9;
public static Test32Class2 local10;
public static Test32Class3 local11;
public static Test32Class3 local12;
public static Test32Class3 local13;
public static Test32Class3 local14;
public static Test32Class3 local15;
public static Test32Class3 local16;
public static Test32Class3 local17;
public static Test32Class3 local18;
public static Test32Class3 local19;
public static Test32Class4 local20;
public static Test32Class4 local21;
public static Test32Class4 local22;
public static Test32Class4 local23;
public static Test32Class4 local24;
public static Test32Class4 local25;
public static Test32Class5 local26;
public static Test32Class5 local27;
public static Test32Class5 local28;
public static Test32Class5 local29;
public static Test32Class5 local30;
public static Test32Class5 local31;
public static Test32Class5 local32;
public static Test32Class5 local33;
public static Test32Class5 local34;
}
class Test32Class1 extends BasicClass {
public Test32Class3 field1;
public static Test32Class4 field2;
public Test32Class1 field3;
public void method1(Test32Class5 arg0, Test32Class3 arg1, int depth) {
if (depth == 0) return;
arg0=arg0;
}
public static Test32Class1 method2(Test32Class1 arg0, int depth) {
if (depth == 0) return Test32Lib.local31;
if (depth==1) {
if (depth<4) {
field2.method16(field2.field2,depth-1);
}
}
return field2.field3;
}
public static Test32Class5 method3(Test32Class3 arg0, int depth) {
if (depth == 0) return Test32Lib.local28;
return arg0.field14;
}
public static void method4(Test32Class4 arg0, Test32Class5 arg1, int depth) {
if (depth == 0) return;
for (int local35 = 0; local35<=2; local35 += 1) {
if (depth>1) {
arg1.field2=field2;
}else {
if (depth>=3) {
for (int local36 = 0; local36<=3; local36 += 1) {
field2.field21=arg1.field11;
}
}else {
arg0.field22=arg0.field14;
}
}
}
arg1.field4=arg1.field5;
}
public static void method5(Test32Class2 arg0, Test32Class2 arg1, int depth) {
if (depth == 0) return;
if (depth>1) {
for (int local37 = 0; local37<=2; local37 += 1) {
arg0.field9=arg0.field10;
}
}else {
if (depth>=4) {
arg1.field5=field2.field20;
}else {
if (depth>2) {
field2.field17.method26(field2.field19,depth-1);
}
}
}
}
public Test32Class4 method6(Test32Class2 arg0, Test32Class1 arg1, int depth) {
if (depth == 0) return Test32Lib.local20;
if (depth<=2) {
if (depth>4) {
arg0.field6.method11(arg0.field7,arg0,depth-1);
}
}else {
for (int local38 = 0; local38<=0; local38 += 1) {
arg0.field2.method17(arg0.field10,depth-1);
}
}
arg1.field2.method12(depth-1);
return arg0.field2;
}
public static Test32Class5 method7(Test32Class2 arg0, int depth) {
if (depth == 0) return Test32Lib.local33;
arg0.field3=field2.field14;
arg0.field11.method4(arg0.field2,field2.field22,depth-1);
return field2.field22;
}
}
class Test32Class2 extends Test32Class1 {
public static Test32Class1 field4;
public static Test32Class2 field5;
public static Test32Class4 field6;
public Test32Class4 field7;
public Test32Class2 field8;
public static Test32Class2 field9;
public Test32Class5 field10;
public static Test32Class2 field11;
public static Test32Class2 field12;
public static Test32Class5 method8(Test32Class4 arg0, Test32Class5 arg1, int depth) {
if (depth == 0) return Test32Lib.local26;
if (depth<=3) {
for (int local39 = 0; local39<=0; local39 += 1) {
for (int local40 = 0; local40<=0; local40 += 1) {
if (depth>1) {
if (depth<2) {
}else {
}
}
}
}
}else {
field6.field1=field5.field10.method22(field6.field1,depth-1);
}
return arg1;
}
public Test32Class5 method9(Test32Class3 arg0, Test32Class1 arg1, int depth) {
if (depth == 0) return Test32Lib.local33;
return arg0.field14;
}
public Test32Class4 method10(Test32Class5 arg0, Test32Class3 arg1, int depth) {
if (depth == 0) return Test32Lib.local24;
for (int local41 = 0; local41<=0; local41 += 1) {
this.field6.method13(depth-1);
}
return arg0.field7;
}
}
class Test32Class3 extends Test32Class1 {
public Test32Class3 field13;
public Test32Class5 field14;
public static Test32Class3 method11(Test32Class4 arg0, Test32Class2 arg1, int depth) {
if (depth == 0) return Test32Lib.local11;
arg0.field19=field2.field19;
return field2;
}
}
class Test32Class4 extends Test32Class3 {
public static Test32Class5 field15;
public static Test32Class4 field16;
public static Test32Class5 field17;
public Test32Class2 field18;
public static Test32Class3 field19;
public Test32Class2 field20;
public static Test32Class2 field21;
public static Test32Class5 field22;
public static void method12(int depth) {
if (depth == 0) return;
}
public Test32Class5 method13(int depth) {
if (depth == 0) return Test32Lib.local26;
return this.field17;
}
public Test32Class3 method14(Test32Class2 arg0, int depth) {
if (depth == 0) return Test32Lib.local13;
this.field15.method9(this.field13,this.field14,depth-1);
return this.field19;
}
public static void method15(int depth) {
if (depth == 0) return;
field16.field13.method11(field22.field24,field15.field9,depth-1);
}
public void method16(Test32Class3 arg0, int depth) {
if (depth == 0) return;
}
public void method17(Test32Class5 arg0, int depth) {
if (depth == 0) return;
}
public Test32Class5 method18(int depth) {
if (depth == 0) return Test32Lib.local28;
this.field2=this.field21.method10(this.field15,this,depth-1);
return this.field14;
}
}
class Test32Class5 extends Test32Class2 {
public Test32Class1 field23;
public Test32Class4 field24;
public static Test32Class4 field25;
public static void method19(int depth) {
if (depth == 0) return;
for (int local42 = 0; local42<=0; local42 += 1) {
field25.field22.method6(field5.field8,field12.field7,depth-1);
}
}
public static void method20(Test32Class1 arg0, Test32Class2 arg1, int depth) {
if (depth == 0) return;
field4=arg1.field6.method14(field6.field21,depth-1);
field4.field2.method12(depth-1);
}
public void method21(int depth) {
if (depth == 0) return;
this.field3=this.field10.method10(this.field10,this.field6,depth-1);
if (depth==2) {
if (depth<=2) {
this.method23(this.field7,depth-1);
}else {
this.field8=this.field5;
}
}else {
this.field25.method12(depth-1);
}
}
public static Test32Class3 method22(Test32Class1 arg0, int depth) {
if (depth == 0) return Test32Lib.local25;
return field9.field1;
}
public Test32Class5 method23(Test32Class3 arg0, int depth) {
if (depth == 0) return Test32Lib.local29;
return this;
}
public Test32Class1 method24(Test32Class3 arg0, Test32Class1 arg1, int depth) {
if (depth == 0) return Test32Lib.local26;
if (depth<2) {
if (depth<=4) {
this.field5=this.field12;
}else {
if (depth<=3) {
if (depth>=2) {
if (depth==4) {
}else {
}
}
}
}
}else {
if (depth<=3) {
for (int local43 = 0; local43<=2; local43 += 1) {
arg1.field2.method18(depth-1);
}
}
}
return arg1.field3;
}
public Test32Class1 method25(Test32Class2 arg0, Test32Class2 arg1, int depth) {
if (depth == 0) return Test32Lib.local16;
for (int local44 = 0; local44<=0; local44 += 1) {
if (depth<=2) {
this.field24.method13(depth-1);
}else {
if (depth>1) {
this.field10.method20(arg1.field1,arg0,depth-1);
}else {
for (int local45 = 0; local45<=3; local45 += 1) {
this.field2=arg0.field2;
}
}
}
}
arg1.field4=this.field25.method11(this.field7,this.field10,depth-1);
return arg1.field7;
}
public static void method26(Test32Class1 arg0, int depth) {
if (depth == 0) return;
}
public void method27(Test32Class1 arg0, Test32Class5 arg1, int depth) {
if (depth == 0) return;
for (int local46 = 0; local46<=0; local46 += 1) {
if (depth>2) {
arg1.field5=arg1.field8;
}
}
arg1.field11=this.field9;
}
public void method28(int depth) {
if (depth == 0) return;
if (depth==1) {
for (int local47 = 0; local47<=3; local47 += 1) {
for (int local48 = 0; local48<=3; local48 += 1) {
for (int local49 = 0; local49<=1; local49 += 1) {
for (int local50 = 0; local50<=0; local50 += 1) {
}
}
}
}
}else {
for (int local51 = 0; local51<=2; local51 += 1) {
if (depth==1) {
if (depth==4) {
if (depth<2) {
}else {
}
}
}
}
}
for (int local52 = 0; local52<=3; local52 += 1) {
this.field23=this.field6.method13(depth-1);
}
}
}
public class Test32{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test32Lib.local1 = new Test32Class1();
Benchmark.alloc(2);
Test32Lib.local2 = new Test32Class1();
Benchmark.alloc(3);
Test32Lib.local3 = new Test32Class1();
Benchmark.alloc(4);
Test32Lib.local4 = new Test32Class1();
Benchmark.alloc(5);
Test32Lib.local5 = new Test32Class1();
Benchmark.alloc(6);
Test32Lib.local6 = new Test32Class1();
Benchmark.alloc(7);
Test32Lib.local7 = new Test32Class1();
Benchmark.alloc(8);
Test32Lib.local8 = new Test32Class1();
Benchmark.alloc(9);
Test32Lib.local9 = new Test32Class1();
Benchmark.alloc(10);
Test32Lib.local10 = new Test32Class2();
Benchmark.alloc(11);
Test32Lib.local11 = new Test32Class3();
Benchmark.alloc(12);
Test32Lib.local12 = new Test32Class3();
Benchmark.alloc(13);
Test32Lib.local13 = new Test32Class3();
Benchmark.alloc(14);
Test32Lib.local14 = new Test32Class3();
Benchmark.alloc(15);
Test32Lib.local15 = new Test32Class3();
Benchmark.alloc(16);
Test32Lib.local16 = new Test32Class3();
Benchmark.alloc(17);
Test32Lib.local17 = new Test32Class3();
Benchmark.alloc(18);
Test32Lib.local18 = new Test32Class3();
Benchmark.alloc(19);
Test32Lib.local19 = new Test32Class3();
Benchmark.alloc(20);
Test32Lib.local20 = new Test32Class4();
Benchmark.alloc(21);
Test32Lib.local21 = new Test32Class4();
Benchmark.alloc(22);
Test32Lib.local22 = new Test32Class4();
Benchmark.alloc(23);
Test32Lib.local23 = new Test32Class4();
Benchmark.alloc(24);
Test32Lib.local24 = new Test32Class4();
Benchmark.alloc(25);
Test32Lib.local25 = new Test32Class4();
Benchmark.alloc(26);
Test32Lib.local26 = new Test32Class5();
Benchmark.alloc(27);
Test32Lib.local27 = new Test32Class5();
Benchmark.alloc(28);
Test32Lib.local28 = new Test32Class5();
Benchmark.alloc(29);
Test32Lib.local29 = new Test32Class5();
Benchmark.alloc(30);
Test32Lib.local30 = new Test32Class5();
Benchmark.alloc(31);
Test32Lib.local31 = new Test32Class5();
Benchmark.alloc(32);
Test32Lib.local32 = new Test32Class5();
Benchmark.alloc(33);
Test32Lib.local33 = new Test32Class5();
Benchmark.alloc(34);
Test32Lib.local34 = new Test32Class5();
Test32Lib.local1.field1 = Test32Lib.local20;
Test32Lib.local1.field2 = Test32Lib.local23;
Test32Lib.local1.field3 = Test32Lib.local11;
Test32Lib.local2.field1 = Test32Lib.local17;
Test32Lib.local2.field2 = Test32Lib.local25;
Test32Lib.local2.field3 = Test32Lib.local11;
Test32Lib.local3.field1 = Test32Lib.local18;
Test32Lib.local3.field2 = Test32Lib.local20;
Test32Lib.local3.field3 = Test32Lib.local4;
Test32Lib.local4.field1 = Test32Lib.local17;
Test32Lib.local4.field2 = Test32Lib.local25;
Test32Lib.local4.field3 = Test32Lib.local22;
Test32Lib.local5.field1 = Test32Lib.local13;
Test32Lib.local5.field2 = Test32Lib.local23;
Test32Lib.local5.field3 = Test32Lib.local24;
Test32Lib.local6.field1 = Test32Lib.local17;
Test32Lib.local6.field2 = Test32Lib.local21;
Test32Lib.local6.field3 = Test32Lib.local21;
Test32Lib.local7.field1 = Test32Lib.local19;
Test32Lib.local7.field2 = Test32Lib.local23;
Test32Lib.local7.field3 = Test32Lib.local2;
Test32Lib.local8.field1 = Test32Lib.local21;
Test32Lib.local8.field2 = Test32Lib.local25;
Test32Lib.local8.field3 = Test32Lib.local28;
Test32Lib.local9.field1 = Test32Lib.local16;
Test32Lib.local9.field2 = Test32Lib.local25;
Test32Lib.local9.field3 = Test32Lib.local3;
Test32Lib.local10.field4 = Test32Lib.local9;
Test32Lib.local10.field5 = Test32Lib.local29;
Test32Lib.local10.field6 = Test32Lib.local25;
Test32Lib.local10.field7 = Test32Lib.local22;
Test32Lib.local10.field8 = Test32Lib.local33;
Test32Lib.local10.field9 = Test32Lib.local34;
Test32Lib.local10.field10 = Test32Lib.local30;
Test32Lib.local10.field11 = Test32Lib.local26;
Test32Lib.local10.field12 = Test32Lib.local26;
Test32Lib.local10.field1 = Test32Lib.local20;
Test32Lib.local10.field2 = Test32Lib.local23;
Test32Lib.local10.field3 = Test32Lib.local18;
Test32Lib.local11.field13 = Test32Lib.local24;
Test32Lib.local11.field14 = Test32Lib.local29;
Test32Lib.local11.field1 = Test32Lib.local15;
Test32Lib.local11.field2 = Test32Lib.local22;
Test32Lib.local11.field3 = Test32Lib.local21;
Test32Lib.local12.field13 = Test32Lib.local14;
Test32Lib.local12.field14 = Test32Lib.local27;
Test32Lib.local12.field1 = Test32Lib.local21;
Test32Lib.local12.field2 = Test32Lib.local24;
Test32Lib.local12.field3 = Test32Lib.local1;
Test32Lib.local13.field13 = Test32Lib.local17;
Test32Lib.local13.field14 = Test32Lib.local34;
Test32Lib.local13.field1 = Test32Lib.local19;
Test32Lib.local13.field2 = Test32Lib.local21;
Test32Lib.local13.field3 = Test32Lib.local31;
Test32Lib.local14.field13 = Test32Lib.local22;
Test32Lib.local14.field14 = Test32Lib.local26;
Test32Lib.local14.field1 = Test32Lib.local14;
Test32Lib.local14.field2 = Test32Lib.local25;
Test32Lib.local14.field3 = Test32Lib.local12;
Test32Lib.local15.field13 = Test32Lib.local17;
Test32Lib.local15.field14 = Test32Lib.local29;
Test32Lib.local15.field1 = Test32Lib.local17;
Test32Lib.local15.field2 = Test32Lib.local25;
Test32Lib.local15.field3 = Test32Lib.local26;
Test32Lib.local16.field13 = Test32Lib.local16;
Test32Lib.local16.field14 = Test32Lib.local34;
Test32Lib.local16.field1 = Test32Lib.local20;
Test32Lib.local16.field2 = Test32Lib.local22;
Test32Lib.local16.field3 = Test32Lib.local25;
Test32Lib.local17.field13 = Test32Lib.local16;
Test32Lib.local17.field14 = Test32Lib.local34;
Test32Lib.local17.field1 = Test32Lib.local12;
Test32Lib.local17.field2 = Test32Lib.local20;
Test32Lib.local17.field3 = Test32Lib.local2;
Test32Lib.local18.field13 = Test32Lib.local18;
Test32Lib.local18.field14 = Test32Lib.local32;
Test32Lib.local18.field1 = Test32Lib.local18;
Test32Lib.local18.field2 = Test32Lib.local20;
Test32Lib.local18.field3 = Test32Lib.local34;
Test32Lib.local19.field13 = Test32Lib.local23;
Test32Lib.local19.field14 = Test32Lib.local27;
Test32Lib.local19.field1 = Test32Lib.local19;
Test32Lib.local19.field2 = Test32Lib.local24;
Test32Lib.local19.field3 = Test32Lib.local30;
Test32Lib.local20.field15 = Test32Lib.local29;
Test32Lib.local20.field16 = Test32Lib.local24;
Test32Lib.local20.field17 = Test32Lib.local27;
Test32Lib.local20.field18 = Test32Lib.local29;
Test32Lib.local20.field19 = Test32Lib.local21;
Test32Lib.local20.field20 = Test32Lib.local10;
Test32Lib.local20.field21 = Test32Lib.local34;
Test32Lib.local20.field22 = Test32Lib.local27;
Test32Lib.local20.field13 = Test32Lib.local22;
Test32Lib.local20.field14 = Test32Lib.local30;
Test32Lib.local20.field1 = Test32Lib.local22;
Test32Lib.local20.field2 = Test32Lib.local25;
Test32Lib.local20.field3 = Test32Lib.local12;
Test32Lib.local21.field15 = Test32Lib.local34;
Test32Lib.local21.field16 = Test32Lib.local21;
Test32Lib.local21.field17 = Test32Lib.local28;
Test32Lib.local21.field18 = Test32Lib.local29;
Test32Lib.local21.field19 = Test32Lib.local14;
Test32Lib.local21.field20 = Test32Lib.local32;
Test32Lib.local21.field21 = Test32Lib.local31;
Test32Lib.local21.field22 = Test32Lib.local34;
Test32Lib.local21.field13 = Test32Lib.local15;
Test32Lib.local21.field14 = Test32Lib.local32;
Test32Lib.local21.field1 = Test32Lib.local23;
Test32Lib.local21.field2 = Test32Lib.local24;
Test32Lib.local21.field3 = Test32Lib.local34;
Test32Lib.local22.field15 = Test32Lib.local31;
Test32Lib.local22.field16 = Test32Lib.local21;
Test32Lib.local22.field17 = Test32Lib.local31;
Test32Lib.local22.field18 = Test32Lib.local27;
Test32Lib.local22.field19 = Test32Lib.local18;
Test32Lib.local22.field20 = Test32Lib.local10;
Test32Lib.local22.field21 = Test32Lib.local31;
Test32Lib.local22.field22 = Test32Lib.local33;
Test32Lib.local22.field13 = Test32Lib.local17;
Test32Lib.local22.field14 = Test32Lib.local26;
Test32Lib.local22.field1 = Test32Lib.local13;
Test32Lib.local22.field2 = Test32Lib.local21;
Test32Lib.local22.field3 = Test32Lib.local33;
Test32Lib.local23.field15 = Test32Lib.local28;
Test32Lib.local23.field16 = Test32Lib.local24;
Test32Lib.local23.field17 = Test32Lib.local34;
Test32Lib.local23.field18 = Test32Lib.local29;
Test32Lib.local23.field19 = Test32Lib.local17;
Test32Lib.local23.field20 = Test32Lib.local31;
Test32Lib.local23.field21 = Test32Lib.local10;
Test32Lib.local23.field22 = Test32Lib.local29;
Test32Lib.local23.field13 = Test32Lib.local21;
Test32Lib.local23.field14 = Test32Lib.local26;
Test32Lib.local23.field1 = Test32Lib.local22;
Test32Lib.local23.field2 = Test32Lib.local25;
Test32Lib.local23.field3 = Test32Lib.local8;
Test32Lib.local24.field15 = Test32Lib.local32;
Test32Lib.local24.field16 = Test32Lib.local24;
Test32Lib.local24.field17 = Test32Lib.local34;
Test32Lib.local24.field18 = Test32Lib.local31;
Test32Lib.local24.field19 = Test32Lib.local20;
Test32Lib.local24.field20 = Test32Lib.local34;
Test32Lib.local24.field21 = Test32Lib.local33;
Test32Lib.local24.field22 = Test32Lib.local31;
Test32Lib.local24.field13 = Test32Lib.local24;
Test32Lib.local24.field14 = Test32Lib.local29;
Test32Lib.local24.field1 = Test32Lib.local25;
Test32Lib.local24.field2 = Test32Lib.local21;
Test32Lib.local24.field3 = Test32Lib.local1;
Test32Lib.local25.field15 = Test32Lib.local27;
Test32Lib.local25.field16 = Test32Lib.local25;
Test32Lib.local25.field17 = Test32Lib.local27;
Test32Lib.local25.field18 = Test32Lib.local26;
Test32Lib.local25.field19 = Test32Lib.local16;
Test32Lib.local25.field20 = Test32Lib.local26;
Test32Lib.local25.field21 = Test32Lib.local31;
Test32Lib.local25.field22 = Test32Lib.local33;
Test32Lib.local25.field13 = Test32Lib.local11;
Test32Lib.local25.field14 = Test32Lib.local29;
Test32Lib.local25.field1 = Test32Lib.local21;
Test32Lib.local25.field2 = Test32Lib.local24;
Test32Lib.local25.field3 = Test32Lib.local17;
Test32Lib.local26.field23 = Test32Lib.local11;
Test32Lib.local26.field24 = Test32Lib.local24;
Test32Lib.local26.field25 = Test32Lib.local25;
Test32Lib.local26.field4 = Test32Lib.local27;
Test32Lib.local26.field5 = Test32Lib.local30;
Test32Lib.local26.field6 = Test32Lib.local20;
Test32Lib.local26.field7 = Test32Lib.local22;
Test32Lib.local26.field8 = Test32Lib.local10;
Test32Lib.local26.field9 = Test32Lib.local10;
Test32Lib.local26.field10 = Test32Lib.local28;
Test32Lib.local26.field11 = Test32Lib.local26;
Test32Lib.local26.field12 = Test32Lib.local34;
Test32Lib.local26.field1 = Test32Lib.local16;
Test32Lib.local26.field2 = Test32Lib.local20;
Test32Lib.local26.field3 = Test32Lib.local22;
Test32Lib.local27.field23 = Test32Lib.local16;
Test32Lib.local27.field24 = Test32Lib.local23;
Test32Lib.local27.field25 = Test32Lib.local25;
Test32Lib.local27.field4 = Test32Lib.local27;
Test32Lib.local27.field5 = Test32Lib.local10;
Test32Lib.local27.field6 = Test32Lib.local22;
Test32Lib.local27.field7 = Test32Lib.local23;
Test32Lib.local27.field8 = Test32Lib.local34;
Test32Lib.local27.field9 = Test32Lib.local31;
Test32Lib.local27.field10 = Test32Lib.local34;
Test32Lib.local27.field11 = Test32Lib.local31;
Test32Lib.local27.field12 = Test32Lib.local33;
Test32Lib.local27.field1 = Test32Lib.local21;
Test32Lib.local27.field2 = Test32Lib.local20;
Test32Lib.local27.field3 = Test32Lib.local32;
Test32Lib.local28.field23 = Test32Lib.local29;
Test32Lib.local28.field24 = Test32Lib.local21;
Test32Lib.local28.field25 = Test32Lib.local21;
Test32Lib.local28.field4 = Test32Lib.local19;
Test32Lib.local28.field5 = Test32Lib.local26;
Test32Lib.local28.field6 = Test32Lib.local21;
Test32Lib.local28.field7 = Test32Lib.local23;
Test32Lib.local28.field8 = Test32Lib.local33;
Test32Lib.local28.field9 = Test32Lib.local29;
Test32Lib.local28.field10 = Test32Lib.local26;
Test32Lib.local28.field11 = Test32Lib.local34;
Test32Lib.local28.field12 = Test32Lib.local34;
Test32Lib.local28.field1 = Test32Lib.local22;
Test32Lib.local28.field2 = Test32Lib.local21;
Test32Lib.local28.field3 = Test32Lib.local23;
Test32Lib.local29.field23 = Test32Lib.local28;
Test32Lib.local29.field24 = Test32Lib.local23;
Test32Lib.local29.field25 = Test32Lib.local22;
Test32Lib.local29.field4 = Test32Lib.local14;
Test32Lib.local29.field5 = Test32Lib.local29;
Test32Lib.local29.field6 = Test32Lib.local21;
Test32Lib.local29.field7 = Test32Lib.local24;
Test32Lib.local29.field8 = Test32Lib.local30;
Test32Lib.local29.field9 = Test32Lib.local33;
Test32Lib.local29.field10 = Test32Lib.local27;
Test32Lib.local29.field11 = Test32Lib.local26;
Test32Lib.local29.field12 = Test32Lib.local27;
Test32Lib.local29.field1 = Test32Lib.local15;
Test32Lib.local29.field2 = Test32Lib.local21;
Test32Lib.local29.field3 = Test32Lib.local19;
Test32Lib.local30.field23 = Test32Lib.local6;
Test32Lib.local30.field24 = Test32Lib.local22;
Test32Lib.local30.field25 = Test32Lib.local20;
Test32Lib.local30.field4 = Test32Lib.local27;
Test32Lib.local30.field5 = Test32Lib.local32;
Test32Lib.local30.field6 = Test32Lib.local25;
Test32Lib.local30.field7 = Test32Lib.local21;
Test32Lib.local30.field8 = Test32Lib.local29;
Test32Lib.local30.field9 = Test32Lib.local27;
Test32Lib.local30.field10 = Test32Lib.local30;
Test32Lib.local30.field11 = Test32Lib.local34;
Test32Lib.local30.field12 = Test32Lib.local30;
Test32Lib.local30.field1 = Test32Lib.local11;
Test32Lib.local30.field2 = Test32Lib.local20;
Test32Lib.local30.field3 = Test32Lib.local28;
Test32Lib.local31.field23 = Test32Lib.local4;
Test32Lib.local31.field24 = Test32Lib.local24;
Test32Lib.local31.field25 = Test32Lib.local22;
Test32Lib.local31.field4 = Test32Lib.local1;
Test32Lib.local31.field5 = Test32Lib.local27;
Test32Lib.local31.field6 = Test32Lib.local20;
Test32Lib.local31.field7 = Test32Lib.local20;
Test32Lib.local31.field8 = Test32Lib.local28;
Test32Lib.local31.field9 = Test32Lib.local26;
Test32Lib.local31.field10 = Test32Lib.local32;
Test32Lib.local31.field11 = Test32Lib.local26;
Test32Lib.local31.field12 = Test32Lib.local34;
Test32Lib.local31.field1 = Test32Lib.local25;
Test32Lib.local31.field2 = Test32Lib.local21;
Test32Lib.local31.field3 = Test32Lib.local7;
Test32Lib.local32.field23 = Test32Lib.local22;
Test32Lib.local32.field24 = Test32Lib.local21;
Test32Lib.local32.field25 = Test32Lib.local25;
Test32Lib.local32.field4 = Test32Lib.local24;
Test32Lib.local32.field5 = Test32Lib.local33;
Test32Lib.local32.field6 = Test32Lib.local23;
Test32Lib.local32.field7 = Test32Lib.local22;
Test32Lib.local32.field8 = Test32Lib.local29;
Test32Lib.local32.field9 = Test32Lib.local30;
Test32Lib.local32.field10 = Test32Lib.local28;
Test32Lib.local32.field11 = Test32Lib.local30;
Test32Lib.local32.field12 = Test32Lib.local26;
Test32Lib.local32.field1 = Test32Lib.local19;
Test32Lib.local32.field2 = Test32Lib.local25;
Test32Lib.local32.field3 = Test32Lib.local11;
Test32Lib.local33.field23 = Test32Lib.local8;
Test32Lib.local33.field24 = Test32Lib.local22;
Test32Lib.local33.field25 = Test32Lib.local25;
Test32Lib.local33.field4 = Test32Lib.local2;
Test32Lib.local33.field5 = Test32Lib.local30;
Test32Lib.local33.field6 = Test32Lib.local25;
Test32Lib.local33.field7 = Test32Lib.local24;
Test32Lib.local33.field8 = Test32Lib.local27;
Test32Lib.local33.field9 = Test32Lib.local34;
Test32Lib.local33.field10 = Test32Lib.local32;
Test32Lib.local33.field11 = Test32Lib.local27;
Test32Lib.local33.field12 = Test32Lib.local26;
Test32Lib.local33.field1 = Test32Lib.local14;
Test32Lib.local33.field2 = Test32Lib.local25;
Test32Lib.local33.field3 = Test32Lib.local23;
Test32Lib.local34.field23 = Test32Lib.local33;
Test32Lib.local34.field24 = Test32Lib.local24;
Test32Lib.local34.field25 = Test32Lib.local22;
Test32Lib.local34.field4 = Test32Lib.local29;
Test32Lib.local34.field5 = Test32Lib.local10;
Test32Lib.local34.field6 = Test32Lib.local22;
Test32Lib.local34.field7 = Test32Lib.local20;
Test32Lib.local34.field8 = Test32Lib.local30;
Test32Lib.local34.field9 = Test32Lib.local29;
Test32Lib.local34.field10 = Test32Lib.local29;
Test32Lib.local34.field11 = Test32Lib.local33;
Test32Lib.local34.field12 = Test32Lib.local34;
Test32Lib.local34.field1 = Test32Lib.local23;
Test32Lib.local34.field2 = Test32Lib.local20;
Test32Lib.local34.field3 = Test32Lib.local9;
if (inputValue>1) {
if (inputValue<=3) {
Test32Lib.local30.field6.method16(Test32Lib.local33.field24,3);
}else {
if (inputValue<=2) {
for (int local53 = 0; local53<=2; local53 += 1) {
if (inputValue>=1) {
}else {
}
}
}else {
Test32Lib.local10.field4=Test32Lib.local17;
}
}
}
Test32Lib.local22.field18=Test32Lib.local22.field21;
for (int local54 = 0; local54<=3; local54 += 1) {
Test32Lib.local10.field9=Test32Lib.local33.field1.method7(Test32Lib.local28.field9,3);
}
Test32Lib.local22.field22=Test32Lib.local32.field10.method23(Test32Lib.local18,3);
Test32Lib.local17=Test32Lib.local24.field16;
if (inputValue==2) {
for (int local55 = 0; local55<=1; local55 += 1) {
if (inputValue<=2) {
Test32Lib.local28.field1=Test32Lib.local21.field17.method22(Test32Lib.local13.field3,3);
}else {
if (inputValue>=4) {
for (int local56 = 0; local56<=3; local56 += 1) {
}
}
}
}
}else {
Test32Lib.local21.field15.method21(3);
}
Test32Lib.local29.field10.method9(Test32Lib.local30.field25,Test32Lib.local30,3);
for (int local57 = 0; local57<=1; local57 += 1) {
Test32Lib.local17.field13.method2(Test32Lib.local34.field5,3);
}
Test32Lib.local20.field17.method23(Test32Lib.local12,3);
Test32Lib.local19=Test32Lib.local32.field25;
Benchmark.test(1,Test32Lib.local1);
Benchmark.test(2,Test32Lib.local2);
Benchmark.test(3,Test32Lib.local3);
Benchmark.test(4,Test32Lib.local4);
Benchmark.test(5,Test32Lib.local5);
Benchmark.test(6,Test32Lib.local6);
Benchmark.test(7,Test32Lib.local7);
Benchmark.test(8,Test32Lib.local8);
Benchmark.test(9,Test32Lib.local9);
Benchmark.test(10,Test32Lib.local10);
Benchmark.test(11,Test32Lib.local11);
Benchmark.test(12,Test32Lib.local12);
Benchmark.test(13,Test32Lib.local13);
Benchmark.test(14,Test32Lib.local14);
Benchmark.test(15,Test32Lib.local15);
Benchmark.test(16,Test32Lib.local16);
Benchmark.test(17,Test32Lib.local17);
Benchmark.test(18,Test32Lib.local18);
Benchmark.test(19,Test32Lib.local19);
Benchmark.test(20,Test32Lib.local20);
Benchmark.test(21,Test32Lib.local21);
Benchmark.test(22,Test32Lib.local22);
Benchmark.test(23,Test32Lib.local23);
Benchmark.test(24,Test32Lib.local24);
Benchmark.test(25,Test32Lib.local25);
Benchmark.test(26,Test32Lib.local26);
Benchmark.test(27,Test32Lib.local27);
Benchmark.test(28,Test32Lib.local28);
Benchmark.test(29,Test32Lib.local29);
Benchmark.test(30,Test32Lib.local30);
Benchmark.test(31,Test32Lib.local31);
Benchmark.test(32,Test32Lib.local32);
Benchmark.test(33,Test32Lib.local33);
Benchmark.test(34,Test32Lib.local34);
Benchmark.test(35,Test32Lib.local1.field1);
Benchmark.test(36,Test32Lib.local1.field2);
Benchmark.test(37,Test32Lib.local1.field3);
Benchmark.test(38,Test32Lib.local2.field1);
Benchmark.test(39,Test32Lib.local2.field2);
Benchmark.test(40,Test32Lib.local2.field3);
Benchmark.test(41,Test32Lib.local3.field1);
Benchmark.test(42,Test32Lib.local3.field2);
Benchmark.test(43,Test32Lib.local3.field3);
Benchmark.test(44,Test32Lib.local4.field1);
Benchmark.test(45,Test32Lib.local4.field2);
Benchmark.test(46,Test32Lib.local4.field3);
Benchmark.test(47,Test32Lib.local5.field1);
Benchmark.test(48,Test32Lib.local5.field2);
Benchmark.test(49,Test32Lib.local5.field3);
Benchmark.test(50,Test32Lib.local6.field1);
Benchmark.test(51,Test32Lib.local6.field2);
Benchmark.test(52,Test32Lib.local6.field3);
Benchmark.test(53,Test32Lib.local7.field1);
Benchmark.test(54,Test32Lib.local7.field2);
Benchmark.test(55,Test32Lib.local7.field3);
Benchmark.test(56,Test32Lib.local8.field1);
Benchmark.test(57,Test32Lib.local8.field2);
Benchmark.test(58,Test32Lib.local8.field3);
Benchmark.test(59,Test32Lib.local9.field1);
Benchmark.test(60,Test32Lib.local9.field2);
Benchmark.test(61,Test32Lib.local9.field3);
Benchmark.test(62,Test32Lib.local10.field4);
Benchmark.test(63,Test32Lib.local10.field5);
Benchmark.test(64,Test32Lib.local10.field6);
Benchmark.test(65,Test32Lib.local10.field7);
Benchmark.test(66,Test32Lib.local10.field8);
Benchmark.test(67,Test32Lib.local10.field9);
Benchmark.test(68,Test32Lib.local10.field10);
Benchmark.test(69,Test32Lib.local10.field11);
Benchmark.test(70,Test32Lib.local10.field12);
Benchmark.test(71,Test32Lib.local10.field1);
Benchmark.test(72,Test32Lib.local10.field2);
Benchmark.test(73,Test32Lib.local10.field3);
Benchmark.test(74,Test32Lib.local11.field13);
Benchmark.test(75,Test32Lib.local11.field14);
Benchmark.test(76,Test32Lib.local11.field1);
Benchmark.test(77,Test32Lib.local11.field2);
Benchmark.test(78,Test32Lib.local11.field3);
Benchmark.test(79,Test32Lib.local12.field13);
Benchmark.test(80,Test32Lib.local12.field14);
Benchmark.test(81,Test32Lib.local12.field1);
Benchmark.test(82,Test32Lib.local12.field2);
Benchmark.test(83,Test32Lib.local12.field3);
Benchmark.test(84,Test32Lib.local13.field13);
Benchmark.test(85,Test32Lib.local13.field14);
Benchmark.test(86,Test32Lib.local13.field1);
Benchmark.test(87,Test32Lib.local13.field2);
Benchmark.test(88,Test32Lib.local13.field3);
Benchmark.test(89,Test32Lib.local14.field13);
Benchmark.test(90,Test32Lib.local14.field14);
Benchmark.test(91,Test32Lib.local14.field1);
Benchmark.test(92,Test32Lib.local14.field2);
Benchmark.test(93,Test32Lib.local14.field3);
Benchmark.test(94,Test32Lib.local15.field13);
Benchmark.test(95,Test32Lib.local15.field14);
Benchmark.test(96,Test32Lib.local15.field1);
Benchmark.test(97,Test32Lib.local15.field2);
Benchmark.test(98,Test32Lib.local15.field3);
Benchmark.test(99,Test32Lib.local16.field13);
Benchmark.test(100,Test32Lib.local16.field14);
Benchmark.test(101,Test32Lib.local16.field1);
Benchmark.test(102,Test32Lib.local16.field2);
Benchmark.test(103,Test32Lib.local16.field3);
Benchmark.test(104,Test32Lib.local17.field13);
Benchmark.test(105,Test32Lib.local17.field14);
Benchmark.test(106,Test32Lib.local17.field1);
Benchmark.test(107,Test32Lib.local17.field2);
Benchmark.test(108,Test32Lib.local17.field3);
Benchmark.test(109,Test32Lib.local18.field13);
Benchmark.test(110,Test32Lib.local18.field14);
Benchmark.test(111,Test32Lib.local18.field1);
Benchmark.test(112,Test32Lib.local18.field2);
Benchmark.test(113,Test32Lib.local18.field3);
Benchmark.test(114,Test32Lib.local19.field13);
Benchmark.test(115,Test32Lib.local19.field14);
Benchmark.test(116,Test32Lib.local19.field1);
Benchmark.test(117,Test32Lib.local19.field2);
Benchmark.test(118,Test32Lib.local19.field3);
Benchmark.test(119,Test32Lib.local20.field15);
Benchmark.test(120,Test32Lib.local20.field16);
Benchmark.test(121,Test32Lib.local20.field17);
Benchmark.test(122,Test32Lib.local20.field18);
Benchmark.test(123,Test32Lib.local20.field19);
Benchmark.test(124,Test32Lib.local20.field20);
Benchmark.test(125,Test32Lib.local20.field21);
Benchmark.test(126,Test32Lib.local20.field22);
Benchmark.test(127,Test32Lib.local20.field13);
Benchmark.test(128,Test32Lib.local20.field14);
Benchmark.test(129,Test32Lib.local20.field1);
Benchmark.test(130,Test32Lib.local20.field2);
Benchmark.test(131,Test32Lib.local20.field3);
Benchmark.test(132,Test32Lib.local21.field15);
Benchmark.test(133,Test32Lib.local21.field16);
Benchmark.test(134,Test32Lib.local21.field17);
Benchmark.test(135,Test32Lib.local21.field18);
Benchmark.test(136,Test32Lib.local21.field19);
Benchmark.test(137,Test32Lib.local21.field20);
Benchmark.test(138,Test32Lib.local21.field21);
Benchmark.test(139,Test32Lib.local21.field22);
Benchmark.test(140,Test32Lib.local21.field13);
Benchmark.test(141,Test32Lib.local21.field14);
Benchmark.test(142,Test32Lib.local21.field1);
Benchmark.test(143,Test32Lib.local21.field2);
Benchmark.test(144,Test32Lib.local21.field3);
Benchmark.test(145,Test32Lib.local22.field15);
Benchmark.test(146,Test32Lib.local22.field16);
Benchmark.test(147,Test32Lib.local22.field17);
Benchmark.test(148,Test32Lib.local22.field18);
Benchmark.test(149,Test32Lib.local22.field19);
Benchmark.test(150,Test32Lib.local22.field20);
Benchmark.test(151,Test32Lib.local22.field21);
Benchmark.test(152,Test32Lib.local22.field22);
Benchmark.test(153,Test32Lib.local22.field13);
Benchmark.test(154,Test32Lib.local22.field14);
Benchmark.test(155,Test32Lib.local22.field1);
Benchmark.test(156,Test32Lib.local22.field2);
Benchmark.test(157,Test32Lib.local22.field3);
Benchmark.test(158,Test32Lib.local23.field15);
Benchmark.test(159,Test32Lib.local23.field16);
Benchmark.test(160,Test32Lib.local23.field17);
Benchmark.test(161,Test32Lib.local23.field18);
Benchmark.test(162,Test32Lib.local23.field19);
Benchmark.test(163,Test32Lib.local23.field20);
Benchmark.test(164,Test32Lib.local23.field21);
Benchmark.test(165,Test32Lib.local23.field22);
Benchmark.test(166,Test32Lib.local23.field13);
Benchmark.test(167,Test32Lib.local23.field14);
Benchmark.test(168,Test32Lib.local23.field1);
Benchmark.test(169,Test32Lib.local23.field2);
Benchmark.test(170,Test32Lib.local23.field3);
Benchmark.test(171,Test32Lib.local24.field15);
Benchmark.test(172,Test32Lib.local24.field16);
Benchmark.test(173,Test32Lib.local24.field17);
Benchmark.test(174,Test32Lib.local24.field18);
Benchmark.test(175,Test32Lib.local24.field19);
Benchmark.test(176,Test32Lib.local24.field20);
Benchmark.test(177,Test32Lib.local24.field21);
Benchmark.test(178,Test32Lib.local24.field22);
Benchmark.test(179,Test32Lib.local24.field13);
Benchmark.test(180,Test32Lib.local24.field14);
Benchmark.test(181,Test32Lib.local24.field1);
Benchmark.test(182,Test32Lib.local24.field2);
Benchmark.test(183,Test32Lib.local24.field3);
Benchmark.test(184,Test32Lib.local25.field15);
Benchmark.test(185,Test32Lib.local25.field16);
Benchmark.test(186,Test32Lib.local25.field17);
Benchmark.test(187,Test32Lib.local25.field18);
Benchmark.test(188,Test32Lib.local25.field19);
Benchmark.test(189,Test32Lib.local25.field20);
Benchmark.test(190,Test32Lib.local25.field21);
Benchmark.test(191,Test32Lib.local25.field22);
Benchmark.test(192,Test32Lib.local25.field13);
Benchmark.test(193,Test32Lib.local25.field14);
Benchmark.test(194,Test32Lib.local25.field1);
Benchmark.test(195,Test32Lib.local25.field2);
Benchmark.test(196,Test32Lib.local25.field3);
Benchmark.test(197,Test32Lib.local26.field23);
Benchmark.test(198,Test32Lib.local26.field24);
Benchmark.test(199,Test32Lib.local26.field25);
Benchmark.test(200,Test32Lib.local26.field4);
Benchmark.test(201,Test32Lib.local26.field5);
Benchmark.test(202,Test32Lib.local26.field6);
Benchmark.test(203,Test32Lib.local26.field7);
Benchmark.test(204,Test32Lib.local26.field8);
Benchmark.test(205,Test32Lib.local26.field9);
Benchmark.test(206,Test32Lib.local26.field10);
Benchmark.test(207,Test32Lib.local26.field11);
Benchmark.test(208,Test32Lib.local26.field12);
Benchmark.test(209,Test32Lib.local26.field1);
Benchmark.test(210,Test32Lib.local26.field2);
Benchmark.test(211,Test32Lib.local26.field3);
Benchmark.test(212,Test32Lib.local27.field23);
Benchmark.test(213,Test32Lib.local27.field24);
Benchmark.test(214,Test32Lib.local27.field25);
Benchmark.test(215,Test32Lib.local27.field4);
Benchmark.test(216,Test32Lib.local27.field5);
Benchmark.test(217,Test32Lib.local27.field6);
Benchmark.test(218,Test32Lib.local27.field7);
Benchmark.test(219,Test32Lib.local27.field8);
Benchmark.test(220,Test32Lib.local27.field9);
Benchmark.test(221,Test32Lib.local27.field10);
Benchmark.test(222,Test32Lib.local27.field11);
Benchmark.test(223,Test32Lib.local27.field12);
Benchmark.test(224,Test32Lib.local27.field1);
Benchmark.test(225,Test32Lib.local27.field2);
Benchmark.test(226,Test32Lib.local27.field3);
Benchmark.test(227,Test32Lib.local28.field23);
Benchmark.test(228,Test32Lib.local28.field24);
Benchmark.test(229,Test32Lib.local28.field25);
Benchmark.test(230,Test32Lib.local28.field4);
Benchmark.test(231,Test32Lib.local28.field5);
Benchmark.test(232,Test32Lib.local28.field6);
Benchmark.test(233,Test32Lib.local28.field7);
Benchmark.test(234,Test32Lib.local28.field8);
Benchmark.test(235,Test32Lib.local28.field9);
Benchmark.test(236,Test32Lib.local28.field10);
Benchmark.test(237,Test32Lib.local28.field11);
Benchmark.test(238,Test32Lib.local28.field12);
Benchmark.test(239,Test32Lib.local28.field1);
Benchmark.test(240,Test32Lib.local28.field2);
Benchmark.test(241,Test32Lib.local28.field3);
Benchmark.test(242,Test32Lib.local29.field23);
Benchmark.test(243,Test32Lib.local29.field24);
Benchmark.test(244,Test32Lib.local29.field25);
Benchmark.test(245,Test32Lib.local29.field4);
Benchmark.test(246,Test32Lib.local29.field5);
Benchmark.test(247,Test32Lib.local29.field6);
Benchmark.test(248,Test32Lib.local29.field7);
Benchmark.test(249,Test32Lib.local29.field8);
Benchmark.test(250,Test32Lib.local29.field9);
Benchmark.test(251,Test32Lib.local29.field10);
Benchmark.test(252,Test32Lib.local29.field11);
Benchmark.test(253,Test32Lib.local29.field12);
Benchmark.test(254,Test32Lib.local29.field1);
Benchmark.test(255,Test32Lib.local29.field2);
Benchmark.test(256,Test32Lib.local29.field3);
Benchmark.test(257,Test32Lib.local30.field23);
Benchmark.test(258,Test32Lib.local30.field24);
Benchmark.test(259,Test32Lib.local30.field25);
Benchmark.test(260,Test32Lib.local30.field4);
Benchmark.test(261,Test32Lib.local30.field5);
Benchmark.test(262,Test32Lib.local30.field6);
Benchmark.test(263,Test32Lib.local30.field7);
Benchmark.test(264,Test32Lib.local30.field8);
Benchmark.test(265,Test32Lib.local30.field9);
Benchmark.test(266,Test32Lib.local30.field10);
Benchmark.test(267,Test32Lib.local30.field11);
Benchmark.test(268,Test32Lib.local30.field12);
Benchmark.test(269,Test32Lib.local30.field1);
Benchmark.test(270,Test32Lib.local30.field2);
Benchmark.test(271,Test32Lib.local30.field3);
Benchmark.test(272,Test32Lib.local31.field23);
Benchmark.test(273,Test32Lib.local31.field24);
Benchmark.test(274,Test32Lib.local31.field25);
Benchmark.test(275,Test32Lib.local31.field4);
Benchmark.test(276,Test32Lib.local31.field5);
Benchmark.test(277,Test32Lib.local31.field6);
Benchmark.test(278,Test32Lib.local31.field7);
Benchmark.test(279,Test32Lib.local31.field8);
Benchmark.test(280,Test32Lib.local31.field9);
Benchmark.test(281,Test32Lib.local31.field10);
Benchmark.test(282,Test32Lib.local31.field11);
Benchmark.test(283,Test32Lib.local31.field12);
Benchmark.test(284,Test32Lib.local31.field1);
Benchmark.test(285,Test32Lib.local31.field2);
Benchmark.test(286,Test32Lib.local31.field3);
Benchmark.test(287,Test32Lib.local32.field23);
Benchmark.test(288,Test32Lib.local32.field24);
Benchmark.test(289,Test32Lib.local32.field25);
Benchmark.test(290,Test32Lib.local32.field4);
Benchmark.test(291,Test32Lib.local32.field5);
Benchmark.test(292,Test32Lib.local32.field6);
Benchmark.test(293,Test32Lib.local32.field7);
Benchmark.test(294,Test32Lib.local32.field8);
Benchmark.test(295,Test32Lib.local32.field9);
Benchmark.test(296,Test32Lib.local32.field10);
Benchmark.test(297,Test32Lib.local32.field11);
Benchmark.test(298,Test32Lib.local32.field12);
Benchmark.test(299,Test32Lib.local32.field1);
Benchmark.test(300,Test32Lib.local32.field2);
Benchmark.test(301,Test32Lib.local32.field3);
Benchmark.test(302,Test32Lib.local33.field23);
Benchmark.test(303,Test32Lib.local33.field24);
Benchmark.test(304,Test32Lib.local33.field25);
Benchmark.test(305,Test32Lib.local33.field4);
Benchmark.test(306,Test32Lib.local33.field5);
Benchmark.test(307,Test32Lib.local33.field6);
Benchmark.test(308,Test32Lib.local33.field7);
Benchmark.test(309,Test32Lib.local33.field8);
Benchmark.test(310,Test32Lib.local33.field9);
Benchmark.test(311,Test32Lib.local33.field10);
Benchmark.test(312,Test32Lib.local33.field11);
Benchmark.test(313,Test32Lib.local33.field12);
Benchmark.test(314,Test32Lib.local33.field1);
Benchmark.test(315,Test32Lib.local33.field2);
Benchmark.test(316,Test32Lib.local33.field3);
Benchmark.test(317,Test32Lib.local34.field23);
Benchmark.test(318,Test32Lib.local34.field24);
Benchmark.test(319,Test32Lib.local34.field25);
Benchmark.test(320,Test32Lib.local34.field4);
Benchmark.test(321,Test32Lib.local34.field5);
Benchmark.test(322,Test32Lib.local34.field6);
Benchmark.test(323,Test32Lib.local34.field7);
Benchmark.test(324,Test32Lib.local34.field8);
Benchmark.test(325,Test32Lib.local34.field9);
Benchmark.test(326,Test32Lib.local34.field10);
Benchmark.test(327,Test32Lib.local34.field11);
Benchmark.test(328,Test32Lib.local34.field12);
Benchmark.test(329,Test32Lib.local34.field1);
Benchmark.test(330,Test32Lib.local34.field2);
Benchmark.test(331,Test32Lib.local34.field3);
Benchmark.print();
}
}
