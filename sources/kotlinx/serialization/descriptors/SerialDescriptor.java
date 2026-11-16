package kotlinx.serialization.descriptors;

import defpackage.gg0;
import defpackage.h00;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface SerialDescriptor {
    default boolean b() {
        return false;
    }

    int c(String str);

    SerialDescriptor d(int i);

    int e();

    String f(int i);

    List g(int i);

    h00 getKind();

    String h();

    boolean i(int i);

    default boolean isInline() {
        return false;
    }

    default List getAnnotations() {
        return gg0.a;
    }
}
