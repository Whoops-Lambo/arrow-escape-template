package io.p071bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import com.facebook.login.p;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzth;
import defpackage.ga4;
import defpackage.ia4;
import defpackage.w85;
import defpackage.xv4;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.exoplayer.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class x extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        y yVar;
        w wVar;
        y yVar2;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (audioTrack.equals(((y) ((p) obj).c).v) && (wVar = (yVar = (y) ((p) obj).c).r) != null && yVar.V && (yVar2 = ((a0) wVar.a).F) != null) {
                    yVar2.a();
                }
                break;
            default:
                zzeg zzegVar = ((zzth) ((xv4) obj).d).i;
                zzegVar.c(-1, w85.b);
                zzegVar.d();
                break;
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (audioTrack.equals(((y) ((p) obj).c).v)) {
                    ((y) ((p) obj).c).U = true;
                    break;
                }
                break;
            default:
                zzeg zzegVar = ((zzth) ((xv4) obj).d).i;
                zzegVar.c(-1, ga4.z);
                zzegVar.d();
                break;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        y yVar;
        w wVar;
        y yVar2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (audioTrack.equals(((y) ((p) obj).c).v) && (wVar = (yVar = (y) ((p) obj).c).r) != null && yVar.V && (yVar2 = ((a0) wVar.a).F) != null) {
                    yVar2.a();
                }
                break;
            default:
                zzeg zzegVar = ((zzth) ((xv4) obj).d).i;
                zzegVar.c(-1, ia4.w);
                zzegVar.d();
                break;
        }
    }
}
