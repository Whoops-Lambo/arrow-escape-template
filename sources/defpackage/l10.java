package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Looper;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l10 extends ks0 implements sr0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l10(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        Context context;
        AlertDialog alertDialog;
        Context context2;
        AlertDialog alertDialog2;
        int i = this.b;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                ((m10) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                return Boolean.valueOf(dk2.O(name, "Firebase Background Thread #", false));
            case 1:
                ((m10) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                return Boolean.valueOf(dk2.O(name2, "Firebase Blocking Thread #", false));
            case 2:
                ((m10) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                tu2 tu2Var = (tu2) this.receiver;
                AlertDialog alertDialog3 = tu2Var.a;
                if (alertDialog3 != null && (context = alertDialog3.getContext()) != null && !wx.m(context) && (alertDialog = tu2Var.a) != null) {
                    alertDialog.dismiss();
                }
                tu2Var.a = null;
                return az2Var;
            case 4:
                jw2 jw2Var = (jw2) this.receiver;
                AlertDialog alertDialog4 = jw2Var.a;
                if (alertDialog4 != null && (context2 = alertDialog4.getContext()) != null && !wx.m(context2) && (alertDialog2 = jw2Var.a) != null) {
                    alertDialog2.dismiss();
                }
                jw2Var.a = null;
                return az2Var;
            case 5:
                fx2.m((fx2) this.receiver);
                return az2Var;
            case 6:
                hx2 hx2Var = (hx2) this.receiver;
                Context context3 = hx2Var.a;
                String str = hx2Var.f;
                String str2 = (String) ((lt0) hx2Var.j.c).b;
                str.getClass();
                str2.getClass();
                try {
                    Object systemService = context3.getSystemService("clipboard");
                    systemService.getClass();
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str2, str));
                    break;
                } catch (Throwable unused) {
                }
                return az2Var;
            default:
                ((m23) this.receiver).b();
                return az2Var;
        }
    }
}
