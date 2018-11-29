package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test24Lib{
public static Test24Class1 local1;
public static Test24Class1 local2;
public static Test24Class1 local3;
public static Test24Class1 local4;
public static Test24Class1 local5;
public static Test24Class1 local6;
public static Test24Class1 local7;
public static Test24Class1 local8;
public static Test24Class1 local9;
public static Test24Class2 local10;
public static Test24Class2 local11;
public static Test24Class2 local12;
public static Test24Class3 local13;
public static Test24Class3 local14;
public static Test24Class3 local15;
public static Test24Class3 local16;
public static Test24Class3 local17;
public static Test24Class3 local18;
public static Test24Class4 local19;
public static Test24Class4 local20;
public static Test24Class5 local21;
public static Test24Class5 local22;
public static Test24Class5 local23;
public static Test24Class5 local24;
public static Test24Class5 local25;
public static Test24Class5 local26;
public static Test24Class5 local27;
public static Test24Class5 local28;
}
class Test24Class1 extends BasicClass {
public Test24Class1 field1;
public Test24Class4 field2;
public Test24Class2 field3;
public Test24Class1 method1(int depth) {
if (depth == 0) return Test24Lib.local27;
this.field3.method3(depth-1);
for (int local29 = 0; local29<=1; local29 += 1) {
for (int local30 = 0; local30<=3; local30 += 1) {
if (depth==1) {
for (int local31 = 0; local31<=2; local31 += 1) {
for (int local32 = 0; local32<=0; local32 += 1) {
}
}
}else {
this.field1=this.method1(depth-1);
}
}
}
this.field1=this.field2;
for (int local33 = 0; local33<=1; local33 += 1) {
if (depth<2) {
for (int local34 = 0; local34<=3; local34 += 1) {
this.field2=this.field2;
}
}
}
this.field3=this.field2.method5(depth-1);
if (depth<2) {
if (depth<2) {
this.field1=this.field2;
}else {
if (depth<4) {
this.field3.method3(depth-1);
}else {
this.field1=this.field3;
}
}
}else {
for (int local35 = 0; local35<=2; local35 += 1) {
this.field3=this.field3;
}
}
for (int local36 = 0; local36<=1; local36 += 1) {
this.field2=this.field2;
}
for (int local37 = 0; local37<=0; local37 += 1) {
for (int local38 = 0; local38<=2; local38 += 1) {
if (depth<=4) {
if (depth<2) {
this.field2=this.field2;
}
}else {
if (depth>2) {
this.field3=this.field3;
}
}
}
}
for (int local39 = 0; local39<=0; local39 += 1) {
this.field3.method3(depth-1);
}
return this.field1;
}
public static void method2(Test24Class2 arg0, Test24Class1 arg1, int depth) {
if (depth == 0) return;
if (depth>=2) {
for (int local40 = 0; local40<=2; local40 += 1) {
arg0.field1=arg0.field6;
}
}else {
arg0.field7=arg0.field7;
}
arg0.field7=arg0.field7;
arg1.field1=arg0.field3;
for (int local41 = 0; local41<=3; local41 += 1) {
for (int local42 = 0; local42<=3; local42 += 1) {
if (depth>4) {
for (int local43 = 0; local43<=0; local43 += 1) {
for (int local44 = 0; local44<=1; local44 += 1) {
}
}
}else {
arg0.field2.method7(depth-1);
}
}
}
arg0.field7.method8(arg1.field2,depth-1);
arg0.field7.method8(arg0.field2,depth-1);
for (int local45 = 0; local45<=3; local45 += 1) {
arg0.field1=arg1.field2.method5(depth-1);
}
arg1.field2.method5(depth-1);
}
}
class Test24Class2 extends Test24Class1 {
public static Test24Class1 field4;
public Test24Class4 field5;
public static Test24Class2 field6;
public Test24Class5 field7;
public static void method3(int depth) {
if (depth == 0) return;
field4.field1=field6.field2.method5(depth-1);
field4.field2.method7(depth-1);
field6.field4=field6.field2;
if (depth>=4) {
for (int local46 = 0; local46<=3; local46 += 1) {
field6.field2.method7(depth-1);
}
}else {
for (int local47 = 0; local47<=2; local47 += 1) {
field6.field7=field6.field7;
}
}
field6.field4=field6.field5.method4(field6.field7,depth-1);
}
}
class Test24Class3 extends Test24Class1 {
public Test24Class2 field8;
public Test24Class3 field9;
public static Test24Class3 field10;
public static Test24Class1 method4(Test24Class5 arg0, int depth) {
if (depth == 0) return Test24Lib.local16;
return arg0.field12;
}
public Test24Class2 method5(int depth) {
if (depth == 0) return Test24Lib.local10;
this.field2=this.field2;
for (int local48 = 0; local48<=2; local48 += 1) {
this.field1=this.field3;
}
this.field1=this.method1(depth-1);
return this.field3;
}
}
class Test24Class4 extends Test24Class3 {
public Test24Class2 field11;
public void method6(Test24Class1 arg0, int depth) {
if (depth == 0) return;
if (depth>=1) {
for (int local49 = 0; local49<=0; local49 += 1) {
for (int local50 = 0; local50<=2; local50 += 1) {
if (depth<=2) {
if (depth>=2) {
}else {
}
}
}
}
}else {
if (depth<=1) {
if (depth<1) {
for (int local51 = 0; local51<=1; local51 += 1) {
if (depth<=2) {
}
}
}else {
arg0.field1=this.field2.method5(depth-1);
}
}
}
if (depth>1) {
arg0=this;
}
for (int local52 = 0; local52<=2; local52 += 1) {
this.field2.method7(depth-1);
}
if (depth<=4) {
for (int local53 = 0; local53<=0; local53 += 1) {
this.field9=this.field9;
}
}
this.field9=this.field10;
this.field3.method1(depth-1);
if (depth>=2) {
if (depth>4) {
if (depth<=3) {
arg0.field2=arg0.field2;
}
}
}else {
if (depth<1) {
this.field1=this.field8;
}else {
if (depth==2) {
if (depth==1) {
for (int local54 = 0; local54<=2; local54 += 1) {
}
}
}else {
for (int local55 = 0; local55<=1; local55 += 1) {
this.method7(depth-1);
}
}
}
}
if (depth>=2) {
if (depth==4) {
if (depth>=1) {
for (int local56 = 0; local56<=3; local56 += 1) {
this.field9=this.field9;
}
}
}else {
this.field1=this.field10;
}
}
}
public void method7(int depth) {
if (depth == 0) return;
for (int local57 = 0; local57<=1; local57 += 1) {
for (int local58 = 0; local58<=1; local58 += 1) {
for (int local59 = 0; local59<=2; local59 += 1) {
for (int local60 = 0; local60<=0; local60 += 1) {
this.field1=this.field10;
}
}
}
}
for (int local61 = 0; local61<=0; local61 += 1) {
this.field1=this.field2;
}
if (depth<=2) {
for (int local62 = 0; local62<=1; local62 += 1) {
this.field1=this.field9.method1(depth-1);
}
}else {
this.field1=this.field3.method1(depth-1);
}
for (int local63 = 0; local63<=0; local63 += 1) {
for (int local64 = 0; local64<=1; local64 += 1) {
for (int local65 = 0; local65<=3; local65 += 1) {
if (depth<=2) {
if (depth>1) {
}
}
}
}
}
this.field10=this.field9;
}
}
class Test24Class5 extends Test24Class2 {
public Test24Class1 field12;
public static void method8(Test24Class3 arg0, int depth) {
if (depth == 0) return;
if (depth==1) {
field6=arg0.field2.method5(depth-1);
}
for (int local66 = 0; local66<=3; local66 += 1) {
if (depth<=3) {
field6.method3(depth-1);
}
}
for (int local67 = 0; local67<=3; local67 += 1) {
field6.field7.method8(field6.field5,depth-1);
}
if (depth==3) {
for (int local68 = 0; local68<=1; local68 += 1) {
for (int local69 = 0; local69<=2; local69 += 1) {
if (depth>=2) {
field4.field1=field4.field2.method5(depth-1);
}
}
}
}else {
for (int local70 = 0; local70<=2; local70 += 1) {
field4.field3=arg0.field2.method5(depth-1);
}
}
for (int local71 = 0; local71<=1; local71 += 1) {
for (int local72 = 0; local72<=3; local72 += 1) {
field6.field2=field4.field2;
}
}
if (depth>1) {
field6.field5=arg0.field2;
}
if (depth>=2) {
for (int local73 = 0; local73<=3; local73 += 1) {
field4.field1=field6.field3;
}
}
for (int local74 = 0; local74<=3; local74 += 1) {
if (depth>=1) {
for (int local75 = 0; local75<=1; local75 += 1) {
if (depth>1) {
field4.field2=field6.field2;
}else {
if (depth<3) {
}else {
}
}
}
}else {
if (depth>1) {
field6.field6.method3(depth-1);
}
}
}
}
}
public class Test24{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test24Lib.local1 = new Test24Class1();
Benchmark.alloc(2);
Test24Lib.local2 = new Test24Class1();
Benchmark.alloc(3);
Test24Lib.local3 = new Test24Class1();
Benchmark.alloc(4);
Test24Lib.local4 = new Test24Class1();
Benchmark.alloc(5);
Test24Lib.local5 = new Test24Class1();
Benchmark.alloc(6);
Test24Lib.local6 = new Test24Class1();
Benchmark.alloc(7);
Test24Lib.local7 = new Test24Class1();
Benchmark.alloc(8);
Test24Lib.local8 = new Test24Class1();
Benchmark.alloc(9);
Test24Lib.local9 = new Test24Class1();
Benchmark.alloc(10);
Test24Lib.local10 = new Test24Class2();
Benchmark.alloc(11);
Test24Lib.local11 = new Test24Class2();
Benchmark.alloc(12);
Test24Lib.local12 = new Test24Class2();
Benchmark.alloc(13);
Test24Lib.local13 = new Test24Class3();
Benchmark.alloc(14);
Test24Lib.local14 = new Test24Class3();
Benchmark.alloc(15);
Test24Lib.local15 = new Test24Class3();
Benchmark.alloc(16);
Test24Lib.local16 = new Test24Class3();
Benchmark.alloc(17);
Test24Lib.local17 = new Test24Class3();
Benchmark.alloc(18);
Test24Lib.local18 = new Test24Class3();
Benchmark.alloc(19);
Test24Lib.local19 = new Test24Class4();
Benchmark.alloc(20);
Test24Lib.local20 = new Test24Class4();
Benchmark.alloc(21);
Test24Lib.local21 = new Test24Class5();
Benchmark.alloc(22);
Test24Lib.local22 = new Test24Class5();
Benchmark.alloc(23);
Test24Lib.local23 = new Test24Class5();
Benchmark.alloc(24);
Test24Lib.local24 = new Test24Class5();
Benchmark.alloc(25);
Test24Lib.local25 = new Test24Class5();
Benchmark.alloc(26);
Test24Lib.local26 = new Test24Class5();
Benchmark.alloc(27);
Test24Lib.local27 = new Test24Class5();
Benchmark.alloc(28);
Test24Lib.local28 = new Test24Class5();
Test24Lib.local1.field1 = Test24Lib.local28;
Test24Lib.local1.field2 = Test24Lib.local19;
Test24Lib.local1.field3 = Test24Lib.local21;
Test24Lib.local2.field1 = Test24Lib.local7;
Test24Lib.local2.field2 = Test24Lib.local20;
Test24Lib.local2.field3 = Test24Lib.local27;
Test24Lib.local3.field1 = Test24Lib.local12;
Test24Lib.local3.field2 = Test24Lib.local20;
Test24Lib.local3.field3 = Test24Lib.local27;
Test24Lib.local4.field1 = Test24Lib.local6;
Test24Lib.local4.field2 = Test24Lib.local20;
Test24Lib.local4.field3 = Test24Lib.local25;
Test24Lib.local5.field1 = Test24Lib.local24;
Test24Lib.local5.field2 = Test24Lib.local20;
Test24Lib.local5.field3 = Test24Lib.local22;
Test24Lib.local6.field1 = Test24Lib.local10;
Test24Lib.local6.field2 = Test24Lib.local20;
Test24Lib.local6.field3 = Test24Lib.local10;
Test24Lib.local7.field1 = Test24Lib.local13;
Test24Lib.local7.field2 = Test24Lib.local19;
Test24Lib.local7.field3 = Test24Lib.local24;
Test24Lib.local8.field1 = Test24Lib.local5;
Test24Lib.local8.field2 = Test24Lib.local19;
Test24Lib.local8.field3 = Test24Lib.local21;
Test24Lib.local9.field1 = Test24Lib.local25;
Test24Lib.local9.field2 = Test24Lib.local19;
Test24Lib.local9.field3 = Test24Lib.local23;
Test24Lib.local10.field4 = Test24Lib.local18;
Test24Lib.local10.field5 = Test24Lib.local19;
Test24Lib.local10.field6 = Test24Lib.local24;
Test24Lib.local10.field7 = Test24Lib.local25;
Test24Lib.local10.field1 = Test24Lib.local23;
Test24Lib.local10.field2 = Test24Lib.local20;
Test24Lib.local10.field3 = Test24Lib.local25;
Test24Lib.local11.field4 = Test24Lib.local11;
Test24Lib.local11.field5 = Test24Lib.local19;
Test24Lib.local11.field6 = Test24Lib.local28;
Test24Lib.local11.field7 = Test24Lib.local21;
Test24Lib.local11.field1 = Test24Lib.local1;
Test24Lib.local11.field2 = Test24Lib.local20;
Test24Lib.local11.field3 = Test24Lib.local23;
Test24Lib.local12.field4 = Test24Lib.local26;
Test24Lib.local12.field5 = Test24Lib.local19;
Test24Lib.local12.field6 = Test24Lib.local28;
Test24Lib.local12.field7 = Test24Lib.local24;
Test24Lib.local12.field1 = Test24Lib.local10;
Test24Lib.local12.field2 = Test24Lib.local19;
Test24Lib.local12.field3 = Test24Lib.local25;
Test24Lib.local13.field8 = Test24Lib.local22;
Test24Lib.local13.field9 = Test24Lib.local15;
Test24Lib.local13.field10 = Test24Lib.local18;
Test24Lib.local13.field1 = Test24Lib.local16;
Test24Lib.local13.field2 = Test24Lib.local19;
Test24Lib.local13.field3 = Test24Lib.local11;
Test24Lib.local14.field8 = Test24Lib.local24;
Test24Lib.local14.field9 = Test24Lib.local19;
Test24Lib.local14.field10 = Test24Lib.local13;
Test24Lib.local14.field1 = Test24Lib.local19;
Test24Lib.local14.field2 = Test24Lib.local19;
Test24Lib.local14.field3 = Test24Lib.local21;
Test24Lib.local15.field8 = Test24Lib.local21;
Test24Lib.local15.field9 = Test24Lib.local17;
Test24Lib.local15.field10 = Test24Lib.local18;
Test24Lib.local15.field1 = Test24Lib.local27;
Test24Lib.local15.field2 = Test24Lib.local19;
Test24Lib.local15.field3 = Test24Lib.local11;
Test24Lib.local16.field8 = Test24Lib.local24;
Test24Lib.local16.field9 = Test24Lib.local19;
Test24Lib.local16.field10 = Test24Lib.local20;
Test24Lib.local16.field1 = Test24Lib.local3;
Test24Lib.local16.field2 = Test24Lib.local19;
Test24Lib.local16.field3 = Test24Lib.local12;
Test24Lib.local17.field8 = Test24Lib.local23;
Test24Lib.local17.field9 = Test24Lib.local13;
Test24Lib.local17.field10 = Test24Lib.local16;
Test24Lib.local17.field1 = Test24Lib.local24;
Test24Lib.local17.field2 = Test24Lib.local20;
Test24Lib.local17.field3 = Test24Lib.local26;
Test24Lib.local18.field8 = Test24Lib.local24;
Test24Lib.local18.field9 = Test24Lib.local18;
Test24Lib.local18.field10 = Test24Lib.local16;
Test24Lib.local18.field1 = Test24Lib.local15;
Test24Lib.local18.field2 = Test24Lib.local20;
Test24Lib.local18.field3 = Test24Lib.local28;
Test24Lib.local19.field11 = Test24Lib.local25;
Test24Lib.local19.field8 = Test24Lib.local10;
Test24Lib.local19.field9 = Test24Lib.local20;
Test24Lib.local19.field10 = Test24Lib.local19;
Test24Lib.local19.field1 = Test24Lib.local1;
Test24Lib.local19.field2 = Test24Lib.local20;
Test24Lib.local19.field3 = Test24Lib.local28;
Test24Lib.local20.field11 = Test24Lib.local11;
Test24Lib.local20.field8 = Test24Lib.local24;
Test24Lib.local20.field9 = Test24Lib.local16;
Test24Lib.local20.field10 = Test24Lib.local19;
Test24Lib.local20.field1 = Test24Lib.local23;
Test24Lib.local20.field2 = Test24Lib.local19;
Test24Lib.local20.field3 = Test24Lib.local28;
Test24Lib.local21.field12 = Test24Lib.local23;
Test24Lib.local21.field4 = Test24Lib.local14;
Test24Lib.local21.field5 = Test24Lib.local20;
Test24Lib.local21.field6 = Test24Lib.local26;
Test24Lib.local21.field7 = Test24Lib.local25;
Test24Lib.local21.field1 = Test24Lib.local22;
Test24Lib.local21.field2 = Test24Lib.local20;
Test24Lib.local21.field3 = Test24Lib.local24;
Test24Lib.local22.field12 = Test24Lib.local10;
Test24Lib.local22.field4 = Test24Lib.local28;
Test24Lib.local22.field5 = Test24Lib.local19;
Test24Lib.local22.field6 = Test24Lib.local24;
Test24Lib.local22.field7 = Test24Lib.local27;
Test24Lib.local22.field1 = Test24Lib.local5;
Test24Lib.local22.field2 = Test24Lib.local20;
Test24Lib.local22.field3 = Test24Lib.local28;
Test24Lib.local23.field12 = Test24Lib.local14;
Test24Lib.local23.field4 = Test24Lib.local22;
Test24Lib.local23.field5 = Test24Lib.local20;
Test24Lib.local23.field6 = Test24Lib.local12;
Test24Lib.local23.field7 = Test24Lib.local21;
Test24Lib.local23.field1 = Test24Lib.local26;
Test24Lib.local23.field2 = Test24Lib.local19;
Test24Lib.local23.field3 = Test24Lib.local11;
Test24Lib.local24.field12 = Test24Lib.local12;
Test24Lib.local24.field4 = Test24Lib.local7;
Test24Lib.local24.field5 = Test24Lib.local20;
Test24Lib.local24.field6 = Test24Lib.local28;
Test24Lib.local24.field7 = Test24Lib.local25;
Test24Lib.local24.field1 = Test24Lib.local19;
Test24Lib.local24.field2 = Test24Lib.local20;
Test24Lib.local24.field3 = Test24Lib.local26;
Test24Lib.local25.field12 = Test24Lib.local7;
Test24Lib.local25.field4 = Test24Lib.local7;
Test24Lib.local25.field5 = Test24Lib.local19;
Test24Lib.local25.field6 = Test24Lib.local22;
Test24Lib.local25.field7 = Test24Lib.local24;
Test24Lib.local25.field1 = Test24Lib.local11;
Test24Lib.local25.field2 = Test24Lib.local20;
Test24Lib.local25.field3 = Test24Lib.local27;
Test24Lib.local26.field12 = Test24Lib.local13;
Test24Lib.local26.field4 = Test24Lib.local5;
Test24Lib.local26.field5 = Test24Lib.local20;
Test24Lib.local26.field6 = Test24Lib.local22;
Test24Lib.local26.field7 = Test24Lib.local28;
Test24Lib.local26.field1 = Test24Lib.local9;
Test24Lib.local26.field2 = Test24Lib.local20;
Test24Lib.local26.field3 = Test24Lib.local24;
Test24Lib.local27.field12 = Test24Lib.local19;
Test24Lib.local27.field4 = Test24Lib.local18;
Test24Lib.local27.field5 = Test24Lib.local20;
Test24Lib.local27.field6 = Test24Lib.local28;
Test24Lib.local27.field7 = Test24Lib.local27;
Test24Lib.local27.field1 = Test24Lib.local11;
Test24Lib.local27.field2 = Test24Lib.local20;
Test24Lib.local27.field3 = Test24Lib.local28;
Test24Lib.local28.field12 = Test24Lib.local14;
Test24Lib.local28.field4 = Test24Lib.local12;
Test24Lib.local28.field5 = Test24Lib.local20;
Test24Lib.local28.field6 = Test24Lib.local21;
Test24Lib.local28.field7 = Test24Lib.local21;
Test24Lib.local28.field1 = Test24Lib.local4;
Test24Lib.local28.field2 = Test24Lib.local20;
Test24Lib.local28.field3 = Test24Lib.local23;
if (inputValue<4) {
Test24Lib.local21.field1=Test24Lib.local21.field5.method4(Test24Lib.local27.field7,3);
}
Test24Lib.local17=Test24Lib.local17.field10;
Test24Lib.local14.field9.method5(3);
Test24Lib.local17.field8=Test24Lib.local15.field8;
if (inputValue==4) {
if (inputValue<2) {
if (inputValue==4) {
if (inputValue>=4) {
Test24Lib.local28.field7=Test24Lib.local28;
}else {
Test24Lib.local23.field7.method8(Test24Lib.local25.field2,3);
}
}
}else {
for (int local76 = 0; local76<=3; local76 += 1) {
if (inputValue==1) {
for (int local77 = 0; local77<=0; local77 += 1) {
}
}
}
}
}else {
Test24Lib.local14=Test24Lib.local28.field2;
}
Test24Lib.local23.field3.method3(3);
if (inputValue>=1) {
Test24Lib.local16.field2.method6(Test24Lib.local2.field2,3);
}
Test24Lib.local11.field5=Test24Lib.local24.field5;
Test24Lib.local21.field3=Test24Lib.local12.field2.method5(3);
Test24Lib.local13.field2=Test24Lib.local12.field2;
Benchmark.test(1,Test24Lib.local1);
Benchmark.test(2,Test24Lib.local2);
Benchmark.test(3,Test24Lib.local3);
Benchmark.test(4,Test24Lib.local4);
Benchmark.test(5,Test24Lib.local5);
Benchmark.test(6,Test24Lib.local6);
Benchmark.test(7,Test24Lib.local7);
Benchmark.test(8,Test24Lib.local8);
Benchmark.test(9,Test24Lib.local9);
Benchmark.test(10,Test24Lib.local10);
Benchmark.test(11,Test24Lib.local11);
Benchmark.test(12,Test24Lib.local12);
Benchmark.test(13,Test24Lib.local13);
Benchmark.test(14,Test24Lib.local14);
Benchmark.test(15,Test24Lib.local15);
Benchmark.test(16,Test24Lib.local16);
Benchmark.test(17,Test24Lib.local17);
Benchmark.test(18,Test24Lib.local18);
Benchmark.test(19,Test24Lib.local19);
Benchmark.test(20,Test24Lib.local20);
Benchmark.test(21,Test24Lib.local21);
Benchmark.test(22,Test24Lib.local22);
Benchmark.test(23,Test24Lib.local23);
Benchmark.test(24,Test24Lib.local24);
Benchmark.test(25,Test24Lib.local25);
Benchmark.test(26,Test24Lib.local26);
Benchmark.test(27,Test24Lib.local27);
Benchmark.test(28,Test24Lib.local28);
Benchmark.test(29,Test24Lib.local1.field1);
Benchmark.test(30,Test24Lib.local1.field2);
Benchmark.test(31,Test24Lib.local1.field3);
Benchmark.test(32,Test24Lib.local2.field1);
Benchmark.test(33,Test24Lib.local2.field2);
Benchmark.test(34,Test24Lib.local2.field3);
Benchmark.test(35,Test24Lib.local3.field1);
Benchmark.test(36,Test24Lib.local3.field2);
Benchmark.test(37,Test24Lib.local3.field3);
Benchmark.test(38,Test24Lib.local4.field1);
Benchmark.test(39,Test24Lib.local4.field2);
Benchmark.test(40,Test24Lib.local4.field3);
Benchmark.test(41,Test24Lib.local5.field1);
Benchmark.test(42,Test24Lib.local5.field2);
Benchmark.test(43,Test24Lib.local5.field3);
Benchmark.test(44,Test24Lib.local6.field1);
Benchmark.test(45,Test24Lib.local6.field2);
Benchmark.test(46,Test24Lib.local6.field3);
Benchmark.test(47,Test24Lib.local7.field1);
Benchmark.test(48,Test24Lib.local7.field2);
Benchmark.test(49,Test24Lib.local7.field3);
Benchmark.test(50,Test24Lib.local8.field1);
Benchmark.test(51,Test24Lib.local8.field2);
Benchmark.test(52,Test24Lib.local8.field3);
Benchmark.test(53,Test24Lib.local9.field1);
Benchmark.test(54,Test24Lib.local9.field2);
Benchmark.test(55,Test24Lib.local9.field3);
Benchmark.test(56,Test24Lib.local10.field4);
Benchmark.test(57,Test24Lib.local10.field5);
Benchmark.test(58,Test24Lib.local10.field6);
Benchmark.test(59,Test24Lib.local10.field7);
Benchmark.test(60,Test24Lib.local10.field1);
Benchmark.test(61,Test24Lib.local10.field2);
Benchmark.test(62,Test24Lib.local10.field3);
Benchmark.test(63,Test24Lib.local11.field4);
Benchmark.test(64,Test24Lib.local11.field5);
Benchmark.test(65,Test24Lib.local11.field6);
Benchmark.test(66,Test24Lib.local11.field7);
Benchmark.test(67,Test24Lib.local11.field1);
Benchmark.test(68,Test24Lib.local11.field2);
Benchmark.test(69,Test24Lib.local11.field3);
Benchmark.test(70,Test24Lib.local12.field4);
Benchmark.test(71,Test24Lib.local12.field5);
Benchmark.test(72,Test24Lib.local12.field6);
Benchmark.test(73,Test24Lib.local12.field7);
Benchmark.test(74,Test24Lib.local12.field1);
Benchmark.test(75,Test24Lib.local12.field2);
Benchmark.test(76,Test24Lib.local12.field3);
Benchmark.test(77,Test24Lib.local13.field8);
Benchmark.test(78,Test24Lib.local13.field9);
Benchmark.test(79,Test24Lib.local13.field10);
Benchmark.test(80,Test24Lib.local13.field1);
Benchmark.test(81,Test24Lib.local13.field2);
Benchmark.test(82,Test24Lib.local13.field3);
Benchmark.test(83,Test24Lib.local14.field8);
Benchmark.test(84,Test24Lib.local14.field9);
Benchmark.test(85,Test24Lib.local14.field10);
Benchmark.test(86,Test24Lib.local14.field1);
Benchmark.test(87,Test24Lib.local14.field2);
Benchmark.test(88,Test24Lib.local14.field3);
Benchmark.test(89,Test24Lib.local15.field8);
Benchmark.test(90,Test24Lib.local15.field9);
Benchmark.test(91,Test24Lib.local15.field10);
Benchmark.test(92,Test24Lib.local15.field1);
Benchmark.test(93,Test24Lib.local15.field2);
Benchmark.test(94,Test24Lib.local15.field3);
Benchmark.test(95,Test24Lib.local16.field8);
Benchmark.test(96,Test24Lib.local16.field9);
Benchmark.test(97,Test24Lib.local16.field10);
Benchmark.test(98,Test24Lib.local16.field1);
Benchmark.test(99,Test24Lib.local16.field2);
Benchmark.test(100,Test24Lib.local16.field3);
Benchmark.test(101,Test24Lib.local17.field8);
Benchmark.test(102,Test24Lib.local17.field9);
Benchmark.test(103,Test24Lib.local17.field10);
Benchmark.test(104,Test24Lib.local17.field1);
Benchmark.test(105,Test24Lib.local17.field2);
Benchmark.test(106,Test24Lib.local17.field3);
Benchmark.test(107,Test24Lib.local18.field8);
Benchmark.test(108,Test24Lib.local18.field9);
Benchmark.test(109,Test24Lib.local18.field10);
Benchmark.test(110,Test24Lib.local18.field1);
Benchmark.test(111,Test24Lib.local18.field2);
Benchmark.test(112,Test24Lib.local18.field3);
Benchmark.test(113,Test24Lib.local19.field11);
Benchmark.test(114,Test24Lib.local19.field8);
Benchmark.test(115,Test24Lib.local19.field9);
Benchmark.test(116,Test24Lib.local19.field10);
Benchmark.test(117,Test24Lib.local19.field1);
Benchmark.test(118,Test24Lib.local19.field2);
Benchmark.test(119,Test24Lib.local19.field3);
Benchmark.test(120,Test24Lib.local20.field11);
Benchmark.test(121,Test24Lib.local20.field8);
Benchmark.test(122,Test24Lib.local20.field9);
Benchmark.test(123,Test24Lib.local20.field10);
Benchmark.test(124,Test24Lib.local20.field1);
Benchmark.test(125,Test24Lib.local20.field2);
Benchmark.test(126,Test24Lib.local20.field3);
Benchmark.test(127,Test24Lib.local21.field12);
Benchmark.test(128,Test24Lib.local21.field4);
Benchmark.test(129,Test24Lib.local21.field5);
Benchmark.test(130,Test24Lib.local21.field6);
Benchmark.test(131,Test24Lib.local21.field7);
Benchmark.test(132,Test24Lib.local21.field1);
Benchmark.test(133,Test24Lib.local21.field2);
Benchmark.test(134,Test24Lib.local21.field3);
Benchmark.test(135,Test24Lib.local22.field12);
Benchmark.test(136,Test24Lib.local22.field4);
Benchmark.test(137,Test24Lib.local22.field5);
Benchmark.test(138,Test24Lib.local22.field6);
Benchmark.test(139,Test24Lib.local22.field7);
Benchmark.test(140,Test24Lib.local22.field1);
Benchmark.test(141,Test24Lib.local22.field2);
Benchmark.test(142,Test24Lib.local22.field3);
Benchmark.test(143,Test24Lib.local23.field12);
Benchmark.test(144,Test24Lib.local23.field4);
Benchmark.test(145,Test24Lib.local23.field5);
Benchmark.test(146,Test24Lib.local23.field6);
Benchmark.test(147,Test24Lib.local23.field7);
Benchmark.test(148,Test24Lib.local23.field1);
Benchmark.test(149,Test24Lib.local23.field2);
Benchmark.test(150,Test24Lib.local23.field3);
Benchmark.test(151,Test24Lib.local24.field12);
Benchmark.test(152,Test24Lib.local24.field4);
Benchmark.test(153,Test24Lib.local24.field5);
Benchmark.test(154,Test24Lib.local24.field6);
Benchmark.test(155,Test24Lib.local24.field7);
Benchmark.test(156,Test24Lib.local24.field1);
Benchmark.test(157,Test24Lib.local24.field2);
Benchmark.test(158,Test24Lib.local24.field3);
Benchmark.test(159,Test24Lib.local25.field12);
Benchmark.test(160,Test24Lib.local25.field4);
Benchmark.test(161,Test24Lib.local25.field5);
Benchmark.test(162,Test24Lib.local25.field6);
Benchmark.test(163,Test24Lib.local25.field7);
Benchmark.test(164,Test24Lib.local25.field1);
Benchmark.test(165,Test24Lib.local25.field2);
Benchmark.test(166,Test24Lib.local25.field3);
Benchmark.test(167,Test24Lib.local26.field12);
Benchmark.test(168,Test24Lib.local26.field4);
Benchmark.test(169,Test24Lib.local26.field5);
Benchmark.test(170,Test24Lib.local26.field6);
Benchmark.test(171,Test24Lib.local26.field7);
Benchmark.test(172,Test24Lib.local26.field1);
Benchmark.test(173,Test24Lib.local26.field2);
Benchmark.test(174,Test24Lib.local26.field3);
Benchmark.test(175,Test24Lib.local27.field12);
Benchmark.test(176,Test24Lib.local27.field4);
Benchmark.test(177,Test24Lib.local27.field5);
Benchmark.test(178,Test24Lib.local27.field6);
Benchmark.test(179,Test24Lib.local27.field7);
Benchmark.test(180,Test24Lib.local27.field1);
Benchmark.test(181,Test24Lib.local27.field2);
Benchmark.test(182,Test24Lib.local27.field3);
Benchmark.test(183,Test24Lib.local28.field12);
Benchmark.test(184,Test24Lib.local28.field4);
Benchmark.test(185,Test24Lib.local28.field5);
Benchmark.test(186,Test24Lib.local28.field6);
Benchmark.test(187,Test24Lib.local28.field7);
Benchmark.test(188,Test24Lib.local28.field1);
Benchmark.test(189,Test24Lib.local28.field2);
Benchmark.test(190,Test24Lib.local28.field3);
Benchmark.print();
}
}
