package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class tw0 extends wt0 {
    @Override // defpackage.wt0
    public final void r(String str) {
        str.getClass();
        List list = qy0.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (s71.h(cCharAt, 32) > 0 && !dk2.P("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                i++;
                i2 = i3;
            } else {
                throw new g21(str, i2);
            }
        }
    }

    @Override // defpackage.wt0
    public final void s(String str) {
        str.getClass();
        List list = qy0.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (s71.h(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new h21(str, i2);
            }
            i++;
            i2 = i3;
        }
    }
}
