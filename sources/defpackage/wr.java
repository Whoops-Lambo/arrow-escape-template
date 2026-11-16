package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class wr {
    public final String a;
    public List b = gg0.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public wr(String str) {
        this.a = str;
    }

    public static void a(wr wrVar, String str, SerialDescriptor serialDescriptor) {
        wrVar.getClass();
        serialDescriptor.getClass();
        if (wrVar.d.add(str)) {
            wrVar.c.add(str);
            wrVar.e.add(serialDescriptor);
            wrVar.f.add(gg0.a);
            wrVar.g.add(false);
            return;
        }
        StringBuilder sbR = h50.r("Element with name '", str, "' is already registered in ");
        sbR.append(wrVar.a);
        throw new IllegalArgumentException(sbR.toString().toString());
    }
}
