package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.inmobi.media.C4108ij;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yd3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ yd3(JsResult jsResult, int i) {
        this.a = i;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        JsResult jsResult = this.b;
        switch (i2) {
            case 0:
                C4108ij.a(jsResult, dialogInterface, i);
                break;
            case 1:
                C4108ij.b(jsResult, dialogInterface, i);
                break;
            default:
                C4108ij.c(jsResult, dialogInterface, i);
                break;
        }
    }
}
