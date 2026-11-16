package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import com.google.android.gms.internal.ads.zzbzh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e14 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e14(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                ((zzbzh) this.b).b("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.b).cancel();
                break;
        }
    }
}
