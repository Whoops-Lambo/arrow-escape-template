package defpackage;

import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.exoplayer2.a;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.inmobi.media.A2;
import com.inmobi.media.C4435ub;
import com.tiktok.appevents.TTAppEventLogger;
import io.p071bidmachine.media3.exoplayer.analytics.c;
import io.p071bidmachine.media3.exoplayer.analytics.f;
import io.p071bidmachine.media3.exoplayer.d0;
import io.p071bidmachine.media3.exoplayer.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(d0 d0Var, int i, boolean z) {
        this.a = 10;
        this.c = d0Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioAttributes audioAttributes;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                A2.a((A2) obj, i2);
                break;
            case 1:
                sa saVar = (sa) ((ra) obj).c;
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2 && ((audioAttributes = saVar.d) == null || audioAttributes.contentType != 1)) {
                        saVar.c(3);
                    } else {
                        a aVar = saVar.c;
                        if (aVar != null) {
                            aVar.executePlayerCommand(0);
                        }
                        saVar.c(2);
                    }
                } else if (i2 == -1) {
                    a aVar2 = saVar.c;
                    if (aVar2 != null) {
                        aVar2.executePlayerCommand(-1);
                    }
                    saVar.a();
                } else if (i2 == 1) {
                    saVar.c(1);
                    a aVar3 = saVar.c;
                    if (aVar3 != null) {
                        aVar3.executePlayerCommand(1);
                    }
                } else {
                    h50.t(i2, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 2:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$audioSessionIdChanged$12(i2);
                break;
            case 3:
                ((MaxAdPlacer) obj).a(i2);
                break;
            case 4:
                ((ResourcesCompat.FontCallback) obj).b(i2);
                break;
            case 5:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, i2, false);
                }
                break;
            case 6:
                ((TTAppEventLogger) obj).lambda$doStartScheduler$4(i2);
                break;
            case 7:
                ((RecyclerView) obj).scrollToPosition(i2);
                break;
            case 8:
                ((com.applovin.impl.adview.a) obj).a(i2);
                break;
            case 9:
                ((io.p071bidmachine.media3.common.audio.a) obj).b.onAudioFocusChange(i2);
                break;
            case 10:
                d0 d0Var = (d0) obj;
                f fVar = d0Var.w;
                int i3 = ((e) d0Var.a[i2].e).b;
                fVar.z(fVar.y(), 1033, new c(0));
                break;
            case 11:
                ((j.a) obj).a(i2);
                break;
            case 12:
                ((r2) obj).a(i2);
                break;
            default:
                C4435ub.a((C4435ub) obj, i2);
                break;
        }
    }

    public /* synthetic */ s(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
