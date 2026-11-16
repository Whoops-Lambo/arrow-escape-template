package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class w4 {
    public final Descriptors.Descriptor a;
    public final k4[] b;
    public String[] c;
    public final m4[] d;
    public volatile boolean e = false;

    public final void c(Class cls, Class cls2) {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                int length = this.b.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = this.a.getFields().get(i);
                    String str = fieldDescriptor.getContainingOneof() != null ? this.c[fieldDescriptor.getContainingOneof().getIndex() + length] : null;
                    if (fieldDescriptor.isRepeated()) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            boolean zIsMapField = fieldDescriptor.isMapField();
                            k4[] k4VarArr = this.b;
                            if (zIsMapField) {
                                String str2 = this.c[i];
                                k4VarArr[i] = new l4(fieldDescriptor, cls);
                            } else {
                                k4VarArr[i] = new q4(this.c[i], cls, cls2);
                            }
                        } else {
                            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
                            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.ENUM;
                            k4[] k4VarArr2 = this.b;
                            if (javaType == javaType2) {
                                k4VarArr2[i] = new n4(fieldDescriptor, this.c[i], cls, cls2);
                            } else {
                                k4VarArr2[i] = new p4(this.c[i], cls, cls2);
                            }
                        }
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.b[i] = new u4(fieldDescriptor, this.c[i], cls, cls2, str);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        this.b[i] = new r4(fieldDescriptor, this.c[i], cls, cls2, str);
                    } else {
                        Descriptors.FieldDescriptor.JavaType javaType3 = fieldDescriptor.getJavaType();
                        Descriptors.FieldDescriptor.JavaType javaType4 = Descriptors.FieldDescriptor.JavaType.STRING;
                        k4[] k4VarArr3 = this.b;
                        if (javaType3 == javaType4) {
                            k4VarArr3[i] = new v4(fieldDescriptor, this.c[i], cls, cls2, str);
                        } else {
                            k4VarArr3[i] = new t4(fieldDescriptor, this.c[i], cls, cls2, str);
                        }
                    }
                    i++;
                }
                int length2 = this.d.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.d[i2] = new m4(this.a, i2, this.c[i2 + length], cls, cls2);
                }
                this.e = true;
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public w4(Descriptors.Descriptor descriptor, String[] strArr) {
        this.a = descriptor;
        this.c = strArr;
        this.b = new k4[descriptor.getFields().size()];
        this.d = new m4[descriptor.getOneofs().size()];
    }

    public static m4 a(w4 w4Var, Descriptors.OneofDescriptor oneofDescriptor) {
        w4Var.getClass();
        if (oneofDescriptor.getContainingType() == w4Var.a) {
            return w4Var.d[oneofDescriptor.getIndex()];
        }
        defpackage.d.r("OneofDescriptor does not match message type.");
        return null;
    }

    public static k4 b(w4 w4Var, Descriptors.FieldDescriptor fieldDescriptor) {
        w4Var.getClass();
        if (fieldDescriptor.getContainingType() == w4Var.a) {
            if (!fieldDescriptor.isExtension()) {
                return w4Var.b[fieldDescriptor.getIndex()];
            }
            defpackage.d.r("This type does not have extensions.");
            return null;
        }
        defpackage.d.r("FieldDescriptor does not match message type.");
        return null;
    }
}
