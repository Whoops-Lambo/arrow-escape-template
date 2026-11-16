package defpackage;

import android.view.View;
import com.facebook.a0;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h63 implements View.OnClickListener {
    public static final HashSet e = new HashSet();
    public final View.OnClickListener a;
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    public final void a() {
        h63 h63Var;
        Set set = lz.a;
        if (set.contains(this)) {
            return;
        }
        try {
            View view = (View) this.b.get();
            View view2 = (View) this.c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strD = ll2.d(view2);
                String strB = ny1.b(view2, strD);
                if (strB != null && !l71.h(strB, strD)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, ll2.b(view, view2));
                    jSONObject.put("screenname", this.d);
                    if (!set.contains(this)) {
                        try {
                            h63Var = this;
                            try {
                                a0.c().execute(new r70(jSONObject, strD, h63Var, strB, 17));
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    lz.a(h63Var, th);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            h63Var = this;
                        }
                    }
                }
                return;
            } catch (Exception unused) {
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            h63Var = this;
        }
        lz.a(h63Var, th);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set = lz.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                view.getClass();
                View.OnClickListener onClickListener = this.a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                a();
            } catch (Throwable th) {
                lz.a(this, th);
            }
        } catch (Throwable th2) {
            lz.a(this, th2);
        }
    }

    public h63(View view, View view2, String str) {
        this.a = b63.f(view);
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.d = kk2.I(lowerCase, "activity", "", false);
    }
}
