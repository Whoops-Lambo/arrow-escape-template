package com.explorestack.protobuf;

import defpackage.vq2;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c4 implements Serializable {
    public final Class a;
    public final String b;
    public final byte[] c;

    public Object readResolve() throws ObjectStreamException {
        Class cls = this.a;
        byte[] bArr = this.c;
        String str = this.b;
        try {
            try {
                Field declaredField = cls.getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(bArr).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                vq2.n("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                vq2.n("Unable to find proto buffer class: ".concat(str), e2);
                return null;
            } catch (IllegalAccessException e3) {
                vq2.n("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException unused) {
                Field declaredField2 = cls.getDeclaredField("defaultInstance");
                declaredField2.setAccessible(true);
                return ((MessageLite) declaredField2.get(null)).newBuilderForType().mergeFrom(bArr).buildPartial();
            } catch (SecurityException e4) {
                vq2.n("Unable to call DEFAULT_INSTANCE in ".concat(str), e4);
                return null;
            }
        } catch (InvalidProtocolBufferException e5) {
            vq2.n("Unable to understand proto buffer", e5);
            return null;
        } catch (ClassNotFoundException e6) {
            vq2.n("Unable to find proto buffer class: ".concat(str), e6);
            return null;
        } catch (IllegalAccessException e7) {
            vq2.n("Unable to call parsePartialFrom", e7);
            return null;
        } catch (NoSuchFieldException e8) {
            vq2.n("Unable to find defaultInstance in ".concat(str), e8);
            return null;
        } catch (SecurityException e9) {
            vq2.n("Unable to call defaultInstance in ".concat(str), e9);
            return null;
        }
    }

    public c4(y4 y4Var) {
        Class<?> cls = y4Var.getClass();
        this.a = cls;
        this.b = cls.getName();
        this.c = y4Var.toByteArray();
    }
}
