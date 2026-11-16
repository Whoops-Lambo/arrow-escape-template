package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import com.applovin.impl.t3;
import com.applovin.impl.v0;
import com.vungle.ads.internal.presenter.w;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class hh3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hh3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((t3) obj).a(dialogInterface, i);
                break;
            case 1:
                v0.b((Uri) obj, dialogInterface, i);
                break;
            default:
                w.a((w) obj, dialogInterface, i);
                break;
        }
    }
}
