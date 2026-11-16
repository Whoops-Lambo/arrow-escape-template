package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzigu {
    public abstract zzigm a();

    public static zzigm b() {
        ClassLoader classLoader = zzigu.class.getClassLoader();
        if (zzigm.class.equals(zzigm.class)) {
            try {
                try {
                    return (zzigm) zzigm.class.cast(((zzigu) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzigu.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzigm) zzigm.class.cast(((zzigu) it.next()).a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(zzigh.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzigm"), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zzigm) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzigm) zzigm.class.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            com.facebook.appevents.p.g(e3);
            return null;
        }
    }
}
