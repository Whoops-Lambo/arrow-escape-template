package defpackage;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class rj2 {
    public static final Set a = n8.q0(new SerialDescriptor[]{cy2.b, hy2.b, zs2.b, ty2.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.isInline() && a.contains(serialDescriptor)) {
            return true;
        }
        return false;
    }
}
