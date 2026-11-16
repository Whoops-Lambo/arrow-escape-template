package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class x extends ObjectInputStream {
    public final List a;

    public x(InputStream inputStream, List list) {
        super(inputStream);
        this.a = list;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        objectStreamClass.getClass();
        Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
        if (this.a != null && !Number.class.isAssignableFrom(clsResolveClass) && !String.class.equals(clsResolveClass) && !Boolean.class.equals(clsResolveClass) && !clsResolveClass.isArray() && !this.a.contains(clsResolveClass)) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Deserialization is not allowed for ");
            sbA.append(objectStreamClass.getName());
            throw new IOException(sbA.toString());
        }
        clsResolveClass.getClass();
        return clsResolveClass;
    }
}
