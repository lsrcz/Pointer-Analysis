package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test26Lib{
public static Test26Class1 local1;
public static Test26Class1 local2;
public static Test26Class1 local3;
public static Test26Class2 local4;
public static Test26Class2 local5;
public static Test26Class2 local6;
public static Test26Class2 local7;
public static Test26Class2 local8;
public static Test26Class2 local9;
public static Test26Class2 local10;
public static Test26Class3 local11;
public static Test26Class3 local12;
public static Test26Class3 local13;
public static Test26Class3 local14;
public static Test26Class4 local15;
public static Test26Class4 local16;
public static Test26Class4 local17;
public static Test26Class4 local18;
public static Test26Class4 local19;
public static Test26Class5 local20;
public static Test26Class5 local21;
public static Test26Class5 local22;
public static Test26Class5 local23;
public static Test26Class5 local24;
}
class Test26Class1 extends BasicClass {
public static Test26Class5 field1;
public static Test26Class3 field2;
public static Test26Class4 field3;
public static void method1(Test26Class2 arg0, int depth) {
if (depth == 0) return;
field1.field1.method3(field2.field3,field3.field12,depth-1);
}
public Test26Class1 method2(Test26Class5 arg0, Test26Class4 arg1, int depth) {
if (depth == 0) return Test26Lib.local12;
if (depth>4) {
for (int local25 = 0; local25<=1; local25 += 1) {
for (int local26 = 0; local26<=2; local26 += 1) {
for (int local27 = 0; local27<=1; local27 += 1) {
this.field2.method11(arg0.field2,depth-1);
}
}
}
}
if (depth>3) {
if (depth==2) {
if (depth==3) {
if (depth>1) {
if (depth==2) {
}
}else {
arg1.field13=arg1.field2.method9(this.field1,arg0.field1,depth-1);
}
}
}else {
for (int local28 = 0; local28<=3; local28 += 1) {
for (int local29 = 0; local29<=0; local29 += 1) {
arg1.field3.method15(arg1,depth-1);
}
}
}
}else {
arg1.field3.method16(arg1.field2,depth-1);
}
if (depth<=3) {
arg0=this.field1;
}else {
if (depth==3) {
for (int local30 = 0; local30<=2; local30 += 1) {
if (depth==1) {
for (int local31 = 0; local31<=3; local31 += 1) {
}
}
}
}
}
arg0.field2=arg1.field2;
for (int local32 = 0; local32<=1; local32 += 1) {
for (int local33 = 0; local33<=3; local33 += 1) {
for (int local34 = 0; local34<=2; local34 += 1) {
arg0.field15.method4(arg0.field1,arg0.field2,depth-1);
}
}
}
return this.field3;
}
public static void method3(Test26Class4 arg0, Test26Class4 arg1, int depth) {
if (depth == 0) return;
arg0.field14=arg1.field2.method10(arg1.field2,arg1.field12,depth-1);
if (depth==4) {
for (int local35 = 0; local35<=0; local35 += 1) {
field2.field2=field3.field2;
}
}else {
arg0.field13=field2.method12(depth-1);
}
field1.field1=field1;
for (int local36 = 0; local36<=3; local36 += 1) {
for (int local37 = 0; local37<=3; local37 += 1) {
if (depth>2) {
for (int local38 = 0; local38<=0; local38 += 1) {
field2.field2=field1.field2;
}
}else {
if (depth<=1) {
for (int local39 = 0; local39<=3; local39 += 1) {
}
}else {
if (depth<=3) {
}else {
}
}
}
}
}
if (depth>3) {
for (int local40 = 0; local40<=3; local40 += 1) {
field2.field8.method6(field1.field1,depth-1);
}
}else {
if (depth==2) {
field2.field8=field2.field8;
}
}
field2.field10.method15(arg1.field1,depth-1);
}
public static void method4(Test26Class5 arg0, Test26Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<=3) {
if (depth>=1) {
field2.field8.method7(field2.field9,depth-1);
}else {
for (int local41 = 0; local41<=0; local41 += 1) {
field3.field1.method2(field2.field1,arg1.field3,depth-1);
}
}
}
field3.field2=field2.field2;
}
}
class Test26Class2 extends Test26Class1 {
public Test26Class1 field4;
public Test26Class3 field5;
public Test26Class1 field6;
public static Test26Class2 field7;
public Test26Class1 method5(Test26Class1 arg0, Test26Class5 arg1, int depth) {
if (depth == 0) return Test26Lib.local13;
return this.field3;
}
public static Test26Class4 method6(Test26Class5 arg0, int depth) {
if (depth == 0) return Test26Lib.local18;
arg0.field2.method11(field2.field11,depth-1);
if (depth>=3) {
field7.field2.method11(field3.field2,depth-1);
}else {
for (int local42 = 0; local42<=2; local42 += 1) {
if (depth<1) {
field3.field14=field7.method5(arg0.field3,arg0.field1,depth-1);
}
}
}
field7.field6=arg0.field3;
arg0.field15.method3(field2.field10,field2.field3,depth-1);
return field3;
}
public void method7(Test26Class1 arg0, int depth) {
if (depth == 0) return;
this.field4=this.method5(arg0.field1,arg0.field1,depth-1);
}
public Test26Class2 method8(int depth) {
if (depth == 0) return Test26Lib.local9;
this.field4=this.field2;
this.field6=this.field2.method12(depth-1);
this.field7.method5(this,this.field1,depth-1);
if (depth<4) {
for (int local43 = 0; local43<=1; local43 += 1) {
if (depth==2) {
if (depth==4) {
this.field2=this.field5;
}else {
this.field4=this.field5;
}
}else {
this.field1=this.field1;
}
}
}
this.field2.method1(this.field7,depth-1);
if (depth==2) {
for (int local44 = 0; local44<=2; local44 += 1) {
this.field3=this.field3;
}
}else {
this.method6(this.field1,depth-1);
}
this.field6=this.field3;
return this;
}
}
class Test26Class3 extends Test26Class1 {
public static Test26Class2 field8;
public Test26Class3 field9;
public static Test26Class4 field10;
public static Test26Class3 field11;
public static Test26Class3 method9(Test26Class1 arg0, Test26Class5 arg1, int depth) {
if (depth == 0) return Test26Lib.local11;
field10.method13(arg1.field1,depth-1);
field8.method7(field11.field10,depth-1);
arg1.field1=arg1;
for (int local45 = 0; local45<=0; local45 += 1) {
field10.field14=field1.field2;
}
return arg0.field2;
}
public Test26Class2 method10(Test26Class3 arg0, Test26Class1 arg1, int depth) {
if (depth == 0) return Test26Lib.local8;
arg0.field2=this.field2;
arg0.field8=this.field8;
arg0.field3=arg0.field3;
for (int local46 = 0; local46<=3; local46 += 1) {
if (depth>1) {
if (depth<=2) {
for (int local47 = 0; local47<=3; local47 += 1) {
this.field1.method2(this.field1,arg1.field3,depth-1);
}
}else {
arg0.field11=arg1.field2;
}
}else {
if (depth>=2) {
for (int local48 = 0; local48<=3; local48 += 1) {
if (depth<4) {
}
}
}else {
if (depth==3) {
arg1=this.field10.method2(arg0.field1,arg0.field3,depth-1);
}else {
if (depth==4) {
}
}
}
}
}
arg1.field1=arg1.field1;
return this.field8;
}
public void method11(Test26Class3 arg0, int depth) {
if (depth == 0) return;
arg0=this.field11;
for (int local49 = 0; local49<=2; local49 += 1) {
for (int local50 = 0; local50<=0; local50 += 1) {
this.field10=arg0.field8.method6(arg0.field1,depth-1);
}
}
if (depth>=1) {
arg0.field3=arg0.field10;
}else {
if (depth<=1) {
for (int local51 = 0; local51<=3; local51 += 1) {
this.field10=this.field8.method6(this.field1,depth-1);
}
}else {
this.field2.method10(this,this.field1,depth-1);
}
}
}
public Test26Class1 method12(int depth) {
if (depth == 0) return Test26Lib.local8;
for (int local52 = 0; local52<=1; local52 += 1) {
if (depth>2) {
for (int local53 = 0; local53<=1; local53 += 1) {
for (int local54 = 0; local54<=0; local54 += 1) {
if (depth>=4) {
}
}
}
}
}
for (int local55 = 0; local55<=1; local55 += 1) {
this.field8=this.field8;
}
for (int local56 = 0; local56<=2; local56 += 1) {
this.field8.method6(this.field1,depth-1);
}
this.field8.method8(depth-1);
for (int local57 = 0; local57<=0; local57 += 1) {
for (int local58 = 0; local58<=2; local58 += 1) {
this.method4(this.field1,this.field8,depth-1);
}
}
for (int local59 = 0; local59<=1; local59 += 1) {
this.field8=this.field8;
}
this.field8.method8(depth-1);
return this.field11;
}
}
class Test26Class4 extends Test26Class1 {
public static Test26Class4 field12;
public Test26Class1 field13;
public static Test26Class1 field14;
public static void method13(Test26Class5 arg0, int depth) {
if (depth == 0) return;
field3.method15(field12.field13,depth-1);
for (int local60 = 0; local60<=1; local60 += 1) {
if (depth>3) {
field3.field13=arg0.field3;
}else {
if (depth<1) {
field3.field1=arg0;
}else {
for (int local61 = 0; local61<=2; local61 += 1) {
if (depth>1) {
}else {
}
}
}
}
}
field1.field3=arg0.field3.method14(field14.field2,depth-1);
field3.field14=field1.field2;
}
public static Test26Class4 method14(Test26Class3 arg0, int depth) {
if (depth == 0) return Test26Lib.local19;
field12.field1=field14.field1;
field12.field12.method16(field2,depth-1);
for (int local62 = 0; local62<=2; local62 += 1) {
field2.field3=field3.field3;
}
field12.field1.method18(field12.field1,field14.field2,depth-1);
for (int local63 = 0; local63<=1; local63 += 1) {
field2.field11=arg0.field9;
}
arg0.field8=arg0.field8.method8(depth-1);
for (int local64 = 0; local64<=2; local64 += 1) {
field2.field9.method3(field3,field3.field3,depth-1);
}
return field2.field3;
}
public static void method15(Test26Class1 arg0, int depth) {
if (depth == 0) return;
field2.field8.method5(field3.field3,field14.field1,depth-1);
arg0.field1.method18(arg0.field1,field2.field11,depth-1);
field14.field1.method18(field12.field1,field2.field2,depth-1);
field2.field11.method12(depth-1);
field14=arg0.field2.method12(depth-1);
if (depth<2) {
field3.field13=field2.field8.method8(depth-1);
}else {
if (depth<3) {
field3.field1=field14.field1;
}else {
field12.field3.method15(field1,depth-1);
}
}
field2.field8=field2.field8;
}
public static void method16(Test26Class3 arg0, int depth) {
if (depth == 0) return;
}
}
class Test26Class5 extends Test26Class1 {
public static Test26Class4 field15;
public Test26Class1 method17(Test26Class4 arg0, int depth) {
if (depth == 0) return Test26Lib.local8;
for (int local65 = 0; local65<=0; local65 += 1) {
for (int local66 = 0; local66<=2; local66 += 1) {
for (int local67 = 0; local67<=3; local67 += 1) {
arg0.field2=this.field2;
}
}
}
return arg0.field12;
}
public static void method18(Test26Class5 arg0, Test26Class3 arg1, int depth) {
if (depth == 0) return;
field3.field14=arg1.field11.method12(depth-1);
if (depth<3) {
for (int local68 = 0; local68<=0; local68 += 1) {
if (depth==2) {
if (depth==3) {
for (int local69 = 0; local69<=2; local69 += 1) {
}
}
}
}
}
field3.field14.method3(field3.field3,arg0.field15,depth-1);
}
public static void method19(Test26Class2 arg0, int depth) {
if (depth == 0) return;
for (int local70 = 0; local70<=3; local70 += 1) {
arg0.field7=arg0.field7;
}
}
}
public class Test26{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test26Lib.local1 = new Test26Class1();
Benchmark.alloc(2);
Test26Lib.local2 = new Test26Class1();
Benchmark.alloc(3);
Test26Lib.local3 = new Test26Class1();
Benchmark.alloc(4);
Test26Lib.local4 = new Test26Class2();
Benchmark.alloc(5);
Test26Lib.local5 = new Test26Class2();
Benchmark.alloc(6);
Test26Lib.local6 = new Test26Class2();
Benchmark.alloc(7);
Test26Lib.local7 = new Test26Class2();
Benchmark.alloc(8);
Test26Lib.local8 = new Test26Class2();
Benchmark.alloc(9);
Test26Lib.local9 = new Test26Class2();
Benchmark.alloc(10);
Test26Lib.local10 = new Test26Class2();
Benchmark.alloc(11);
Test26Lib.local11 = new Test26Class3();
Benchmark.alloc(12);
Test26Lib.local12 = new Test26Class3();
Benchmark.alloc(13);
Test26Lib.local13 = new Test26Class3();
Benchmark.alloc(14);
Test26Lib.local14 = new Test26Class3();
Benchmark.alloc(15);
Test26Lib.local15 = new Test26Class4();
Benchmark.alloc(16);
Test26Lib.local16 = new Test26Class4();
Benchmark.alloc(17);
Test26Lib.local17 = new Test26Class4();
Benchmark.alloc(18);
Test26Lib.local18 = new Test26Class4();
Benchmark.alloc(19);
Test26Lib.local19 = new Test26Class4();
Benchmark.alloc(20);
Test26Lib.local20 = new Test26Class5();
Benchmark.alloc(21);
Test26Lib.local21 = new Test26Class5();
Benchmark.alloc(22);
Test26Lib.local22 = new Test26Class5();
Benchmark.alloc(23);
Test26Lib.local23 = new Test26Class5();
Benchmark.alloc(24);
Test26Lib.local24 = new Test26Class5();
Test26Lib.local1.field1 = Test26Lib.local22;
Test26Lib.local1.field2 = Test26Lib.local13;
Test26Lib.local1.field3 = Test26Lib.local18;
Test26Lib.local2.field1 = Test26Lib.local23;
Test26Lib.local2.field2 = Test26Lib.local13;
Test26Lib.local2.field3 = Test26Lib.local17;
Test26Lib.local3.field1 = Test26Lib.local21;
Test26Lib.local3.field2 = Test26Lib.local14;
Test26Lib.local3.field3 = Test26Lib.local15;
Test26Lib.local4.field4 = Test26Lib.local14;
Test26Lib.local4.field5 = Test26Lib.local13;
Test26Lib.local4.field6 = Test26Lib.local18;
Test26Lib.local4.field7 = Test26Lib.local7;
Test26Lib.local4.field1 = Test26Lib.local21;
Test26Lib.local4.field2 = Test26Lib.local13;
Test26Lib.local4.field3 = Test26Lib.local15;
Test26Lib.local5.field4 = Test26Lib.local6;
Test26Lib.local5.field5 = Test26Lib.local13;
Test26Lib.local5.field6 = Test26Lib.local8;
Test26Lib.local5.field7 = Test26Lib.local10;
Test26Lib.local5.field1 = Test26Lib.local20;
Test26Lib.local5.field2 = Test26Lib.local13;
Test26Lib.local5.field3 = Test26Lib.local18;
Test26Lib.local6.field4 = Test26Lib.local10;
Test26Lib.local6.field5 = Test26Lib.local13;
Test26Lib.local6.field6 = Test26Lib.local3;
Test26Lib.local6.field7 = Test26Lib.local6;
Test26Lib.local6.field1 = Test26Lib.local21;
Test26Lib.local6.field2 = Test26Lib.local14;
Test26Lib.local6.field3 = Test26Lib.local17;
Test26Lib.local7.field4 = Test26Lib.local13;
Test26Lib.local7.field5 = Test26Lib.local11;
Test26Lib.local7.field6 = Test26Lib.local4;
Test26Lib.local7.field7 = Test26Lib.local8;
Test26Lib.local7.field1 = Test26Lib.local24;
Test26Lib.local7.field2 = Test26Lib.local11;
Test26Lib.local7.field3 = Test26Lib.local19;
Test26Lib.local8.field4 = Test26Lib.local3;
Test26Lib.local8.field5 = Test26Lib.local14;
Test26Lib.local8.field6 = Test26Lib.local2;
Test26Lib.local8.field7 = Test26Lib.local9;
Test26Lib.local8.field1 = Test26Lib.local22;
Test26Lib.local8.field2 = Test26Lib.local11;
Test26Lib.local8.field3 = Test26Lib.local15;
Test26Lib.local9.field4 = Test26Lib.local17;
Test26Lib.local9.field5 = Test26Lib.local12;
Test26Lib.local9.field6 = Test26Lib.local24;
Test26Lib.local9.field7 = Test26Lib.local8;
Test26Lib.local9.field1 = Test26Lib.local23;
Test26Lib.local9.field2 = Test26Lib.local12;
Test26Lib.local9.field3 = Test26Lib.local16;
Test26Lib.local10.field4 = Test26Lib.local3;
Test26Lib.local10.field5 = Test26Lib.local13;
Test26Lib.local10.field6 = Test26Lib.local21;
Test26Lib.local10.field7 = Test26Lib.local7;
Test26Lib.local10.field1 = Test26Lib.local24;
Test26Lib.local10.field2 = Test26Lib.local11;
Test26Lib.local10.field3 = Test26Lib.local17;
Test26Lib.local11.field8 = Test26Lib.local6;
Test26Lib.local11.field9 = Test26Lib.local12;
Test26Lib.local11.field10 = Test26Lib.local18;
Test26Lib.local11.field11 = Test26Lib.local12;
Test26Lib.local11.field1 = Test26Lib.local20;
Test26Lib.local11.field2 = Test26Lib.local13;
Test26Lib.local11.field3 = Test26Lib.local19;
Test26Lib.local12.field8 = Test26Lib.local9;
Test26Lib.local12.field9 = Test26Lib.local14;
Test26Lib.local12.field10 = Test26Lib.local18;
Test26Lib.local12.field11 = Test26Lib.local13;
Test26Lib.local12.field1 = Test26Lib.local21;
Test26Lib.local12.field2 = Test26Lib.local13;
Test26Lib.local12.field3 = Test26Lib.local19;
Test26Lib.local13.field8 = Test26Lib.local9;
Test26Lib.local13.field9 = Test26Lib.local13;
Test26Lib.local13.field10 = Test26Lib.local18;
Test26Lib.local13.field11 = Test26Lib.local12;
Test26Lib.local13.field1 = Test26Lib.local20;
Test26Lib.local13.field2 = Test26Lib.local13;
Test26Lib.local13.field3 = Test26Lib.local16;
Test26Lib.local14.field8 = Test26Lib.local10;
Test26Lib.local14.field9 = Test26Lib.local11;
Test26Lib.local14.field10 = Test26Lib.local17;
Test26Lib.local14.field11 = Test26Lib.local14;
Test26Lib.local14.field1 = Test26Lib.local21;
Test26Lib.local14.field2 = Test26Lib.local13;
Test26Lib.local14.field3 = Test26Lib.local17;
Test26Lib.local15.field12 = Test26Lib.local18;
Test26Lib.local15.field13 = Test26Lib.local3;
Test26Lib.local15.field14 = Test26Lib.local2;
Test26Lib.local15.field1 = Test26Lib.local23;
Test26Lib.local15.field2 = Test26Lib.local12;
Test26Lib.local15.field3 = Test26Lib.local19;
Test26Lib.local16.field12 = Test26Lib.local17;
Test26Lib.local16.field13 = Test26Lib.local2;
Test26Lib.local16.field14 = Test26Lib.local7;
Test26Lib.local16.field1 = Test26Lib.local20;
Test26Lib.local16.field2 = Test26Lib.local12;
Test26Lib.local16.field3 = Test26Lib.local16;
Test26Lib.local17.field12 = Test26Lib.local16;
Test26Lib.local17.field13 = Test26Lib.local24;
Test26Lib.local17.field14 = Test26Lib.local12;
Test26Lib.local17.field1 = Test26Lib.local24;
Test26Lib.local17.field2 = Test26Lib.local14;
Test26Lib.local17.field3 = Test26Lib.local17;
Test26Lib.local18.field12 = Test26Lib.local17;
Test26Lib.local18.field13 = Test26Lib.local22;
Test26Lib.local18.field14 = Test26Lib.local2;
Test26Lib.local18.field1 = Test26Lib.local22;
Test26Lib.local18.field2 = Test26Lib.local13;
Test26Lib.local18.field3 = Test26Lib.local17;
Test26Lib.local19.field12 = Test26Lib.local19;
Test26Lib.local19.field13 = Test26Lib.local7;
Test26Lib.local19.field14 = Test26Lib.local9;
Test26Lib.local19.field1 = Test26Lib.local23;
Test26Lib.local19.field2 = Test26Lib.local12;
Test26Lib.local19.field3 = Test26Lib.local17;
Test26Lib.local20.field15 = Test26Lib.local17;
Test26Lib.local20.field1 = Test26Lib.local22;
Test26Lib.local20.field2 = Test26Lib.local12;
Test26Lib.local20.field3 = Test26Lib.local19;
Test26Lib.local21.field15 = Test26Lib.local15;
Test26Lib.local21.field1 = Test26Lib.local22;
Test26Lib.local21.field2 = Test26Lib.local14;
Test26Lib.local21.field3 = Test26Lib.local17;
Test26Lib.local22.field15 = Test26Lib.local16;
Test26Lib.local22.field1 = Test26Lib.local22;
Test26Lib.local22.field2 = Test26Lib.local11;
Test26Lib.local22.field3 = Test26Lib.local19;
Test26Lib.local23.field15 = Test26Lib.local15;
Test26Lib.local23.field1 = Test26Lib.local22;
Test26Lib.local23.field2 = Test26Lib.local14;
Test26Lib.local23.field3 = Test26Lib.local15;
Test26Lib.local24.field15 = Test26Lib.local15;
Test26Lib.local24.field1 = Test26Lib.local24;
Test26Lib.local24.field2 = Test26Lib.local13;
Test26Lib.local24.field3 = Test26Lib.local18;
if (inputValue>2) {
for (int local71 = 0; local71<=3; local71 += 1) {
for (int local72 = 0; local72<=0; local72 += 1) {
Test26Lib.local8=Test26Lib.local9;
}
}
}else {
for (int local73 = 0; local73<=3; local73 += 1) {
if (inputValue>4) {
for (int local74 = 0; local74<=0; local74 += 1) {
if (inputValue<1) {
}
}
}
}
}
for (int local75 = 0; local75<=1; local75 += 1) {
Test26Lib.local6.field1=Test26Lib.local10.field1;
}
Test26Lib.local4.field3.method13(Test26Lib.local24,3);
for (int local76 = 0; local76<=3; local76 += 1) {
for (int local77 = 0; local77<=0; local77 += 1) {
for (int local78 = 0; local78<=0; local78 += 1) {
Test26Lib.local18.field14=Test26Lib.local17;
}
}
}
if (inputValue==1) {
if (inputValue<=3) {
for (int local79 = 0; local79<=1; local79 += 1) {
Test26Lib.local18.field13=Test26Lib.local14.field11;
}
}
}else {
for (int local80 = 0; local80<=1; local80 += 1) {
if (inputValue>=4) {
Test26Lib.local9.method7(Test26Lib.local18.field1,3);
}
}
}
if (inputValue>=4) {
if (inputValue==4) {
if (inputValue==3) {
if (inputValue>3) {
for (int local81 = 0; local81<=3; local81 += 1) {
}
}
}else {
Test26Lib.local4.field2=Test26Lib.local12.field9;
}
}else {
Test26Lib.local4=Test26Lib.local9.field7;
}
}
for (int local82 = 0; local82<=2; local82 += 1) {
Test26Lib.local9.method7(Test26Lib.local24.field2,3);
}
Test26Lib.local3.field2=Test26Lib.local11.field11;
Test26Lib.local16.field1.method19(Test26Lib.local9,3);
Test26Lib.local13.field10=Test26Lib.local18;
Benchmark.test(1,Test26Lib.local1);
Benchmark.test(2,Test26Lib.local2);
Benchmark.test(3,Test26Lib.local3);
Benchmark.test(4,Test26Lib.local4);
Benchmark.test(5,Test26Lib.local5);
Benchmark.test(6,Test26Lib.local6);
Benchmark.test(7,Test26Lib.local7);
Benchmark.test(8,Test26Lib.local8);
Benchmark.test(9,Test26Lib.local9);
Benchmark.test(10,Test26Lib.local10);
Benchmark.test(11,Test26Lib.local11);
Benchmark.test(12,Test26Lib.local12);
Benchmark.test(13,Test26Lib.local13);
Benchmark.test(14,Test26Lib.local14);
Benchmark.test(15,Test26Lib.local15);
Benchmark.test(16,Test26Lib.local16);
Benchmark.test(17,Test26Lib.local17);
Benchmark.test(18,Test26Lib.local18);
Benchmark.test(19,Test26Lib.local19);
Benchmark.test(20,Test26Lib.local20);
Benchmark.test(21,Test26Lib.local21);
Benchmark.test(22,Test26Lib.local22);
Benchmark.test(23,Test26Lib.local23);
Benchmark.test(24,Test26Lib.local24);
Benchmark.test(25,Test26Lib.local1.field1);
Benchmark.test(26,Test26Lib.local1.field2);
Benchmark.test(27,Test26Lib.local1.field3);
Benchmark.test(28,Test26Lib.local2.field1);
Benchmark.test(29,Test26Lib.local2.field2);
Benchmark.test(30,Test26Lib.local2.field3);
Benchmark.test(31,Test26Lib.local3.field1);
Benchmark.test(32,Test26Lib.local3.field2);
Benchmark.test(33,Test26Lib.local3.field3);
Benchmark.test(34,Test26Lib.local4.field4);
Benchmark.test(35,Test26Lib.local4.field5);
Benchmark.test(36,Test26Lib.local4.field6);
Benchmark.test(37,Test26Lib.local4.field7);
Benchmark.test(38,Test26Lib.local4.field1);
Benchmark.test(39,Test26Lib.local4.field2);
Benchmark.test(40,Test26Lib.local4.field3);
Benchmark.test(41,Test26Lib.local5.field4);
Benchmark.test(42,Test26Lib.local5.field5);
Benchmark.test(43,Test26Lib.local5.field6);
Benchmark.test(44,Test26Lib.local5.field7);
Benchmark.test(45,Test26Lib.local5.field1);
Benchmark.test(46,Test26Lib.local5.field2);
Benchmark.test(47,Test26Lib.local5.field3);
Benchmark.test(48,Test26Lib.local6.field4);
Benchmark.test(49,Test26Lib.local6.field5);
Benchmark.test(50,Test26Lib.local6.field6);
Benchmark.test(51,Test26Lib.local6.field7);
Benchmark.test(52,Test26Lib.local6.field1);
Benchmark.test(53,Test26Lib.local6.field2);
Benchmark.test(54,Test26Lib.local6.field3);
Benchmark.test(55,Test26Lib.local7.field4);
Benchmark.test(56,Test26Lib.local7.field5);
Benchmark.test(57,Test26Lib.local7.field6);
Benchmark.test(58,Test26Lib.local7.field7);
Benchmark.test(59,Test26Lib.local7.field1);
Benchmark.test(60,Test26Lib.local7.field2);
Benchmark.test(61,Test26Lib.local7.field3);
Benchmark.test(62,Test26Lib.local8.field4);
Benchmark.test(63,Test26Lib.local8.field5);
Benchmark.test(64,Test26Lib.local8.field6);
Benchmark.test(65,Test26Lib.local8.field7);
Benchmark.test(66,Test26Lib.local8.field1);
Benchmark.test(67,Test26Lib.local8.field2);
Benchmark.test(68,Test26Lib.local8.field3);
Benchmark.test(69,Test26Lib.local9.field4);
Benchmark.test(70,Test26Lib.local9.field5);
Benchmark.test(71,Test26Lib.local9.field6);
Benchmark.test(72,Test26Lib.local9.field7);
Benchmark.test(73,Test26Lib.local9.field1);
Benchmark.test(74,Test26Lib.local9.field2);
Benchmark.test(75,Test26Lib.local9.field3);
Benchmark.test(76,Test26Lib.local10.field4);
Benchmark.test(77,Test26Lib.local10.field5);
Benchmark.test(78,Test26Lib.local10.field6);
Benchmark.test(79,Test26Lib.local10.field7);
Benchmark.test(80,Test26Lib.local10.field1);
Benchmark.test(81,Test26Lib.local10.field2);
Benchmark.test(82,Test26Lib.local10.field3);
Benchmark.test(83,Test26Lib.local11.field8);
Benchmark.test(84,Test26Lib.local11.field9);
Benchmark.test(85,Test26Lib.local11.field10);
Benchmark.test(86,Test26Lib.local11.field11);
Benchmark.test(87,Test26Lib.local11.field1);
Benchmark.test(88,Test26Lib.local11.field2);
Benchmark.test(89,Test26Lib.local11.field3);
Benchmark.test(90,Test26Lib.local12.field8);
Benchmark.test(91,Test26Lib.local12.field9);
Benchmark.test(92,Test26Lib.local12.field10);
Benchmark.test(93,Test26Lib.local12.field11);
Benchmark.test(94,Test26Lib.local12.field1);
Benchmark.test(95,Test26Lib.local12.field2);
Benchmark.test(96,Test26Lib.local12.field3);
Benchmark.test(97,Test26Lib.local13.field8);
Benchmark.test(98,Test26Lib.local13.field9);
Benchmark.test(99,Test26Lib.local13.field10);
Benchmark.test(100,Test26Lib.local13.field11);
Benchmark.test(101,Test26Lib.local13.field1);
Benchmark.test(102,Test26Lib.local13.field2);
Benchmark.test(103,Test26Lib.local13.field3);
Benchmark.test(104,Test26Lib.local14.field8);
Benchmark.test(105,Test26Lib.local14.field9);
Benchmark.test(106,Test26Lib.local14.field10);
Benchmark.test(107,Test26Lib.local14.field11);
Benchmark.test(108,Test26Lib.local14.field1);
Benchmark.test(109,Test26Lib.local14.field2);
Benchmark.test(110,Test26Lib.local14.field3);
Benchmark.test(111,Test26Lib.local15.field12);
Benchmark.test(112,Test26Lib.local15.field13);
Benchmark.test(113,Test26Lib.local15.field14);
Benchmark.test(114,Test26Lib.local15.field1);
Benchmark.test(115,Test26Lib.local15.field2);
Benchmark.test(116,Test26Lib.local15.field3);
Benchmark.test(117,Test26Lib.local16.field12);
Benchmark.test(118,Test26Lib.local16.field13);
Benchmark.test(119,Test26Lib.local16.field14);
Benchmark.test(120,Test26Lib.local16.field1);
Benchmark.test(121,Test26Lib.local16.field2);
Benchmark.test(122,Test26Lib.local16.field3);
Benchmark.test(123,Test26Lib.local17.field12);
Benchmark.test(124,Test26Lib.local17.field13);
Benchmark.test(125,Test26Lib.local17.field14);
Benchmark.test(126,Test26Lib.local17.field1);
Benchmark.test(127,Test26Lib.local17.field2);
Benchmark.test(128,Test26Lib.local17.field3);
Benchmark.test(129,Test26Lib.local18.field12);
Benchmark.test(130,Test26Lib.local18.field13);
Benchmark.test(131,Test26Lib.local18.field14);
Benchmark.test(132,Test26Lib.local18.field1);
Benchmark.test(133,Test26Lib.local18.field2);
Benchmark.test(134,Test26Lib.local18.field3);
Benchmark.test(135,Test26Lib.local19.field12);
Benchmark.test(136,Test26Lib.local19.field13);
Benchmark.test(137,Test26Lib.local19.field14);
Benchmark.test(138,Test26Lib.local19.field1);
Benchmark.test(139,Test26Lib.local19.field2);
Benchmark.test(140,Test26Lib.local19.field3);
Benchmark.test(141,Test26Lib.local20.field15);
Benchmark.test(142,Test26Lib.local20.field1);
Benchmark.test(143,Test26Lib.local20.field2);
Benchmark.test(144,Test26Lib.local20.field3);
Benchmark.test(145,Test26Lib.local21.field15);
Benchmark.test(146,Test26Lib.local21.field1);
Benchmark.test(147,Test26Lib.local21.field2);
Benchmark.test(148,Test26Lib.local21.field3);
Benchmark.test(149,Test26Lib.local22.field15);
Benchmark.test(150,Test26Lib.local22.field1);
Benchmark.test(151,Test26Lib.local22.field2);
Benchmark.test(152,Test26Lib.local22.field3);
Benchmark.test(153,Test26Lib.local23.field15);
Benchmark.test(154,Test26Lib.local23.field1);
Benchmark.test(155,Test26Lib.local23.field2);
Benchmark.test(156,Test26Lib.local23.field3);
Benchmark.test(157,Test26Lib.local24.field15);
Benchmark.test(158,Test26Lib.local24.field1);
Benchmark.test(159,Test26Lib.local24.field2);
Benchmark.test(160,Test26Lib.local24.field3);
Benchmark.print();
}
}
