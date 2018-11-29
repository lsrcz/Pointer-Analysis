package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Class1 extends BasicClass {
    public static Class3 field1;
    public static Class1 method1(Class2 arg0, int depth) {
        if (depth == 0) return new Class1();
        return field1.field11;
    }
    public static void method2(Class2 arg0, int depth) {
        if (depth == 0) return;
    }
    public Class1 method3(Class3 arg0, int depth) {
        if (depth == 0) return new Class1();
        return arg0.field6;
    }
    public Class3 method4(int depth) {
        if (depth == 0) return new Class3();
        this.method3(this.field1,depth-1);
        if (depth<2) {
            if (depth<3) {
                if (depth>4) {
                    for (int local1 = 0; local1<=3; local1 += 1) {
                        for (int local2 = 0; local2<=2; local2 += 1) {
                        }
                    }
                }else {
                    if (depth>1) {
                        for (int local3 = 0; local3<=3; local3 += 1) {
                        }
                    }
                }
            }else {
                if (depth<4) {
                    if (depth>=4) {
                        this.field1.method4(depth-1);
                    }
                }else {
                    this.field1=this.field1;
                }
            }
        }else {
            for (int local4 = 0; local4<=2; local4 += 1) {
                for (int local5 = 0; local5<=2; local5 += 1) {
                    this.field1.method21(depth-1);
                }
            }
        }
        for (int local6 = 0; local6<=0; local6 += 1) {
            if (depth==2) {
                if (depth==4) {
                    if (depth>4) {
                        if (depth==3) {
                        }
                    }else {
                        if (depth>4) {
                        }
                    }
                }
            }
        }
        return this.field1;
    }
    public static Class1 method5(Class3 arg0, Class1 arg1, int depth) {
        if (depth == 0) return new Class1();
        return field1.field14;
    }
    public Class4 method6(Class2 arg0, int depth) {
        if (depth == 0) return new Class4();
        arg0=arg0.field1.method18(arg0,depth-1);
        if (depth==3) {
            for (int local7 = 0; local7<=2; local7 += 1) {
                if (depth==3) {
                    for (int local8 = 0; local8<=3; local8 += 1) {
                        arg0=arg0.method4(depth-1);
                    }
                }else {
                    if (depth<2) {
                        arg0.field3.method35(depth-1);
                    }else {
                        arg0.field2.method9(arg0.field8,depth-1);
                    }
                }
            }
        }
        arg0.field1=this.field1;
        return arg0.field8;
    }
    public static Class1 method7(int depth) {
        if (depth == 0) return new Class1();
        for (int local9 = 0; local9<=1; local9 += 1) {
            field1.field7=field1.field6.method15(field1.field7,depth-1);
        }
        for (int local10 = 0; local10<=1; local10 += 1) {
            if (depth==2) {
                if (depth<1) {
                    for (int local11 = 0; local11<=2; local11 += 1) {
                        for (int local12 = 0; local12<=3; local12 += 1) {
                        }
                    }
                }else {
                    if (depth>=4) {
                        if (depth>2) {
                        }else {
                        }
                    }else {
                        field1.field17.method2(field1.field17,depth-1);
                    }
                }
            }
        }
        return field1.field9;
    }
    public static Class3 method8(Class2 arg0, Class4 arg1, int depth) {
        if (depth == 0) return new Class3();
        if (depth>3) {
            arg1.field5.method31(arg1.field15,depth-1);
        }else {
            field1.field16=field1.field8;
        }
        arg1.field3=arg1.field22;
        if (depth>=2) {
            for (int local13 = 0; local13<=0; local13 += 1) {
                if (depth>=4) {
                    arg1.field12=field1.field12.method3(field1.field15,depth-1);
                }
            }
        }else {
            if (depth==1) {
                for (int local14 = 0; local14<=3; local14 += 1) {
                    arg1.field1.method19(depth-1);
                }
            }
        }
        arg1.field12=field1.field3.method1(arg0.field10,depth-1);
        return arg1.field15;
    }
}
class Class2 extends Class1 {
    public static Class2 field2;
    public Class5 field3;
    public Class5 field4;
    public static Class4 field5;
    public Class2 field6;
    public Class5 field7;
    public static Class4 field8;
    public Class2 field9;
    public Class3 field10;
    public Class5 method9(Class1 arg0, int depth) {
        if (depth == 0) return new Class5();
        arg0=this.field8;
        this.field3.method2(this.field2,depth-1);
        return this.field3;
    }
    public static Class2 method10(int depth) {
        if (depth == 0) return new Class2();
        field1=field5.field20;
        for (int local15 = 0; local15<=1; local15 += 1) {
            if (depth<=1) {
                for (int local16 = 0; local16<=0; local16 += 1) {
                    if (depth>=3) {
                        field8.field18=field5.field18;
                    }else {
                        field5.field2=field5;
                    }
                }
            }else {
                for (int local17 = 0; local17<=0; local17 += 1) {
                    field1.field11=field1.field4;
                }
            }
        }
        field8.field14=field5.field5;
        if (depth==3) {
            if (depth<1) {
                field1.field14=field8.field9.method5(field1.field10,field5.field16,depth-1);
            }
        }else {
            if (depth>2) {
                for (int local18 = 0; local18<=1; local18 += 1) {
                    field2.field3=field5.field7;
                }
            }
        }
        return field5.field10;
    }
    public Class2 method11(int depth) {
        if (depth == 0) return new Class2();
        if (depth>=4) {
            if (depth<=1) {
                this.field6=this.field2;
            }
        }
        this.field1=this.field10;
        this.field2.method15(this.field3,depth-1);
        this.field7.method38(this.field7,this.field7,depth-1);
        return this;
    }
    public static void method12(Class2 arg0, int depth) {
        if (depth == 0) return;
        if (depth<1) {
            if (depth>=4) {
                arg0.field8.method29(field5.field1,depth-1);
            }else {
                if (depth>3) {
                    field1.field5.method20(field2.field5,field2.field8,depth-1);
                }else {
                    field5.field18=field2.field3;
                }
            }
        }else {
            for (int local19 = 0; local19<=3; local19 += 1) {
                arg0.field2.method16(field5.field19,field5.field16,depth-1);
            }
        }
        arg0.field10.method19(depth-1);
        if (depth==2) {
            for (int local20 = 0; local20<=0; local20 += 1) {
                if (depth>2) {
                    if (depth>=2) {
                        field8.field23.method31(field8.field8,depth-1);
                    }else {
                        field2.field5.method31(field5.field5,depth-1);
                    }
                }else {
                    if (depth>2) {
                        field5.field16=field2.field10.method13(depth-1);
                    }
                }
            }
        }else {
            field8.field14=field5.field21;
        }
        for (int local21 = 0; local21<=2; local21 += 1) {
            for (int local22 = 0; local22<=3; local22 += 1) {
                for (int local23 = 0; local23<=0; local23 += 1) {
                    if (depth<4) {
                        for (int local24 = 0; local24<=0; local24 += 1) {
                        }
                    }
                }
            }
        }
    }
    public static Class4 method13(int depth) {
        if (depth == 0) return new Class4();
        field8.field15.method23(depth-1);
        return field2.field8;
    }
    public static void method14(int depth) {
        if (depth == 0) return;
        for (int local25 = 0; local25<=3; local25 += 1) {
            if (depth>=4) {
                if (depth<2) {
                    field1.field3.method36(field2.field4,field8.field23,depth-1);
                }
            }else {
                field2=field1.field13;
            }
        }
        for (int local26 = 0; local26<=0; local26 += 1) {
            for (int local27 = 0; local27<=0; local27 += 1) {
                if (depth<1) {
                    for (int local28 = 0; local28<=1; local28 += 1) {
                        for (int local29 = 0; local29<=0; local29 += 1) {
                        }
                    }
                }else {
                    field8.field1=field8.field15;
                }
            }
        }
        if (depth>2) {
            if (depth<=3) {
                field5.field11.method1(field2.field2,depth-1);
            }else {
                if (depth>=2) {
                    for (int local30 = 0; local30<=2; local30 += 1) {
                        field1.field5.method27(field8.field3,field2.field5,depth-1);
                    }
                }
            }
        }
    }
    public Class5 method15(Class1 arg0, int depth) {
        if (depth == 0) return new Class5();
        for (int local31 = 0; local31<=1; local31 += 1) {
            this.field5.method29(this.field8,depth-1);
        }
        return this.field7;
    }
    public void method16(Class5 arg0, Class2 arg1, int depth) {
        if (depth == 0) return;
    }
    public static Class3 method17(int depth) {
        if (depth == 0) return new Class3();
        return field8;
    }
}
class Class3 extends Class2 {
    public static Class1 field11;
    public Class1 field12;
    public Class2 field13;
    public Class1 field14;
    public static Class4 field15;
    public static Class3 field16;
    public Class2 field17;
    public Class2 method18(Class2 arg0, int depth) {
        if (depth == 0) return new Class2();
        this.field17.method7(depth-1);
        this.field8=this.field15;
        return this.field16;
    }
    public static void method19(int depth) {
        if (depth == 0) return;
        field1.field5.method33(field8.field13,field16.field10,depth-1);
        field5.field17=field8.field15.method8(field2.field10,field8.field23,depth-1);
    }
    public Class4 method20(Class2 arg0, Class1 arg1, int depth) {
        if (depth == 0) return new Class4();
        return arg0.field8;
    }
    public void method21(int depth) {
        if (depth == 0) return;
        if (depth<3) {
            if (depth==2) {
                this.field12=this.field1.method22(depth-1);
            }else {
                this.field16.method19(depth-1);
            }
        }else {
            this.field13.method6(this.field2,depth-1);
        }
        this.field3=this.field7;
        this.field5.method29(this,depth-1);
        this.field8=this.field5;
    }
    public Class1 method22(int depth) {
        if (depth == 0) return new Class1();
        return this.field8;
    }
    public static void method23(int depth) {
        if (depth == 0) return;
        field1.field15=field5.field23;
        for (int local32 = 0; local32<=0; local32 += 1) {
            for (int local33 = 0; local33<=1; local33 += 1) {
                if (depth<=3) {
                    if (depth>=3) {
                        for (int local34 = 0; local34<=0; local34 += 1) {
                        }
                    }
                }else {
                    field5.field19=field5.field22;
                }
            }
        }
    }
    public void method24(int depth) {
        if (depth == 0) return;
    }
    public static void method25(Class3 arg0, Class2 arg1, int depth) {
        if (depth == 0) return;
        if (depth==3) {
            if (depth<1) {
                if (depth<2) {
                    if (depth>3) {
                        for (int local35 = 0; local35<=0; local35 += 1) {
                        }
                    }else {
                        field8.field8.method28(field5.field15,depth-1);
                    }
                }else {
                    if (depth>1) {
                        if (depth>=4) {
                        }else {
                        }
                    }else {
                        if (depth<1) {
                        }else {
                        }
                    }
                }
            }else {
                for (int local36 = 0; local36<=0; local36 += 1) {
                    for (int local37 = 0; local37<=0; local37 += 1) {
                        if (depth>=4) {
                        }else {
                        }
                    }
                }
            }
        }
        for (int local38 = 0; local38<=2; local38 += 1) {
            field5.field11=field2.field8.method5(field15.field23,field15.field18,depth-1);
        }
        for (int local39 = 0; local39<=0; local39 += 1) {
            arg0.field10=field15.field8;
        }
    }
}
class Class4 extends Class3 {
    public Class5 field18;
    public Class5 field19;
    public static Class3 field20;
    public static Class2 field21;
    public static Class5 field22;
    public Class4 field23;
    public void method26(int depth) {
        if (depth == 0) return;
        for (int local40 = 0; local40<=3; local40 += 1) {
            this.field3.method37(depth-1);
        }
        if (depth<3) {
            if (depth>=1) {
                this.field16.method25(this.field1,this.field15,depth-1);
            }else {
                for (int local41 = 0; local41<=0; local41 += 1) {
                    if (depth>=3) {
                        for (int local42 = 0; local42<=1; local42 += 1) {
                        }
                    }else {
                        this.field5=this.field8;
                    }
                }
            }
        }
        this.field17=this.field20;
        for (int local43 = 0; local43<=1; local43 += 1) {
            for (int local44 = 0; local44<=0; local44 += 1) {
                this.field18=this.field18;
            }
        }
    }
    public Class5 method27(Class1 arg0, Class4 arg1, int depth) {
        if (depth == 0) return new Class5();
        arg1.field20=arg1.field23;
        this.field23=this.field15;
        for (int local45 = 0; local45<=3; local45 += 1) {
            for (int local46 = 0; local46<=3; local46 += 1) {
                if (depth>2) {
                    for (int local47 = 0; local47<=3; local47 += 1) {
                        if (depth<=2) {
                        }else {
                        }
                    }
                }
            }
        }
        this.field6.method14(depth-1);
        return this.field22;
    }
    public static void method28(Class4 arg0, int depth) {
        if (depth == 0) return;
    }
    public void method29(Class3 arg0, int depth) {
        if (depth == 0) return;
        this.field6=this.field1;
        arg0.field2.method3(arg0.field8,depth-1);
    }
    public static void method30(Class2 arg0, int depth) {
        if (depth == 0) return;
        field16.field5=field8.field19.method6(field11.field1,depth-1);
        for (int local48 = 0; local48<=3; local48 += 1) {
            field20.field2=field20.field15;
        }
        field8.field23=field5.field5;
        if (depth<=3) {
            field5.field23=field21.field10.method20(field2.field6,field20.field6,depth-1);
        }
    }
    public static void method31(Class4 arg0, int depth) {
        if (depth == 0) return;
        if (depth==1) {
            if (depth>2) {
                for (int local49 = 0; local49<=0; local49 += 1) {
                    for (int local50 = 0; local50<=3; local50 += 1) {
                        field16.field17=field20.field16;
                    }
                }
            }else {
                if (depth>4) {
                    if (depth==3) {
                        field1.field7=field5.field3;
                    }
                }else {
                    field1.field8.method16(field8.field22,field8.field5,depth-1);
                }
            }
        }else {
            if (depth>2) {
                field15.field5.method32(field5,arg0.field5,depth-1);
            }
        }
    }
    public void method32(Class2 arg0, Class4 arg1, int depth) {
        if (depth == 0) return;
        if (depth<1) {
            for (int local51 = 0; local51<=0; local51 += 1) {
                this.field14=arg0.field2;
            }
        }
    }
    public static void method33(Class1 arg0, Class2 arg1, int depth) {
        if (depth == 0) return;
    }
    public static void method34(int depth) {
        if (depth == 0) return;
        field5.field23=field15;
        field5.field14.method3(field11.field1,depth-1);
        field1.field2.method16(field5.field4,field8,depth-1);
        if (depth>1) {
            for (int local52 = 0; local52<=3; local52 += 1) {
                field16.field9=field5.field20;
            }
        }else {
            field2.field8.method30(field1.field16,depth-1);
        }
    }
}
class Class5 extends Class1 {
    public Class1 field24;
    public static Class1 field25;
    public static Class2 field26;
    public Class2 field27;
    public Class2 field28;
    public static Class5 field29;
    public void method35(int depth) {
        if (depth == 0) return;
        for (int local53 = 0; local53<=1; local53 += 1) {
            if (depth<3) {
                for (int local54 = 0; local54<=2; local54 += 1) {
                    if (depth>=4) {
                        this.field1.method25(this.field1,this.field1,depth-1);
                    }else {
                        this.field24=this.field26.method13(depth-1);
                    }
                }
            }else {
                if (depth==1) {
                    this.field29=this.field29;
                }
            }
        }
        for (int local55 = 0; local55<=1; local55 += 1) {
            for (int local56 = 0; local56<=1; local56 += 1) {
                if (depth==4) {
                    for (int local57 = 0; local57<=3; local57 += 1) {
                        this.field26=this.field27;
                    }
                }
            }
        }
        if (depth<=2) {
            for (int local58 = 0; local58<=3; local58 += 1) {
                if (depth<3) {
                    if (depth>2) {
                        if (depth<2) {
                        }else {
                        }
                    }
                }else {
                    for (int local59 = 0; local59<=2; local59 += 1) {
                        for (int local60 = 0; local60<=1; local60 += 1) {
                        }
                    }
                }
            }
        }
    }
    public static Class1 method36(Class5 arg0, Class4 arg1, int depth) {
        if (depth == 0) return new Class1();
        for (int local61 = 0; local61<=1; local61 += 1) {
            arg1.field2.method11(depth-1);
        }
        return arg1.field9;
    }
    public static void method37(int depth) {
        if (depth == 0) return;
        field26.field8.method34(depth-1);
        if (depth>4) {
            if (depth<=4) {
                field1.field8.method32(field1.field5,field1.field15,depth-1);
            }
        }
        field26.field3=field1.field7;
        field29.field29.method38(field1.field3,field26.field3,depth-1);
    }
    public static void method38(Class5 arg0, Class5 arg1, int depth) {
        if (depth == 0) return;
        for (int local62 = 0; local62<=0; local62 += 1) {
            field1.field3=field1.field4;
        }
        if (depth<=4) {
            arg1.field28.method17(depth-1);
        }
        field1.field14=arg1.field24;
    }
    public static Class1 method39(Class4 arg0, Class5 arg1, int depth) {
        if (depth == 0) return new Class1();
        arg0.field11=field29.field27;
        field29.field1.method3(arg0.field5,depth-1);
        return arg0.field3;
    }
}
public class Test2{
    public static void main(String[] args) {
        int inputValue = 0;
        Benchmark.alloc(1);
        Class1 local63 = new Class1();
        Benchmark.alloc(2);
        Class1 local64 = new Class1();
        Benchmark.alloc(3);
        Class2 local65 = new Class2();
        Benchmark.alloc(4);
        Class3 local66 = new Class3();
        Benchmark.alloc(5);
        Class4 local67 = new Class4();
        Benchmark.alloc(6);
        Class5 local68 = new Class5();
        local63.field1 = local66;
        local64.field1 = local66;
        local65.field2 = local65;
        local65.field3 = local68;
        local65.field4 = local68;
        local65.field5 = local67;
        local65.field6 = local66;
        local65.field7 = local68;
        local65.field8 = local67;
        local65.field9 = local66;
        local65.field10 = local67;
        local65.field1 = local67;
        local66.field11 = local64;
        local66.field12 = local65;
        local66.field13 = local67;
        local66.field14 = local65;
        local66.field15 = local67;
        local66.field16 = local67;
        local66.field17 = local67;
        local66.field2 = local65;
        local66.field3 = local68;
        local66.field4 = local68;
        local66.field5 = local67;
        local66.field6 = local65;
        local66.field7 = local68;
        local66.field8 = local67;
        local66.field9 = local66;
        local66.field10 = local67;
        local66.field1 = local67;
        local67.field18 = local68;
        local67.field19 = local68;
        local67.field20 = local66;
        local67.field21 = local66;
        local67.field22 = local68;
        local67.field23 = local67;
        local67.field11 = local63;
        local67.field12 = local68;
        local67.field13 = local66;
        local67.field14 = local68;
        local67.field15 = local67;
        local67.field16 = local67;
        local67.field17 = local65;
        local67.field2 = local65;
        local67.field3 = local68;
        local67.field4 = local68;
        local67.field5 = local67;
        local67.field6 = local66;
        local67.field7 = local68;
        local67.field8 = local67;
        local67.field9 = local66;
        local67.field10 = local67;
        local67.field1 = local67;
        local68.field24 = local68;
        local68.field25 = local64;
        local68.field26 = local67;
        local68.field27 = local67;
        local68.field28 = local66;
        local68.field29 = local68;
        local68.field1 = local66;
        if (inputValue<=3) {
            if (inputValue==1) {
                for (int local69 = 0; local69<=2; local69 += 1) {
                    local66.field8.method28(local67.field15,3);
                }
            }
        }else {
            if (inputValue>=2) {
                local67.field10=local66.field8;
            }else {
                local66.field9=local67.field2;
            }
        }
        local66.field3.method37(3);
        local67.field15.method18(local67.field6,3);
        for (int local70 = 0; local70<=2; local70 += 1) {
            for (int local71 = 0; local71<=3; local71 += 1) {
                local67.field5.method24(3);
            }
        }
        for (int local72 = 0; local72<=3; local72 += 1) {
            local67.field5=local67.field15;
        }
        local63.field1=local67.field1;
        local64.method1(local63.field1,3);
        for (int local73 = 0; local73<=3; local73 += 1) {
            for (int local74 = 0; local74<=0; local74 += 1) {
                for (int local75 = 0; local75<=2; local75 += 1) {
                    local66.field12=local68.field29;
                }
            }
        }
        local68.field25=local66.field1;
        local67.field2.method5(local68.field1,local65.field1,3);
        Benchmark.test(1,local63);
        Benchmark.test(2,local64);
        Benchmark.test(3,local65);
        Benchmark.test(4,local66);
        Benchmark.test(5,local67);
        Benchmark.test(6,local68);
        Benchmark.test(7,local63.field1);
        Benchmark.test(8,local64.field1);
        Benchmark.test(9,local65.field2);
        Benchmark.test(10,local65.field3);
        Benchmark.test(11,local65.field4);
        Benchmark.test(12,local65.field5);
        Benchmark.test(13,local65.field6);
        Benchmark.test(14,local65.field7);
        Benchmark.test(15,local65.field8);
        Benchmark.test(16,local65.field9);
        Benchmark.test(17,local65.field10);
        Benchmark.test(18,local65.field1);
        Benchmark.test(19,local66.field11);
        Benchmark.test(20,local66.field12);
        Benchmark.test(21,local66.field13);
        Benchmark.test(22,local66.field14);
        Benchmark.test(23,local66.field15);
        Benchmark.test(24,local66.field16);
        Benchmark.test(25,local66.field17);
        Benchmark.test(26,local66.field2);
        Benchmark.test(27,local66.field3);
        Benchmark.test(28,local66.field4);
        Benchmark.test(29,local66.field5);
        Benchmark.test(30,local66.field6);
        Benchmark.test(31,local66.field7);
        Benchmark.test(32,local66.field8);
        Benchmark.test(33,local66.field9);
        Benchmark.test(34,local66.field10);
        Benchmark.test(35,local66.field1);
        Benchmark.test(36,local67.field18);
        Benchmark.test(37,local67.field19);
        Benchmark.test(38,local67.field20);
        Benchmark.test(39,local67.field21);
        Benchmark.test(40,local67.field22);
        Benchmark.test(41,local67.field23);
        Benchmark.test(42,local67.field11);
        Benchmark.test(43,local67.field12);
        Benchmark.test(44,local67.field13);
        Benchmark.test(45,local67.field14);
        Benchmark.test(46,local67.field15);
        Benchmark.test(47,local67.field16);
        Benchmark.test(48,local67.field17);
        Benchmark.test(49,local67.field2);
        Benchmark.test(50,local67.field3);
        Benchmark.test(51,local67.field4);
        Benchmark.test(52,local67.field5);
        Benchmark.test(53,local67.field6);
        Benchmark.test(54,local67.field7);
        Benchmark.test(55,local67.field8);
        Benchmark.test(56,local67.field9);
        Benchmark.test(57,local67.field10);
        Benchmark.test(58,local67.field1);
        Benchmark.test(59,local68.field24);
        Benchmark.test(60,local68.field25);
        Benchmark.test(61,local68.field26);
        Benchmark.test(62,local68.field27);
        Benchmark.test(63,local68.field28);
        Benchmark.test(64,local68.field29);
        Benchmark.test(65,local68.field1);
        Benchmark.print();
    }
}