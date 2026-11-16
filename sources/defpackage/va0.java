package defpackage;

import com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class va0 {
    public final String a;
    public final GlobalLibraryVersionRegistrar b;

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mf mfVar = (mf) it.next();
            sb.append(mfVar.a);
            sb.append('/');
            sb.append(mfVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public va0(Set set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.a = a(set);
        this.b = globalLibraryVersionRegistrar;
    }
}
