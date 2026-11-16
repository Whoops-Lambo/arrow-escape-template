package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zn implements Serializable {
    public static final zn a = new zn();

    private Object readResolve() throws ObjectStreamException {
        return a;
    }
}
