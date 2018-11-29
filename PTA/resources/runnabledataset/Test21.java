package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test21Lib{
public static Test21Class1 local1;
public static Test21Class1 local2;
public static Test21Class1 local3;
public static Test21Class1 local4;
public static Test21Class1 local5;
public static Test21Class1 local6;
public static Test21Class1 local7;
public static Test21Class1 local8;
public static Test21Class2 local9;
public static Test21Class2 local10;
public static Test21Class2 local11;
public static Test21Class2 local12;
public static Test21Class2 local13;
public static Test21Class2 local14;
public static Test21Class2 local15;
public static Test21Class2 local16;
public static Test21Class2 local17;
public static Test21Class2 local18;
public static Test21Class3 local19;
public static Test21Class3 local20;
public static Test21Class3 local21;
public static Test21Class3 local22;
public static Test21Class3 local23;
public static Test21Class3 local24;
public static Test21Class3 local25;
public static Test21Class4 local26;
public static Test21Class5 local27;
public static Test21Class5 local28;
}
class Test21Class1 extends BasicClass {
public static Test21Class1 field1;
public Test21Class3 field2;
public Test21Class3 field3;
public Test21Class4 method1(Test21Class3 arg0, Test21Class2 arg1, int depth) {
if (depth == 0) return Test21Lib.local26;
for (int local29 = 0; local29<=1; local29 += 1) {
if (depth>=2) {
arg1=arg1;
}else {
for (int local30 = 0; local30<=2; local30 += 1) {
for (int local31 = 0; local31<=1; local31 += 1) {
this.field1=arg0;
}
}
}
}
for (int local32 = 0; local32<=1; local32 += 1) {
arg0.field6=arg0.field6;
}
return arg0.field6;
}
}
class Test21Class2 extends Test21Class1 {
public static Test21Class3 field4;
public static Test21Class3 field5;
public static void method2(Test21Class1 arg0, Test21Class5 arg1, int depth) {
if (depth == 0) return;
if (depth<=1) {
field4.field6=arg1.field11;
}
for (int local33 = 0; local33<=3; local33 += 1) {
for (int local34 = 0; local34<=3; local34 += 1) {
for (int local35 = 0; local35<=2; local35 += 1) {
if (depth<=1) {
arg1.field11.method2(arg1.field8,arg1.field9,depth-1);
}
}
}
}
field5.field6.method7(arg1,field4.field2,depth-1);
field1=arg1.field11.method3(arg1.field6,arg1.field2,depth-1);
for (int local36 = 0; local36<=2; local36 += 1) {
if (depth<1) {
field4.field6.method6(field4.field6,field5.field6,depth-1);
}
}
for (int local37 = 0; local37<=1; local37 += 1) {
for (int local38 = 0; local38<=2; local38 += 1) {
arg1.field6.method2(arg1,arg1,depth-1);
}
}
}
public Test21Class4 method3(Test21Class4 arg0, Test21Class3 arg1, int depth) {
if (depth == 0) return Test21Lib.local26;
return arg0;
}
public static Test21Class3 method4(Test21Class5 arg0, Test21Class2 arg1, int depth) {
if (depth == 0) return Test21Lib.local22;
for (int local39 = 0; local39<=3; local39 += 1) {
for (int local40 = 0; local40<=0; local40 += 1) {
arg0.field9.method10(field5.field6,field4.field6,depth-1);
}
}
if (depth<=4) {
field5.field6.method8(arg0.field11,field4.field6,depth-1);
}else {
arg0.field9=arg0.field8;
}
return arg0.field10;
}
}
class Test21Class3 extends Test21Class1 {
public static Test21Class4 field6;
public static void method5(Test21Class4 arg0, int depth) {
if (depth == 0) return;
for (int local41 = 0; local41<=3; local41 += 1) {
for (int local42 = 0; local42<=0; local42 += 1) {
arg0.method9(arg0.field1,field6.field2,depth-1);
}
}
field6.field4=field1.field2;
for (int local43 = 0; local43<=2; local43 += 1) {
for (int local44 = 0; local44<=2; local44 += 1) {
if (depth>2) {
arg0.method6(arg0,field6,depth-1);
}
}
}
field6=arg0;
if (depth>1) {
field6=arg0;
}else {
if (depth==1) {
arg0.field7=arg0;
}else {
if (depth<2) {
arg0.field7=field6.field1.method1(field1.field3,arg0,depth-1);
}
}
}
for (int local45 = 0; local45<=3; local45 += 1) {
for (int local46 = 0; local46<=0; local46 += 1) {
field6.field7.method3(field6,field6.field2,depth-1);
}
}
arg0.field1=arg0.field7;
arg0=arg0;
arg0.method8(field6,field6,depth-1);
}
}
class Test21Class4 extends Test21Class2 {
public static Test21Class2 field7;
public static void method6(Test21Class2 arg0, Test21Class4 arg1, int depth) {
if (depth == 0) return;
if (depth<=2) {
for (int local47 = 0; local47<=2; local47 += 1) {
if (depth==2) {
field4.field1=field5.field6;
}else {
for (int local48 = 0; local48<=2; local48 += 1) {
for (int local49 = 0; local49<=2; local49 += 1) {
}
}
}
}
}
arg1=arg1;
if (depth>4) {
if (depth>4) {
for (int local50 = 0; local50<=1; local50 += 1) {
field5.field2=field4.field6.method8(field4.field6,field5.field6,depth-1);
}
}else {
if (depth<=4) {
field1.field3=field4.field6.method8(field5.field6,field5.field6,depth-1);
}
}
}else {
for (int local51 = 0; local51<=3; local51 += 1) {
field1.field3=arg1.field4;
}
}
field4.field1=field5.field3;
if (depth<4) {
field4.field6=field5.field6;
}
arg0.field3=arg1.field3;
for (int local52 = 0; local52<=1; local52 += 1) {
for (int local53 = 0; local53<=3; local53 += 1) {
if (depth>=3) {
for (int local54 = 0; local54<=2; local54 += 1) {
if (depth<=3) {
}
}
}else {
if (depth<=4) {
arg1.field7=field5.field6.method1(arg1.field3,field5.field6,depth-1);
}
}
}
}
for (int local55 = 0; local55<=0; local55 += 1) {
arg0.field3=arg1.field4;
}
field4.field6.method6(field4.field6,arg1,depth-1);
}
public void method7(Test21Class5 arg0, Test21Class1 arg1, int depth) {
if (depth == 0) return;
arg0.field8=arg0;
arg0.field11=arg0.field6;
arg0.field6.method2(this.field2,arg0.field9,depth-1);
for (int local56 = 0; local56<=3; local56 += 1) {
arg0.field2=this.field4;
}
}
public Test21Class5 method8(Test21Class4 arg0, Test21Class4 arg1, int depth) {
if (depth == 0) return Test21Lib.local28;
for (int local57 = 0; local57<=2; local57 += 1) {
if (depth<=2) {
arg1.field1=arg0.method3(arg1,this.field3,depth-1);
}else {
for (int local58 = 0; local58<=1; local58 += 1) {
for (int local59 = 0; local59<=1; local59 += 1) {
if (depth<=4) {
}else {
}
}
}
}
}
return Test21Lib.local27;
}
public Test21Class2 method9(Test21Class1 arg0, Test21Class3 arg1, int depth) {
if (depth == 0) return Test21Lib.local9;
for (int local60 = 0; local60<=0; local60 += 1) {
if (depth==4) {
arg1.field3.method5(arg1.field6,depth-1);
}
}
arg1.field6=arg1.field6;
for (int local61 = 0; local61<=1; local61 += 1) {
for (int local62 = 0; local62<=2; local62 += 1) {
this.field2=this.field2;
}
}
if (depth>1) {
for (int local63 = 0; local63<=3; local63 += 1) {
if (depth>=2) {
if (depth>=4) {
for (int local64 = 0; local64<=2; local64 += 1) {
}
}else {
if (depth<=4) {
}
}
}
}
}
arg0=this.field1.method1(arg1.field2,this.field7,depth-1);
arg1.field6=this;
for (int local65 = 0; local65<=3; local65 += 1) {
for (int local66 = 0; local66<=2; local66 += 1) {
arg0.field1=this.field2;
}
}
if (depth<=1) {
if (depth<4) {
if (depth>4) {
if (depth==1) {
arg0=arg1.field6.method8(arg1.field6,arg1.field6,depth-1);
}else {
arg1.field6=arg1.field6;
}
}
}else {
for (int local67 = 0; local67<=1; local67 += 1) {
this.field3.method5(this,depth-1);
}
}
}else {
for (int local68 = 0; local68<=3; local68 += 1) {
if (depth<3) {
this.field4.method5(this,depth-1);
}else {
if (depth==2) {
arg1.field6=this;
}
}
}
}
this.method6(this.field7,this,depth-1);
return arg1.field6;
}
}
class Test21Class5 extends Test21Class3 {
public static Test21Class5 field8;
public static Test21Class5 field9;
public static Test21Class3 field10;
public Test21Class4 field11;
public Test21Class3 method10(Test21Class4 arg0, Test21Class4 arg1, int depth) {
if (depth == 0) return Test21Lib.local19;
if (depth<4) {
arg1.field7=arg0;
}
if (depth>2) {
if (depth<2) {
arg0.field7.method4(this.field8,arg0.field7,depth-1);
}
}else {
for (int local69 = 0; local69<=3; local69 += 1) {
if (depth<1) {
for (int local70 = 0; local70<=0; local70 += 1) {
arg0.field1=arg1.field5;
}
}
}
}
this.field9=this.field8;
if (depth==2) {
if (depth==4) {
if (depth==3) {
if (depth>2) {
if (depth==4) {
}
}else {
arg0.field5=arg0.field4;
}
}else {
arg0.field3=this.field10;
}
}
}
if (depth>=1) {
this.field9=this.field8;
}
if (depth>2) {
this.field11=arg1.method1(this.field2,arg0,depth-1);
}
if (depth<=1) {
arg0.field4=this.field9.method10(this.field6,this.field11,depth-1);
}else {
this.field9=this;
}
return arg0.field3;
}
public void method11(Test21Class5 arg0, int depth) {
if (depth == 0) return;
arg0.field6=arg0.field6;
if (depth<2) {
for (int local71 = 0; local71<=1; local71 += 1) {
if (depth>=2) {
for (int local72 = 0; local72<=0; local72 += 1) {
this.field6=arg0.field11;
}
}
}
}else {
arg0.field3=this.field2;
}
if (depth>3) {
for (int local73 = 0; local73<=1; local73 += 1) {
this.field9=this.field8;
}
}
arg0.field6=this.field11;
arg0.field11=this.field11.method3(this.field6,arg0.field9,depth-1);
if (depth==4) {
if (depth<=2) {
for (int local74 = 0; local74<=0; local74 += 1) {
arg0.field9.method5(this.field11,depth-1);
}
}else {
arg0.field1=arg0.field1;
}
}
}
public Test21Class4 method12(int depth) {
if (depth == 0) return Test21Lib.local26;
this.field9.method11(this.field9,depth-1);
for (int local75 = 0; local75<=1; local75 += 1) {
this.field11.method6(this.field6,this.field11,depth-1);
}
if (depth==4) {
this.field9.method11(this.field8,depth-1);
}else {
if (depth>=4) {
for (int local76 = 0; local76<=2; local76 += 1) {
for (int local77 = 0; local77<=1; local77 += 1) {
this.field9=this.field9;
}
}
}
}
this.field10=this.field3;
for (int local78 = 0; local78<=3; local78 += 1) {
this.field10=this.field9.method10(this.field11,this.field6,depth-1);
}
this.field11.method7(this.field9,this.field9,depth-1);
return this.field11;
}
}
public class Test21{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test21Lib.local1 = new Test21Class1();
Benchmark.alloc(2);
Test21Lib.local2 = new Test21Class1();
Benchmark.alloc(3);
Test21Lib.local3 = new Test21Class1();
Benchmark.alloc(4);
Test21Lib.local4 = new Test21Class1();
Benchmark.alloc(5);
Test21Lib.local5 = new Test21Class1();
Benchmark.alloc(6);
Test21Lib.local6 = new Test21Class1();
Benchmark.alloc(7);
Test21Lib.local7 = new Test21Class1();
Benchmark.alloc(8);
Test21Lib.local8 = new Test21Class1();
Benchmark.alloc(9);
Test21Lib.local9 = new Test21Class2();
Benchmark.alloc(10);
Test21Lib.local10 = new Test21Class2();
Benchmark.alloc(11);
Test21Lib.local11 = new Test21Class2();
Benchmark.alloc(12);
Test21Lib.local12 = new Test21Class2();
Benchmark.alloc(13);
Test21Lib.local13 = new Test21Class2();
Benchmark.alloc(14);
Test21Lib.local14 = new Test21Class2();
Benchmark.alloc(15);
Test21Lib.local15 = new Test21Class2();
Benchmark.alloc(16);
Test21Lib.local16 = new Test21Class2();
Benchmark.alloc(17);
Test21Lib.local17 = new Test21Class2();
Benchmark.alloc(18);
Test21Lib.local18 = new Test21Class2();
Benchmark.alloc(19);
Test21Lib.local19 = new Test21Class3();
Benchmark.alloc(20);
Test21Lib.local20 = new Test21Class3();
Benchmark.alloc(21);
Test21Lib.local21 = new Test21Class3();
Benchmark.alloc(22);
Test21Lib.local22 = new Test21Class3();
Benchmark.alloc(23);
Test21Lib.local23 = new Test21Class3();
Benchmark.alloc(24);
Test21Lib.local24 = new Test21Class3();
Benchmark.alloc(25);
Test21Lib.local25 = new Test21Class3();
Benchmark.alloc(26);
Test21Lib.local26 = new Test21Class4();
Benchmark.alloc(27);
Test21Lib.local27 = new Test21Class5();
Benchmark.alloc(28);
Test21Lib.local28 = new Test21Class5();
Test21Lib.local1.field1 = Test21Lib.local15;
Test21Lib.local1.field2 = Test21Lib.local27;
Test21Lib.local1.field3 = Test21Lib.local20;
Test21Lib.local2.field1 = Test21Lib.local19;
Test21Lib.local2.field2 = Test21Lib.local23;
Test21Lib.local2.field3 = Test21Lib.local28;
Test21Lib.local3.field1 = Test21Lib.local10;
Test21Lib.local3.field2 = Test21Lib.local22;
Test21Lib.local3.field3 = Test21Lib.local19;
Test21Lib.local4.field1 = Test21Lib.local4;
Test21Lib.local4.field2 = Test21Lib.local19;
Test21Lib.local4.field3 = Test21Lib.local27;
Test21Lib.local5.field1 = Test21Lib.local9;
Test21Lib.local5.field2 = Test21Lib.local21;
Test21Lib.local5.field3 = Test21Lib.local19;
Test21Lib.local6.field1 = Test21Lib.local25;
Test21Lib.local6.field2 = Test21Lib.local21;
Test21Lib.local6.field3 = Test21Lib.local22;
Test21Lib.local7.field1 = Test21Lib.local15;
Test21Lib.local7.field2 = Test21Lib.local25;
Test21Lib.local7.field3 = Test21Lib.local23;
Test21Lib.local8.field1 = Test21Lib.local19;
Test21Lib.local8.field2 = Test21Lib.local25;
Test21Lib.local8.field3 = Test21Lib.local19;
Test21Lib.local9.field4 = Test21Lib.local24;
Test21Lib.local9.field5 = Test21Lib.local27;
Test21Lib.local9.field1 = Test21Lib.local22;
Test21Lib.local9.field2 = Test21Lib.local21;
Test21Lib.local9.field3 = Test21Lib.local20;
Test21Lib.local10.field4 = Test21Lib.local23;
Test21Lib.local10.field5 = Test21Lib.local28;
Test21Lib.local10.field1 = Test21Lib.local6;
Test21Lib.local10.field2 = Test21Lib.local19;
Test21Lib.local10.field3 = Test21Lib.local22;
Test21Lib.local11.field4 = Test21Lib.local19;
Test21Lib.local11.field5 = Test21Lib.local25;
Test21Lib.local11.field1 = Test21Lib.local5;
Test21Lib.local11.field2 = Test21Lib.local25;
Test21Lib.local11.field3 = Test21Lib.local24;
Test21Lib.local12.field4 = Test21Lib.local28;
Test21Lib.local12.field5 = Test21Lib.local24;
Test21Lib.local12.field1 = Test21Lib.local15;
Test21Lib.local12.field2 = Test21Lib.local21;
Test21Lib.local12.field3 = Test21Lib.local25;
Test21Lib.local13.field4 = Test21Lib.local27;
Test21Lib.local13.field5 = Test21Lib.local19;
Test21Lib.local13.field1 = Test21Lib.local2;
Test21Lib.local13.field2 = Test21Lib.local24;
Test21Lib.local13.field3 = Test21Lib.local23;
Test21Lib.local14.field4 = Test21Lib.local24;
Test21Lib.local14.field5 = Test21Lib.local20;
Test21Lib.local14.field1 = Test21Lib.local15;
Test21Lib.local14.field2 = Test21Lib.local19;
Test21Lib.local14.field3 = Test21Lib.local19;
Test21Lib.local15.field4 = Test21Lib.local28;
Test21Lib.local15.field5 = Test21Lib.local25;
Test21Lib.local15.field1 = Test21Lib.local5;
Test21Lib.local15.field2 = Test21Lib.local23;
Test21Lib.local15.field3 = Test21Lib.local19;
Test21Lib.local16.field4 = Test21Lib.local27;
Test21Lib.local16.field5 = Test21Lib.local28;
Test21Lib.local16.field1 = Test21Lib.local27;
Test21Lib.local16.field2 = Test21Lib.local21;
Test21Lib.local16.field3 = Test21Lib.local21;
Test21Lib.local17.field4 = Test21Lib.local27;
Test21Lib.local17.field5 = Test21Lib.local25;
Test21Lib.local17.field1 = Test21Lib.local11;
Test21Lib.local17.field2 = Test21Lib.local19;
Test21Lib.local17.field3 = Test21Lib.local20;
Test21Lib.local18.field4 = Test21Lib.local27;
Test21Lib.local18.field5 = Test21Lib.local22;
Test21Lib.local18.field1 = Test21Lib.local4;
Test21Lib.local18.field2 = Test21Lib.local19;
Test21Lib.local18.field3 = Test21Lib.local24;
Test21Lib.local19.field6 = Test21Lib.local26;
Test21Lib.local19.field1 = Test21Lib.local2;
Test21Lib.local19.field2 = Test21Lib.local25;
Test21Lib.local19.field3 = Test21Lib.local22;
Test21Lib.local20.field6 = Test21Lib.local26;
Test21Lib.local20.field1 = Test21Lib.local23;
Test21Lib.local20.field2 = Test21Lib.local27;
Test21Lib.local20.field3 = Test21Lib.local21;
Test21Lib.local21.field6 = Test21Lib.local26;
Test21Lib.local21.field1 = Test21Lib.local2;
Test21Lib.local21.field2 = Test21Lib.local20;
Test21Lib.local21.field3 = Test21Lib.local21;
Test21Lib.local22.field6 = Test21Lib.local26;
Test21Lib.local22.field1 = Test21Lib.local7;
Test21Lib.local22.field2 = Test21Lib.local22;
Test21Lib.local22.field3 = Test21Lib.local27;
Test21Lib.local23.field6 = Test21Lib.local26;
Test21Lib.local23.field1 = Test21Lib.local1;
Test21Lib.local23.field2 = Test21Lib.local21;
Test21Lib.local23.field3 = Test21Lib.local24;
Test21Lib.local24.field6 = Test21Lib.local26;
Test21Lib.local24.field1 = Test21Lib.local14;
Test21Lib.local24.field2 = Test21Lib.local22;
Test21Lib.local24.field3 = Test21Lib.local25;
Test21Lib.local25.field6 = Test21Lib.local26;
Test21Lib.local25.field1 = Test21Lib.local15;
Test21Lib.local25.field2 = Test21Lib.local27;
Test21Lib.local25.field3 = Test21Lib.local27;
Test21Lib.local26.field7 = Test21Lib.local18;
Test21Lib.local26.field4 = Test21Lib.local22;
Test21Lib.local26.field5 = Test21Lib.local24;
Test21Lib.local26.field1 = Test21Lib.local20;
Test21Lib.local26.field2 = Test21Lib.local28;
Test21Lib.local26.field3 = Test21Lib.local25;
Test21Lib.local27.field8 = Test21Lib.local27;
Test21Lib.local27.field9 = Test21Lib.local27;
Test21Lib.local27.field10 = Test21Lib.local24;
Test21Lib.local27.field11 = Test21Lib.local26;
Test21Lib.local27.field6 = Test21Lib.local26;
Test21Lib.local27.field1 = Test21Lib.local1;
Test21Lib.local27.field2 = Test21Lib.local25;
Test21Lib.local27.field3 = Test21Lib.local25;
Test21Lib.local28.field8 = Test21Lib.local27;
Test21Lib.local28.field9 = Test21Lib.local28;
Test21Lib.local28.field10 = Test21Lib.local28;
Test21Lib.local28.field11 = Test21Lib.local26;
Test21Lib.local28.field6 = Test21Lib.local26;
Test21Lib.local28.field1 = Test21Lib.local17;
Test21Lib.local28.field2 = Test21Lib.local24;
Test21Lib.local28.field3 = Test21Lib.local21;
for (int local79 = 0; local79<=3; local79 += 1) {
Test21Lib.local20.field6.method6(Test21Lib.local14,Test21Lib.local25.field6,3);
}
if (inputValue<1) {
Test21Lib.local28.field11=Test21Lib.local1.field2.method1(Test21Lib.local16.field2,Test21Lib.local22.field6,3);
}else {
Test21Lib.local27=Test21Lib.local27.field9;
}
Test21Lib.local17.field5=Test21Lib.local27.field8.method10(Test21Lib.local25.field6,Test21Lib.local27.field6,3);
Test21Lib.local14.field5=Test21Lib.local21.field3;
Test21Lib.local12=Test21Lib.local26.field7;
if (inputValue==4) {
Test21Lib.local5.field3=Test21Lib.local19.field2;
}else {
Test21Lib.local23.field1=Test21Lib.local28.field11.method9(Test21Lib.local28.field9,Test21Lib.local20,3);
}
Test21Lib.local24.field6.method7(Test21Lib.local28.field8,Test21Lib.local6,3);
for (int local80 = 0; local80<=0; local80 += 1) {
if (inputValue==4) {
Test21Lib.local27.field11.method6(Test21Lib.local13,Test21Lib.local23.field6,3);
}else {
Test21Lib.local25.field6=Test21Lib.local21.field6;
}
}
Test21Lib.local21.field6.method7(Test21Lib.local28.field8,Test21Lib.local17.field4,3);
Test21Lib.local7.field1=Test21Lib.local15.method3(Test21Lib.local22.field6,Test21Lib.local7.field2,3);
Benchmark.test(1,Test21Lib.local1);
Benchmark.test(2,Test21Lib.local2);
Benchmark.test(3,Test21Lib.local3);
Benchmark.test(4,Test21Lib.local4);
Benchmark.test(5,Test21Lib.local5);
Benchmark.test(6,Test21Lib.local6);
Benchmark.test(7,Test21Lib.local7);
Benchmark.test(8,Test21Lib.local8);
Benchmark.test(9,Test21Lib.local9);
Benchmark.test(10,Test21Lib.local10);
Benchmark.test(11,Test21Lib.local11);
Benchmark.test(12,Test21Lib.local12);
Benchmark.test(13,Test21Lib.local13);
Benchmark.test(14,Test21Lib.local14);
Benchmark.test(15,Test21Lib.local15);
Benchmark.test(16,Test21Lib.local16);
Benchmark.test(17,Test21Lib.local17);
Benchmark.test(18,Test21Lib.local18);
Benchmark.test(19,Test21Lib.local19);
Benchmark.test(20,Test21Lib.local20);
Benchmark.test(21,Test21Lib.local21);
Benchmark.test(22,Test21Lib.local22);
Benchmark.test(23,Test21Lib.local23);
Benchmark.test(24,Test21Lib.local24);
Benchmark.test(25,Test21Lib.local25);
Benchmark.test(26,Test21Lib.local26);
Benchmark.test(27,Test21Lib.local27);
Benchmark.test(28,Test21Lib.local28);
Benchmark.test(29,Test21Lib.local1.field1);
Benchmark.test(30,Test21Lib.local1.field2);
Benchmark.test(31,Test21Lib.local1.field3);
Benchmark.test(32,Test21Lib.local2.field1);
Benchmark.test(33,Test21Lib.local2.field2);
Benchmark.test(34,Test21Lib.local2.field3);
Benchmark.test(35,Test21Lib.local3.field1);
Benchmark.test(36,Test21Lib.local3.field2);
Benchmark.test(37,Test21Lib.local3.field3);
Benchmark.test(38,Test21Lib.local4.field1);
Benchmark.test(39,Test21Lib.local4.field2);
Benchmark.test(40,Test21Lib.local4.field3);
Benchmark.test(41,Test21Lib.local5.field1);
Benchmark.test(42,Test21Lib.local5.field2);
Benchmark.test(43,Test21Lib.local5.field3);
Benchmark.test(44,Test21Lib.local6.field1);
Benchmark.test(45,Test21Lib.local6.field2);
Benchmark.test(46,Test21Lib.local6.field3);
Benchmark.test(47,Test21Lib.local7.field1);
Benchmark.test(48,Test21Lib.local7.field2);
Benchmark.test(49,Test21Lib.local7.field3);
Benchmark.test(50,Test21Lib.local8.field1);
Benchmark.test(51,Test21Lib.local8.field2);
Benchmark.test(52,Test21Lib.local8.field3);
Benchmark.test(53,Test21Lib.local9.field4);
Benchmark.test(54,Test21Lib.local9.field5);
Benchmark.test(55,Test21Lib.local9.field1);
Benchmark.test(56,Test21Lib.local9.field2);
Benchmark.test(57,Test21Lib.local9.field3);
Benchmark.test(58,Test21Lib.local10.field4);
Benchmark.test(59,Test21Lib.local10.field5);
Benchmark.test(60,Test21Lib.local10.field1);
Benchmark.test(61,Test21Lib.local10.field2);
Benchmark.test(62,Test21Lib.local10.field3);
Benchmark.test(63,Test21Lib.local11.field4);
Benchmark.test(64,Test21Lib.local11.field5);
Benchmark.test(65,Test21Lib.local11.field1);
Benchmark.test(66,Test21Lib.local11.field2);
Benchmark.test(67,Test21Lib.local11.field3);
Benchmark.test(68,Test21Lib.local12.field4);
Benchmark.test(69,Test21Lib.local12.field5);
Benchmark.test(70,Test21Lib.local12.field1);
Benchmark.test(71,Test21Lib.local12.field2);
Benchmark.test(72,Test21Lib.local12.field3);
Benchmark.test(73,Test21Lib.local13.field4);
Benchmark.test(74,Test21Lib.local13.field5);
Benchmark.test(75,Test21Lib.local13.field1);
Benchmark.test(76,Test21Lib.local13.field2);
Benchmark.test(77,Test21Lib.local13.field3);
Benchmark.test(78,Test21Lib.local14.field4);
Benchmark.test(79,Test21Lib.local14.field5);
Benchmark.test(80,Test21Lib.local14.field1);
Benchmark.test(81,Test21Lib.local14.field2);
Benchmark.test(82,Test21Lib.local14.field3);
Benchmark.test(83,Test21Lib.local15.field4);
Benchmark.test(84,Test21Lib.local15.field5);
Benchmark.test(85,Test21Lib.local15.field1);
Benchmark.test(86,Test21Lib.local15.field2);
Benchmark.test(87,Test21Lib.local15.field3);
Benchmark.test(88,Test21Lib.local16.field4);
Benchmark.test(89,Test21Lib.local16.field5);
Benchmark.test(90,Test21Lib.local16.field1);
Benchmark.test(91,Test21Lib.local16.field2);
Benchmark.test(92,Test21Lib.local16.field3);
Benchmark.test(93,Test21Lib.local17.field4);
Benchmark.test(94,Test21Lib.local17.field5);
Benchmark.test(95,Test21Lib.local17.field1);
Benchmark.test(96,Test21Lib.local17.field2);
Benchmark.test(97,Test21Lib.local17.field3);
Benchmark.test(98,Test21Lib.local18.field4);
Benchmark.test(99,Test21Lib.local18.field5);
Benchmark.test(100,Test21Lib.local18.field1);
Benchmark.test(101,Test21Lib.local18.field2);
Benchmark.test(102,Test21Lib.local18.field3);
Benchmark.test(103,Test21Lib.local19.field6);
Benchmark.test(104,Test21Lib.local19.field1);
Benchmark.test(105,Test21Lib.local19.field2);
Benchmark.test(106,Test21Lib.local19.field3);
Benchmark.test(107,Test21Lib.local20.field6);
Benchmark.test(108,Test21Lib.local20.field1);
Benchmark.test(109,Test21Lib.local20.field2);
Benchmark.test(110,Test21Lib.local20.field3);
Benchmark.test(111,Test21Lib.local21.field6);
Benchmark.test(112,Test21Lib.local21.field1);
Benchmark.test(113,Test21Lib.local21.field2);
Benchmark.test(114,Test21Lib.local21.field3);
Benchmark.test(115,Test21Lib.local22.field6);
Benchmark.test(116,Test21Lib.local22.field1);
Benchmark.test(117,Test21Lib.local22.field2);
Benchmark.test(118,Test21Lib.local22.field3);
Benchmark.test(119,Test21Lib.local23.field6);
Benchmark.test(120,Test21Lib.local23.field1);
Benchmark.test(121,Test21Lib.local23.field2);
Benchmark.test(122,Test21Lib.local23.field3);
Benchmark.test(123,Test21Lib.local24.field6);
Benchmark.test(124,Test21Lib.local24.field1);
Benchmark.test(125,Test21Lib.local24.field2);
Benchmark.test(126,Test21Lib.local24.field3);
Benchmark.test(127,Test21Lib.local25.field6);
Benchmark.test(128,Test21Lib.local25.field1);
Benchmark.test(129,Test21Lib.local25.field2);
Benchmark.test(130,Test21Lib.local25.field3);
Benchmark.test(131,Test21Lib.local26.field7);
Benchmark.test(132,Test21Lib.local26.field4);
Benchmark.test(133,Test21Lib.local26.field5);
Benchmark.test(134,Test21Lib.local26.field1);
Benchmark.test(135,Test21Lib.local26.field2);
Benchmark.test(136,Test21Lib.local26.field3);
Benchmark.test(137,Test21Lib.local27.field8);
Benchmark.test(138,Test21Lib.local27.field9);
Benchmark.test(139,Test21Lib.local27.field10);
Benchmark.test(140,Test21Lib.local27.field11);
Benchmark.test(141,Test21Lib.local27.field6);
Benchmark.test(142,Test21Lib.local27.field1);
Benchmark.test(143,Test21Lib.local27.field2);
Benchmark.test(144,Test21Lib.local27.field3);
Benchmark.test(145,Test21Lib.local28.field8);
Benchmark.test(146,Test21Lib.local28.field9);
Benchmark.test(147,Test21Lib.local28.field10);
Benchmark.test(148,Test21Lib.local28.field11);
Benchmark.test(149,Test21Lib.local28.field6);
Benchmark.test(150,Test21Lib.local28.field1);
Benchmark.test(151,Test21Lib.local28.field2);
Benchmark.test(152,Test21Lib.local28.field3);
Benchmark.print();
}
}
