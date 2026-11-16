package com.google.protobuf;

import defpackage.e32;
import defpackage.m02;
import defpackage.ok0;
import defpackage.q72;
import defpackage.x83;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends ok0 {
    @Override // defpackage.ok0
    public final Object a(Object obj, s sVar, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, q0 q0Var, Object obj2, g2 g2Var) throws IOException {
        Object objF;
        ArrayList arrayList;
        int number = generatedExtension.getNumber();
        u0 u0Var = generatedExtension.descriptor;
        Object objValueOf = null;
        if (u0Var.d && u0Var.e) {
            switch (g0.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    sVar.g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    sVar.l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    sVar.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    sVar.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    sVar.m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    sVar.k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    sVar.j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    sVar.d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    sVar.u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    sVar.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    sVar.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    sVar.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    sVar.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    sVar.h(arrayList);
                    obj2 = v1.j(obj, number, arrayList, generatedExtension.descriptor.a, obj2, g2Var);
                    break;
                default:
                    e32.m(generatedExtension.descriptor.c, "Type cannot be packed: ");
                    return null;
            }
            q0Var.p(generatedExtension.descriptor, arrayList);
            return obj2;
        }
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            sVar.x(0);
            int int32 = sVar.a.readInt32();
            if (generatedExtension.descriptor.a.findValueByNumber(int32) == null) {
                return v1.n(obj, number, int32, obj2, g2Var);
            }
            objValueOf = Integer.valueOf(int32);
        } else {
            switch (g0.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    sVar.x(1);
                    objValueOf = Double.valueOf(sVar.a.readDouble());
                    break;
                case 2:
                    sVar.x(5);
                    objValueOf = Float.valueOf(sVar.a.readFloat());
                    break;
                case 3:
                    sVar.x(0);
                    objValueOf = Long.valueOf(sVar.a.readInt64());
                    break;
                case 4:
                    sVar.x(0);
                    objValueOf = Long.valueOf(sVar.a.readUInt64());
                    break;
                case 5:
                    sVar.x(0);
                    objValueOf = Integer.valueOf(sVar.a.readInt32());
                    break;
                case 6:
                    sVar.x(1);
                    objValueOf = Long.valueOf(sVar.a.readFixed64());
                    break;
                case 7:
                    sVar.x(5);
                    objValueOf = Integer.valueOf(sVar.a.readFixed32());
                    break;
                case 8:
                    sVar.x(0);
                    objValueOf = Boolean.valueOf(sVar.a.readBool());
                    break;
                case 9:
                    sVar.x(0);
                    objValueOf = Integer.valueOf(sVar.a.readUInt32());
                    break;
                case 10:
                    sVar.x(5);
                    objValueOf = Integer.valueOf(sVar.a.readSFixed32());
                    break;
                case 11:
                    sVar.x(1);
                    objValueOf = Long.valueOf(sVar.a.readSFixed64());
                    break;
                case 12:
                    sVar.x(0);
                    objValueOf = Integer.valueOf(sVar.a.readSInt32());
                    break;
                case 13:
                    sVar.x(0);
                    objValueOf = Long.valueOf(sVar.a.readSInt64());
                    break;
                case 14:
                    e32.i("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = sVar.e();
                    break;
                case 16:
                    sVar.x(2);
                    objValueOf = sVar.a.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object objF2 = q0Var.f(generatedExtension.descriptor);
                        if (objF2 instanceof GeneratedMessageLite) {
                            m02 m02Var = m02.c;
                            m02Var.getClass();
                            q72 q72VarA = m02Var.a(objF2.getClass());
                            if (!((GeneratedMessageLite) objF2).isMutable()) {
                                Object objC = q72VarA.c();
                                q72VarA.a(objC, objF2);
                                q0Var.p(generatedExtension.descriptor, objC);
                                objF2 = objC;
                            }
                            sVar.x(3);
                            sVar.b(objF2, q72VarA, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                    sVar.x(3);
                    q72 q72VarA2 = m02.c.a(cls);
                    objValueOf = q72VarA2.c();
                    sVar.b(objValueOf, q72VarA2, extensionRegistryLite);
                    q72VarA2.b(objValueOf);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object objF3 = q0Var.f(generatedExtension.descriptor);
                        if (objF3 instanceof GeneratedMessageLite) {
                            m02 m02Var2 = m02.c;
                            m02Var2.getClass();
                            q72 q72VarA3 = m02Var2.a(objF3.getClass());
                            if (!((GeneratedMessageLite) objF3).isMutable()) {
                                Object objC2 = q72VarA3.c();
                                q72VarA3.a(objC2, objF3);
                                q0Var.p(generatedExtension.descriptor, objC2);
                                objF3 = objC2;
                            }
                            sVar.x(2);
                            sVar.c(objF3, q72VarA3, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    objValueOf = sVar.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            q0Var.a(generatedExtension.descriptor, objValueOf);
            return obj2;
        }
        int i = g0.a[generatedExtension.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (objF = q0Var.f(generatedExtension.descriptor)) != null) {
            objValueOf = Internal.mergeMessage(objF, objValueOf);
        }
        q0Var.p(generatedExtension.descriptor, objValueOf);
        return obj2;
    }

    @Override // defpackage.ok0
    public final void b(x83 x83Var, Map.Entry entry) throws IOException {
        u0 u0Var = (u0) entry.getKey();
        boolean z = u0Var.d;
        WireFormat.FieldType fieldType = u0Var.c;
        boolean z2 = u0Var.e;
        int i = u0Var.b;
        if (z) {
            switch (g0.a[fieldType.ordinal()]) {
                case 1:
                    v1.q(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 2:
                    v1.u(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 3:
                    v1.x(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 4:
                    v1.F(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 5:
                    v1.w(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 6:
                    v1.t(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 7:
                    v1.s(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 8:
                    v1.o(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 9:
                    v1.E(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 10:
                    v1.z(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 11:
                    v1.A(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 12:
                    v1.B(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 13:
                    v1.C(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 14:
                    v1.w(i, (List) entry.getValue(), x83Var, z2);
                    break;
                case 15:
                    v1.p(i, (List) entry.getValue(), x83Var);
                    break;
                case 16:
                    v1.D(i, (List) entry.getValue(), x83Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        v1.v(i, (List) entry.getValue(), x83Var, m02.c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        v1.y(i, (List) entry.getValue(), x83Var, m02.c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (g0.a[fieldType.ordinal()]) {
            case 1:
                ((z) x83Var).a.writeDouble(i, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ((z) x83Var).a.writeFloat(i, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                ((z) x83Var).f(i, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((z) x83Var).a.writeUInt64(i, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((z) x83Var).e(i, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((z) x83Var).c(i, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((z) x83Var).b(i, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((z) x83Var).a.writeBool(i, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((z) x83Var).a.writeUInt32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((z) x83Var).a.writeSFixed32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((z) x83Var).a.writeSFixed64(i, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((z) x83Var).a.writeSInt32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((z) x83Var).a.writeSInt64(i, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((z) x83Var).e(i, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((z) x83Var).a(i, (ByteString) entry.getValue());
                break;
            case 16:
                ((z) x83Var).a.writeString(i, (String) entry.getValue());
                break;
            case 17:
                ((z) x83Var).d(i, entry.getValue(), m02.c.a(entry.getValue().getClass()));
                break;
            case 18:
                ((z) x83Var).g(i, entry.getValue(), m02.c.a(entry.getValue().getClass()));
                break;
        }
    }
}
