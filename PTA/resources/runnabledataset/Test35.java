package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test35Lib{
public static Test35Class1 local1;
public static Test35Class1 local2;
public static Test35Class1 local3;
public static Test35Class1 local4;
public static Test35Class1 local5;
public static Test35Class1 local6;
public static Test35Class1 local7;
public static Test35Class2 local8;
public static Test35Class3 local9;
public static Test35Class3 local10;
public static Test35Class3 local11;
public static Test35Class3 local12;
public static Test35Class3 local13;
public static Test35Class3 local14;
public static Test35Class4 local15;
public static Test35Class4 local16;
public static Test35Class4 local17;
public static Test35Class5 local18;
public static Test35Class5 local19;
public static Test35Class5 local20;
public static Test35Class5 local21;
public static Test35Class5 local22;
public static Test35Class5 local23;
}
class Test35Class1 extends BasicClass {
public static Test35Class2 field1;
public Test35Class2 field2;
public static Test35Class4 field3;
public static Test35Class2 field4;
public Test35Class4 field5;
public Test35Class3 field6;
public static Test35Class3 field7;
public Test35Class2 field8;
public Test35Class1 field9;
public static void method1(Test35Class5 arg0, int depth) {
if (depth == 0) return;
arg0.field6=arg0.field23.method22(field7.field3,field3.field5,depth-1);
arg0.field23.method25(field7.field10,arg0,depth-1);
}
public static void method2(Test35Class2 arg0, Test35Class3 arg1, int depth) {
if (depth == 0) return;
field4.field3.method11(arg0.field2,depth-1);
}
}
class Test35Class2 extends Test35Class1 {
public static Test35Class4 field10;
public Test35Class2 field11;
public static Test35Class3 field12;
public void method3(int depth) {
if (depth == 0) return;
if (depth<2) {
this.field5.method10(this.field11,depth-1);
}
for (int local24 = 0; local24<=2; local24 += 1) {
if (depth>4) {
for (int local25 = 0; local25<=0; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
if (depth==3) {
}else {
}
}
}
}else {
if (depth==1) {
this.field7.method2(this.field2,this.field12,depth-1);
}
}
}
}
public void method4(int depth) {
if (depth == 0) return;
for (int local27 = 0; local27<=2; local27 += 1) {
if (depth<=1) {
if (depth>=3) {
for (int local28 = 0; local28<=1; local28 += 1) {
this.field4=this.field4;
}
}else {
this.field5.method8(this,this.field6,depth-1);
}
}
}
this.field11.method5(depth-1);
}
public static void method5(int depth) {
if (depth == 0) return;
for (int local29 = 0; local29<=1; local29 += 1) {
for (int local30 = 0; local30<=1; local30 += 1) {
if (depth>4) {
field1.field9=field3.field11;
}
}
}
}
}
class Test35Class3 extends Test35Class2 {
public Test35Class4 field13;
public Test35Class2 field14;
public Test35Class3 field15;
public static Test35Class4 method6(Test35Class4 arg0, int depth) {
if (depth == 0) return Test35Lib.local15;
return field3.field13;
}
public Test35Class2 method7(int depth) {
if (depth == 0) return Test35Lib.local8;
return this.field8;
}
}
class Test35Class4 extends Test35Class3 {
public Test35Class5 field16;
public static Test35Class1 field17;
public static Test35Class2 field18;
public Test35Class3 field19;
public void method8(Test35Class1 arg0, Test35Class1 arg1, int depth) {
if (depth == 0) return;
arg1.field3.method9(this.field16,this.field16,depth-1);
for (int local31 = 0; local31<=1; local31 += 1) {
arg0.field5.method9(this.field16,this.field16,depth-1);
}
}
public void method9(Test35Class5 arg0, Test35Class5 arg1, int depth) {
if (depth == 0) return;
if (depth>2) {
arg1.field3.method4(depth-1);
}
for (int local32 = 0; local32<=3; local32 += 1) {
arg0.field10=this.field3;
}
}
public static void method10(Test35Class2 arg0, int depth) {
if (depth == 0) return;
for (int local33 = 0; local33<=3; local33 += 1) {
field12.field9=field7.field3;
}
}
public static Test35Class3 method11(Test35Class2 arg0, int depth) {
if (depth == 0) return Test35Lib.local14;
for (int local34 = 0; local34<=2; local34 += 1) {
for (int local35 = 0; local35<=2; local35 += 1) {
field10.field16.method24(arg0.field5,depth-1);
}
}
return field7;
}
public void method12(Test35Class2 arg0, int depth) {
if (depth == 0) return;
this.field10=this.field16.method21(this.field16,depth-1);
for (int local36 = 0; local36<=0; local36 += 1) {
this.field12.method7(depth-1);
}
}
public void method13(Test35Class1 arg0, int depth) {
if (depth == 0) return;
}
public static Test35Class5 method14(int depth) {
if (depth == 0) return Test35Lib.local22;
return field3.field16;
}
public Test35Class1 method15(Test35Class1 arg0, int depth) {
if (depth == 0) return Test35Lib.local9;
return this.field15;
}
public Test35Class4 method16(Test35Class2 arg0, Test35Class1 arg1, int depth) {
if (depth == 0) return Test35Lib.local16;
this.field16.method23(arg1,this.field16,depth-1);
return arg1.field5;
}
public static void method17(Test35Class4 arg0, int depth) {
if (depth == 0) return;
if (depth>=4) {
field7.field5.method17(field7.field10,depth-1);
}
for (int local37 = 0; local37<=2; local37 += 1) {
field4.field9=field18.field7;
}
}
}
class Test35Class5 extends Test35Class3 {
public Test35Class5 field20;
public Test35Class2 field21;
public Test35Class1 field22;
public static Test35Class5 field23;
public static Test35Class1 field24;
public static Test35Class3 field25;
public Test35Class3 field26;
public Test35Class3 field27;
public Test35Class1 field28;
public Test35Class3 field29;
public static void method18(Test35Class4 arg0, Test35Class1 arg1, int depth) {
if (depth == 0) return;
if (depth>=2) {
field4.field10=field7.field3;
}
}
public static Test35Class1 method19(Test35Class1 arg0, Test35Class5 arg1, int depth) {
if (depth == 0) return Test35Lib.local15;
return arg0.field2;
}
public static void method20(Test35Class1 arg0, int depth) {
if (depth == 0) return;
if (depth>3) {
field1.field2=field7.field13;
}else {
for (int local38 = 0; local38<=2; local38 += 1) {
field3.field6=arg0.field5;
}
}
}
public static Test35Class4 method21(Test35Class5 arg0, int depth) {
if (depth == 0) return Test35Lib.local16;
if (depth==3) {
arg0=arg0;
}
return field12.field13;
}
public Test35Class4 method22(Test35Class4 arg0, Test35Class4 arg1, int depth) {
if (depth == 0) return Test35Lib.local16;
for (int local39 = 0; local39<=0; local39 += 1) {
if (depth<=1) {
this.field3.method1(this.field23,depth-1);
}
}
this.field9=this.field3.method15(arg0.field2,depth-1);
return arg1.field5;
}
public Test35Class3 method23(Test35Class1 arg0, Test35Class5 arg1, int depth) {
if (depth == 0) return Test35Lib.local13;
this.field24=this.field2;
this.field15=arg0.field7;
return this.field12;
}
public static Test35Class5 method24(Test35Class1 arg0, int depth) {
if (depth == 0) return Test35Lib.local19;
for (int local40 = 0; local40<=1; local40 += 1) {
field7.field5=field23.field5;
}
return field23.field23;
}
public static void method25(Test35Class1 arg0, Test35Class5 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test35{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test35Lib.local1 = new Test35Class1();
Benchmark.alloc(2);
Test35Lib.local2 = new Test35Class1();
Benchmark.alloc(3);
Test35Lib.local3 = new Test35Class1();
Benchmark.alloc(4);
Test35Lib.local4 = new Test35Class1();
Benchmark.alloc(5);
Test35Lib.local5 = new Test35Class1();
Benchmark.alloc(6);
Test35Lib.local6 = new Test35Class1();
Benchmark.alloc(7);
Test35Lib.local7 = new Test35Class1();
Benchmark.alloc(8);
Test35Lib.local8 = new Test35Class2();
Benchmark.alloc(9);
Test35Lib.local9 = new Test35Class3();
Benchmark.alloc(10);
Test35Lib.local10 = new Test35Class3();
Benchmark.alloc(11);
Test35Lib.local11 = new Test35Class3();
Benchmark.alloc(12);
Test35Lib.local12 = new Test35Class3();
Benchmark.alloc(13);
Test35Lib.local13 = new Test35Class3();
Benchmark.alloc(14);
Test35Lib.local14 = new Test35Class3();
Benchmark.alloc(15);
Test35Lib.local15 = new Test35Class4();
Benchmark.alloc(16);
Test35Lib.local16 = new Test35Class4();
Benchmark.alloc(17);
Test35Lib.local17 = new Test35Class4();
Benchmark.alloc(18);
Test35Lib.local18 = new Test35Class5();
Benchmark.alloc(19);
Test35Lib.local19 = new Test35Class5();
Benchmark.alloc(20);
Test35Lib.local20 = new Test35Class5();
Benchmark.alloc(21);
Test35Lib.local21 = new Test35Class5();
Benchmark.alloc(22);
Test35Lib.local22 = new Test35Class5();
Benchmark.alloc(23);
Test35Lib.local23 = new Test35Class5();
Test35Lib.local1.field1 = Test35Lib.local13;
Test35Lib.local1.field2 = Test35Lib.local14;
Test35Lib.local1.field3 = Test35Lib.local16;
Test35Lib.local1.field4 = Test35Lib.local15;
Test35Lib.local1.field5 = Test35Lib.local17;
Test35Lib.local1.field6 = Test35Lib.local22;
Test35Lib.local1.field7 = Test35Lib.local18;
Test35Lib.local1.field8 = Test35Lib.local20;
Test35Lib.local1.field9 = Test35Lib.local3;
Test35Lib.local2.field1 = Test35Lib.local12;
Test35Lib.local2.field2 = Test35Lib.local17;
Test35Lib.local2.field3 = Test35Lib.local15;
Test35Lib.local2.field4 = Test35Lib.local8;
Test35Lib.local2.field5 = Test35Lib.local16;
Test35Lib.local2.field6 = Test35Lib.local18;
Test35Lib.local2.field7 = Test35Lib.local18;
Test35Lib.local2.field8 = Test35Lib.local9;
Test35Lib.local2.field9 = Test35Lib.local11;
Test35Lib.local3.field1 = Test35Lib.local20;
Test35Lib.local3.field2 = Test35Lib.local16;
Test35Lib.local3.field3 = Test35Lib.local16;
Test35Lib.local3.field4 = Test35Lib.local22;
Test35Lib.local3.field5 = Test35Lib.local16;
Test35Lib.local3.field6 = Test35Lib.local15;
Test35Lib.local3.field7 = Test35Lib.local9;
Test35Lib.local3.field8 = Test35Lib.local10;
Test35Lib.local3.field9 = Test35Lib.local18;
Test35Lib.local4.field1 = Test35Lib.local18;
Test35Lib.local4.field2 = Test35Lib.local13;
Test35Lib.local4.field3 = Test35Lib.local15;
Test35Lib.local4.field4 = Test35Lib.local19;
Test35Lib.local4.field5 = Test35Lib.local15;
Test35Lib.local4.field6 = Test35Lib.local9;
Test35Lib.local4.field7 = Test35Lib.local20;
Test35Lib.local4.field8 = Test35Lib.local19;
Test35Lib.local4.field9 = Test35Lib.local13;
Test35Lib.local5.field1 = Test35Lib.local21;
Test35Lib.local5.field2 = Test35Lib.local12;
Test35Lib.local5.field3 = Test35Lib.local15;
Test35Lib.local5.field4 = Test35Lib.local21;
Test35Lib.local5.field5 = Test35Lib.local15;
Test35Lib.local5.field6 = Test35Lib.local16;
Test35Lib.local5.field7 = Test35Lib.local17;
Test35Lib.local5.field8 = Test35Lib.local10;
Test35Lib.local5.field9 = Test35Lib.local4;
Test35Lib.local6.field1 = Test35Lib.local15;
Test35Lib.local6.field2 = Test35Lib.local15;
Test35Lib.local6.field3 = Test35Lib.local17;
Test35Lib.local6.field4 = Test35Lib.local10;
Test35Lib.local6.field5 = Test35Lib.local15;
Test35Lib.local6.field6 = Test35Lib.local9;
Test35Lib.local6.field7 = Test35Lib.local17;
Test35Lib.local6.field8 = Test35Lib.local20;
Test35Lib.local6.field9 = Test35Lib.local7;
Test35Lib.local7.field1 = Test35Lib.local15;
Test35Lib.local7.field2 = Test35Lib.local16;
Test35Lib.local7.field3 = Test35Lib.local15;
Test35Lib.local7.field4 = Test35Lib.local17;
Test35Lib.local7.field5 = Test35Lib.local16;
Test35Lib.local7.field6 = Test35Lib.local12;
Test35Lib.local7.field7 = Test35Lib.local13;
Test35Lib.local7.field8 = Test35Lib.local20;
Test35Lib.local7.field9 = Test35Lib.local14;
Test35Lib.local8.field10 = Test35Lib.local16;
Test35Lib.local8.field11 = Test35Lib.local23;
Test35Lib.local8.field12 = Test35Lib.local22;
Test35Lib.local8.field1 = Test35Lib.local14;
Test35Lib.local8.field2 = Test35Lib.local18;
Test35Lib.local8.field3 = Test35Lib.local16;
Test35Lib.local8.field4 = Test35Lib.local21;
Test35Lib.local8.field5 = Test35Lib.local16;
Test35Lib.local8.field6 = Test35Lib.local9;
Test35Lib.local8.field7 = Test35Lib.local13;
Test35Lib.local8.field8 = Test35Lib.local22;
Test35Lib.local8.field9 = Test35Lib.local9;
Test35Lib.local9.field13 = Test35Lib.local16;
Test35Lib.local9.field14 = Test35Lib.local22;
Test35Lib.local9.field15 = Test35Lib.local23;
Test35Lib.local9.field10 = Test35Lib.local15;
Test35Lib.local9.field11 = Test35Lib.local20;
Test35Lib.local9.field12 = Test35Lib.local18;
Test35Lib.local9.field1 = Test35Lib.local12;
Test35Lib.local9.field2 = Test35Lib.local21;
Test35Lib.local9.field3 = Test35Lib.local16;
Test35Lib.local9.field4 = Test35Lib.local10;
Test35Lib.local9.field5 = Test35Lib.local16;
Test35Lib.local9.field6 = Test35Lib.local12;
Test35Lib.local9.field7 = Test35Lib.local12;
Test35Lib.local9.field8 = Test35Lib.local8;
Test35Lib.local9.field9 = Test35Lib.local11;
Test35Lib.local10.field13 = Test35Lib.local16;
Test35Lib.local10.field14 = Test35Lib.local16;
Test35Lib.local10.field15 = Test35Lib.local17;
Test35Lib.local10.field10 = Test35Lib.local17;
Test35Lib.local10.field11 = Test35Lib.local10;
Test35Lib.local10.field12 = Test35Lib.local22;
Test35Lib.local10.field1 = Test35Lib.local13;
Test35Lib.local10.field2 = Test35Lib.local12;
Test35Lib.local10.field3 = Test35Lib.local17;
Test35Lib.local10.field4 = Test35Lib.local17;
Test35Lib.local10.field5 = Test35Lib.local15;
Test35Lib.local10.field6 = Test35Lib.local20;
Test35Lib.local10.field7 = Test35Lib.local19;
Test35Lib.local10.field8 = Test35Lib.local20;
Test35Lib.local10.field9 = Test35Lib.local21;
Test35Lib.local11.field13 = Test35Lib.local15;
Test35Lib.local11.field14 = Test35Lib.local11;
Test35Lib.local11.field15 = Test35Lib.local16;
Test35Lib.local11.field10 = Test35Lib.local17;
Test35Lib.local11.field11 = Test35Lib.local21;
Test35Lib.local11.field12 = Test35Lib.local18;
Test35Lib.local11.field1 = Test35Lib.local22;
Test35Lib.local11.field2 = Test35Lib.local12;
Test35Lib.local11.field3 = Test35Lib.local17;
Test35Lib.local11.field4 = Test35Lib.local10;
Test35Lib.local11.field5 = Test35Lib.local15;
Test35Lib.local11.field6 = Test35Lib.local20;
Test35Lib.local11.field7 = Test35Lib.local11;
Test35Lib.local11.field8 = Test35Lib.local22;
Test35Lib.local11.field9 = Test35Lib.local21;
Test35Lib.local12.field13 = Test35Lib.local15;
Test35Lib.local12.field14 = Test35Lib.local20;
Test35Lib.local12.field15 = Test35Lib.local18;
Test35Lib.local12.field10 = Test35Lib.local16;
Test35Lib.local12.field11 = Test35Lib.local23;
Test35Lib.local12.field12 = Test35Lib.local23;
Test35Lib.local12.field1 = Test35Lib.local9;
Test35Lib.local12.field2 = Test35Lib.local11;
Test35Lib.local12.field3 = Test35Lib.local16;
Test35Lib.local12.field4 = Test35Lib.local20;
Test35Lib.local12.field5 = Test35Lib.local17;
Test35Lib.local12.field6 = Test35Lib.local20;
Test35Lib.local12.field7 = Test35Lib.local18;
Test35Lib.local12.field8 = Test35Lib.local11;
Test35Lib.local12.field9 = Test35Lib.local2;
Test35Lib.local13.field13 = Test35Lib.local16;
Test35Lib.local13.field14 = Test35Lib.local9;
Test35Lib.local13.field15 = Test35Lib.local23;
Test35Lib.local13.field10 = Test35Lib.local16;
Test35Lib.local13.field11 = Test35Lib.local22;
Test35Lib.local13.field12 = Test35Lib.local21;
Test35Lib.local13.field1 = Test35Lib.local12;
Test35Lib.local13.field2 = Test35Lib.local19;
Test35Lib.local13.field3 = Test35Lib.local15;
Test35Lib.local13.field4 = Test35Lib.local16;
Test35Lib.local13.field5 = Test35Lib.local15;
Test35Lib.local13.field6 = Test35Lib.local15;
Test35Lib.local13.field7 = Test35Lib.local12;
Test35Lib.local13.field8 = Test35Lib.local23;
Test35Lib.local13.field9 = Test35Lib.local21;
Test35Lib.local14.field13 = Test35Lib.local17;
Test35Lib.local14.field14 = Test35Lib.local18;
Test35Lib.local14.field15 = Test35Lib.local16;
Test35Lib.local14.field10 = Test35Lib.local15;
Test35Lib.local14.field11 = Test35Lib.local18;
Test35Lib.local14.field12 = Test35Lib.local19;
Test35Lib.local14.field1 = Test35Lib.local23;
Test35Lib.local14.field2 = Test35Lib.local22;
Test35Lib.local14.field3 = Test35Lib.local15;
Test35Lib.local14.field4 = Test35Lib.local10;
Test35Lib.local14.field5 = Test35Lib.local16;
Test35Lib.local14.field6 = Test35Lib.local15;
Test35Lib.local14.field7 = Test35Lib.local20;
Test35Lib.local14.field8 = Test35Lib.local12;
Test35Lib.local14.field9 = Test35Lib.local1;
Test35Lib.local15.field16 = Test35Lib.local23;
Test35Lib.local15.field17 = Test35Lib.local13;
Test35Lib.local15.field18 = Test35Lib.local19;
Test35Lib.local15.field19 = Test35Lib.local14;
Test35Lib.local15.field13 = Test35Lib.local17;
Test35Lib.local15.field14 = Test35Lib.local21;
Test35Lib.local15.field15 = Test35Lib.local23;
Test35Lib.local15.field10 = Test35Lib.local15;
Test35Lib.local15.field11 = Test35Lib.local8;
Test35Lib.local15.field12 = Test35Lib.local10;
Test35Lib.local15.field1 = Test35Lib.local16;
Test35Lib.local15.field2 = Test35Lib.local9;
Test35Lib.local15.field3 = Test35Lib.local16;
Test35Lib.local15.field4 = Test35Lib.local18;
Test35Lib.local15.field5 = Test35Lib.local15;
Test35Lib.local15.field6 = Test35Lib.local11;
Test35Lib.local15.field7 = Test35Lib.local11;
Test35Lib.local15.field8 = Test35Lib.local18;
Test35Lib.local15.field9 = Test35Lib.local3;
Test35Lib.local16.field16 = Test35Lib.local19;
Test35Lib.local16.field17 = Test35Lib.local14;
Test35Lib.local16.field18 = Test35Lib.local16;
Test35Lib.local16.field19 = Test35Lib.local10;
Test35Lib.local16.field13 = Test35Lib.local16;
Test35Lib.local16.field14 = Test35Lib.local18;
Test35Lib.local16.field15 = Test35Lib.local10;
Test35Lib.local16.field10 = Test35Lib.local15;
Test35Lib.local16.field11 = Test35Lib.local23;
Test35Lib.local16.field12 = Test35Lib.local23;
Test35Lib.local16.field1 = Test35Lib.local19;
Test35Lib.local16.field2 = Test35Lib.local15;
Test35Lib.local16.field3 = Test35Lib.local17;
Test35Lib.local16.field4 = Test35Lib.local22;
Test35Lib.local16.field5 = Test35Lib.local16;
Test35Lib.local16.field6 = Test35Lib.local10;
Test35Lib.local16.field7 = Test35Lib.local19;
Test35Lib.local16.field8 = Test35Lib.local23;
Test35Lib.local16.field9 = Test35Lib.local9;
Test35Lib.local17.field16 = Test35Lib.local23;
Test35Lib.local17.field17 = Test35Lib.local19;
Test35Lib.local17.field18 = Test35Lib.local16;
Test35Lib.local17.field19 = Test35Lib.local19;
Test35Lib.local17.field13 = Test35Lib.local16;
Test35Lib.local17.field14 = Test35Lib.local17;
Test35Lib.local17.field15 = Test35Lib.local20;
Test35Lib.local17.field10 = Test35Lib.local15;
Test35Lib.local17.field11 = Test35Lib.local9;
Test35Lib.local17.field12 = Test35Lib.local17;
Test35Lib.local17.field1 = Test35Lib.local14;
Test35Lib.local17.field2 = Test35Lib.local21;
Test35Lib.local17.field3 = Test35Lib.local16;
Test35Lib.local17.field4 = Test35Lib.local17;
Test35Lib.local17.field5 = Test35Lib.local16;
Test35Lib.local17.field6 = Test35Lib.local10;
Test35Lib.local17.field7 = Test35Lib.local14;
Test35Lib.local17.field8 = Test35Lib.local9;
Test35Lib.local17.field9 = Test35Lib.local4;
Test35Lib.local18.field20 = Test35Lib.local18;
Test35Lib.local18.field21 = Test35Lib.local10;
Test35Lib.local18.field22 = Test35Lib.local9;
Test35Lib.local18.field23 = Test35Lib.local21;
Test35Lib.local18.field24 = Test35Lib.local5;
Test35Lib.local18.field25 = Test35Lib.local19;
Test35Lib.local18.field26 = Test35Lib.local16;
Test35Lib.local18.field27 = Test35Lib.local19;
Test35Lib.local18.field28 = Test35Lib.local22;
Test35Lib.local18.field29 = Test35Lib.local20;
Test35Lib.local18.field13 = Test35Lib.local15;
Test35Lib.local18.field14 = Test35Lib.local17;
Test35Lib.local18.field15 = Test35Lib.local11;
Test35Lib.local18.field10 = Test35Lib.local15;
Test35Lib.local18.field11 = Test35Lib.local16;
Test35Lib.local18.field12 = Test35Lib.local19;
Test35Lib.local18.field1 = Test35Lib.local17;
Test35Lib.local18.field2 = Test35Lib.local18;
Test35Lib.local18.field3 = Test35Lib.local15;
Test35Lib.local18.field4 = Test35Lib.local15;
Test35Lib.local18.field5 = Test35Lib.local16;
Test35Lib.local18.field6 = Test35Lib.local17;
Test35Lib.local18.field7 = Test35Lib.local9;
Test35Lib.local18.field8 = Test35Lib.local14;
Test35Lib.local18.field9 = Test35Lib.local13;
Test35Lib.local19.field20 = Test35Lib.local21;
Test35Lib.local19.field21 = Test35Lib.local20;
Test35Lib.local19.field22 = Test35Lib.local20;
Test35Lib.local19.field23 = Test35Lib.local20;
Test35Lib.local19.field24 = Test35Lib.local6;
Test35Lib.local19.field25 = Test35Lib.local12;
Test35Lib.local19.field26 = Test35Lib.local15;
Test35Lib.local19.field27 = Test35Lib.local20;
Test35Lib.local19.field28 = Test35Lib.local19;
Test35Lib.local19.field29 = Test35Lib.local19;
Test35Lib.local19.field13 = Test35Lib.local16;
Test35Lib.local19.field14 = Test35Lib.local8;
Test35Lib.local19.field15 = Test35Lib.local18;
Test35Lib.local19.field10 = Test35Lib.local15;
Test35Lib.local19.field11 = Test35Lib.local23;
Test35Lib.local19.field12 = Test35Lib.local23;
Test35Lib.local19.field1 = Test35Lib.local16;
Test35Lib.local19.field2 = Test35Lib.local8;
Test35Lib.local19.field3 = Test35Lib.local15;
Test35Lib.local19.field4 = Test35Lib.local11;
Test35Lib.local19.field5 = Test35Lib.local16;
Test35Lib.local19.field6 = Test35Lib.local23;
Test35Lib.local19.field7 = Test35Lib.local9;
Test35Lib.local19.field8 = Test35Lib.local21;
Test35Lib.local19.field9 = Test35Lib.local16;
Test35Lib.local20.field20 = Test35Lib.local21;
Test35Lib.local20.field21 = Test35Lib.local17;
Test35Lib.local20.field22 = Test35Lib.local20;
Test35Lib.local20.field23 = Test35Lib.local22;
Test35Lib.local20.field24 = Test35Lib.local9;
Test35Lib.local20.field25 = Test35Lib.local20;
Test35Lib.local20.field26 = Test35Lib.local10;
Test35Lib.local20.field27 = Test35Lib.local17;
Test35Lib.local20.field28 = Test35Lib.local11;
Test35Lib.local20.field29 = Test35Lib.local12;
Test35Lib.local20.field13 = Test35Lib.local17;
Test35Lib.local20.field14 = Test35Lib.local12;
Test35Lib.local20.field15 = Test35Lib.local15;
Test35Lib.local20.field10 = Test35Lib.local15;
Test35Lib.local20.field11 = Test35Lib.local19;
Test35Lib.local20.field12 = Test35Lib.local9;
Test35Lib.local20.field1 = Test35Lib.local10;
Test35Lib.local20.field2 = Test35Lib.local19;
Test35Lib.local20.field3 = Test35Lib.local17;
Test35Lib.local20.field4 = Test35Lib.local20;
Test35Lib.local20.field5 = Test35Lib.local17;
Test35Lib.local20.field6 = Test35Lib.local21;
Test35Lib.local20.field7 = Test35Lib.local15;
Test35Lib.local20.field8 = Test35Lib.local18;
Test35Lib.local20.field9 = Test35Lib.local16;
Test35Lib.local21.field20 = Test35Lib.local18;
Test35Lib.local21.field21 = Test35Lib.local11;
Test35Lib.local21.field22 = Test35Lib.local11;
Test35Lib.local21.field23 = Test35Lib.local20;
Test35Lib.local21.field24 = Test35Lib.local6;
Test35Lib.local21.field25 = Test35Lib.local12;
Test35Lib.local21.field26 = Test35Lib.local10;
Test35Lib.local21.field27 = Test35Lib.local13;
Test35Lib.local21.field28 = Test35Lib.local2;
Test35Lib.local21.field29 = Test35Lib.local15;
Test35Lib.local21.field13 = Test35Lib.local15;
Test35Lib.local21.field14 = Test35Lib.local20;
Test35Lib.local21.field15 = Test35Lib.local20;
Test35Lib.local21.field10 = Test35Lib.local17;
Test35Lib.local21.field11 = Test35Lib.local18;
Test35Lib.local21.field12 = Test35Lib.local20;
Test35Lib.local21.field1 = Test35Lib.local13;
Test35Lib.local21.field2 = Test35Lib.local17;
Test35Lib.local21.field3 = Test35Lib.local16;
Test35Lib.local21.field4 = Test35Lib.local22;
Test35Lib.local21.field5 = Test35Lib.local17;
Test35Lib.local21.field6 = Test35Lib.local18;
Test35Lib.local21.field7 = Test35Lib.local22;
Test35Lib.local21.field8 = Test35Lib.local22;
Test35Lib.local21.field9 = Test35Lib.local7;
Test35Lib.local22.field20 = Test35Lib.local18;
Test35Lib.local22.field21 = Test35Lib.local18;
Test35Lib.local22.field22 = Test35Lib.local18;
Test35Lib.local22.field23 = Test35Lib.local18;
Test35Lib.local22.field24 = Test35Lib.local14;
Test35Lib.local22.field25 = Test35Lib.local20;
Test35Lib.local22.field26 = Test35Lib.local11;
Test35Lib.local22.field27 = Test35Lib.local15;
Test35Lib.local22.field28 = Test35Lib.local16;
Test35Lib.local22.field29 = Test35Lib.local21;
Test35Lib.local22.field13 = Test35Lib.local16;
Test35Lib.local22.field14 = Test35Lib.local10;
Test35Lib.local22.field15 = Test35Lib.local19;
Test35Lib.local22.field10 = Test35Lib.local15;
Test35Lib.local22.field11 = Test35Lib.local13;
Test35Lib.local22.field12 = Test35Lib.local18;
Test35Lib.local22.field1 = Test35Lib.local15;
Test35Lib.local22.field2 = Test35Lib.local12;
Test35Lib.local22.field3 = Test35Lib.local15;
Test35Lib.local22.field4 = Test35Lib.local10;
Test35Lib.local22.field5 = Test35Lib.local17;
Test35Lib.local22.field6 = Test35Lib.local20;
Test35Lib.local22.field7 = Test35Lib.local20;
Test35Lib.local22.field8 = Test35Lib.local11;
Test35Lib.local22.field9 = Test35Lib.local5;
Test35Lib.local23.field20 = Test35Lib.local22;
Test35Lib.local23.field21 = Test35Lib.local17;
Test35Lib.local23.field22 = Test35Lib.local17;
Test35Lib.local23.field23 = Test35Lib.local21;
Test35Lib.local23.field24 = Test35Lib.local17;
Test35Lib.local23.field25 = Test35Lib.local9;
Test35Lib.local23.field26 = Test35Lib.local19;
Test35Lib.local23.field27 = Test35Lib.local18;
Test35Lib.local23.field28 = Test35Lib.local18;
Test35Lib.local23.field29 = Test35Lib.local21;
Test35Lib.local23.field13 = Test35Lib.local15;
Test35Lib.local23.field14 = Test35Lib.local21;
Test35Lib.local23.field15 = Test35Lib.local16;
Test35Lib.local23.field10 = Test35Lib.local17;
Test35Lib.local23.field11 = Test35Lib.local22;
Test35Lib.local23.field12 = Test35Lib.local17;
Test35Lib.local23.field1 = Test35Lib.local18;
Test35Lib.local23.field2 = Test35Lib.local20;
Test35Lib.local23.field3 = Test35Lib.local16;
Test35Lib.local23.field4 = Test35Lib.local13;
Test35Lib.local23.field5 = Test35Lib.local16;
Test35Lib.local23.field6 = Test35Lib.local22;
Test35Lib.local23.field7 = Test35Lib.local17;
Test35Lib.local23.field8 = Test35Lib.local8;
Test35Lib.local23.field9 = Test35Lib.local14;
Test35Lib.local15.field10.method13(Test35Lib.local14.field10,3);
Test35Lib.local20.field20=Test35Lib.local23.field20;
Test35Lib.local18.field14=Test35Lib.local5.field7;
Test35Lib.local17.field3.method10(Test35Lib.local16.field2,3);
for (int local41 = 0; local41<=3; local41 += 1) {
Test35Lib.local16.field2=Test35Lib.local21.field20.method23(Test35Lib.local9.field10,Test35Lib.local22.field20,3);
}
Test35Lib.local20.field8=Test35Lib.local23.field3;
for (int local42 = 0; local42<=1; local42 += 1) {
for (int local43 = 0; local43<=1; local43 += 1) {
for (int local44 = 0; local44<=0; local44 += 1) {
if (inputValue>=3) {
Test35Lib.local22=Test35Lib.local23.field23;
}
}
}
}
if (inputValue<=3) {
Test35Lib.local17.field1.method3(3);
}
Test35Lib.local22.method24(Test35Lib.local11.field10,3);
Test35Lib.local17.field13=Test35Lib.local15.field3;
Benchmark.test(1,Test35Lib.local1);
Benchmark.test(2,Test35Lib.local2);
Benchmark.test(3,Test35Lib.local3);
Benchmark.test(4,Test35Lib.local4);
Benchmark.test(5,Test35Lib.local5);
Benchmark.test(6,Test35Lib.local6);
Benchmark.test(7,Test35Lib.local7);
Benchmark.test(8,Test35Lib.local8);
Benchmark.test(9,Test35Lib.local9);
Benchmark.test(10,Test35Lib.local10);
Benchmark.test(11,Test35Lib.local11);
Benchmark.test(12,Test35Lib.local12);
Benchmark.test(13,Test35Lib.local13);
Benchmark.test(14,Test35Lib.local14);
Benchmark.test(15,Test35Lib.local15);
Benchmark.test(16,Test35Lib.local16);
Benchmark.test(17,Test35Lib.local17);
Benchmark.test(18,Test35Lib.local18);
Benchmark.test(19,Test35Lib.local19);
Benchmark.test(20,Test35Lib.local20);
Benchmark.test(21,Test35Lib.local21);
Benchmark.test(22,Test35Lib.local22);
Benchmark.test(23,Test35Lib.local23);
Benchmark.test(24,Test35Lib.local1.field1);
Benchmark.test(25,Test35Lib.local1.field2);
Benchmark.test(26,Test35Lib.local1.field3);
Benchmark.test(27,Test35Lib.local1.field4);
Benchmark.test(28,Test35Lib.local1.field5);
Benchmark.test(29,Test35Lib.local1.field6);
Benchmark.test(30,Test35Lib.local1.field7);
Benchmark.test(31,Test35Lib.local1.field8);
Benchmark.test(32,Test35Lib.local1.field9);
Benchmark.test(33,Test35Lib.local2.field1);
Benchmark.test(34,Test35Lib.local2.field2);
Benchmark.test(35,Test35Lib.local2.field3);
Benchmark.test(36,Test35Lib.local2.field4);
Benchmark.test(37,Test35Lib.local2.field5);
Benchmark.test(38,Test35Lib.local2.field6);
Benchmark.test(39,Test35Lib.local2.field7);
Benchmark.test(40,Test35Lib.local2.field8);
Benchmark.test(41,Test35Lib.local2.field9);
Benchmark.test(42,Test35Lib.local3.field1);
Benchmark.test(43,Test35Lib.local3.field2);
Benchmark.test(44,Test35Lib.local3.field3);
Benchmark.test(45,Test35Lib.local3.field4);
Benchmark.test(46,Test35Lib.local3.field5);
Benchmark.test(47,Test35Lib.local3.field6);
Benchmark.test(48,Test35Lib.local3.field7);
Benchmark.test(49,Test35Lib.local3.field8);
Benchmark.test(50,Test35Lib.local3.field9);
Benchmark.test(51,Test35Lib.local4.field1);
Benchmark.test(52,Test35Lib.local4.field2);
Benchmark.test(53,Test35Lib.local4.field3);
Benchmark.test(54,Test35Lib.local4.field4);
Benchmark.test(55,Test35Lib.local4.field5);
Benchmark.test(56,Test35Lib.local4.field6);
Benchmark.test(57,Test35Lib.local4.field7);
Benchmark.test(58,Test35Lib.local4.field8);
Benchmark.test(59,Test35Lib.local4.field9);
Benchmark.test(60,Test35Lib.local5.field1);
Benchmark.test(61,Test35Lib.local5.field2);
Benchmark.test(62,Test35Lib.local5.field3);
Benchmark.test(63,Test35Lib.local5.field4);
Benchmark.test(64,Test35Lib.local5.field5);
Benchmark.test(65,Test35Lib.local5.field6);
Benchmark.test(66,Test35Lib.local5.field7);
Benchmark.test(67,Test35Lib.local5.field8);
Benchmark.test(68,Test35Lib.local5.field9);
Benchmark.test(69,Test35Lib.local6.field1);
Benchmark.test(70,Test35Lib.local6.field2);
Benchmark.test(71,Test35Lib.local6.field3);
Benchmark.test(72,Test35Lib.local6.field4);
Benchmark.test(73,Test35Lib.local6.field5);
Benchmark.test(74,Test35Lib.local6.field6);
Benchmark.test(75,Test35Lib.local6.field7);
Benchmark.test(76,Test35Lib.local6.field8);
Benchmark.test(77,Test35Lib.local6.field9);
Benchmark.test(78,Test35Lib.local7.field1);
Benchmark.test(79,Test35Lib.local7.field2);
Benchmark.test(80,Test35Lib.local7.field3);
Benchmark.test(81,Test35Lib.local7.field4);
Benchmark.test(82,Test35Lib.local7.field5);
Benchmark.test(83,Test35Lib.local7.field6);
Benchmark.test(84,Test35Lib.local7.field7);
Benchmark.test(85,Test35Lib.local7.field8);
Benchmark.test(86,Test35Lib.local7.field9);
Benchmark.test(87,Test35Lib.local8.field10);
Benchmark.test(88,Test35Lib.local8.field11);
Benchmark.test(89,Test35Lib.local8.field12);
Benchmark.test(90,Test35Lib.local8.field1);
Benchmark.test(91,Test35Lib.local8.field2);
Benchmark.test(92,Test35Lib.local8.field3);
Benchmark.test(93,Test35Lib.local8.field4);
Benchmark.test(94,Test35Lib.local8.field5);
Benchmark.test(95,Test35Lib.local8.field6);
Benchmark.test(96,Test35Lib.local8.field7);
Benchmark.test(97,Test35Lib.local8.field8);
Benchmark.test(98,Test35Lib.local8.field9);
Benchmark.test(99,Test35Lib.local9.field13);
Benchmark.test(100,Test35Lib.local9.field14);
Benchmark.test(101,Test35Lib.local9.field15);
Benchmark.test(102,Test35Lib.local9.field10);
Benchmark.test(103,Test35Lib.local9.field11);
Benchmark.test(104,Test35Lib.local9.field12);
Benchmark.test(105,Test35Lib.local9.field1);
Benchmark.test(106,Test35Lib.local9.field2);
Benchmark.test(107,Test35Lib.local9.field3);
Benchmark.test(108,Test35Lib.local9.field4);
Benchmark.test(109,Test35Lib.local9.field5);
Benchmark.test(110,Test35Lib.local9.field6);
Benchmark.test(111,Test35Lib.local9.field7);
Benchmark.test(112,Test35Lib.local9.field8);
Benchmark.test(113,Test35Lib.local9.field9);
Benchmark.test(114,Test35Lib.local10.field13);
Benchmark.test(115,Test35Lib.local10.field14);
Benchmark.test(116,Test35Lib.local10.field15);
Benchmark.test(117,Test35Lib.local10.field10);
Benchmark.test(118,Test35Lib.local10.field11);
Benchmark.test(119,Test35Lib.local10.field12);
Benchmark.test(120,Test35Lib.local10.field1);
Benchmark.test(121,Test35Lib.local10.field2);
Benchmark.test(122,Test35Lib.local10.field3);
Benchmark.test(123,Test35Lib.local10.field4);
Benchmark.test(124,Test35Lib.local10.field5);
Benchmark.test(125,Test35Lib.local10.field6);
Benchmark.test(126,Test35Lib.local10.field7);
Benchmark.test(127,Test35Lib.local10.field8);
Benchmark.test(128,Test35Lib.local10.field9);
Benchmark.test(129,Test35Lib.local11.field13);
Benchmark.test(130,Test35Lib.local11.field14);
Benchmark.test(131,Test35Lib.local11.field15);
Benchmark.test(132,Test35Lib.local11.field10);
Benchmark.test(133,Test35Lib.local11.field11);
Benchmark.test(134,Test35Lib.local11.field12);
Benchmark.test(135,Test35Lib.local11.field1);
Benchmark.test(136,Test35Lib.local11.field2);
Benchmark.test(137,Test35Lib.local11.field3);
Benchmark.test(138,Test35Lib.local11.field4);
Benchmark.test(139,Test35Lib.local11.field5);
Benchmark.test(140,Test35Lib.local11.field6);
Benchmark.test(141,Test35Lib.local11.field7);
Benchmark.test(142,Test35Lib.local11.field8);
Benchmark.test(143,Test35Lib.local11.field9);
Benchmark.test(144,Test35Lib.local12.field13);
Benchmark.test(145,Test35Lib.local12.field14);
Benchmark.test(146,Test35Lib.local12.field15);
Benchmark.test(147,Test35Lib.local12.field10);
Benchmark.test(148,Test35Lib.local12.field11);
Benchmark.test(149,Test35Lib.local12.field12);
Benchmark.test(150,Test35Lib.local12.field1);
Benchmark.test(151,Test35Lib.local12.field2);
Benchmark.test(152,Test35Lib.local12.field3);
Benchmark.test(153,Test35Lib.local12.field4);
Benchmark.test(154,Test35Lib.local12.field5);
Benchmark.test(155,Test35Lib.local12.field6);
Benchmark.test(156,Test35Lib.local12.field7);
Benchmark.test(157,Test35Lib.local12.field8);
Benchmark.test(158,Test35Lib.local12.field9);
Benchmark.test(159,Test35Lib.local13.field13);
Benchmark.test(160,Test35Lib.local13.field14);
Benchmark.test(161,Test35Lib.local13.field15);
Benchmark.test(162,Test35Lib.local13.field10);
Benchmark.test(163,Test35Lib.local13.field11);
Benchmark.test(164,Test35Lib.local13.field12);
Benchmark.test(165,Test35Lib.local13.field1);
Benchmark.test(166,Test35Lib.local13.field2);
Benchmark.test(167,Test35Lib.local13.field3);
Benchmark.test(168,Test35Lib.local13.field4);
Benchmark.test(169,Test35Lib.local13.field5);
Benchmark.test(170,Test35Lib.local13.field6);
Benchmark.test(171,Test35Lib.local13.field7);
Benchmark.test(172,Test35Lib.local13.field8);
Benchmark.test(173,Test35Lib.local13.field9);
Benchmark.test(174,Test35Lib.local14.field13);
Benchmark.test(175,Test35Lib.local14.field14);
Benchmark.test(176,Test35Lib.local14.field15);
Benchmark.test(177,Test35Lib.local14.field10);
Benchmark.test(178,Test35Lib.local14.field11);
Benchmark.test(179,Test35Lib.local14.field12);
Benchmark.test(180,Test35Lib.local14.field1);
Benchmark.test(181,Test35Lib.local14.field2);
Benchmark.test(182,Test35Lib.local14.field3);
Benchmark.test(183,Test35Lib.local14.field4);
Benchmark.test(184,Test35Lib.local14.field5);
Benchmark.test(185,Test35Lib.local14.field6);
Benchmark.test(186,Test35Lib.local14.field7);
Benchmark.test(187,Test35Lib.local14.field8);
Benchmark.test(188,Test35Lib.local14.field9);
Benchmark.test(189,Test35Lib.local15.field16);
Benchmark.test(190,Test35Lib.local15.field17);
Benchmark.test(191,Test35Lib.local15.field18);
Benchmark.test(192,Test35Lib.local15.field19);
Benchmark.test(193,Test35Lib.local15.field13);
Benchmark.test(194,Test35Lib.local15.field14);
Benchmark.test(195,Test35Lib.local15.field15);
Benchmark.test(196,Test35Lib.local15.field10);
Benchmark.test(197,Test35Lib.local15.field11);
Benchmark.test(198,Test35Lib.local15.field12);
Benchmark.test(199,Test35Lib.local15.field1);
Benchmark.test(200,Test35Lib.local15.field2);
Benchmark.test(201,Test35Lib.local15.field3);
Benchmark.test(202,Test35Lib.local15.field4);
Benchmark.test(203,Test35Lib.local15.field5);
Benchmark.test(204,Test35Lib.local15.field6);
Benchmark.test(205,Test35Lib.local15.field7);
Benchmark.test(206,Test35Lib.local15.field8);
Benchmark.test(207,Test35Lib.local15.field9);
Benchmark.test(208,Test35Lib.local16.field16);
Benchmark.test(209,Test35Lib.local16.field17);
Benchmark.test(210,Test35Lib.local16.field18);
Benchmark.test(211,Test35Lib.local16.field19);
Benchmark.test(212,Test35Lib.local16.field13);
Benchmark.test(213,Test35Lib.local16.field14);
Benchmark.test(214,Test35Lib.local16.field15);
Benchmark.test(215,Test35Lib.local16.field10);
Benchmark.test(216,Test35Lib.local16.field11);
Benchmark.test(217,Test35Lib.local16.field12);
Benchmark.test(218,Test35Lib.local16.field1);
Benchmark.test(219,Test35Lib.local16.field2);
Benchmark.test(220,Test35Lib.local16.field3);
Benchmark.test(221,Test35Lib.local16.field4);
Benchmark.test(222,Test35Lib.local16.field5);
Benchmark.test(223,Test35Lib.local16.field6);
Benchmark.test(224,Test35Lib.local16.field7);
Benchmark.test(225,Test35Lib.local16.field8);
Benchmark.test(226,Test35Lib.local16.field9);
Benchmark.test(227,Test35Lib.local17.field16);
Benchmark.test(228,Test35Lib.local17.field17);
Benchmark.test(229,Test35Lib.local17.field18);
Benchmark.test(230,Test35Lib.local17.field19);
Benchmark.test(231,Test35Lib.local17.field13);
Benchmark.test(232,Test35Lib.local17.field14);
Benchmark.test(233,Test35Lib.local17.field15);
Benchmark.test(234,Test35Lib.local17.field10);
Benchmark.test(235,Test35Lib.local17.field11);
Benchmark.test(236,Test35Lib.local17.field12);
Benchmark.test(237,Test35Lib.local17.field1);
Benchmark.test(238,Test35Lib.local17.field2);
Benchmark.test(239,Test35Lib.local17.field3);
Benchmark.test(240,Test35Lib.local17.field4);
Benchmark.test(241,Test35Lib.local17.field5);
Benchmark.test(242,Test35Lib.local17.field6);
Benchmark.test(243,Test35Lib.local17.field7);
Benchmark.test(244,Test35Lib.local17.field8);
Benchmark.test(245,Test35Lib.local17.field9);
Benchmark.test(246,Test35Lib.local18.field20);
Benchmark.test(247,Test35Lib.local18.field21);
Benchmark.test(248,Test35Lib.local18.field22);
Benchmark.test(249,Test35Lib.local18.field23);
Benchmark.test(250,Test35Lib.local18.field24);
Benchmark.test(251,Test35Lib.local18.field25);
Benchmark.test(252,Test35Lib.local18.field26);
Benchmark.test(253,Test35Lib.local18.field27);
Benchmark.test(254,Test35Lib.local18.field28);
Benchmark.test(255,Test35Lib.local18.field29);
Benchmark.test(256,Test35Lib.local18.field13);
Benchmark.test(257,Test35Lib.local18.field14);
Benchmark.test(258,Test35Lib.local18.field15);
Benchmark.test(259,Test35Lib.local18.field10);
Benchmark.test(260,Test35Lib.local18.field11);
Benchmark.test(261,Test35Lib.local18.field12);
Benchmark.test(262,Test35Lib.local18.field1);
Benchmark.test(263,Test35Lib.local18.field2);
Benchmark.test(264,Test35Lib.local18.field3);
Benchmark.test(265,Test35Lib.local18.field4);
Benchmark.test(266,Test35Lib.local18.field5);
Benchmark.test(267,Test35Lib.local18.field6);
Benchmark.test(268,Test35Lib.local18.field7);
Benchmark.test(269,Test35Lib.local18.field8);
Benchmark.test(270,Test35Lib.local18.field9);
Benchmark.test(271,Test35Lib.local19.field20);
Benchmark.test(272,Test35Lib.local19.field21);
Benchmark.test(273,Test35Lib.local19.field22);
Benchmark.test(274,Test35Lib.local19.field23);
Benchmark.test(275,Test35Lib.local19.field24);
Benchmark.test(276,Test35Lib.local19.field25);
Benchmark.test(277,Test35Lib.local19.field26);
Benchmark.test(278,Test35Lib.local19.field27);
Benchmark.test(279,Test35Lib.local19.field28);
Benchmark.test(280,Test35Lib.local19.field29);
Benchmark.test(281,Test35Lib.local19.field13);
Benchmark.test(282,Test35Lib.local19.field14);
Benchmark.test(283,Test35Lib.local19.field15);
Benchmark.test(284,Test35Lib.local19.field10);
Benchmark.test(285,Test35Lib.local19.field11);
Benchmark.test(286,Test35Lib.local19.field12);
Benchmark.test(287,Test35Lib.local19.field1);
Benchmark.test(288,Test35Lib.local19.field2);
Benchmark.test(289,Test35Lib.local19.field3);
Benchmark.test(290,Test35Lib.local19.field4);
Benchmark.test(291,Test35Lib.local19.field5);
Benchmark.test(292,Test35Lib.local19.field6);
Benchmark.test(293,Test35Lib.local19.field7);
Benchmark.test(294,Test35Lib.local19.field8);
Benchmark.test(295,Test35Lib.local19.field9);
Benchmark.test(296,Test35Lib.local20.field20);
Benchmark.test(297,Test35Lib.local20.field21);
Benchmark.test(298,Test35Lib.local20.field22);
Benchmark.test(299,Test35Lib.local20.field23);
Benchmark.test(300,Test35Lib.local20.field24);
Benchmark.test(301,Test35Lib.local20.field25);
Benchmark.test(302,Test35Lib.local20.field26);
Benchmark.test(303,Test35Lib.local20.field27);
Benchmark.test(304,Test35Lib.local20.field28);
Benchmark.test(305,Test35Lib.local20.field29);
Benchmark.test(306,Test35Lib.local20.field13);
Benchmark.test(307,Test35Lib.local20.field14);
Benchmark.test(308,Test35Lib.local20.field15);
Benchmark.test(309,Test35Lib.local20.field10);
Benchmark.test(310,Test35Lib.local20.field11);
Benchmark.test(311,Test35Lib.local20.field12);
Benchmark.test(312,Test35Lib.local20.field1);
Benchmark.test(313,Test35Lib.local20.field2);
Benchmark.test(314,Test35Lib.local20.field3);
Benchmark.test(315,Test35Lib.local20.field4);
Benchmark.test(316,Test35Lib.local20.field5);
Benchmark.test(317,Test35Lib.local20.field6);
Benchmark.test(318,Test35Lib.local20.field7);
Benchmark.test(319,Test35Lib.local20.field8);
Benchmark.test(320,Test35Lib.local20.field9);
Benchmark.test(321,Test35Lib.local21.field20);
Benchmark.test(322,Test35Lib.local21.field21);
Benchmark.test(323,Test35Lib.local21.field22);
Benchmark.test(324,Test35Lib.local21.field23);
Benchmark.test(325,Test35Lib.local21.field24);
Benchmark.test(326,Test35Lib.local21.field25);
Benchmark.test(327,Test35Lib.local21.field26);
Benchmark.test(328,Test35Lib.local21.field27);
Benchmark.test(329,Test35Lib.local21.field28);
Benchmark.test(330,Test35Lib.local21.field29);
Benchmark.test(331,Test35Lib.local21.field13);
Benchmark.test(332,Test35Lib.local21.field14);
Benchmark.test(333,Test35Lib.local21.field15);
Benchmark.test(334,Test35Lib.local21.field10);
Benchmark.test(335,Test35Lib.local21.field11);
Benchmark.test(336,Test35Lib.local21.field12);
Benchmark.test(337,Test35Lib.local21.field1);
Benchmark.test(338,Test35Lib.local21.field2);
Benchmark.test(339,Test35Lib.local21.field3);
Benchmark.test(340,Test35Lib.local21.field4);
Benchmark.test(341,Test35Lib.local21.field5);
Benchmark.test(342,Test35Lib.local21.field6);
Benchmark.test(343,Test35Lib.local21.field7);
Benchmark.test(344,Test35Lib.local21.field8);
Benchmark.test(345,Test35Lib.local21.field9);
Benchmark.test(346,Test35Lib.local22.field20);
Benchmark.test(347,Test35Lib.local22.field21);
Benchmark.test(348,Test35Lib.local22.field22);
Benchmark.test(349,Test35Lib.local22.field23);
Benchmark.test(350,Test35Lib.local22.field24);
Benchmark.test(351,Test35Lib.local22.field25);
Benchmark.test(352,Test35Lib.local22.field26);
Benchmark.test(353,Test35Lib.local22.field27);
Benchmark.test(354,Test35Lib.local22.field28);
Benchmark.test(355,Test35Lib.local22.field29);
Benchmark.test(356,Test35Lib.local22.field13);
Benchmark.test(357,Test35Lib.local22.field14);
Benchmark.test(358,Test35Lib.local22.field15);
Benchmark.test(359,Test35Lib.local22.field10);
Benchmark.test(360,Test35Lib.local22.field11);
Benchmark.test(361,Test35Lib.local22.field12);
Benchmark.test(362,Test35Lib.local22.field1);
Benchmark.test(363,Test35Lib.local22.field2);
Benchmark.test(364,Test35Lib.local22.field3);
Benchmark.test(365,Test35Lib.local22.field4);
Benchmark.test(366,Test35Lib.local22.field5);
Benchmark.test(367,Test35Lib.local22.field6);
Benchmark.test(368,Test35Lib.local22.field7);
Benchmark.test(369,Test35Lib.local22.field8);
Benchmark.test(370,Test35Lib.local22.field9);
Benchmark.test(371,Test35Lib.local23.field20);
Benchmark.test(372,Test35Lib.local23.field21);
Benchmark.test(373,Test35Lib.local23.field22);
Benchmark.test(374,Test35Lib.local23.field23);
Benchmark.test(375,Test35Lib.local23.field24);
Benchmark.test(376,Test35Lib.local23.field25);
Benchmark.test(377,Test35Lib.local23.field26);
Benchmark.test(378,Test35Lib.local23.field27);
Benchmark.test(379,Test35Lib.local23.field28);
Benchmark.test(380,Test35Lib.local23.field29);
Benchmark.test(381,Test35Lib.local23.field13);
Benchmark.test(382,Test35Lib.local23.field14);
Benchmark.test(383,Test35Lib.local23.field15);
Benchmark.test(384,Test35Lib.local23.field10);
Benchmark.test(385,Test35Lib.local23.field11);
Benchmark.test(386,Test35Lib.local23.field12);
Benchmark.test(387,Test35Lib.local23.field1);
Benchmark.test(388,Test35Lib.local23.field2);
Benchmark.test(389,Test35Lib.local23.field3);
Benchmark.test(390,Test35Lib.local23.field4);
Benchmark.test(391,Test35Lib.local23.field5);
Benchmark.test(392,Test35Lib.local23.field6);
Benchmark.test(393,Test35Lib.local23.field7);
Benchmark.test(394,Test35Lib.local23.field8);
Benchmark.test(395,Test35Lib.local23.field9);
Benchmark.print();
}
}
