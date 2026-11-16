package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2346Tf implements InterfaceC2115Jt {
    public final long A00;

    @MetaExoPlayerCustomization
    public final List<C2348Th> A01;
    public static final C2346Tf A03 = new C2346Tf(XR.A01(), 0);
    public static final String A04 = N1.A0h(0);
    public static final String A05 = N1.A0h(1);
    public static final InterfaceC2114Js<C2346Tf> A02 = new InterfaceC2114Js() { // from class: com.facebook.ads.redexgen.X.Tg
        @Override // com.facebook.ads.redexgen.X.InterfaceC2114Js
        public final InterfaceC2115Jt A7F(Bundle bundle) {
            return C2346Tf.A00(bundle);
        }
    };

    @MetaExoPlayerCustomization
    public C2346Tf(List<C2348Th> list, long j) {
        this.A01 = XR.A03((C2348Th[]) list.toArray(new C2348Th[0]));
        this.A00 = j;
    }

    public static final C2346Tf A00(Bundle bundle) {
        List listA01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            listA01 = XR.A01();
        } else {
            listA01 = C2165Lt.A01(C2348Th.A0I, cues);
        }
        return new C2346Tf(listA01, bundle.getLong(A05));
    }
}
