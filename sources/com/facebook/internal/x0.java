package com.facebook.internal;

import android.content.Context;
import android.view.View;
import android.widget.VideoView;
import com.ecffri.arrows.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C5116b;
import defpackage.fx;
import io.p071bidmachine.PrivacySheetData;
import io.p071bidmachine.nativead.view.VideoPlayerActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d1) obj).cancel();
                break;
            case 1:
                ((com.moloco.sdk.internal.m0) obj).a.invoke();
                break;
            case 2:
                C5116b.a((C5116b) obj, view);
                break;
            case 3:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q) obj, view);
                break;
            case 4:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s) obj, view);
                break;
            case 5:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u) obj, view);
                break;
            case 6:
                io.p071bidmachine.media3.ui.r rVar = (io.p071bidmachine.media3.ui.r) obj;
                rVar.k(!rVar.k0);
                break;
            case 7:
                io.p071bidmachine.media3.ui.r rVar2 = ((io.p071bidmachine.media3.ui.f) obj).l;
                io.p071bidmachine.media3.common.n0 n0Var = rVar2.j0;
                if (n0Var != null && ((io.p071bidmachine.media3.exoplayer.w) n0Var).r(29)) {
                    io.p071bidmachine.media3.exoplayer.trackselection.h hVarQ = ((io.p071bidmachine.media3.exoplayer.w) rVar2.j0).q();
                    io.p071bidmachine.media3.common.n0 n0Var2 = rVar2.j0;
                    hVarQ.getClass();
                    io.p071bidmachine.media3.exoplayer.trackselection.g gVar = new io.p071bidmachine.media3.exoplayer.trackselection.g(hVarQ);
                    gVar.a(1);
                    gVar.d(1);
                    ((io.p071bidmachine.media3.exoplayer.w) n0Var2).I(new io.p071bidmachine.media3.exoplayer.trackselection.h(gVar));
                    rVar2.f.k[1] = rVar2.getResources().getString(R.string.exo_track_selection_auto);
                    rVar2.k.dismiss();
                    break;
                }
                break;
            case 8:
                io.p071bidmachine.media3.ui.k kVar = (io.p071bidmachine.media3.ui.k) obj;
                io.p071bidmachine.media3.ui.r rVar3 = kVar.h;
                int bindingAdapterPosition = kVar.getBindingAdapterPosition();
                View view2 = rVar3.z;
                if (bindingAdapterPosition == 0) {
                    io.p071bidmachine.media3.ui.i iVar = rVar3.g;
                    view2.getClass();
                    rVar3.d(iVar, view2);
                } else if (bindingAdapterPosition != 1) {
                    rVar3.k.dismiss();
                } else {
                    io.p071bidmachine.media3.ui.f fVar = rVar3.i;
                    view2.getClass();
                    rVar3.d(fVar, view2);
                }
                break;
            case 9:
                io.p071bidmachine.media3.ui.r rVar4 = ((io.p071bidmachine.media3.ui.n) obj).l;
                io.p071bidmachine.media3.common.n0 n0Var3 = rVar4.j0;
                if (n0Var3 != null && ((io.p071bidmachine.media3.exoplayer.w) n0Var3).r(29)) {
                    io.p071bidmachine.media3.exoplayer.trackselection.h hVarQ2 = ((io.p071bidmachine.media3.exoplayer.w) rVar4.j0).q();
                    io.p071bidmachine.media3.common.n0 n0Var4 = rVar4.j0;
                    hVarQ2.getClass();
                    io.p071bidmachine.media3.exoplayer.trackselection.g gVar2 = new io.p071bidmachine.media3.exoplayer.trackselection.g(hVarQ2);
                    gVar2.a(3);
                    gVar2.r = -3;
                    gVar2.c(new String[0]);
                    gVar2.q = false;
                    ((io.p071bidmachine.media3.exoplayer.w) n0Var4).I(new io.p071bidmachine.media3.exoplayer.trackselection.h(gVar2));
                    rVar4.k.dismiss();
                    break;
                }
                break;
            case 10:
                io.p071bidmachine.media3.ui.w wVar = (io.p071bidmachine.media3.ui.w) obj;
                wVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    wVar.q.start();
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    wVar.r.start();
                }
                break;
            case 11:
                view.getClass();
                WeakReference weakReference = io.p071bidmachine.rendering.view.b.c;
                Context contextC = io.p071bidmachine.core.j.c(view.getContext(), view);
                contextC.getClass();
                io.p071bidmachine.media3.common.audio.c.u(contextC, ((PrivacySheetData) obj).getPrivacySheetParams());
                break;
            case 12:
                VideoPlayerActivity videoPlayerActivity = (VideoPlayerActivity) obj;
                io.p071bidmachine.nativead.view.d dVar = VideoPlayerActivity.e;
                io.p071bidmachine.nativead.view.d dVar2 = videoPlayerActivity.d;
                if (dVar2 != null) {
                    VideoView videoView = videoPlayerActivity.c;
                    dVar2.n((videoView == null || !videoView.isPlaying()) ? 0 : videoView.getCurrentPosition(), false);
                }
                VideoPlayerActivity.e = null;
                videoPlayerActivity.runOnUiThread(new io.p071bidmachine.nativead.view.i(videoPlayerActivity, i2));
                videoPlayerActivity.finish();
                break;
            case 13:
                ((io.p071bidmachine.rendering.internal.view.privacy.d) obj).b.invoke();
                break;
            default:
                ((fx) obj).invoke();
                break;
        }
    }
}
