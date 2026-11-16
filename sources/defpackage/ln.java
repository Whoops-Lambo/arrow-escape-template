package defpackage;

import okhttp3.CacheControl;
import okhttp3.MediaType;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ln extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ mn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln(mn mnVar, int i) {
        super(0);
        this.i = i;
        this.j = mnVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        mn mnVar = this.j;
        switch (i) {
            case 0:
                return CacheControl.INSTANCE.parse(mnVar.f);
            default:
                String str = mnVar.f.get("Content-Type");
                if (str != null) {
                    return MediaType.INSTANCE.parse(str);
                }
                return null;
        }
    }
}
