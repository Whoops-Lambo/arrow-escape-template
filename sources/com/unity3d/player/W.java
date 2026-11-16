package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.ld3;
import defpackage.sm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class W extends FrameLayout {
    public final ld3 a;
    public final UnityPlayerForActivityOrService b;
    public final sm c;

    public W(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new sm(context);
        this.b = unityPlayerForActivityOrService;
        ld3 ld3Var = new ld3(unityPlayerForActivityOrService);
        this.a = ld3Var;
        ld3Var.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(ld3Var);
        ld3Var.getHolder().addCallback(new V(this));
        ld3Var.setFocusable(true);
        ld3Var.setFocusableInTouchMode(true);
        ld3Var.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName())));
        addView(ld3Var, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
