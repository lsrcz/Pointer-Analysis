package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test18Lib{
public static Test18Class1 local1;
public static Test18Class1 local2;
public static Test18Class1 local3;
public static Test18Class1 local4;
public static Test18Class1 local5;
public static Test18Class2 local6;
public static Test18Class2 local7;
public static Test18Class2 local8;
public static Test18Class2 local9;
public static Test18Class2 local10;
public static Test18Class2 local11;
public static Test18Class2 local12;
public static Test18Class3 local13;
public static Test18Class4 local14;
public static Test18Class4 local15;
public static Test18Class4 local16;
public static Test18Class4 local17;
public static Test18Class4 local18;
public static Test18Class4 local19;
public static Test18Class4 local20;
public static Test18Class5 local21;
public static Test18Class5 local22;
}
class Test18Class1 extends BasicClass {
public Test18Class1 field1;
public static Test18Class1 field2;
public Test18Class4 method1(Test18Class5 arg0, Test18Class1 arg1, int depth) {
if (depth == 0) return Test18Lib.local16;
if (depth>=4) {
if (depth<3) {
arg0.field5.method13(arg0.field4,arg0.field9,depth-1);
}else {
arg1.field2=arg0.field10.method6(arg0.field8,arg0.field4,depth-1);
}
}
arg0.field13=arg0.field11;
return arg0;
}
public static void method2(Test18Class4 arg0, int depth) {
if (depth == 0) return;
for (int local23 = 0; local23<=1; local23 += 1) {
for (int local24 = 0; local24<=3; local24 += 1) {
if (depth<=3) {
for (int local25 = 0; local25<=1; local25 += 1) {
if (depth>=1) {
}else {
}
}
}
}
}
for (int local26 = 0; local26<=2; local26 += 1) {
arg0.field5.method5(arg0,depth-1);
}
arg0.field9.method2(arg0,depth-1);
arg0.field10=arg0.field5;
if (depth<=1) {
for (int local27 = 0; local27<=1; local27 += 1) {
field2.field2=arg0.field2;
}
}
arg0.field4=arg0;
arg0.field10=arg0.field10;
arg0.field10=arg0.field5;
if (depth>1) {
for (int local28 = 0; local28<=3; local28 += 1) {
field2=arg0.method6(arg0.field4,arg0.field9,depth-1);
}
}else {
arg0.field1.method2(arg0.field8,depth-1);
}
}
public static Test18Class1 method3(Test18Class4 arg0, Test18Class5 arg1, int depth) {
if (depth == 0) return Test18Lib.local1;
if (depth<3) {
if (depth>4) {
arg0.field10=arg1.field5;
}else {
arg0.field9=arg0.field11;
}
}
if (depth<=3) {
arg0.method1(arg0.field8,arg1,depth-1);
}else {
if (depth>4) {
for (int local29 = 0; local29<=0; local29 += 1) {
arg1.method6(arg1.field5,arg0.field5,depth-1);
}
}else {
if (depth>=3) {
if (depth<=2) {
arg0.field5.method7(arg0.field9,arg0.field4,depth-1);
}else {
if (depth<=4) {
}
}
}else {
if (depth>=4) {
arg0.field8=arg1.field8;
}else {
arg0.field9=arg1.field11;
}
}
}
}
arg0.field3=arg1.field13;
for (int local30 = 0; local30<=3; local30 += 1) {
if (depth==1) {
for (int local31 = 0; local31<=2; local31 += 1) {
for (int local32 = 0; local32<=3; local32 += 1) {
for (int local33 = 0; local33<=0; local33 += 1) {
}
}
}
}
}
for (int local34 = 0; local34<=3; local34 += 1) {
if (depth==2) {
arg1.field5.method14(arg0.field4,arg0.field8,depth-1);
}
}
arg0.field4=arg0;
arg1=arg1;
arg0.field1=arg1.field5.method3(arg0.field8,arg0.field8,depth-1);
return arg0.field5;
}
public static Test18Class5 method4(Test18Class1 arg0, Test18Class3 arg1, int depth) {
if (depth == 0) return Test18Lib.local21;
if (depth>3) {
if (depth<4) {
arg0.field2=arg1;
}else {
if (depth==4) {
for (int local35 = 0; local35<=2; local35 += 1) {
if (depth<=3) {
}
}
}
}
}
field2.field2=arg1.method10(depth-1);
arg0.field1=arg1.method9(arg1.field6,field2.field1,depth-1);
if (depth>=1) {
for (int local36 = 0; local36<=0; local36 += 1) {
arg1.method10(depth-1);
}
}
if (depth<2) {
if (depth<2) {
for (int local37 = 0; local37<=2; local37 += 1) {
arg1=arg1;
}
}
}
arg1=arg1;
arg1=arg1;
return Test18Lib.local22;
}
}
class Test18Class2 extends Test18Class1 {
public Test18Class3 field3;
public Test18Class4 field4;
public static Test18Class4 field5;
public static void method5(Test18Class2 arg0, int depth) {
if (depth == 0) return;
if (depth>=3) {
field5.field8=field5.field8;
}
arg0.field3.method11(arg0.field4,arg0,depth-1);
field5.field4.method12(field5.field11,depth-1);
}
public Test18Class1 method6(Test18Class4 arg0, Test18Class1 arg1, int depth) {
if (depth == 0) return Test18Lib.local2;
arg0.field1=arg1.method3(this.field5,arg0.field8,depth-1);
for (int local38 = 0; local38<=0; local38 += 1) {
for (int local39 = 0; local39<=3; local39 += 1) {
this.field4.method2(arg0.field8,depth-1);
}
}
if (depth<3) {
arg0.field4.method3(this.field5,arg0.field8,depth-1);
}
arg0.field8.method16(arg0.field8,depth-1);
arg0.field9.method2(arg0,depth-1);
return arg0.field5;
}
public static void method7(Test18Class3 arg0, Test18Class4 arg1, int depth) {
if (depth == 0) return;
if (depth>1) {
if (depth>3) {
field5.field3.method8(depth-1);
}
}else {
arg1.field8.method12(field5.field9,depth-1);
}
if (depth>=4) {
field5.field4.method7(field5.field11,field5.field8,depth-1);
}else {
field5.field4=arg1;
}
for (int local40 = 0; local40<=1; local40 += 1) {
for (int local41 = 0; local41<=2; local41 += 1) {
arg1.field8.method16(field5.field5,depth-1);
}
}
}
}
class Test18Class3 extends Test18Class1 {
public Test18Class4 field6;
public static Test18Class4 field7;
public static void method8(int depth) {
if (depth == 0) return;
field7.field11.method8(depth-1);
}
public static Test18Class2 method9(Test18Class4 arg0, Test18Class1 arg1, int depth) {
if (depth == 0) return Test18Lib.local15;
if (depth<=2) {
arg0.field8=field7.field8;
}else {
for (int local42 = 0; local42<=3; local42 += 1) {
field7.field5=field7;
}
}
if (depth>1) {
arg1=arg0.field4;
}else {
field7.field9.method8(depth-1);
}
field7.field10=field7.field8;
for (int local43 = 0; local43<=3; local43 += 1) {
arg0.field3.method11(arg0,arg1.field2,depth-1);
}
arg0.field3.method8(depth-1);
for (int local44 = 0; local44<=0; local44 += 1) {
if (depth==4) {
if (depth==2) {
arg0.field8=field7.field8;
}
}else {
arg0.field4.method14(arg0.field10,field7.field8,depth-1);
}
}
field7.field8=arg0.field8;
arg0.field3=arg0.field3;
for (int local45 = 0; local45<=0; local45 += 1) {
if (depth>=1) {
field2=arg0.field1;
}
}
return arg0.field8;
}
public static Test18Class5 method10(int depth) {
if (depth == 0) return Test18Lib.local21;
field7.field8.method13(field7.field8,field7.field11,depth-1);
field7.field11=field7.field9;
field7.field8=field7.field8;
return field7.field8;
}
public static Test18Class5 method11(Test18Class4 arg0, Test18Class1 arg1, int depth) {
if (depth == 0) return Test18Lib.local21;
if (depth<=3) {
arg0.field8.method17(field7.field11,arg0.field8,depth-1);
}
field7.field4.method14(arg0.field5,field7.field8,depth-1);
field7.field11=field7.field9;
if (depth>1) {
field7.field9=arg0.field9;
}
if (depth<4) {
for (int local46 = 0; local46<=2; local46 += 1) {
field7.field5.method13(field7.field8,field7.field3,depth-1);
}
}else {
for (int local47 = 0; local47<=3; local47 += 1) {
if (depth>=3) {
for (int local48 = 0; local48<=1; local48 += 1) {
arg1.field1=field7.field4;
}
}else {
field7.field3.method8(depth-1);
}
}
}
if (depth<3) {
for (int local49 = 0; local49<=0; local49 += 1) {
field7.field10=arg0;
}
}else {
arg0.field8=arg0.field11.method4(field2.field2,arg0.field3,depth-1);
}
field2=field7.field8.method15(field7.field11,arg0.field8,depth-1);
return field7.field8;
}
}
class Test18Class4 extends Test18Class2 {
public static Test18Class5 field8;
public static Test18Class3 field9;
public static Test18Class2 field10;
public Test18Class3 field11;
public void method12(Test18Class3 arg0, int depth) {
if (depth == 0) return;
for (int local50 = 0; local50<=0; local50 += 1) {
if (depth>4) {
if (depth<4) {
for (int local51 = 0; local51<=3; local51 += 1) {
this.field11=this.field3;
}
}
}else {
for (int local52 = 0; local52<=3; local52 += 1) {
if (depth<4) {
this.field11=this.field9;
}
}
}
}
arg0.field7=arg0.field7;
}
public void method13(Test18Class4 arg0, Test18Class3 arg1, int depth) {
if (depth == 0) return;
if (depth<2) {
arg1.field2=this.field10.method4(arg0.field3,this.field11,depth-1);
}
if (depth<=3) {
for (int local53 = 0; local53<=0; local53 += 1) {
arg0.method13(arg0.field4,arg0.field3,depth-1);
}
}
for (int local54 = 0; local54<=0; local54 += 1) {
this.field8=arg0.field8;
}
for (int local55 = 0; local55<=2; local55 += 1) {
for (int local56 = 0; local56<=3; local56 += 1) {
arg0.field3.method11(this.field5,this.field1,depth-1);
}
}
for (int local57 = 0; local57<=2; local57 += 1) {
if (depth<=4) {
for (int local58 = 0; local58<=3; local58 += 1) {
for (int local59 = 0; local59<=0; local59 += 1) {
this.field10=arg1.field6;
}
}
}
}
arg1.field7=this;
}
public static void method14(Test18Class2 arg0, Test18Class5 arg1, int depth) {
if (depth == 0) return;
field5.field10=field9.field6;
arg1.field13.method8(depth-1);
for (int local60 = 0; local60<=1; local60 += 1) {
field9.field7=field10.method1(arg1,field10,depth-1);
}
arg1.method17(arg1.field13,field8,depth-1);
for (int local61 = 0; local61<=1; local61 += 1) {
field5.field8.method6(arg1.field5,field8.field9,depth-1);
}
if (depth<=4) {
field10.field4.method1(arg1,field2.field2,depth-1);
}else {
for (int local62 = 0; local62<=3; local62 += 1) {
for (int local63 = 0; local63<=2; local63 += 1) {
for (int local64 = 0; local64<=3; local64 += 1) {
if (depth==4) {
}else {
}
}
}
}
}
}
}
class Test18Class5 extends Test18Class4 {
public static Test18Class1 field12;
public Test18Class3 field13;
public Test18Class1 field14;
public static Test18Class1 field15;
public Test18Class1 method15(Test18Class3 arg0, Test18Class5 arg1, int depth) {
if (depth == 0) return Test18Lib.local6;
if (depth==1) {
arg1.field8.method16(arg1.field10,depth-1);
}
for (int local65 = 0; local65<=2; local65 += 1) {
for (int local66 = 0; local66<=3; local66 += 1) {
for (int local67 = 0; local67<=2; local67 += 1) {
this.method12(this.field13,depth-1);
}
}
}
for (int local68 = 0; local68<=0; local68 += 1) {
if (depth==1) {
this.field11=this.field3;
}
}
if (depth>3) {
if (depth<=4) {
this.field14=this.field8.method6(this.field5,this.field10,depth-1);
}
}else {
if (depth>=2) {
arg1.field1=arg1.field11.method1(this,this.field8,depth-1);
}else {
for (int local69 = 0; local69<=2; local69 += 1) {
arg0.field7.method14(this.field4,arg1,depth-1);
}
}
}
if (depth>=2) {
this.field5=arg0.field7;
}
return this.field12;
}
public void method16(Test18Class2 arg0, int depth) {
if (depth == 0) return;
this.field10=this.field10;
for (int local70 = 0; local70<=3; local70 += 1) {
this.field3.method8(depth-1);
}
}
public void method17(Test18Class3 arg0, Test18Class5 arg1, int depth) {
if (depth == 0) return;
if (depth>=4) {
this.field10=this.field8;
}
if (depth>1) {
for (int local71 = 0; local71<=1; local71 += 1) {
this.field8=arg1.field8;
}
}else {
this.field12=this.field5;
}
arg1.field8=this.field8;
arg1.field2=arg1.field4;
}
}
public class Test18{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test18Lib.local1 = new Test18Class1();
Benchmark.alloc(2);
Test18Lib.local2 = new Test18Class1();
Benchmark.alloc(3);
Test18Lib.local3 = new Test18Class1();
Benchmark.alloc(4);
Test18Lib.local4 = new Test18Class1();
Benchmark.alloc(5);
Test18Lib.local5 = new Test18Class1();
Benchmark.alloc(6);
Test18Lib.local6 = new Test18Class2();
Benchmark.alloc(7);
Test18Lib.local7 = new Test18Class2();
Benchmark.alloc(8);
Test18Lib.local8 = new Test18Class2();
Benchmark.alloc(9);
Test18Lib.local9 = new Test18Class2();
Benchmark.alloc(10);
Test18Lib.local10 = new Test18Class2();
Benchmark.alloc(11);
Test18Lib.local11 = new Test18Class2();
Benchmark.alloc(12);
Test18Lib.local12 = new Test18Class2();
Benchmark.alloc(13);
Test18Lib.local13 = new Test18Class3();
Benchmark.alloc(14);
Test18Lib.local14 = new Test18Class4();
Benchmark.alloc(15);
Test18Lib.local15 = new Test18Class4();
Benchmark.alloc(16);
Test18Lib.local16 = new Test18Class4();
Benchmark.alloc(17);
Test18Lib.local17 = new Test18Class4();
Benchmark.alloc(18);
Test18Lib.local18 = new Test18Class4();
Benchmark.alloc(19);
Test18Lib.local19 = new Test18Class4();
Benchmark.alloc(20);
Test18Lib.local20 = new Test18Class4();
Benchmark.alloc(21);
Test18Lib.local21 = new Test18Class5();
Benchmark.alloc(22);
Test18Lib.local22 = new Test18Class5();
Test18Lib.local1.field1 = Test18Lib.local10;
Test18Lib.local1.field2 = Test18Lib.local9;
Test18Lib.local2.field1 = Test18Lib.local19;
Test18Lib.local2.field2 = Test18Lib.local10;
Test18Lib.local3.field1 = Test18Lib.local16;
Test18Lib.local3.field2 = Test18Lib.local4;
Test18Lib.local4.field1 = Test18Lib.local5;
Test18Lib.local4.field2 = Test18Lib.local7;
Test18Lib.local5.field1 = Test18Lib.local10;
Test18Lib.local5.field2 = Test18Lib.local5;
Test18Lib.local6.field3 = Test18Lib.local13;
Test18Lib.local6.field4 = Test18Lib.local16;
Test18Lib.local6.field5 = Test18Lib.local19;
Test18Lib.local6.field1 = Test18Lib.local22;
Test18Lib.local6.field2 = Test18Lib.local11;
Test18Lib.local7.field3 = Test18Lib.local13;
Test18Lib.local7.field4 = Test18Lib.local17;
Test18Lib.local7.field5 = Test18Lib.local19;
Test18Lib.local7.field1 = Test18Lib.local13;
Test18Lib.local7.field2 = Test18Lib.local2;
Test18Lib.local8.field3 = Test18Lib.local13;
Test18Lib.local8.field4 = Test18Lib.local17;
Test18Lib.local8.field5 = Test18Lib.local18;
Test18Lib.local8.field1 = Test18Lib.local17;
Test18Lib.local8.field2 = Test18Lib.local22;
Test18Lib.local9.field3 = Test18Lib.local13;
Test18Lib.local9.field4 = Test18Lib.local18;
Test18Lib.local9.field5 = Test18Lib.local19;
Test18Lib.local9.field1 = Test18Lib.local12;
Test18Lib.local9.field2 = Test18Lib.local19;
Test18Lib.local10.field3 = Test18Lib.local13;
Test18Lib.local10.field4 = Test18Lib.local17;
Test18Lib.local10.field5 = Test18Lib.local18;
Test18Lib.local10.field1 = Test18Lib.local22;
Test18Lib.local10.field2 = Test18Lib.local3;
Test18Lib.local11.field3 = Test18Lib.local13;
Test18Lib.local11.field4 = Test18Lib.local15;
Test18Lib.local11.field5 = Test18Lib.local16;
Test18Lib.local11.field1 = Test18Lib.local6;
Test18Lib.local11.field2 = Test18Lib.local10;
Test18Lib.local12.field3 = Test18Lib.local13;
Test18Lib.local12.field4 = Test18Lib.local16;
Test18Lib.local12.field5 = Test18Lib.local16;
Test18Lib.local12.field1 = Test18Lib.local6;
Test18Lib.local12.field2 = Test18Lib.local5;
Test18Lib.local13.field6 = Test18Lib.local17;
Test18Lib.local13.field7 = Test18Lib.local17;
Test18Lib.local13.field1 = Test18Lib.local22;
Test18Lib.local13.field2 = Test18Lib.local5;
Test18Lib.local14.field8 = Test18Lib.local21;
Test18Lib.local14.field9 = Test18Lib.local13;
Test18Lib.local14.field10 = Test18Lib.local10;
Test18Lib.local14.field11 = Test18Lib.local13;
Test18Lib.local14.field3 = Test18Lib.local13;
Test18Lib.local14.field4 = Test18Lib.local18;
Test18Lib.local14.field5 = Test18Lib.local21;
Test18Lib.local14.field1 = Test18Lib.local2;
Test18Lib.local14.field2 = Test18Lib.local5;
Test18Lib.local15.field8 = Test18Lib.local22;
Test18Lib.local15.field9 = Test18Lib.local13;
Test18Lib.local15.field10 = Test18Lib.local15;
Test18Lib.local15.field11 = Test18Lib.local13;
Test18Lib.local15.field3 = Test18Lib.local13;
Test18Lib.local15.field4 = Test18Lib.local19;
Test18Lib.local15.field5 = Test18Lib.local20;
Test18Lib.local15.field1 = Test18Lib.local11;
Test18Lib.local15.field2 = Test18Lib.local21;
Test18Lib.local16.field8 = Test18Lib.local21;
Test18Lib.local16.field9 = Test18Lib.local13;
Test18Lib.local16.field10 = Test18Lib.local9;
Test18Lib.local16.field11 = Test18Lib.local13;
Test18Lib.local16.field3 = Test18Lib.local13;
Test18Lib.local16.field4 = Test18Lib.local22;
Test18Lib.local16.field5 = Test18Lib.local22;
Test18Lib.local16.field1 = Test18Lib.local1;
Test18Lib.local16.field2 = Test18Lib.local4;
Test18Lib.local17.field8 = Test18Lib.local22;
Test18Lib.local17.field9 = Test18Lib.local13;
Test18Lib.local17.field10 = Test18Lib.local21;
Test18Lib.local17.field11 = Test18Lib.local13;
Test18Lib.local17.field3 = Test18Lib.local13;
Test18Lib.local17.field4 = Test18Lib.local22;
Test18Lib.local17.field5 = Test18Lib.local21;
Test18Lib.local17.field1 = Test18Lib.local5;
Test18Lib.local17.field2 = Test18Lib.local22;
Test18Lib.local18.field8 = Test18Lib.local22;
Test18Lib.local18.field9 = Test18Lib.local13;
Test18Lib.local18.field10 = Test18Lib.local20;
Test18Lib.local18.field11 = Test18Lib.local13;
Test18Lib.local18.field3 = Test18Lib.local13;
Test18Lib.local18.field4 = Test18Lib.local19;
Test18Lib.local18.field5 = Test18Lib.local18;
Test18Lib.local18.field1 = Test18Lib.local11;
Test18Lib.local18.field2 = Test18Lib.local9;
Test18Lib.local19.field8 = Test18Lib.local21;
Test18Lib.local19.field9 = Test18Lib.local13;
Test18Lib.local19.field10 = Test18Lib.local7;
Test18Lib.local19.field11 = Test18Lib.local13;
Test18Lib.local19.field3 = Test18Lib.local13;
Test18Lib.local19.field4 = Test18Lib.local21;
Test18Lib.local19.field5 = Test18Lib.local22;
Test18Lib.local19.field1 = Test18Lib.local7;
Test18Lib.local19.field2 = Test18Lib.local12;
Test18Lib.local20.field8 = Test18Lib.local22;
Test18Lib.local20.field9 = Test18Lib.local13;
Test18Lib.local20.field10 = Test18Lib.local6;
Test18Lib.local20.field11 = Test18Lib.local13;
Test18Lib.local20.field3 = Test18Lib.local13;
Test18Lib.local20.field4 = Test18Lib.local16;
Test18Lib.local20.field5 = Test18Lib.local21;
Test18Lib.local20.field1 = Test18Lib.local15;
Test18Lib.local20.field2 = Test18Lib.local16;
Test18Lib.local21.field12 = Test18Lib.local1;
Test18Lib.local21.field13 = Test18Lib.local13;
Test18Lib.local21.field14 = Test18Lib.local6;
Test18Lib.local21.field15 = Test18Lib.local21;
Test18Lib.local21.field8 = Test18Lib.local21;
Test18Lib.local21.field9 = Test18Lib.local13;
Test18Lib.local21.field10 = Test18Lib.local14;
Test18Lib.local21.field11 = Test18Lib.local13;
Test18Lib.local21.field3 = Test18Lib.local13;
Test18Lib.local21.field4 = Test18Lib.local19;
Test18Lib.local21.field5 = Test18Lib.local14;
Test18Lib.local21.field1 = Test18Lib.local12;
Test18Lib.local21.field2 = Test18Lib.local1;
Test18Lib.local22.field12 = Test18Lib.local15;
Test18Lib.local22.field13 = Test18Lib.local13;
Test18Lib.local22.field14 = Test18Lib.local14;
Test18Lib.local22.field15 = Test18Lib.local12;
Test18Lib.local22.field8 = Test18Lib.local22;
Test18Lib.local22.field9 = Test18Lib.local13;
Test18Lib.local22.field10 = Test18Lib.local18;
Test18Lib.local22.field11 = Test18Lib.local13;
Test18Lib.local22.field3 = Test18Lib.local13;
Test18Lib.local22.field4 = Test18Lib.local22;
Test18Lib.local22.field5 = Test18Lib.local17;
Test18Lib.local22.field1 = Test18Lib.local12;
Test18Lib.local22.field2 = Test18Lib.local17;
if (inputValue==4) {
if (inputValue<2) {
if (inputValue<2) {
Test18Lib.local4.field2=Test18Lib.local2.field1;
}
}
}
Test18Lib.local3=Test18Lib.local10.field3;
for (int local72 = 0; local72<=1; local72 += 1) {
Test18Lib.local19.method12(Test18Lib.local17.field9,3);
}
if (inputValue<=2) {
if (inputValue==3) {
for (int local73 = 0; local73<=0; local73 += 1) {
if (inputValue<4) {
Test18Lib.local20.method12(Test18Lib.local21.field3,3);
}else {
for (int local74 = 0; local74<=3; local74 += 1) {
}
}
}
}
}else {
Test18Lib.local13.field7=Test18Lib.local11.field4;
}
for (int local75 = 0; local75<=2; local75 += 1) {
Test18Lib.local16.field3=Test18Lib.local11.field3;
}
if (inputValue<2) {
Test18Lib.local7=Test18Lib.local7;
}
for (int local76 = 0; local76<=1; local76 += 1) {
Test18Lib.local17.method12(Test18Lib.local20.field9,3);
}
Test18Lib.local21.field1=Test18Lib.local15.field11.method9(Test18Lib.local16.field8,Test18Lib.local22.field2,3);
Test18Lib.local13.field2=Test18Lib.local20.field4.method3(Test18Lib.local7.field4,Test18Lib.local22,3);
for (int local77 = 0; local77<=1; local77 += 1) {
for (int local78 = 0; local78<=0; local78 += 1) {
for (int local79 = 0; local79<=2; local79 += 1) {
Test18Lib.local3.field2=Test18Lib.local14.field5.method6(Test18Lib.local20.field8,Test18Lib.local11.field1,3);
}
}
}
Benchmark.test(1,Test18Lib.local1);
Benchmark.test(2,Test18Lib.local2);
Benchmark.test(3,Test18Lib.local3);
Benchmark.test(4,Test18Lib.local4);
Benchmark.test(5,Test18Lib.local5);
Benchmark.test(6,Test18Lib.local6);
Benchmark.test(7,Test18Lib.local7);
Benchmark.test(8,Test18Lib.local8);
Benchmark.test(9,Test18Lib.local9);
Benchmark.test(10,Test18Lib.local10);
Benchmark.test(11,Test18Lib.local11);
Benchmark.test(12,Test18Lib.local12);
Benchmark.test(13,Test18Lib.local13);
Benchmark.test(14,Test18Lib.local14);
Benchmark.test(15,Test18Lib.local15);
Benchmark.test(16,Test18Lib.local16);
Benchmark.test(17,Test18Lib.local17);
Benchmark.test(18,Test18Lib.local18);
Benchmark.test(19,Test18Lib.local19);
Benchmark.test(20,Test18Lib.local20);
Benchmark.test(21,Test18Lib.local21);
Benchmark.test(22,Test18Lib.local22);
Benchmark.test(23,Test18Lib.local1.field1);
Benchmark.test(24,Test18Lib.local1.field2);
Benchmark.test(25,Test18Lib.local2.field1);
Benchmark.test(26,Test18Lib.local2.field2);
Benchmark.test(27,Test18Lib.local3.field1);
Benchmark.test(28,Test18Lib.local3.field2);
Benchmark.test(29,Test18Lib.local4.field1);
Benchmark.test(30,Test18Lib.local4.field2);
Benchmark.test(31,Test18Lib.local5.field1);
Benchmark.test(32,Test18Lib.local5.field2);
Benchmark.test(33,Test18Lib.local6.field3);
Benchmark.test(34,Test18Lib.local6.field4);
Benchmark.test(35,Test18Lib.local6.field5);
Benchmark.test(36,Test18Lib.local6.field1);
Benchmark.test(37,Test18Lib.local6.field2);
Benchmark.test(38,Test18Lib.local7.field3);
Benchmark.test(39,Test18Lib.local7.field4);
Benchmark.test(40,Test18Lib.local7.field5);
Benchmark.test(41,Test18Lib.local7.field1);
Benchmark.test(42,Test18Lib.local7.field2);
Benchmark.test(43,Test18Lib.local8.field3);
Benchmark.test(44,Test18Lib.local8.field4);
Benchmark.test(45,Test18Lib.local8.field5);
Benchmark.test(46,Test18Lib.local8.field1);
Benchmark.test(47,Test18Lib.local8.field2);
Benchmark.test(48,Test18Lib.local9.field3);
Benchmark.test(49,Test18Lib.local9.field4);
Benchmark.test(50,Test18Lib.local9.field5);
Benchmark.test(51,Test18Lib.local9.field1);
Benchmark.test(52,Test18Lib.local9.field2);
Benchmark.test(53,Test18Lib.local10.field3);
Benchmark.test(54,Test18Lib.local10.field4);
Benchmark.test(55,Test18Lib.local10.field5);
Benchmark.test(56,Test18Lib.local10.field1);
Benchmark.test(57,Test18Lib.local10.field2);
Benchmark.test(58,Test18Lib.local11.field3);
Benchmark.test(59,Test18Lib.local11.field4);
Benchmark.test(60,Test18Lib.local11.field5);
Benchmark.test(61,Test18Lib.local11.field1);
Benchmark.test(62,Test18Lib.local11.field2);
Benchmark.test(63,Test18Lib.local12.field3);
Benchmark.test(64,Test18Lib.local12.field4);
Benchmark.test(65,Test18Lib.local12.field5);
Benchmark.test(66,Test18Lib.local12.field1);
Benchmark.test(67,Test18Lib.local12.field2);
Benchmark.test(68,Test18Lib.local13.field6);
Benchmark.test(69,Test18Lib.local13.field7);
Benchmark.test(70,Test18Lib.local13.field1);
Benchmark.test(71,Test18Lib.local13.field2);
Benchmark.test(72,Test18Lib.local14.field8);
Benchmark.test(73,Test18Lib.local14.field9);
Benchmark.test(74,Test18Lib.local14.field10);
Benchmark.test(75,Test18Lib.local14.field11);
Benchmark.test(76,Test18Lib.local14.field3);
Benchmark.test(77,Test18Lib.local14.field4);
Benchmark.test(78,Test18Lib.local14.field5);
Benchmark.test(79,Test18Lib.local14.field1);
Benchmark.test(80,Test18Lib.local14.field2);
Benchmark.test(81,Test18Lib.local15.field8);
Benchmark.test(82,Test18Lib.local15.field9);
Benchmark.test(83,Test18Lib.local15.field10);
Benchmark.test(84,Test18Lib.local15.field11);
Benchmark.test(85,Test18Lib.local15.field3);
Benchmark.test(86,Test18Lib.local15.field4);
Benchmark.test(87,Test18Lib.local15.field5);
Benchmark.test(88,Test18Lib.local15.field1);
Benchmark.test(89,Test18Lib.local15.field2);
Benchmark.test(90,Test18Lib.local16.field8);
Benchmark.test(91,Test18Lib.local16.field9);
Benchmark.test(92,Test18Lib.local16.field10);
Benchmark.test(93,Test18Lib.local16.field11);
Benchmark.test(94,Test18Lib.local16.field3);
Benchmark.test(95,Test18Lib.local16.field4);
Benchmark.test(96,Test18Lib.local16.field5);
Benchmark.test(97,Test18Lib.local16.field1);
Benchmark.test(98,Test18Lib.local16.field2);
Benchmark.test(99,Test18Lib.local17.field8);
Benchmark.test(100,Test18Lib.local17.field9);
Benchmark.test(101,Test18Lib.local17.field10);
Benchmark.test(102,Test18Lib.local17.field11);
Benchmark.test(103,Test18Lib.local17.field3);
Benchmark.test(104,Test18Lib.local17.field4);
Benchmark.test(105,Test18Lib.local17.field5);
Benchmark.test(106,Test18Lib.local17.field1);
Benchmark.test(107,Test18Lib.local17.field2);
Benchmark.test(108,Test18Lib.local18.field8);
Benchmark.test(109,Test18Lib.local18.field9);
Benchmark.test(110,Test18Lib.local18.field10);
Benchmark.test(111,Test18Lib.local18.field11);
Benchmark.test(112,Test18Lib.local18.field3);
Benchmark.test(113,Test18Lib.local18.field4);
Benchmark.test(114,Test18Lib.local18.field5);
Benchmark.test(115,Test18Lib.local18.field1);
Benchmark.test(116,Test18Lib.local18.field2);
Benchmark.test(117,Test18Lib.local19.field8);
Benchmark.test(118,Test18Lib.local19.field9);
Benchmark.test(119,Test18Lib.local19.field10);
Benchmark.test(120,Test18Lib.local19.field11);
Benchmark.test(121,Test18Lib.local19.field3);
Benchmark.test(122,Test18Lib.local19.field4);
Benchmark.test(123,Test18Lib.local19.field5);
Benchmark.test(124,Test18Lib.local19.field1);
Benchmark.test(125,Test18Lib.local19.field2);
Benchmark.test(126,Test18Lib.local20.field8);
Benchmark.test(127,Test18Lib.local20.field9);
Benchmark.test(128,Test18Lib.local20.field10);
Benchmark.test(129,Test18Lib.local20.field11);
Benchmark.test(130,Test18Lib.local20.field3);
Benchmark.test(131,Test18Lib.local20.field4);
Benchmark.test(132,Test18Lib.local20.field5);
Benchmark.test(133,Test18Lib.local20.field1);
Benchmark.test(134,Test18Lib.local20.field2);
Benchmark.test(135,Test18Lib.local21.field12);
Benchmark.test(136,Test18Lib.local21.field13);
Benchmark.test(137,Test18Lib.local21.field14);
Benchmark.test(138,Test18Lib.local21.field15);
Benchmark.test(139,Test18Lib.local21.field8);
Benchmark.test(140,Test18Lib.local21.field9);
Benchmark.test(141,Test18Lib.local21.field10);
Benchmark.test(142,Test18Lib.local21.field11);
Benchmark.test(143,Test18Lib.local21.field3);
Benchmark.test(144,Test18Lib.local21.field4);
Benchmark.test(145,Test18Lib.local21.field5);
Benchmark.test(146,Test18Lib.local21.field1);
Benchmark.test(147,Test18Lib.local21.field2);
Benchmark.test(148,Test18Lib.local22.field12);
Benchmark.test(149,Test18Lib.local22.field13);
Benchmark.test(150,Test18Lib.local22.field14);
Benchmark.test(151,Test18Lib.local22.field15);
Benchmark.test(152,Test18Lib.local22.field8);
Benchmark.test(153,Test18Lib.local22.field9);
Benchmark.test(154,Test18Lib.local22.field10);
Benchmark.test(155,Test18Lib.local22.field11);
Benchmark.test(156,Test18Lib.local22.field3);
Benchmark.test(157,Test18Lib.local22.field4);
Benchmark.test(158,Test18Lib.local22.field5);
Benchmark.test(159,Test18Lib.local22.field1);
Benchmark.test(160,Test18Lib.local22.field2);
Benchmark.print();
}
}
