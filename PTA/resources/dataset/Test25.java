package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test25Lib{
public static Test25Class1 local1;
public static Test25Class2 local2;
public static Test25Class2 local3;
public static Test25Class2 local4;
public static Test25Class2 local5;
public static Test25Class2 local6;
public static Test25Class2 local7;
public static Test25Class2 local8;
public static Test25Class2 local9;
public static Test25Class2 local10;
public static Test25Class3 local11;
public static Test25Class3 local12;
public static Test25Class3 local13;
public static Test25Class3 local14;
public static Test25Class3 local15;
public static Test25Class3 local16;
public static Test25Class3 local17;
public static Test25Class3 local18;
public static Test25Class4 local19;
public static Test25Class4 local20;
public static Test25Class4 local21;
public static Test25Class4 local22;
public static Test25Class4 local23;
public static Test25Class4 local24;
public static Test25Class4 local25;
public static Test25Class4 local26;
public static Test25Class5 local27;
public static Test25Class5 local28;
public static Test25Class5 local29;
public static Test25Class5 local30;
}
class Test25Class1 extends BasicClass {
public static Test25Class2 field1;
public Test25Class4 field2;
public Test25Class3 field3;
public static Test25Class5 field4;
public static void method1(Test25Class2 arg0, Test25Class2 arg1, int depth) {
if (depth == 0) return;
}
public void method2(int depth) {
if (depth == 0) return;
}
}
class Test25Class2 extends Test25Class1 {
public static Test25Class3 field5;
public Test25Class3 field6;
public static Test25Class5 field7;
public static Test25Class2 field8;
public void method3(int depth) {
if (depth == 0) return;
if (depth>2) {
if (depth>2) {
if (depth>3) {
for (int local31 = 0; local31<=2; local31 += 1) {
if (depth<=3) {
}
}
}
}else {
this.field6=this.field2.method7(this.field2,depth-1);
}
}else {
for (int local32 = 0; local32<=3; local32 += 1) {
for (int local33 = 0; local33<=3; local33 += 1) {
for (int local34 = 0; local34<=1; local34 += 1) {
if (depth>1) {
}else {
}
}
}
}
}
this.field4.method9(this.field7,depth-1);
for (int local35 = 0; local35<=3; local35 += 1) {
this.field7=this.field7;
}
this.field2.method8(this.field3,this.field2,depth-1);
for (int local36 = 0; local36<=2; local36 += 1) {
if (depth==4) {
if (depth<=2) {
this.field8=this.field7;
}else {
if (depth<=2) {
if (depth>=1) {
}else {
}
}
}
}else {
if (depth>2) {
for (int local37 = 0; local37<=1; local37 += 1) {
if (depth>2) {
}
}
}
}
}
}
}
class Test25Class3 extends Test25Class1 {
public static Test25Class5 field9;
public static Test25Class5 method4(Test25Class4 arg0, int depth) {
if (depth == 0) return Test25Lib.local27;
field4.field3.method4(field4.field2,depth-1);
field9.field2=field1.field2;
field9.field11=field9;
arg0.field2.method8(field9.field3,field9.field2,depth-1);
field9.field4.method2(depth-1);
return field4.field7;
}
public Test25Class1 method5(Test25Class2 arg0, Test25Class3 arg1, int depth) {
if (depth == 0) return Test25Lib.local9;
for (int local38 = 0; local38<=2; local38 += 1) {
if (depth>1) {
arg0.field4.method2(depth-1);
}else {
this.field2=arg1.field2;
}
}
arg0.field5.method5(arg1.field1,this.field3,depth-1);
arg0.field1.method2(depth-1);
arg0.field3=arg0.field5;
for (int local39 = 0; local39<=1; local39 += 1) {
arg0.field4.method3(depth-1);
}
return arg1.field2;
}
}
class Test25Class4 extends Test25Class1 {
public Test25Class5 field10;
public static Test25Class4 method6(Test25Class4 arg0, Test25Class2 arg1, int depth) {
if (depth == 0) return Test25Lib.local24;
for (int local40 = 0; local40<=1; local40 += 1) {
if (depth<2) {
arg0.method8(field4.field3,arg0,depth-1);
}else {
if (depth<3) {
for (int local41 = 0; local41<=0; local41 += 1) {
for (int local42 = 0; local42<=3; local42 += 1) {
}
}
}else {
field1.field2=field4.field2;
}
}
}
for (int local43 = 0; local43<=3; local43 += 1) {
for (int local44 = 0; local44<=1; local44 += 1) {
field4.field4.method9(arg0.field4,depth-1);
}
}
field1.field3=arg1.field3;
arg0.field4.method2(depth-1);
for (int local45 = 0; local45<=1; local45 += 1) {
for (int local46 = 0; local46<=1; local46 += 1) {
for (int local47 = 0; local47<=2; local47 += 1) {
if (depth<=4) {
arg1.field4=field1.field4;
}else {
if (depth==1) {
}else {
}
}
}
}
}
field1.field2.method8(field4.field3,arg0,depth-1);
for (int local48 = 0; local48<=2; local48 += 1) {
for (int local49 = 0; local49<=2; local49 += 1) {
for (int local50 = 0; local50<=0; local50 += 1) {
for (int local51 = 0; local51<=1; local51 += 1) {
if (depth<=1) {
}
}
}
}
}
if (depth>1) {
arg1.field5.method5(field1.field8,field4.field5,depth-1);
}else {
field1.field3.method1(field1.field7,field1.field7,depth-1);
}
field1.field4.method9(arg0.field4,depth-1);
return arg0;
}
public static Test25Class3 method7(Test25Class4 arg0, int depth) {
if (depth == 0) return Test25Lib.local16;
for (int local52 = 0; local52<=0; local52 += 1) {
arg0.field2=field1.field2;
}
for (int local53 = 0; local53<=3; local53 += 1) {
field4.field4.method1(field1.field1,field4.field11,depth-1);
}
return field4.field6;
}
public static void method8(Test25Class3 arg0, Test25Class4 arg1, int depth) {
if (depth == 0) return;
arg0.method4(field1.field2,depth-1);
field1=field1.field6.method4(field1.field2,depth-1);
arg1.field10=arg1.field10;
field1=field1.field7;
for (int local54 = 0; local54<=1; local54 += 1) {
for (int local55 = 0; local55<=2; local55 += 1) {
for (int local56 = 0; local56<=0; local56 += 1) {
arg0.field1.method1(field4.field7,field4.field8,depth-1);
}
}
}
field4.field2=field4.field2;
arg0.field3.method1(arg0.field1,arg0.field9,depth-1);
if (depth==2) {
for (int local57 = 0; local57<=0; local57 += 1) {
field1.method3(depth-1);
}
}
}
}
class Test25Class5 extends Test25Class2 {
public static Test25Class2 field11;
public Test25Class3 field12;
public Test25Class2 field13;
public static void method9(Test25Class5 arg0, int depth) {
if (depth == 0) return;
if (depth>1) {
field8.field2.method6(field11.field2,field5.field4,depth-1);
}else {
field7.field2=field1.field2.method6(field11.field2,field11.field7,depth-1);
}
field8.field1=field7.field1;
if (depth>=2) {
field8.field7=arg0.field4;
}else {
for (int local58 = 0; local58<=0; local58 += 1) {
field1.field4.method9(field8.field7,depth-1);
}
}
field11.field6=field11.field5;
field11.field2.method6(field11.field2,field1.field1,depth-1);
field4.field12=field11.field6;
}
}
public class Test25{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test25Lib.local1 = new Test25Class1();
Benchmark.alloc(2);
Test25Lib.local2 = new Test25Class2();
Benchmark.alloc(3);
Test25Lib.local3 = new Test25Class2();
Benchmark.alloc(4);
Test25Lib.local4 = new Test25Class2();
Benchmark.alloc(5);
Test25Lib.local5 = new Test25Class2();
Benchmark.alloc(6);
Test25Lib.local6 = new Test25Class2();
Benchmark.alloc(7);
Test25Lib.local7 = new Test25Class2();
Benchmark.alloc(8);
Test25Lib.local8 = new Test25Class2();
Benchmark.alloc(9);
Test25Lib.local9 = new Test25Class2();
Benchmark.alloc(10);
Test25Lib.local10 = new Test25Class2();
Benchmark.alloc(11);
Test25Lib.local11 = new Test25Class3();
Benchmark.alloc(12);
Test25Lib.local12 = new Test25Class3();
Benchmark.alloc(13);
Test25Lib.local13 = new Test25Class3();
Benchmark.alloc(14);
Test25Lib.local14 = new Test25Class3();
Benchmark.alloc(15);
Test25Lib.local15 = new Test25Class3();
Benchmark.alloc(16);
Test25Lib.local16 = new Test25Class3();
Benchmark.alloc(17);
Test25Lib.local17 = new Test25Class3();
Benchmark.alloc(18);
Test25Lib.local18 = new Test25Class3();
Benchmark.alloc(19);
Test25Lib.local19 = new Test25Class4();
Benchmark.alloc(20);
Test25Lib.local20 = new Test25Class4();
Benchmark.alloc(21);
Test25Lib.local21 = new Test25Class4();
Benchmark.alloc(22);
Test25Lib.local22 = new Test25Class4();
Benchmark.alloc(23);
Test25Lib.local23 = new Test25Class4();
Benchmark.alloc(24);
Test25Lib.local24 = new Test25Class4();
Benchmark.alloc(25);
Test25Lib.local25 = new Test25Class4();
Benchmark.alloc(26);
Test25Lib.local26 = new Test25Class4();
Benchmark.alloc(27);
Test25Lib.local27 = new Test25Class5();
Benchmark.alloc(28);
Test25Lib.local28 = new Test25Class5();
Benchmark.alloc(29);
Test25Lib.local29 = new Test25Class5();
Benchmark.alloc(30);
Test25Lib.local30 = new Test25Class5();
Test25Lib.local1.field1 = Test25Lib.local7;
Test25Lib.local1.field2 = Test25Lib.local19;
Test25Lib.local1.field3 = Test25Lib.local17;
Test25Lib.local1.field4 = Test25Lib.local27;
Test25Lib.local2.field5 = Test25Lib.local14;
Test25Lib.local2.field6 = Test25Lib.local13;
Test25Lib.local2.field7 = Test25Lib.local27;
Test25Lib.local2.field8 = Test25Lib.local30;
Test25Lib.local2.field1 = Test25Lib.local4;
Test25Lib.local2.field2 = Test25Lib.local20;
Test25Lib.local2.field3 = Test25Lib.local17;
Test25Lib.local2.field4 = Test25Lib.local28;
Test25Lib.local3.field5 = Test25Lib.local12;
Test25Lib.local3.field6 = Test25Lib.local18;
Test25Lib.local3.field7 = Test25Lib.local27;
Test25Lib.local3.field8 = Test25Lib.local5;
Test25Lib.local3.field1 = Test25Lib.local29;
Test25Lib.local3.field2 = Test25Lib.local26;
Test25Lib.local3.field3 = Test25Lib.local18;
Test25Lib.local3.field4 = Test25Lib.local30;
Test25Lib.local4.field5 = Test25Lib.local14;
Test25Lib.local4.field6 = Test25Lib.local18;
Test25Lib.local4.field7 = Test25Lib.local30;
Test25Lib.local4.field8 = Test25Lib.local27;
Test25Lib.local4.field1 = Test25Lib.local9;
Test25Lib.local4.field2 = Test25Lib.local26;
Test25Lib.local4.field3 = Test25Lib.local12;
Test25Lib.local4.field4 = Test25Lib.local27;
Test25Lib.local5.field5 = Test25Lib.local15;
Test25Lib.local5.field6 = Test25Lib.local17;
Test25Lib.local5.field7 = Test25Lib.local29;
Test25Lib.local5.field8 = Test25Lib.local2;
Test25Lib.local5.field1 = Test25Lib.local28;
Test25Lib.local5.field2 = Test25Lib.local26;
Test25Lib.local5.field3 = Test25Lib.local16;
Test25Lib.local5.field4 = Test25Lib.local27;
Test25Lib.local6.field5 = Test25Lib.local17;
Test25Lib.local6.field6 = Test25Lib.local15;
Test25Lib.local6.field7 = Test25Lib.local29;
Test25Lib.local6.field8 = Test25Lib.local3;
Test25Lib.local6.field1 = Test25Lib.local8;
Test25Lib.local6.field2 = Test25Lib.local21;
Test25Lib.local6.field3 = Test25Lib.local17;
Test25Lib.local6.field4 = Test25Lib.local28;
Test25Lib.local7.field5 = Test25Lib.local18;
Test25Lib.local7.field6 = Test25Lib.local15;
Test25Lib.local7.field7 = Test25Lib.local27;
Test25Lib.local7.field8 = Test25Lib.local7;
Test25Lib.local7.field1 = Test25Lib.local3;
Test25Lib.local7.field2 = Test25Lib.local24;
Test25Lib.local7.field3 = Test25Lib.local12;
Test25Lib.local7.field4 = Test25Lib.local28;
Test25Lib.local8.field5 = Test25Lib.local15;
Test25Lib.local8.field6 = Test25Lib.local16;
Test25Lib.local8.field7 = Test25Lib.local30;
Test25Lib.local8.field8 = Test25Lib.local5;
Test25Lib.local8.field1 = Test25Lib.local9;
Test25Lib.local8.field2 = Test25Lib.local25;
Test25Lib.local8.field3 = Test25Lib.local12;
Test25Lib.local8.field4 = Test25Lib.local29;
Test25Lib.local9.field5 = Test25Lib.local13;
Test25Lib.local9.field6 = Test25Lib.local12;
Test25Lib.local9.field7 = Test25Lib.local29;
Test25Lib.local9.field8 = Test25Lib.local28;
Test25Lib.local9.field1 = Test25Lib.local7;
Test25Lib.local9.field2 = Test25Lib.local26;
Test25Lib.local9.field3 = Test25Lib.local16;
Test25Lib.local9.field4 = Test25Lib.local27;
Test25Lib.local10.field5 = Test25Lib.local12;
Test25Lib.local10.field6 = Test25Lib.local14;
Test25Lib.local10.field7 = Test25Lib.local27;
Test25Lib.local10.field8 = Test25Lib.local27;
Test25Lib.local10.field1 = Test25Lib.local2;
Test25Lib.local10.field2 = Test25Lib.local22;
Test25Lib.local10.field3 = Test25Lib.local17;
Test25Lib.local10.field4 = Test25Lib.local29;
Test25Lib.local11.field9 = Test25Lib.local27;
Test25Lib.local11.field1 = Test25Lib.local3;
Test25Lib.local11.field2 = Test25Lib.local22;
Test25Lib.local11.field3 = Test25Lib.local13;
Test25Lib.local11.field4 = Test25Lib.local28;
Test25Lib.local12.field9 = Test25Lib.local27;
Test25Lib.local12.field1 = Test25Lib.local8;
Test25Lib.local12.field2 = Test25Lib.local19;
Test25Lib.local12.field3 = Test25Lib.local15;
Test25Lib.local12.field4 = Test25Lib.local29;
Test25Lib.local13.field9 = Test25Lib.local28;
Test25Lib.local13.field1 = Test25Lib.local29;
Test25Lib.local13.field2 = Test25Lib.local21;
Test25Lib.local13.field3 = Test25Lib.local13;
Test25Lib.local13.field4 = Test25Lib.local29;
Test25Lib.local14.field9 = Test25Lib.local28;
Test25Lib.local14.field1 = Test25Lib.local7;
Test25Lib.local14.field2 = Test25Lib.local22;
Test25Lib.local14.field3 = Test25Lib.local16;
Test25Lib.local14.field4 = Test25Lib.local30;
Test25Lib.local15.field9 = Test25Lib.local29;
Test25Lib.local15.field1 = Test25Lib.local27;
Test25Lib.local15.field2 = Test25Lib.local23;
Test25Lib.local15.field3 = Test25Lib.local18;
Test25Lib.local15.field4 = Test25Lib.local27;
Test25Lib.local16.field9 = Test25Lib.local27;
Test25Lib.local16.field1 = Test25Lib.local2;
Test25Lib.local16.field2 = Test25Lib.local20;
Test25Lib.local16.field3 = Test25Lib.local17;
Test25Lib.local16.field4 = Test25Lib.local28;
Test25Lib.local17.field9 = Test25Lib.local29;
Test25Lib.local17.field1 = Test25Lib.local9;
Test25Lib.local17.field2 = Test25Lib.local24;
Test25Lib.local17.field3 = Test25Lib.local14;
Test25Lib.local17.field4 = Test25Lib.local27;
Test25Lib.local18.field9 = Test25Lib.local28;
Test25Lib.local18.field1 = Test25Lib.local6;
Test25Lib.local18.field2 = Test25Lib.local22;
Test25Lib.local18.field3 = Test25Lib.local16;
Test25Lib.local18.field4 = Test25Lib.local27;
Test25Lib.local19.field10 = Test25Lib.local30;
Test25Lib.local19.field1 = Test25Lib.local5;
Test25Lib.local19.field2 = Test25Lib.local19;
Test25Lib.local19.field3 = Test25Lib.local12;
Test25Lib.local19.field4 = Test25Lib.local28;
Test25Lib.local20.field10 = Test25Lib.local30;
Test25Lib.local20.field1 = Test25Lib.local29;
Test25Lib.local20.field2 = Test25Lib.local21;
Test25Lib.local20.field3 = Test25Lib.local18;
Test25Lib.local20.field4 = Test25Lib.local28;
Test25Lib.local21.field10 = Test25Lib.local28;
Test25Lib.local21.field1 = Test25Lib.local29;
Test25Lib.local21.field2 = Test25Lib.local24;
Test25Lib.local21.field3 = Test25Lib.local14;
Test25Lib.local21.field4 = Test25Lib.local29;
Test25Lib.local22.field10 = Test25Lib.local30;
Test25Lib.local22.field1 = Test25Lib.local6;
Test25Lib.local22.field2 = Test25Lib.local25;
Test25Lib.local22.field3 = Test25Lib.local13;
Test25Lib.local22.field4 = Test25Lib.local29;
Test25Lib.local23.field10 = Test25Lib.local29;
Test25Lib.local23.field1 = Test25Lib.local4;
Test25Lib.local23.field2 = Test25Lib.local23;
Test25Lib.local23.field3 = Test25Lib.local18;
Test25Lib.local23.field4 = Test25Lib.local29;
Test25Lib.local24.field10 = Test25Lib.local28;
Test25Lib.local24.field1 = Test25Lib.local27;
Test25Lib.local24.field2 = Test25Lib.local23;
Test25Lib.local24.field3 = Test25Lib.local11;
Test25Lib.local24.field4 = Test25Lib.local28;
Test25Lib.local25.field10 = Test25Lib.local30;
Test25Lib.local25.field1 = Test25Lib.local27;
Test25Lib.local25.field2 = Test25Lib.local21;
Test25Lib.local25.field3 = Test25Lib.local17;
Test25Lib.local25.field4 = Test25Lib.local30;
Test25Lib.local26.field10 = Test25Lib.local30;
Test25Lib.local26.field1 = Test25Lib.local27;
Test25Lib.local26.field2 = Test25Lib.local19;
Test25Lib.local26.field3 = Test25Lib.local13;
Test25Lib.local26.field4 = Test25Lib.local28;
Test25Lib.local27.field11 = Test25Lib.local5;
Test25Lib.local27.field12 = Test25Lib.local12;
Test25Lib.local27.field13 = Test25Lib.local9;
Test25Lib.local27.field5 = Test25Lib.local14;
Test25Lib.local27.field6 = Test25Lib.local12;
Test25Lib.local27.field7 = Test25Lib.local28;
Test25Lib.local27.field8 = Test25Lib.local7;
Test25Lib.local27.field1 = Test25Lib.local29;
Test25Lib.local27.field2 = Test25Lib.local26;
Test25Lib.local27.field3 = Test25Lib.local17;
Test25Lib.local27.field4 = Test25Lib.local28;
Test25Lib.local28.field11 = Test25Lib.local8;
Test25Lib.local28.field12 = Test25Lib.local15;
Test25Lib.local28.field13 = Test25Lib.local5;
Test25Lib.local28.field5 = Test25Lib.local12;
Test25Lib.local28.field6 = Test25Lib.local18;
Test25Lib.local28.field7 = Test25Lib.local28;
Test25Lib.local28.field8 = Test25Lib.local4;
Test25Lib.local28.field1 = Test25Lib.local8;
Test25Lib.local28.field2 = Test25Lib.local23;
Test25Lib.local28.field3 = Test25Lib.local11;
Test25Lib.local28.field4 = Test25Lib.local28;
Test25Lib.local29.field11 = Test25Lib.local2;
Test25Lib.local29.field12 = Test25Lib.local16;
Test25Lib.local29.field13 = Test25Lib.local10;
Test25Lib.local29.field5 = Test25Lib.local17;
Test25Lib.local29.field6 = Test25Lib.local15;
Test25Lib.local29.field7 = Test25Lib.local29;
Test25Lib.local29.field8 = Test25Lib.local3;
Test25Lib.local29.field1 = Test25Lib.local8;
Test25Lib.local29.field2 = Test25Lib.local25;
Test25Lib.local29.field3 = Test25Lib.local15;
Test25Lib.local29.field4 = Test25Lib.local28;
Test25Lib.local30.field11 = Test25Lib.local8;
Test25Lib.local30.field12 = Test25Lib.local13;
Test25Lib.local30.field13 = Test25Lib.local30;
Test25Lib.local30.field5 = Test25Lib.local18;
Test25Lib.local30.field6 = Test25Lib.local13;
Test25Lib.local30.field7 = Test25Lib.local27;
Test25Lib.local30.field8 = Test25Lib.local8;
Test25Lib.local30.field1 = Test25Lib.local27;
Test25Lib.local30.field2 = Test25Lib.local24;
Test25Lib.local30.field3 = Test25Lib.local18;
Test25Lib.local30.field4 = Test25Lib.local28;
for (int local59 = 0; local59<=2; local59 += 1) {
if (inputValue<=1) {
Test25Lib.local4.field4=Test25Lib.local1.field4;
}else {
if (inputValue<=3) {
if (inputValue<2) {
Test25Lib.local28.field12.method4(Test25Lib.local19,3);
}else {
Test25Lib.local1=Test25Lib.local28.field13;
}
}
}
}
if (inputValue>2) {
Test25Lib.local2.field4.method3(3);
}else {
if (inputValue<=2) {
Test25Lib.local6.field6.method4(Test25Lib.local17.field2,3);
}else {
Test25Lib.local26.field4=Test25Lib.local5.field7;
}
}
Test25Lib.local25.field1=Test25Lib.local14.field9;
Test25Lib.local24.field2.method8(Test25Lib.local18,Test25Lib.local19,3);
Test25Lib.local1=Test25Lib.local6.field8;
for (int local60 = 0; local60<=0; local60 += 1) {
Test25Lib.local7.field2=Test25Lib.local14.field2;
}
Test25Lib.local3.field2.method8(Test25Lib.local6.field3,Test25Lib.local10.field2,3);
if (inputValue==3) {
Test25Lib.local12=Test25Lib.local12.field2.method7(Test25Lib.local11.field2,3);
}else {
Test25Lib.local12.field4=Test25Lib.local3.field7;
}
if (inputValue>=1) {
if (inputValue<=1) {
Test25Lib.local28.field2=Test25Lib.local10.field2;
}else {
for (int local61 = 0; local61<=0; local61 += 1) {
Test25Lib.local3=Test25Lib.local25.field1;
}
}
}else {
if (inputValue>1) {
if (inputValue<1) {
Test25Lib.local1=Test25Lib.local10.field8;
}
}else {
if (inputValue>4) {
Test25Lib.local24=Test25Lib.local20;
}
}
}
for (int local62 = 0; local62<=0; local62 += 1) {
Test25Lib.local1=Test25Lib.local29.field1;
}
Benchmark.test(1,Test25Lib.local1);
Benchmark.test(2,Test25Lib.local2);
Benchmark.test(3,Test25Lib.local3);
Benchmark.test(4,Test25Lib.local4);
Benchmark.test(5,Test25Lib.local5);
Benchmark.test(6,Test25Lib.local6);
Benchmark.test(7,Test25Lib.local7);
Benchmark.test(8,Test25Lib.local8);
Benchmark.test(9,Test25Lib.local9);
Benchmark.test(10,Test25Lib.local10);
Benchmark.test(11,Test25Lib.local11);
Benchmark.test(12,Test25Lib.local12);
Benchmark.test(13,Test25Lib.local13);
Benchmark.test(14,Test25Lib.local14);
Benchmark.test(15,Test25Lib.local15);
Benchmark.test(16,Test25Lib.local16);
Benchmark.test(17,Test25Lib.local17);
Benchmark.test(18,Test25Lib.local18);
Benchmark.test(19,Test25Lib.local19);
Benchmark.test(20,Test25Lib.local20);
Benchmark.test(21,Test25Lib.local21);
Benchmark.test(22,Test25Lib.local22);
Benchmark.test(23,Test25Lib.local23);
Benchmark.test(24,Test25Lib.local24);
Benchmark.test(25,Test25Lib.local25);
Benchmark.test(26,Test25Lib.local26);
Benchmark.test(27,Test25Lib.local27);
Benchmark.test(28,Test25Lib.local28);
Benchmark.test(29,Test25Lib.local29);
Benchmark.test(30,Test25Lib.local30);
Benchmark.test(31,Test25Lib.local1.field1);
Benchmark.test(32,Test25Lib.local1.field2);
Benchmark.test(33,Test25Lib.local1.field3);
Benchmark.test(34,Test25Lib.local1.field4);
Benchmark.test(35,Test25Lib.local2.field5);
Benchmark.test(36,Test25Lib.local2.field6);
Benchmark.test(37,Test25Lib.local2.field7);
Benchmark.test(38,Test25Lib.local2.field8);
Benchmark.test(39,Test25Lib.local2.field1);
Benchmark.test(40,Test25Lib.local2.field2);
Benchmark.test(41,Test25Lib.local2.field3);
Benchmark.test(42,Test25Lib.local2.field4);
Benchmark.test(43,Test25Lib.local3.field5);
Benchmark.test(44,Test25Lib.local3.field6);
Benchmark.test(45,Test25Lib.local3.field7);
Benchmark.test(46,Test25Lib.local3.field8);
Benchmark.test(47,Test25Lib.local3.field1);
Benchmark.test(48,Test25Lib.local3.field2);
Benchmark.test(49,Test25Lib.local3.field3);
Benchmark.test(50,Test25Lib.local3.field4);
Benchmark.test(51,Test25Lib.local4.field5);
Benchmark.test(52,Test25Lib.local4.field6);
Benchmark.test(53,Test25Lib.local4.field7);
Benchmark.test(54,Test25Lib.local4.field8);
Benchmark.test(55,Test25Lib.local4.field1);
Benchmark.test(56,Test25Lib.local4.field2);
Benchmark.test(57,Test25Lib.local4.field3);
Benchmark.test(58,Test25Lib.local4.field4);
Benchmark.test(59,Test25Lib.local5.field5);
Benchmark.test(60,Test25Lib.local5.field6);
Benchmark.test(61,Test25Lib.local5.field7);
Benchmark.test(62,Test25Lib.local5.field8);
Benchmark.test(63,Test25Lib.local5.field1);
Benchmark.test(64,Test25Lib.local5.field2);
Benchmark.test(65,Test25Lib.local5.field3);
Benchmark.test(66,Test25Lib.local5.field4);
Benchmark.test(67,Test25Lib.local6.field5);
Benchmark.test(68,Test25Lib.local6.field6);
Benchmark.test(69,Test25Lib.local6.field7);
Benchmark.test(70,Test25Lib.local6.field8);
Benchmark.test(71,Test25Lib.local6.field1);
Benchmark.test(72,Test25Lib.local6.field2);
Benchmark.test(73,Test25Lib.local6.field3);
Benchmark.test(74,Test25Lib.local6.field4);
Benchmark.test(75,Test25Lib.local7.field5);
Benchmark.test(76,Test25Lib.local7.field6);
Benchmark.test(77,Test25Lib.local7.field7);
Benchmark.test(78,Test25Lib.local7.field8);
Benchmark.test(79,Test25Lib.local7.field1);
Benchmark.test(80,Test25Lib.local7.field2);
Benchmark.test(81,Test25Lib.local7.field3);
Benchmark.test(82,Test25Lib.local7.field4);
Benchmark.test(83,Test25Lib.local8.field5);
Benchmark.test(84,Test25Lib.local8.field6);
Benchmark.test(85,Test25Lib.local8.field7);
Benchmark.test(86,Test25Lib.local8.field8);
Benchmark.test(87,Test25Lib.local8.field1);
Benchmark.test(88,Test25Lib.local8.field2);
Benchmark.test(89,Test25Lib.local8.field3);
Benchmark.test(90,Test25Lib.local8.field4);
Benchmark.test(91,Test25Lib.local9.field5);
Benchmark.test(92,Test25Lib.local9.field6);
Benchmark.test(93,Test25Lib.local9.field7);
Benchmark.test(94,Test25Lib.local9.field8);
Benchmark.test(95,Test25Lib.local9.field1);
Benchmark.test(96,Test25Lib.local9.field2);
Benchmark.test(97,Test25Lib.local9.field3);
Benchmark.test(98,Test25Lib.local9.field4);
Benchmark.test(99,Test25Lib.local10.field5);
Benchmark.test(100,Test25Lib.local10.field6);
Benchmark.test(101,Test25Lib.local10.field7);
Benchmark.test(102,Test25Lib.local10.field8);
Benchmark.test(103,Test25Lib.local10.field1);
Benchmark.test(104,Test25Lib.local10.field2);
Benchmark.test(105,Test25Lib.local10.field3);
Benchmark.test(106,Test25Lib.local10.field4);
Benchmark.test(107,Test25Lib.local11.field9);
Benchmark.test(108,Test25Lib.local11.field1);
Benchmark.test(109,Test25Lib.local11.field2);
Benchmark.test(110,Test25Lib.local11.field3);
Benchmark.test(111,Test25Lib.local11.field4);
Benchmark.test(112,Test25Lib.local12.field9);
Benchmark.test(113,Test25Lib.local12.field1);
Benchmark.test(114,Test25Lib.local12.field2);
Benchmark.test(115,Test25Lib.local12.field3);
Benchmark.test(116,Test25Lib.local12.field4);
Benchmark.test(117,Test25Lib.local13.field9);
Benchmark.test(118,Test25Lib.local13.field1);
Benchmark.test(119,Test25Lib.local13.field2);
Benchmark.test(120,Test25Lib.local13.field3);
Benchmark.test(121,Test25Lib.local13.field4);
Benchmark.test(122,Test25Lib.local14.field9);
Benchmark.test(123,Test25Lib.local14.field1);
Benchmark.test(124,Test25Lib.local14.field2);
Benchmark.test(125,Test25Lib.local14.field3);
Benchmark.test(126,Test25Lib.local14.field4);
Benchmark.test(127,Test25Lib.local15.field9);
Benchmark.test(128,Test25Lib.local15.field1);
Benchmark.test(129,Test25Lib.local15.field2);
Benchmark.test(130,Test25Lib.local15.field3);
Benchmark.test(131,Test25Lib.local15.field4);
Benchmark.test(132,Test25Lib.local16.field9);
Benchmark.test(133,Test25Lib.local16.field1);
Benchmark.test(134,Test25Lib.local16.field2);
Benchmark.test(135,Test25Lib.local16.field3);
Benchmark.test(136,Test25Lib.local16.field4);
Benchmark.test(137,Test25Lib.local17.field9);
Benchmark.test(138,Test25Lib.local17.field1);
Benchmark.test(139,Test25Lib.local17.field2);
Benchmark.test(140,Test25Lib.local17.field3);
Benchmark.test(141,Test25Lib.local17.field4);
Benchmark.test(142,Test25Lib.local18.field9);
Benchmark.test(143,Test25Lib.local18.field1);
Benchmark.test(144,Test25Lib.local18.field2);
Benchmark.test(145,Test25Lib.local18.field3);
Benchmark.test(146,Test25Lib.local18.field4);
Benchmark.test(147,Test25Lib.local19.field10);
Benchmark.test(148,Test25Lib.local19.field1);
Benchmark.test(149,Test25Lib.local19.field2);
Benchmark.test(150,Test25Lib.local19.field3);
Benchmark.test(151,Test25Lib.local19.field4);
Benchmark.test(152,Test25Lib.local20.field10);
Benchmark.test(153,Test25Lib.local20.field1);
Benchmark.test(154,Test25Lib.local20.field2);
Benchmark.test(155,Test25Lib.local20.field3);
Benchmark.test(156,Test25Lib.local20.field4);
Benchmark.test(157,Test25Lib.local21.field10);
Benchmark.test(158,Test25Lib.local21.field1);
Benchmark.test(159,Test25Lib.local21.field2);
Benchmark.test(160,Test25Lib.local21.field3);
Benchmark.test(161,Test25Lib.local21.field4);
Benchmark.test(162,Test25Lib.local22.field10);
Benchmark.test(163,Test25Lib.local22.field1);
Benchmark.test(164,Test25Lib.local22.field2);
Benchmark.test(165,Test25Lib.local22.field3);
Benchmark.test(166,Test25Lib.local22.field4);
Benchmark.test(167,Test25Lib.local23.field10);
Benchmark.test(168,Test25Lib.local23.field1);
Benchmark.test(169,Test25Lib.local23.field2);
Benchmark.test(170,Test25Lib.local23.field3);
Benchmark.test(171,Test25Lib.local23.field4);
Benchmark.test(172,Test25Lib.local24.field10);
Benchmark.test(173,Test25Lib.local24.field1);
Benchmark.test(174,Test25Lib.local24.field2);
Benchmark.test(175,Test25Lib.local24.field3);
Benchmark.test(176,Test25Lib.local24.field4);
Benchmark.test(177,Test25Lib.local25.field10);
Benchmark.test(178,Test25Lib.local25.field1);
Benchmark.test(179,Test25Lib.local25.field2);
Benchmark.test(180,Test25Lib.local25.field3);
Benchmark.test(181,Test25Lib.local25.field4);
Benchmark.test(182,Test25Lib.local26.field10);
Benchmark.test(183,Test25Lib.local26.field1);
Benchmark.test(184,Test25Lib.local26.field2);
Benchmark.test(185,Test25Lib.local26.field3);
Benchmark.test(186,Test25Lib.local26.field4);
Benchmark.test(187,Test25Lib.local27.field11);
Benchmark.test(188,Test25Lib.local27.field12);
Benchmark.test(189,Test25Lib.local27.field13);
Benchmark.test(190,Test25Lib.local27.field5);
Benchmark.test(191,Test25Lib.local27.field6);
Benchmark.test(192,Test25Lib.local27.field7);
Benchmark.test(193,Test25Lib.local27.field8);
Benchmark.test(194,Test25Lib.local27.field1);
Benchmark.test(195,Test25Lib.local27.field2);
Benchmark.test(196,Test25Lib.local27.field3);
Benchmark.test(197,Test25Lib.local27.field4);
Benchmark.test(198,Test25Lib.local28.field11);
Benchmark.test(199,Test25Lib.local28.field12);
Benchmark.test(200,Test25Lib.local28.field13);
Benchmark.test(201,Test25Lib.local28.field5);
Benchmark.test(202,Test25Lib.local28.field6);
Benchmark.test(203,Test25Lib.local28.field7);
Benchmark.test(204,Test25Lib.local28.field8);
Benchmark.test(205,Test25Lib.local28.field1);
Benchmark.test(206,Test25Lib.local28.field2);
Benchmark.test(207,Test25Lib.local28.field3);
Benchmark.test(208,Test25Lib.local28.field4);
Benchmark.test(209,Test25Lib.local29.field11);
Benchmark.test(210,Test25Lib.local29.field12);
Benchmark.test(211,Test25Lib.local29.field13);
Benchmark.test(212,Test25Lib.local29.field5);
Benchmark.test(213,Test25Lib.local29.field6);
Benchmark.test(214,Test25Lib.local29.field7);
Benchmark.test(215,Test25Lib.local29.field8);
Benchmark.test(216,Test25Lib.local29.field1);
Benchmark.test(217,Test25Lib.local29.field2);
Benchmark.test(218,Test25Lib.local29.field3);
Benchmark.test(219,Test25Lib.local29.field4);
Benchmark.test(220,Test25Lib.local30.field11);
Benchmark.test(221,Test25Lib.local30.field12);
Benchmark.test(222,Test25Lib.local30.field13);
Benchmark.test(223,Test25Lib.local30.field5);
Benchmark.test(224,Test25Lib.local30.field6);
Benchmark.test(225,Test25Lib.local30.field7);
Benchmark.test(226,Test25Lib.local30.field8);
Benchmark.test(227,Test25Lib.local30.field1);
Benchmark.test(228,Test25Lib.local30.field2);
Benchmark.test(229,Test25Lib.local30.field3);
Benchmark.test(230,Test25Lib.local30.field4);
Benchmark.print();
}
}
