package defpackage;

import android.webkit.ValueCallback;
import com.mbridge.msdk.config.component.wei.WeiCpt;
import io.p071bidmachine.iab.mraid.u;
import io.p071bidmachine.iab.script.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o83 implements ValueCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ o83(int i) {
        this.a = i;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                WeiCpt.d(str);
                break;
            default:
                u.a("ScriptInjector", a.m);
                break;
        }
    }
}
