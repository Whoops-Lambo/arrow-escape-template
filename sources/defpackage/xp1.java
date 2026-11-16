package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class xp1 implements xf1, Serializable {
    public Object readResolve() throws ObjectStreamException {
        return zf1.b("NOP");
    }
}
