package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzdxs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xp2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.b).onTouchEvent(motionEvent);
                }
                return false;
            default:
                zzdxs zzdxsVar = (zzdxs) this.b;
                if (((Boolean) zzba.zzc().a(zzbjr.Ob)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    zzdxsVar.r.a = motionEvent;
                }
                zzdxsVar.j.zza();
                if (view != 0) {
                    view.performClick();
                }
                return false;
        }
    }
}
