package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵩ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1035 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1026 f3014;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f3015;

    public C1035(C1026 c1026, String str) {
        this.f3014 = c1026;
        this.f3015 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0448 c0448 = this.f3014.f3001;
        boolean zIsEmpty = TextUtils.isEmpty(this.f3015);
        if (zIsEmpty) {
            C0969 c0969 = c0448.f904.f901.f708.f700.f3953;
            String strDecrypt = StringFog.decrypt("swQJ8Q9bEY6mHDvzRFM=\n", "1WholiE9ePw=\n");
            String strDecrypt2 = StringFog.decrypt("3k3F6mQ=\n", "uCypmQFr/OQ=\n");
            c0969.getClass();
            C0969.m739().post(new C0990(c0969, strDecrypt, strDecrypt2));
        }
        AbstractC4631n.m402(new C0454(c0448, zIsEmpty));
    }
}
