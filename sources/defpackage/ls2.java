package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ls2 implements PrivilegedAction {
    public final /* synthetic */ Field a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        this.a.setAccessible(true);
        return null;
    }

    public ls2(Field field) {
        this.a = field;
    }
}
