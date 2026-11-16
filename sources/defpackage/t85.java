package defpackage;

import com.google.android.gms.internal.nearby.zzsg;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t85 extends z85 {
    public final char[] d;

    @Override // defpackage.z85, com.google.android.gms.internal.nearby.zzth
    public final void a(Appendable appendable, byte[] bArr, int i) throws IOException {
        zzsg.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.d;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }

    public t85() {
        s85 s85Var = new s85("base16()", "0123456789ABCDEF".toCharArray());
        super(s85Var, (Character) null);
        this.d = new char[512];
        char[] cArr = s85Var.b;
        if (cArr.length != 16) {
            e32.a();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }
}
